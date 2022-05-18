package examen;

import java.util.Scanner;

/**
 * pregunta5
 */
public class pregunta5 {
    static Scanner lt= new Scanner(System.in);

    public static void main(String[] args) {
    
        System.out.println("Ingrese la pregunta");
        int pregunta = lt.nextInt();
        switch (pregunta) 
        {
          case 1:
          pregunta1examenFRFM(RALL) ; break;
          case 2:
          pregunta2examenFRFM(RALL) ; break;
          case 3:
          pregunta3examenFRFM(RALL); break;
          case 4:
          pregunta4examenFRFM(RALL); break;
            
            default: break;
        }

        }
        

        }