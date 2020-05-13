package iLoops;

import libs.Input;

public class MarioDificil {

    public static void main(String[] args) {
        System.out.print("Altura");
        int altura = Input.get_int();

        if(altura > 1){
            int numGatos = 1;
            int numEspacios = altura - numGatos;

            for (int num = 1; num <= altura; num += 1) {

                for(int gatos = 1; gatos <= numEspacios; gatos += 1) {
                    System.out.print(" ");
                }

                for(int espacios = 1; espacios <= numGatos; espacios += 1) {
                    System.out.print("#");
                }

                System.out.print(" ");

                System.out.println();
                numEspacios--;
                numGatos++;
            }
        }
    }
}
