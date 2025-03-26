package Entornos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Ej4Test {

    @Test
    void testIntegracionOrdenYPago() {
      
        Ej4_ServicioPagos servicioPagos = new Ej4_ServicioPagos();
        
        
        Ej4_ServicioOrdenes servicioOrdenes = new Ej4_ServicioOrdenes(servicioPagos);

        
        boolean resultado = servicioOrdenes.procesarOrden(150.0);

    
        assertTrue(resultado, "La orden debería procesarse correctamente.");
    }

    @Test
    void testFalloEnElPago() {
       
        Ej4_ServicioPagos servicioPagos = new Ej4_ServicioPagos();
        
       
        Ej4_ServicioOrdenes servicioOrdenes = new Ej4_ServicioOrdenes(servicioPagos);

    
        boolean resultado = servicioOrdenes.procesarOrden(2000.0);

     
        assertFalse(resultado, "La orden no debería procesarse debido a un error en el pago.");
        
    }  
      
}
