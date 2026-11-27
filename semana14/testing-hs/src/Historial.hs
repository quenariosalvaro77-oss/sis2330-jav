module Historial
    ( Conteo
    , registrarConsulta
    , consultasDe
    ) where

import Control.Monad.State
import qualified Data.Map as Map
import Data.Map (Map)

type Conteo = Map String Int

 
registrarConsulta :: String -> State Conteo ()
registrarConsulta nombre = modify (Map.insertWith (+) nombre 1)

 
consultasDe :: String -> Conteo -> Int
consultasDe nombre conteo = Map.findWithDefault 0 nombre conteo
