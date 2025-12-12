package modelo;

import java.util.ArrayList;
import java.util.Random;

public class OrdenModelo {
    
    public ArrayList<EmpanadaModelo> productosOrden = new ArrayList<>();
    public String turno;
    public long total;
    
    
    public void generarTurno(){
        Random random = new Random();
        char letra_random = (char) (random.nextInt(90 - 65 + 1) + 65);
        int num_random = (int) (Math.random() * 100);
        turno=letra_random + String.valueOf(num_random);
    }
    
    public void agregarProductoOrden(EmpanadaModelo empanada_orden){
        boolean repetido = false;
        for(EmpanadaModelo empanada : productosOrden){
            if(empanada.tipo.equals(empanada_orden.tipo)){
                int cant = empanada.cantidad+empanada_orden.cantidad;
                empanada.agregarCantidad(cant);
                repetido=true;
                break;
            }
        }
        if(!repetido){
            productosOrden.add(empanada_orden);
        }
    }
    
    public void sumarTotal(){
        for(EmpanadaModelo empanada : productosOrden){
            total += empanada.precio_total;
        }
    }
    
}

