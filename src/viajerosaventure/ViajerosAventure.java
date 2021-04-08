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

public class ViajerosAventure 
{

    public static void main(String[] args) 
    {
 
       ViajerosAventure llamar = new ViajerosAventure();
       llamar.Menuprincipal();
        
        
    }
    
    public void Menuprincipal(){
    
     int menu;
        do{
        menu = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a: Viajeros Aventure\n"
                + "Tu agencia de viajes de confianza\n"
                + "1) Registro de clientes\n"
                + "2) Reservaciones\n"
                + "3) Paquetes de viajes\n"
                + "4) Facturación y cobros\n"
                + "5) Salir\n"));
        switch (menu)
        {
            case 1: 
                RegistroClientes llamado1 =new RegistroClientes();
                llamado1.getNombre();
                llamado1.getCedula();
                llamado1.getTelefono();
                llamado1.getcorreo();
                llamado1.Registro();
             break;
        
            case 2:
                
                Reservaciones llamado = new Reservaciones();
                llamado.destino();
             break;
             
            case 3:
                PaquetesDeViajes llamado3 = new PaquetesDeViajes();
                llamado3.viajes();
                break;
                
            case 4: 
                
               FacturacionYcobro llamada = new FacturacionYcobro();
                llamada.Factu();
                llamada.total();
                break;
        }
        
        }while(menu!=5);
    
    
    }
    
    
}
