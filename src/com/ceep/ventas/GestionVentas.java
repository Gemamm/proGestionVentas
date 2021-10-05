
package com.ceep.ventas;

import com.ceep.domain.*;


public class GestionVentas {


    public static void main(String[] args) {
        
       Producto P1 = new Producto("peras",5.4);
       Producto P2 = new Producto("manzanas",6.4);
       Producto P3 = new Producto("platanos",7);
       Order pedido1 = new Order();
       pedido1.agregarProducto(P1);
       pedido1.agregarProducto(P2);
       pedido1.agregarProducto(P3);
       pedido1.mostrarOrder();
       
    }
    
}
