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

public class RegistroClientes {
    
   private String cedula;
        private String nombre;
        private String telefono;
        private String correo;

        public RegistroClientes(String cedula , String Nombre , String telefono ) {

        }//fin de Cliente

        public RegistroClientes() {
            this.cedula = cedula;
            this.nombre = nombre;
            this.telefono = telefono;
        
        }//Fin de Cliente

        public String getCedula() {
            cedula = JOptionPane.showInputDialog("Viajeros Aventure\n"
                    + "-Digite su cedula-");
            return cedula;
        
        }//Fin de GetCedula

        public void setCedula(String cedula) {
            this.cedula = cedula;
//        
        }//Fin de SetCedula

        public String getNombre() 
        {
            nombre = JOptionPane.showInputDialog("Viajeros Aventure\n"
                    + "-Digite su nombre-");
            return nombre;
        
        }//Fin de GetNombre

        public void setNombre(String nombre) {
            this.nombre = nombre;
        
        }//Fin de SetNombre
        
        public String getTelefono() {
            telefono = JOptionPane.showInputDialog("Viajeros Aventure\n"
                    + "-Digite su número de telefono-");
            return telefono;
        
        }//Fin de GetTelefono

        public void settelefono(String telefono) {
            this.telefono = telefono;
        
        }//Fin de SetTelefono

         public String getcorreo() {
             correo = JOptionPane.showInputDialog("Viajeros Aventure\n"
                    + "-Digite su correo-");
            return correo;
        
        }//Fin de GetCorreo

        public void setcorreo(String correo) {
            this.correo = correo;
        
        }//Fin de SetCorreo
        
    
    
    public void Registro () {
        
        JOptionPane.showMessageDialog(null,"Registro Viajeros Aventure\n"
                + "Nombre: "+nombre+"\n"
                        + "Cedula: "+cedula+"\n"
                                + "Telefono: "+telefono+"\n"
                                        + "Correo: "+correo);
        
     JOptionPane.showMessageDialog(null,"-El registro fue efectuado satisfactoriamente-\n"
             + "-Bienvenido a Viajeros Aventure "+nombre+"-");  
        
    }
    
    
}
