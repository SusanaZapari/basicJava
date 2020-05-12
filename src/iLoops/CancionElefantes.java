package iLoops;

public class CancionElefantes {
    public static void main(String[] args) {
        int numeroElefante;
        String texto;

        for(numeroElefante = 1; numeroElefante <= 100; numeroElefante ++) {
            if (numeroElefante == 1) {
                System.out.println(numeroElefante + "elefante se columpiaba sobre la tela de una araña, \n" +
                        "como veía que resistiía fue a llamar a otro elefante \n");
            } else {
                System.out.println(numeroElefante + "elefantes se columpiaban sobre la tela de una araña, \n" +
                        "como veía que resistiía fue a llamar a otro elefante \n");
            }
        }
    }
}
