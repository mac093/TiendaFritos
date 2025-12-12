package modelo;

public class EmpanadaModelo {
    
    public String tipo;
    public int cantidad;
    public long precio_unidad;
    public long precio_total;
    
    public void asignaTipoEmpanada(String tipo_empanada){
        tipo=tipo_empanada;
        precioUnidad(tipo);
    }
    
    public void agregarCantidad(int cantidad_orden){
        cantidad = cantidad_orden;
        precio_total = cantidad*precio_unidad;
    }
    
    private void precioUnidad(String tipo_empanada){
        switch(tipo_empanada){
            case "pollo":
                precio_unidad=3500;
                break;
            case "carne":
                precio_unidad=3800;
                break;
            case "mixta":
                precio_unidad=3200;
                break;
            case "queso":
                precio_unidad=2500;
                break;
            case "ranchera":
                precio_unidad=2700;
                break;
            default:
                precio_unidad=5000;
        }
    }
    
}


