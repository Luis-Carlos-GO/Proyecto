//*
// Universidad Fidélitas
// Introducción a la Programación
// Avance de proyecto clase Registro
// Realizado Por: Yarón Hernández Chavarría
// 17-03-21
//*
package registro_usuarios;

import javax.swing.JOptionPane;

public class Registro_Usuarios {
    
    String Nombre,Cedula,Telefono,correo;
    
    public class Cliente {

        private String cedula;
        private String nombre;
        private String telefono;
        private String correo;

        public Cliente(String cedula , String Nombre , String telefono ) {

        }//fin de Cliente

        public Cliente() {
            this.cedula = cedula;
            this.nombre = nombre;
            this.telefono = telefono;
        
        }//Fin de Cliente

        public String getCedula() {
            return cedula;
        
        }//Fin de GetCedula

        public void setCedula(String cedula) {
            this.cedula = cedula;
        
        }//Fin de SetCedula

        public String getNombre() {
            return nombre;
        
        }//Fin de GetNombre

        public void setNombre(String nombre) {
            this.nombre = nombre;
        
        }//Fin de SetNombre
        
        public String getTelefono() {
            return telefono;
        
        }//Fin de GetTelefono

        public void settelefono(String telefono) {
            this.telefono = telefono;
        
        }//Fin de SetTelefono

         public String getcorreo() {
            return correo;
        
        }//Fin de GetCorreo

        public void setcorreo(String correo) {
            this.correo = correo;
        
        }//Fin de SetCorreo
        
}//Fin de la clase Cliente

    public void Registro () {
        
            JOptionPane.showMessageDialog(null,"Registro");
        int opcion;
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    " "
                    + "\nNombre de usuario "
                    + "\ncedula "
                    + "\nTelefono "
                    + "\nCorreo "));
       
        }while(opcion!=0);
    }
    

public static void main(String[] args) {
   
    
}//Fin de Main
    
}//Fin de Registro_Usuarios
