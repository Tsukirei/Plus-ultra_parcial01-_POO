package com.JJCF.x00049419;

public class LetterBadException {
    public static void validar(int numero){
        if(Character.isDigit(numero)){
            throw new ArithmeticException("ha ingresado una letra o frase");
        }
    }
}


