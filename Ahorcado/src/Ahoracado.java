
//cerrar carpetas
// control shift p, java create new project y no built 

import java.util.Scanner;

import javax.management.StringValueExp;

public class Ahoracado {
    public static void main(String[] args) throws Exception {
        
        //Para que el usuario pueda ingresar datos.
        Scanner input = new Scanner(System.in);


        // declaraciones y asignaciones
        String palabraSecreta;
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdvinada = false;
        

        // ingresar la palabra secreta o a adivinar
        System.out.print("Ingrese la Palabra Secreta: ");
        palabraSecreta = input.nextLine();

        // arrays
        char[] longuitudSecreta = new char [palabraSecreta.length()];

        


        //Estructura de control, iterar, loop
        for (int i = 0; i < longuitudSecreta.length; i++) {

            longuitudSecreta[i] = '_';
            System.out.print(longuitudSecreta[i]);

        }

        // EStrucutura de control, iterativa (Loop)
        while (!palabraAdvinada && intentos < intentosMaximos) {
                                                //estos string.valueof se usa cuando tenemos una palabra de char
                                            // como que convierte todas la letras de chars en un string para que luego se pueda comparar.
            System.out.println("Palabra a adivinar: " + String.valueOf(longuitudSecreta) + " " + palabraSecreta.length() + " letras.");

            System.out.println("Ingrese una letra, por favor: ");
            char letra = Character.toLowerCase(input.next().charAt(0));

            boolean letraCorrecta = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {

                //Estrucutura de control, condicional
                if (palabraSecreta.charAt(i) == letra) {
                    longuitudSecreta [i] = letra;

                    System.out.println(longuitudSecreta[i]);
                    letraCorrecta = true;
                }
   
            }

            if (!letraCorrecta) {
                intentos++;
                System.out.println("Incorrecto! Te quedan " + (intentosMaximos - intentos) + "intentos.");
            }

            if (String.valueOf(longuitudSecreta).equals(palabraSecreta)) {

                palabraAdvinada = true;
                System.out.println("Haz adivinado la palabra secreta: " + palabraSecreta);
            }
        }

        if (!palabraAdvinada) {
            System.out.println("Que pena te haz quedado sin intentos.");
        }

        input.close();




    }
}
