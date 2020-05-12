package gNumericTypes;

import libs.Input;

public class BotellasAgua2 {
    public static void main(String[] args) {
        int botellasxmin = 12;
        System.out.print("Cuántos minutos tardas en bañarte?");
        int minutos = Input.get_int();


        if(minutos > 0) {
            System.out.print("El número de botellas que usaste al bañarte son:" + botellasxmin * minutos);
        }

        else{
            System.out.print("Favor de ingresar un número mayor que cero");
        }
    }
}
