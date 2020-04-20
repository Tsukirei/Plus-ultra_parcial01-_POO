package com.RHFA_00118519.x;

public class LetterBadException {
    public static void validar(double numero){
        if(Character.isDigit((int) numero)){
            throw new ArithmeticException("ha ingresado una letra o frase");
        }
    }
    public static void validando(int numeroo){
        if(Character.isDigit(numeroo)){
            throw new ArithmeticException("no ha ingresado un numero");
        }
    }
}