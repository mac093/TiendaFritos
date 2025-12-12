package vista;

import java.util.Scanner;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import modelo.EmpanadaModelo;

public class TiendaVista {
    
    Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);
    
    public void bienvenida(){
        System.out.println("Bienvenido a la tienda de Empanadas más sabrosas del mundo");
        System.out.println("     ----- EMPANADAS FERCHO -----");
    }
    
    public String pedirNombre(){
        System.out.println("\nPor favor, dinos ¿Cuál es tu nombre?: ");
        return sc.nextLine().toUpperCase();
    }
    
    public String pedirUser(String nombre){
        System.out.println("\n"+nombre+", Digita tu usuario, por favor: ");
        return sc.next();
    }
    
    public String pedirPassword(String nombre){
        System.out.println("\n"+nombre+", Digita tu contraseña, por favor: ");
        return sc.next();
    }
    
    public void accesoLogin(boolean acceso){
        if(acceso){
            System.out.println("\n------------------------------------------");
            System.out.println("¡¡LOGIN EXITOSO!!");
            System.out.println("------------------------------------------");
        } else{
            System.out.println("\n------------------------------------------");
            System.out.println("USUARIO Y/O CONTRASEÑA INCORRECTOS\nPor favor, Intente nuevamente");
            System.out.println("------------------------------------------");
        }
    }
    
    public void mostrarMenu(){
        System.out.println("\n----- PRODUCTOS DISPONIBLES -----\n");
        System.out.println("Empanada de pollo   ..... $3.500");
        System.out.println("Empanada de carne   ..... $3.800");
        System.out.println("Empanada mixta      ..... $3.200");
        System.out.println("Empanada de queso   ..... $2.500");
        System.out.println("Empanada ranchera   ..... $2.700");
        System.out.println("\n---------------------------------");
    }
    
    public String pedirProductos(String nombre){
        System.out.println("\n"+nombre+", escriba el tipo de empanada para ordenar: ");
        String tipo_empanada = sc.next().toLowerCase();
        while(!tipo_empanada.equals("carne") && !tipo_empanada.equals("pollo") && !tipo_empanada.equals("mixta") && !tipo_empanada.equals("queso") && !tipo_empanada.equals("ranchera")){
            System.out.println("\n------------------------------------------");
            System.out.println("¡¡EL TIPO DE EMPANADA INGRESADO NO ES VÁLIDO!!\nIngresa un valor de la lista disponible");
            System.out.println("------------------------------------------");
            System.out.println("\n"+nombre+", escriba el tipo de empanada para ordenar: ");
            tipo_empanada=sc.next().toLowerCase();
        }
        return tipo_empanada;
    }
    
    public int pedirCantidad(String nombre){
        System.out.println("\n"+nombre+", digite la cantidad de empanadas: ");
        return sc.nextInt();
    }    
    
    public void mostrarTotal(long total){
        System.out.println("__________________________________________");
        System.out.println("El TOTAL de tu orden es: $"+total);
    }
    
    public void mostrarTurno(String turno){
        System.out.println("\n\n------------------------------------------");
        System.out.println("                  TURNO");
        System.out.println("------------------------------------------");
        System.out.println("Tu turno es: "+turno);
        System.out.println("Por favor, espera a que tu turno sea anunciado, será dentro de muy poco :D");
    }
    
    public boolean preguntarOtroPedido(String nombre){
        System.out.println("\n"+nombre+" ¿Deseas agregar algo más a tu orden?(y/n)");
        String agregar_mas = sc.next().toLowerCase();
        while(!agregar_mas.equals("y") && !agregar_mas.equals("n") ){
            System.out.println("\n------------------------------------------");
            System.out.println("¡¡EL VALOR INGRESADO NO ES VÁLIDO!!\nResponde (y) para Sí o (n) para No");
            System.out.println("------------------------------------------");
            System.out.println("\n"+nombre+" ¿Deseas agregar algo más a tu orden?(y/n)");
            agregar_mas=sc.next();
        }
        return agregar_mas.equals("y");
    }
    
    public void despedida(){
        System.out.println("\n¡¡¡MUCHAS GRACIAS POR SIEMPRE PREFERIRINOS!!!");
        System.out.println("Te esperamos de vuelta pronto, para atenderte con la mejor actitud");
        System.out.println("\n--------------------------------------------------------");
        System.out.println("\nEste proyecto se ha creado como parte de la asignatura Programacion Orientada a Objetos");
        System.out.println("Presentado al profe: Harold Torres");
        System.out.println("\nDesarrollador: Miguel Angel Calderon Estrada");
        System.out.println("CC: 1121209757");
        System.out.println("Correo: miguel.calderon.estrada@pi.edu.co");
        System.out.println("Instituto: Politécnico Internacional");
        
        System.out.println("\nIngresa una letra para salir...");
        sc.next();
    }
    
    public void mostrarDetalleOrden(ArrayList<EmpanadaModelo> productosOrden){
        System.out.println("\n------------------------------------------");
        System.out.println("           DETALLE DE TU ORDEN");
        System.out.println("------------------------------------------\n");
        for(EmpanadaModelo empanada : productosOrden){
            System.out.println(empanada.cantidad + " Empanadas "+empanada.tipo+" ..... $"+empanada.precio_total);
        }
    }
    
}
