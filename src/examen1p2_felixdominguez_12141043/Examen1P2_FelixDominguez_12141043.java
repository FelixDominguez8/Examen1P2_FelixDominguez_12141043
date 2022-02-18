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
            System.out.println("1) Opciones universo");
            System.out.println("2) Opciones escuadron");
            System.out.println("3) Opciones Personas");
            System.out.println("4) Salir");
            System.out.println("Ingrese la opcion que desea: ");
            int opcion=lea.nextInt();
            System.out.println("");
            switch(opcion){
                case 1:{
                    System.out.println("");
                    System.out.println("1) Agregar universo");
                    System.out.println("2) Modificar universo");
                    System.out.println("3) Eliminar universo");
                    System.out.println("4) Listar universos");
                    System.out.println("5) Agregar escuadrones al universo");
                    System.out.println("6) Salir");
                    System.out.println("Ingrese la opcion que desea: ");
                    int opcion2=lea.nextInt();
                    System.out.println("");
                    switch(opcion2){
                        case 1:{
                            System.out.println("");
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
                            break;
                        }
                    }
                    break;
                }
                case 2:{
                    System.out.println("");
                    System.out.println("1) Agregar escuadron");
                    System.out.println("2) Modificar escuadron");
                    System.out.println("3) Eliminar escuadron");
                    System.out.println("4) Listar escudrones");
                    System.out.println("5) Agregar persona al escuadron");
                    System.out.println("6) Simular batalla");
                    System.out.println("7) Salir");
                    System.out.println("Ingrese la opcion que desea: ");
                    int opcion2=lea.nextInt();
                    System.out.println("");
                    break;
                }
                case 3:{
                    System.out.println("");
                    System.out.println("1) Agregar persona");
                    System.out.println("2) Modificar persona");
                    System.out.println("3) Eliminar persona");
                    System.out.println("4) Listar persona");
                    System.out.println("5) Salir");
                    System.out.println("Ingrese la opcion que desea: ");
                    int opcion2=lea.nextInt();
                    System.out.println("");
                    break;
                }
                case 4:{
                    resp='n';
                    break;
                }
            }
        }
    }
}
