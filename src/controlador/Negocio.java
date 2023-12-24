package controlador;

import java.util.*;
import modelo.*;
import estructuradatos.*;
public class Negocio {
    List<Usuario> dataUsuarios= new ArrayList();
    TablaHash tablaLogin = new TablaHash();
    private String cargoUsuarioLogin = "Nada";

    public Negocio() {
        datosUsuarios();
    }
    
    public TablaHash.EntradaHash[] entradaLogin(){
        return tablaLogin.getTabla();
    }
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    public void datosUsuarios(){
        tablaLogin.insertarTabHash("admin", new Usuario("admin", "2021-01-01", "2021-01-02"));
        tablaLogin.insertarTabHash("MariaGomez", new Usuario("ufufu", "2021-01-03", "2021-01-04"));
        tablaLogin.insertarTabHash("LuisRamirez", new Usuario("123456","2021-01-05", "2021-01-06"));
        tablaLogin.insertarTabHash("CarlosTorres", new Usuario("abcd123","2021-01-07", "2021-01-08"));
        tablaLogin.insertarTabHash("AnaLopez", new Usuario("pass1234", "2021-01-09", "2021-01-10"));
        tablaLogin.insertarTabHash("PedroGarcia", new Usuario("qwerty", "2021-01-11", "2021-01-12"));
        tablaLogin.insertarTabHash("JuliaRojas", new Usuario("password","2021-01-13", "2021-01-14"));
        tablaLogin.insertarTabHash("DiegoVargas", new Usuario("hello123", "2021-01-15", "2021-01-16"));
        tablaLogin.insertarTabHash("RosaFlores", new Usuario("abc123", "2021-01-17", "2021-01-18"));
        tablaLogin.insertarTabHash("Nelson", new Usuario("letmein", "2021-01-19", "2021-01-20"));
    }//</editor-fold>

    /*----- Fin Usuarios -----*/

    public TablaHash getTablaLogin() {
        return tablaLogin;
    }

    public void setTablaLogin(TablaHash tablaLogin) {
        this.tablaLogin = tablaLogin;
    }

    public String getCargoUsuarioLogin() {
        return cargoUsuarioLogin;
    }

    public void setCargoUsuarioLogin(String cargoUsuarioLogin) {
        this.cargoUsuarioLogin = cargoUsuarioLogin;
    }
}


