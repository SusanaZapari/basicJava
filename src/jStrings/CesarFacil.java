package jStrings;

public class CesarFacil {
    public static void main(String[] args) {
        String msg = "veloz";
        for(int i = 0; i < msg.length(); i ++) {
            char actual = Character.toUpperCase(msg.charAt(i));
            int cifradoPreliminar = (actual + 5);
            if(cifradoPreliminar > 90)
                cifradoPreliminar -= 26;
            char cifrado = (char) cifradoPreliminar;
            System.out.print(cifrado);

        }
    }
}


