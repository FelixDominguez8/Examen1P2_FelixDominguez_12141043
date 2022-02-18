/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_felixdominguez_12141043;
import java.util.ArrayList;
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
        ArrayList<Universo> universos=new ArrayList();
        ArrayList<Escuadron> escuadrones=new ArrayList();
        ArrayList<Persona> heroes=new ArrayList();
        ArrayList<Persona> villanos=new ArrayList();
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
                            System.out.println("Ingrese le nombre del universo: ");
                            lea.nextLine();
                            String nombre=lea.nextLine();
                            universos.add(new Universo(nombre));
                            break;
                        }
                        case 2:{
                            System.out.println("Ingrese la posicion del universo a modificar: ");
                            int pos=lea.nextInt();
                            System.out.println("Ingrese el nuevo nombre del universo");
                            lea.nextLine();
                            String nombre=lea.nextLine();
                            ((Universo)universos.get(pos)).setNombre(nombre);
                            break;
                        }
                        case 3:{
                            System.out.println("Ingrese la posicion del universo a modificar: ");
                            int pos=lea.nextInt();
                            universos.remove(pos);
                            break;
                        }
                        case 4:{
                            String salida="";
                            for (Object temp : universos) {
                                salida+=""+universos.indexOf(temp)+" - "+temp+"\n";
                            }
                            System.out.println(salida);
                            break;
                        }
                        case 5:{
                            System.out.println("Ingrese la posicion del universo la cual se le asignara el escuadron: ");
                            int pos=lea.nextInt();
                            System.out.println("Ingrese la posicion del escuadron que sera asignado: ");
                            int pos2=lea.nextInt();
                            ((Universo)universos.get(pos)).getEscuadrones().add(escuadrones.get(pos2));
                            break;
                        }
                        case 6:{
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
                    System.out.println("1) Persona normal");
                    System.out.println("2) Mutante");
                    System.out.println("3) Persona con accidente radioactivo");
                    System.out.println("4) Superhumano");
                    System.out.println("5) Deidad");
                    System.out.println("6) Alien");
                    System.out.println("Escoja el tipo de Persona: ");
                    int tipo=lea.nextInt();
                    System.out.println("");
                    switch(opcion2){
                        case 1:{
                            System.out.println("Ingrese el nombre de la persona: ");
                            lea.nextLine();
                            String nombre=lea.nextLine();
                            System.out.println("Ingrese el poder de la persona: ");
                            String poder=lea.nextLine();
                            System.out.println("Ingrese la debilidad de la persona: ");
                            String debilidad=lea.nextLine();
                            System.out.println("¿Es un heroe o es un villano? heroe/villano: ");
                            String heroeovillano=lea.nextLine();
                            System.out.println("Ingrese su fuerza: ");
                            int fuerza=lea.nextInt();
                            System.out.println("Ingrese su cantidad de habilidad fisica: ");
                            int fisica=lea.nextInt();
                            System.out.println("Ingrese su cantidad de habilidad mental");
                            int mental=lea.nextInt();
                            System.out.println("¿Esta persona tiene escuadron? true/false:");
                            boolean tiene=lea.nextBoolean();
                            switch(tipo){
                                case 1:{
                                    if(heroeovillano.equals("heroe")){
                                        heroes.add(new PersonaNormal(nombre,poder,debilidad,heroeovillano,fuerza,fisica,mental,tiene));
                                    }else if(heroeovillano.equals("villano")){
                                        villanos.add(new PersonaNormal(nombre,poder,debilidad,heroeovillano,fuerza,fisica,mental,tiene));
                                    }
                                    break;
                                }
                                case 2:{
                                    char s='s';
                                    ArrayList<String> factores=new ArrayList();
                                    while(s=='s'){
                                        System.out.println("Ingrese uno de sus factores: ");
                                        lea.nextLine();
                                        String factor=lea.nextLine();
                                        factores.add(factor);
                                        System.out.println("Desea ingresar otro factor (s/n): ");
                                        s=lea.next().charAt(0);
                                    }
                                    if(heroeovillano.equals("heroe")){
                                        heroes.add(new Mutante(factores,nombre,poder,debilidad,heroeovillano,fuerza,fisica,mental,tiene));
                                    }else if(heroeovillano.equals("villano")){
                                        villanos.add(new Mutante(factores,nombre,poder,debilidad,heroeovillano,fuerza,fisica,mental,tiene));
                                    }
                                    break;
                                }
                                case 3:{
                                    System.out.println("Ingrese la edad de la persona cuando tuvo el accidente: ");
                                    int edad=lea.nextInt();
                                    System.out.println("Ingrese el tipo de accidente que fue: ");
                                    lea.nextLine();
                                    String tipoaccidente=lea.nextLine();
                                    if(heroeovillano.equals("heroe")){
                                        heroes.add(new PorAccidenteRadioactivo(edad,tipoaccidente,nombre,poder,debilidad,heroeovillano,fuerza,fisica,mental,tiene));
                                    }else if(heroeovillano.equals("villano")){
                                        villanos.add(new PorAccidenteRadioactivo(edad,tipoaccidente,nombre,poder,debilidad,heroeovillano,fuerza,fisica,mental,tiene));
                                    }
                                    break;
                                }
                                case 4:{
                                    if(heroeovillano.equals("heroe")){
                                        heroes.add(new PersonaNormal(nombre,poder,debilidad,heroeovillano,fuerza,fisica,mental,tiene));
                                    }else if(heroeovillano.equals("villano")){
                                        villanos.add(new PersonaNormal(nombre,poder,debilidad,heroeovillano,fuerza,fisica,mental,tiene));
                                    }
                                    break;
                                }
                                case 5:{
                                    if(heroeovillano.equals("heroe")){
                                        heroes.add(new PersonaNormal(nombre,poder,debilidad,heroeovillano,fuerza,fisica,mental,tiene));
                                    }else if(heroeovillano.equals("villano")){
                                        villanos.add(new PersonaNormal(nombre,poder,debilidad,heroeovillano,fuerza,fisica,mental,tiene));
                                    }
                                    break;
                                }
                                case 6:{
                                    if(heroeovillano.equals("heroe")){
                                        heroes.add(new PersonaNormal(nombre,poder,debilidad,heroeovillano,fuerza,fisica,mental,tiene));
                                    }else if(heroeovillano.equals("villano")){
                                        villanos.add(new PersonaNormal(nombre,poder,debilidad,heroeovillano,fuerza,fisica,mental,tiene));
                                    }
                                    break;
                                }
                            }
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
                case 4:{
                    resp='n';
                    break;
                }
            }
        }
    }
}
