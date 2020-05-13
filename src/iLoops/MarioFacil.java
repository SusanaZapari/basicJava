package iLoops;

import libs.Input;

public class MarioFacil {

    public static void main(String[] args) {
        System.out.println("Cuál es la altura?");
        int altura = Input.get_positive_int_greater_than(1);
        dibujarPiramide(altura);
    }

    private static void dibujarPiramide(int altura) {
        //imprimir renglon por renglon. Primero el renglon 1, luego el 2...etc hasta el renglon = altura
        for (int numeroRenglon=1;numeroRenglon<=altura; numeroRenglon++){
            imprimirRenglon(numeroRenglon, altura);
        }
    }

    private static void imprimirRenglon(int numeroRenglon, int altura) {
       // para imprimir cada renglon, primero tengo que imprimir espacios, luego los gatitos y luego un salto de línea
        imprimirEspacios(numeroRenglon, altura);
        imprimirGatito(numeroRenglon, altura);
        System.out.println();
    }

    private static void imprimirEspacios(int numRenglon, int altura) {
        //System.out.print("Imprime espacios");
    }

    private static void imprimirGatito(int numRenglon, int altura) {
        //System.out.print("Imprime gatos");
        int numGatos = numRenglon + 1;
        //imprimir los gatos
        for(int i = 0 ; i < numGatos; i++) {
            System.out.print("#");
        }
    }
}
