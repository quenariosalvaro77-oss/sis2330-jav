module Lib
    ( suma
    , doble
    , promedio
    ) where


suma :: Int -> Int -> Int
suma a b = a + b


doble :: Int -> Int
doble x = x * 2


promedio :: [Double] -> Double
promedio [] = 0
promedio xs = sum xs / fromIntegral (length xs)
