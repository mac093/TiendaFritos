package tiendafritos;

import modelo.OrdenModelo;
import modelo.LoginModelo;
import vista.TiendaVista;
import controlador.TiendaControlador;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class TiendaFritos {

    public static void main(String[] args) {
        
        try {
            System.setOut(new PrintStream(System.out, true, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        
        OrdenModelo ordenModelo = new OrdenModelo();
        TiendaVista tiendaVista = new TiendaVista();
        LoginModelo loginModelo = new LoginModelo();
        TiendaControlador tiendaControlador = new TiendaControlador(loginModelo,tiendaVista,ordenModelo);
        
        tiendaControlador.iniciar();
    }
}
