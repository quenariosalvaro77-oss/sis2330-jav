package com.tareas;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.springframework.stereotype.Service;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@Service
public class TareaService {
    private final String ARCHIVO = "tareas.json";
    private List<Tarea> tareas = new ArrayList<>();
    private long siguienteId = 1;
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public TareaService() {
        cargar();
    }

    public List<Tarea> listar() {
        return new ArrayList<>(tareas);
    }

    public void agregar(String descripcion) {
        tareas.add(new Tarea(siguienteId++, descripcion, false));
        guardar();
    }

    public void actualizar(Tarea tarea) {
        for (int i = 0; i < tareas.size(); i++) {
            if (tareas.get(i).id() == tarea.id()) {
                tareas.set(i, tarea);
                guardar();
                return;
            }
        }
    }

    public void eliminar(long id) {
        tareas.removeIf(t -> t.id() == id);
        guardar();
    }

    public Tarea buscarPorId(long id) {
        return tareas.stream().filter(t -> t.id() == id).findFirst().orElse(null);
    }

    private void cargar() {
        File file = new File(ARCHIVO);
        if (!file.exists()) return;
        try (Reader reader = new FileReader(file)) {
            Type tipoLista = new TypeToken<ArrayList<Tarea>>(){}.getType();
            tareas = gson.fromJson(reader, tipoLista);
            if (tareas == null) tareas = new ArrayList<>();
            
            // Actualizar siguienteId
            for (Tarea t : tareas) {
                if (t.id() >= siguienteId) siguienteId = t.id() + 1;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void guardar() {
        try (Writer writer = new FileWriter(ARCHIVO)) {
            gson.toJson(tareas, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
