package Entornos;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class ServicioUsuariosTest1 {

    @Test
    void testRegistrarVerificarUsuario() {
       
        Ej1_BaseDeDatos baseDeDatos = new Ej1_BaseDeDatos();
        Ej1_ServicioUsuarios servicioUsuarios = new Ej1_ServicioUsuarios(baseDeDatos);

   
        String usuario = "Carlos";

      
        servicioUsuarios.registrarUsuario(usuario);

       
        assertTrue(servicioUsuarios.usuarioRegistrado(usuario), "El usuario tiene que estar registrado en la base de datos.");
    }
}