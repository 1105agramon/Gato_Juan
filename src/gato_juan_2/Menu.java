package gato_juan_2;

import java.util.Scanner;

public class Menu {
    private int opcion;
    private String simbolo[]=new String[2];
    

    public Menu() {
        
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }
  
    
    Scanner entrada=new Scanner(System.in);

    public void menuPrincipal() {
        int opc;
        String nombre="";
        
        do{
            System.out.println("\t#Juego del GATO#");
            System.out.println("1.Humano vs Humano");
            System.out.println("2.Salir");
            System.out.println("Selecciona una opcion[1-2]: ");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                        
                    
                        System.out.println("Ingrese el usuario 1 su nombre: ");
                        nombre=entrada.next();
                        System.out.println("\n1.X\n2.O\nSelecciona tu arma [1-2]: ");
                        opc=entrada.nextInt();
                            

                        Jugador p1=new Jugador(nombre,escogeSigno(opc));
                        Jugador p2=new Jugador();
                        
                        if(p1.getSimbolo().equals("X")){
                            System.out.println("Ingrese el usuario 2 su nombre: ");
                            nombre=entrada.next();
                            p2.setNombre(nombre);
                            p2.setSimbolo("O");
                        }else{
                            System.out.println("Ingrese el usuario 2 su nombre: ");
                            nombre=entrada.next();
                            p2.setNombre(nombre);
                            p2.setSimbolo("X");
                        }

                        System.out.println(p1.getNombre()+"  juega con el simbolo: "+p1.getSimbolo());
                        System.out.println(p2.getNombre()+"  juega con el simbolo: "+p2.getSimbolo());
                        //llamar a la clase para empezar a jugar
                        System.out.println("");
                        Tablero t1=new Tablero();
                        t1.iniciaJuego(p1,p2);
                    break;
                case 2:
                    System.out.println("Salio del Juego.\nVuelva pronto...");
                    break;               
                default: System.out.println("Opcion no valida.\nIntentelo de nuevo...\n\n");
            }
        }while(this.opcion!=2);
    }
    
    public String escogeSigno(int opcion){
        if(opcion==1){
            return simbolo[0]="X";
        }else{
            return simbolo[1]="O";
        }
    }
    
}
