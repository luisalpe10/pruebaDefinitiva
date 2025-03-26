package Entornos;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Ej3Test {
    @Test
    void testRegistrarYVerificarProducto() {
       
        Ej3_BaseDeDatosProductos baseDeDatos = new Ej3_BaseDeDatosProductos();
        
        
        Ej3_GestorProductos gestorProductos = new Ej3_GestorProductos(baseDeDatos);
        
       
        String producto = "Producto 123";
        
      
        gestorProductos.registrarProducto(producto);
        
     
        boolean productoRegistrado = gestorProductos.productoRegistrado(producto);
        
  
        assertTrue(productoRegistrado, "El producto debería estar registrado en la base de datos.");
}
}
