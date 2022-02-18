/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_felixdominguez_12141043;
import java.util.Scanner;
/**
 *
 * @author Lenovo I7
 */
public class Examen1P2_FelixDominguez_12141043 {
    static Scanner lea=new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char resp='s';
        while(resp=='s'){
            System.out.println("");
            System.out.println("1) Agregar un heroe/villano");
            System.out.println("2) Modificar los atributos de un heroe/villano");
            System.out.println("3) Listar a todos los escuadrones");
            System.out.println("4) Eliminar un heroe/villano");
            System.out.println("5) Salir");
            System.out.println("Ingrese la opcion que desea: ");
            int opcion=lea.nextInt();
            System.out.println("");
            switch(opcion){
                case 1:{
                    break;
                }
                case 2:{
                    break;
                }
                case 3:{
                    break;
                }
                case 4:{
                    break;
                }
                case 5:{
                    resp='n';
                    break;
                }
            }
        }
    }
}
