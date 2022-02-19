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
        ArrayList<Persona> personas=new ArrayList();
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
                    System.out.println("4) Listar personas");
                    System.out.println("5) Salir");
                    System.out.println("Ingrese la opcion que desea: ");
                    int opcion2=lea.nextInt();
                    System.out.println("");
                    switch(opcion2){
                        case 1:{
                            System.out.println("1) Persona normal");
                            System.out.println("2) Mutante");
                            System.out.println("3) Persona con accidente radioactivo");
                            System.out.println("4) Superhumano");
                            System.out.println("5) Deidad");
                            System.out.println("6) Alien");
                            System.out.println("Escoja el tipo de Persona: ");
                            int tipo=lea.nextInt();
                            System.out.println("");
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
                                    personas.add(new PersonaNormal(nombre,poder,debilidad,heroeovillano,fuerza,fisica,mental,tiene));
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
                                    personas.add(new Mutante(factores,nombre,poder,debilidad,heroeovillano,fuerza,fisica,mental,tiene));
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
                                    personas.add(new PorAccidenteRadioactivo(edad,tipoaccidente,nombre,poder,debilidad,heroeovillano,fuerza,fisica,mental,tiene));
                                    break;
                                }
                                case 4:{
                                    System.out.println("Ingrese el superpoder del superhumano: ");
                                    lea.nextLine();
                                    String superpoder=lea.nextLine();
                                    if(heroeovillano.equals("heroe")){
                                        heroes.add(new Superhumano(superpoder,nombre,poder,debilidad,heroeovillano,fuerza,fisica,mental,tiene));
                                    }else if(heroeovillano.equals("villano")){
                                        villanos.add(new Superhumano(superpoder,nombre,poder,debilidad,heroeovillano,fuerza,fisica,mental,tiene));
                                    }
                                    personas.add(new Superhumano(superpoder,nombre,poder,debilidad,heroeovillano,fuerza,fisica,mental,tiene));
                                    break;
                                }
                                case 5:{
                                    System.out.println("¿Hay creyentes de esta deidad? true/false");
                                    boolean creyentes=lea.nextBoolean();
                                    System.out.println("¿Cual es el nombre de la religion o mythologia a la cual pertenece?: ");
                                    String nomre=lea.nextLine();
                                    if(heroeovillano.equals("heroe")){
                                        heroes.add(new Deidad(creyentes,nomre,nombre,poder,debilidad,heroeovillano,fuerza,fisica,mental,tiene));
                                    }else if(heroeovillano.equals("villano")){
                                        villanos.add(new Deidad(creyentes,nomre,nombre,poder,debilidad,heroeovillano,fuerza,fisica,mental,tiene));
                                    }
                                    personas.add(new Deidad(creyentes,nomre,nombre,poder,debilidad,heroeovillano,fuerza,fisica,mental,tiene));
                                    break;
                                }
                                case 6:{
                                    System.out.println("Ingrese el planeta al cual pertenece: ");
                                    lea.nextLine();
                                    String planeta=lea.nextLine();
                                    if(heroeovillano.equals("heroe")){
                                        heroes.add(new Alien(planeta,nombre,poder,debilidad,heroeovillano,fuerza,fisica,mental,tiene));
                                    }else if(heroeovillano.equals("villano")){
                                        villanos.add(new Alien(planeta,nombre,poder,debilidad,heroeovillano,fuerza,fisica,mental,tiene));
                                    }
                                    personas.add(new Alien(planeta,nombre,poder,debilidad,heroeovillano,fuerza,fisica,mental,tiene));
                                    break;
                                }
                            }
                            break;
                        }
                        case 2:{
                            System.out.println("Ingrese la posicion de la persona a modificar: ");
                            int pos=lea.nextInt();
                            System.out.println("1) Persona normal");
                            System.out.println("2) Mutante");
                            System.out.println("3) Persona con accidente radioactivo");
                            System.out.println("4) Superhumano");
                            System.out.println("5) Deidad");
                            System.out.println("6) Alien");
                            System.out.println("Escoja el tipo de Persona: ");
                            int tipo=lea.nextInt();
                            System.out.println("");
                            System.out.println("1) Nombre");
                            System.out.println("2) Poder");
                            System.out.println("3) Debilidad");
                            System.out.println("4) Es heroe o villano");
                            System.out.println("5) Fuerza");
                            System.out.println("6) Habilidad fisica");
                            System.out.println("7) Habilidad mental");
                            System.out.println("8) Tiene escuadron o no");
                            System.out.println("9) Otro");
                            int mod=lea.nextInt();
                            switch(mod){
                                case 1:{
                                    System.out.println("Ingrese el nuevo nombre de la persona: ");
                                    lea.nextLine();
                                    String nombre=lea.nextLine();
                                    personas.get(pos).setNombre(nombre);
                                    break;
                                }
                                case 2:{
                                    System.out.println("Ingrese el nuevo poder: ");
                                    lea.nextLine();
                                    String poder=lea.nextLine();
                                    personas.get(pos).setPoder(poder);
                                    break;
                                }
                                case 3:{
                                    System.out.println("Ingrese la nueva debilidad: ");
                                    lea.nextLine();
                                    String debilidad=lea.nextLine();
                                    personas.get(pos).setDebilidad(debilidad);
                                    break;
                                }
                                case 4:{
                                    System.out.println("Ingrese el nuevo tipo heroe/villano: ");
                                    lea.nextLine();
                                    String ti=lea.nextLine();
                                    personas.get(pos).setHeroeovillano(ti);
                                    break;
                                }
                                case 5:{
                                    System.out.println("Ingrese la nueva fuerza: ");
                                    int fuerza=lea.nextInt();
                                    personas.get(pos).setFuerza(fuerza);
                                    break;
                                }
                                case 6:{
                                    System.out.println("Ingrese la nueva habilidad fisica: ");
                                    int fisica=lea.nextInt();
                                    personas.get(pos).setHabilidadfisica(fisica);
                                    break;
                                }
                                case 7:{
                                    System.out.println("Ingrese la nueva habilidad mental: ");
                                    int mental=lea.nextInt();
                                    personas.get(pos).setHabilidadmental(mental);
                                    break;
                                }
                                case 8:{
                                    System.out.println("Ingrese si tiene un escuadron o no (true/false): ");
                                    boolean tiene=lea.nextBoolean();
                                    personas.get(pos).setTieneescuadron(tiene);
                                    break;
                                }
                                case 9:{
                                    switch(tipo){
                                        case 2:{
                                            System.out.println("Ingrese la posicion del factor a modificar: ");
                                            int posf=lea.nextInt();
                                            System.out.println("Ingrese el nuevo factor: ");
                                            lea.nextLine();
                                            String factor=lea.nextLine();
                                            ((Mutante)personas.get(pos)).getFactoresmutantes().set(posf, factor);
                                            break;
                                        }
                                        case 3:{
                                            System.out.println("1) Edad en la cual ocurrio el accidente");
                                            System.out.println("2) Tipo de accidente");
                                            System.out.println("Elija la opcion que desea: ");
                                            int op=lea.nextInt();
                                            if(op==1){
                                                System.out.println("Ingrese la nueva edad cuando ocurrio el accidente");
                                                int edad=lea.nextInt();
                                                ((PorAccidenteRadioactivo)personas.get(pos)).setEdadaccidente(edad);
                                            }else{
                                                System.out.println("Ingrese el nuevo tipo de accidente");
                                                lea.nextLine();
                                                String acc=lea.nextLine();
                                                ((PorAccidenteRadioactivo)personas.get(pos)).setTipoaccidente(acc);
                                            }
                                            break;
                                        }
                                        case 4:{
                                            System.out.println("Ingresa el nuevo superpoder");
                                            lea.nextLine();
                                            String superpoder=lea.nextLine();
                                            ((Superhumano)personas.get(pos)).setSuperpoder(superpoder);
                                            break;
                                        }
                                        case 5:{
                                            System.out.println("1) Tiene creyentes");
                                            System.out.println("2) Nombre de su religion/mitologia");
                                            System.out.println("Elija la opcion que desea: ");
                                            int op=lea.nextInt();
                                            if(op==1){
                                                System.out.println("Ingrese si tiene creyentes o no");
                                                boolean creyentes=lea.nextBoolean();
                                                ((Deidad)personas.get(pos)).setCreyentes(creyentes);
                                            }else{
                                                System.out.println("Ingrese el nuevo nombre de la religion/mitologia");
                                                lea.nextLine();
                                                String re=lea.nextLine();
                                                ((Deidad)personas.get(pos)).setReligion(re);
                                            }
                                            break;
                                        }
                                        case 6:{
                                            System.out.println("Ingrese el nuevo nombre del planeta");
                                            lea.nextLine();
                                            String planeta=lea.nextLine();
                                            ((Alien)personas.get(pos)).setPlaneta(planeta);
                                            break;
                                        }
                                    }
                                }
                            }
                            break;
                        }
                        case 3:{
                            System.out.println("Ingrese la posicion de la persona a eliminar");
                            int pos=lea.nextInt();
                            personas.remove(pos);
                            for(int i=0;i<heroes.size();i++){
                                if(personas.get(pos)==heroes.get(pos)){
                                    heroes.remove(i);
                                }
                            }
                            for(int i=0;i<villanos.size();i++){
                                if(personas.get(pos)==villanos.get(pos)){
                                    villanos.remove(i);
                                }
                            }
                            break;
                        }
                        case 4:{
                            for(int i=0; i<heroes.size();i++){
                                System.out.println(heroes.get(i).getNombre()+" = "+heroes.get(i).getPoder());
                            }
                            for(int i=0; i<villanos.size();i++){
                                System.out.println(villanos.get(i).getNombre()+" = "+villanos.get(i).getDebilidad());
                            }
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
