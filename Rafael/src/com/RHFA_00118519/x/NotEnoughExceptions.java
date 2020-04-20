package com.RHFA_00118519.x;

public class NotEnoughExceptions {
    public static void validate(int numero){
        if(numero<0||numero>6){
            throw new ArithmeticException("numero invalido");
        }
        if(Character.isDigit(numero)){
            throw new ArithmeticException("Ha ingresado una letra u oracion");
        }

    }
}

