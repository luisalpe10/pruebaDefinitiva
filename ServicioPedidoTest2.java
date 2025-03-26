package Entornos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ServicioPedidoTest2 {

    @Test
    void testCrearYEnviarPedido() {
        
        Ej2_ServicioEnvio servicioEnvio = new Ej2_ServicioEnvio();

       
        Ej2_ServicioPedido servicioPedido = new Ej2_ServicioPedido(servicioEnvio);

        assertTrue(servicioPedido.crearYEnviarPedido("Pedido 123"));
   
    }
}
