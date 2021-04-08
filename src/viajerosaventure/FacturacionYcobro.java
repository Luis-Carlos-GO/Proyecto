/*
Introducción a la programación
Universidad Fidélitas
Proyecto: Viajeros Aventure
Integrantes: Cristopher Navarro Guevara
             Yarón Hernández Chavarría
             Luis Carlos Gonzalez Ortega
 */
package viajerosaventure;

import javax.swing.JOptionPane;


public class FacturacionYcobro 
{
    RegistroClientes lla = new RegistroClientes();
    
        String Lugar,Targeta;
        int Edad,opcion;
        double Total,Subtotal,IVA;
     

       public void total () {
        
        Lugar = "Cancu";  Edad = 1; Subtotal = 2000;    
        IVA = Subtotal*0.13;
        Total = Subtotal + IVA ;
        
    }  
    
    public void Factu () {
        
            JOptionPane.showMessageDialog(null,"Facturacion del viaje","Facturacion",1);
        
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "-Bienvenido a Viajeros Aventure- "
                    + "\nDigite el metodo de pago que desea utilizar: "
                    + "\n1.Targeta de credito "
                    + "\n2.Targeta de debito "
                    + "\n3.Metodo de pago en Efectivo "
                    + "\n4.Factura "
                    + "\n0.Si desea salir ","Facturacion",1)); 
        
        switch(opcion) {
            case 1 :
                     Targeta = JOptionPane.showInputDialog(null,lla.getNombre()+" por favor ingrese el numero de su targeta de credito ","Facturacion",1);
                    
                break;
            case 2 :
                     Targeta = JOptionPane.showInputDialog(null,lla.getNombre()+" por favor ingrese el numero de su targeta de debito ","Facturacion ",1);
                  
            case 3 :
                    JOptionPane.showMessageDialog(null,lla.getNombre()+" El pago se realizara en el Hotel","Facturacion",1);
                break;
            case 4 :
                JOptionPane.showMessageDialog(null,
                    lla.getNombre()+" Bienvenido a Viajeros Aventure esta es su factura"
                    + "\n  Destino  |Subtotal  |  IVA     | Total "
                    + "\n "+ Lugar+"    | "+Subtotal+ "   | " +IVA +"   | "+Total   
                    + "\n "); 
                break;
        }
        }while(opcion!=0);
    }
    
    
}
