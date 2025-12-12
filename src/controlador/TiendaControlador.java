package controlador;

import modelo.EmpanadaModelo;
import modelo.OrdenModelo;
import modelo.LoginModelo;
import vista.TiendaVista;

public class TiendaControlador {
    
    private OrdenModelo orden;
    private TiendaVista vista;
    private LoginModelo login;
    
    public String nombre;
    
    public TiendaControlador(LoginModelo login, TiendaVista vista, OrdenModelo orden){
        this.login=login;
        this.vista=vista;
        this.orden=orden;
    }
    
    public void iniciar(){
        vista.bienvenida();
        nombre = vista.pedirNombre();
        login();
        hacerPedido();
        orden.sumarTotal();
        vista.mostrarDetalleOrden(orden.productosOrden);
        vista.mostrarTotal(orden.total);
        orden.generarTurno();
        vista.mostrarTurno(orden.turno);
        vista.despedida();
    }
    
    private void login(){
        boolean access=false;
        while(!access){
            String user = vista.pedirUser(nombre);
            String password = vista.pedirPassword(nombre);
            access=login.validarAcceso(user,password);
            vista.accesoLogin(access);
        }
    }
    
    private void hacerPedido(){
        boolean continuarPidiendo = true;
        while (continuarPidiendo){
            vista.mostrarMenu();
            EmpanadaModelo empanada = new EmpanadaModelo();
            empanada.asignaTipoEmpanada(vista.pedirProductos(nombre));
            empanada.agregarCantidad(vista.pedirCantidad(nombre));
            orden.agregarProductoOrden(empanada);
            continuarPidiendo = vista.preguntarOtroPedido(nombre);
        }
    }
    
}

