package examen;

import java.util.Scanner;

/**
 * pregunta5
 */
public class exRAL5. {
    static Scanner lt= new Scanner(System.in);

    public static void main(String[] args) {
    
        System.out.println("Ingrese la pregunta");
        int pregunta = lt.nextInt();
        switch (pregunta) 
        {
          case 1:
          pregunta1examenRALL() ; break;
          case 2:
          pregunta2examenRALL() ; break;
          case 3:
          pregunta3examenRALL(); break;
          case 4:
          pregunta4examenRALL(); break;
            
            default: break;
        }

        }
        

        }