package examen;
import java.util.Scanner;
public class exRAL4 {
    static Scanner it=new Scanner(System.in);
    public static void main(String[] args) {
       //RONY ABAD LUCANA LUNA  
       //ejercicio n 4
        //algoritmo de que vacuna poner al individuo :v 
       
        String mensaje;
        int edad;
        System.out.println("introduzca la edad del paciente");
        edad=it.nextInt();
        //desarrollo
        if (edad>=70) {
            mensaje="usted recibe la vacuna tipo c";
        }else if (edad>16) {
            mensaje="usted recibe la vacuna tipo B";
        }else {
            mensaje="usted recibe la bacuna tipo A";
        }
        System.out.println(mensaje);
}}
