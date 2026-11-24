/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package modeloDAO;

import modelo.DAO.usuarioDAO;
import modelo.entidad.usuario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class usuarioTest {
    
    @Test
    public void testLoginCorrecto() {
        usuarioDAO dao = new usuarioDAO();

        usuario resultado = dao.iniciarSesion("admin", "1234");

        assertNotNull(resultado);
        assertEquals("admin", resultado.getUsuario());
        assertEquals("Administrador", resultado.getRol());
        assertEquals("Activo", resultado.getEstado());
    }

    @Test
    public void testContraseñaIncorrecta() {
        usuarioDAO dao = new usuarioDAO();

        usuario resultado = dao.iniciarSesion("admin", "9999");

        assertNull(resultado);
    }

    @Test
    public void testUsuarioInexistente() {
        usuarioDAO dao = new usuarioDAO();

        usuario resultado = dao.iniciarSesion("usuarioFalso", "12345");

        assertNull(resultado);
    }

    @Test
    public void testUsuarioInactivo() {
        usuarioDAO dao = new usuarioDAO();

        usuario resultado = dao.iniciarSesion("adminInactivo", "12345");

        assertNull(resultado);
    }

    @Test
    public void testUsuarioSinRolAdministrador() {
        usuarioDAO dao = new usuarioDAO();

        usuario resultado = dao.iniciarSesion("usuarioNormal", "12345");

        assertNull(resultado);
    }
    
    
    
    @Test
    public void testCamposVacios() {
        usuarioDAO dao = new usuarioDAO();

        usuario resultado = dao.iniciarSesion("", "");

        assertNull(resultado);
    }
}