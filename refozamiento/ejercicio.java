package reforzamiento;

import java.util.Scanner;

/**
 * ejercicio
 */
public class ejercicio {
    public static void mostrarcursoDia() {
        //Definir Variable
        int diaSem;
        String mensaje;
        //Leer datos
        Scanner leerT=new Scanner(System.in);
        System.out.println("Ingrese un dia de la semana:\n1=Dom"+"\n2=Lun\n3=Mar\n4=Mie\n5=Jue\n6=Vie\n7=Sab");
        diaSem=leerT.nextInt();
        //Proceso
        if (diaSem==1 || diaSem==7) {
            mensaje="No hay clases";
        }else if (diaSem==2){
            mensaje="Matematica";
        }else if (diaSem==3 || diaSem==5){
            mensaje="Fundamentos de programacion";
        }else if (diaSem==4){
            mensaje="Capacidades comunicativas";
        }else if (diaSem==6){
            mensaje="Introduccion a la ing de sistemas";  
        }else{
            mensaje="El dia que coloco no existe";
        }
        //Datos de salida 
        System.out.println("Ese dia toca el curso de: "+mensaje);


    }
    public static void main(String[] args) {
        mostrarcursoDia();
    }

    
}