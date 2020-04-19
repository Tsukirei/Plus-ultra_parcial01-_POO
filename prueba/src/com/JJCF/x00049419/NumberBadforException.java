package com.JJCF.x00049419;

public class NumberBadforException {
    public static void comprobando(int xd){
        if(xd<0||xd>2){
            throw new ArithmeticException("El numero es invalido");

        }
        if(Character.isDigit(xd)){
            throw new ArithmeticException("Has colocado una letra o una frase");

        }
    }

}
