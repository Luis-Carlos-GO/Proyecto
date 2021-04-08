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

public class Reservaciones 
{
    private String[] pais = new String[]{"Costa Rica","Mexico","Panamá","Colombia"};
    private String[] destino1 = new String[]{"Parque Nacional Manuel Antonio","Monte Verde","Parque Nacional Corcovado","Parque Nacional Tortuguero"};
      public String[] getDestino1() {
        return destino1;
    }
    private String[] destino2 = new String[]{"Cancún","Chichén Itzá","Playa del Carmen","Cascadas de hierve el agua, Oaxaca"};

    public String[] getDestino2() {
        return destino2;
    }
    
    private String[] destino3 = new String[]{"Ciudad de Panamá","Bocas del toro","Archipielago de San Blas","Isla Coiba"};

    public String[] getDestino3() {
        return destino3;
    }
    
    private String[] destino4 = new String[]{"Cartagena","Bogotá","Medellín","Santa Marta"};

    public String[] getDestino4() {
        return destino4;
    }
    
    private String[] hotelC = new String[]{"Hotel Monte Campana","Gran hotel Costa Rica","Hotel InterContinental","Paraiso Orocay Lodge"};
    private String[] hotelM = new String[]{"Hotel Zócalo Central","Hotel Galería Plaza Reforma","City Express","Gran Hotel Amazonas"};
    private String[] hotelP = new String[]{"Hotel El Panamá","Grand International Hotel","Hotel Hampton","Hilton Panamá"};
    private String[] hotelColom = new String[]{"Hotel NH Collection","Hotel Medellín","Hotel Central Plaza","Ibis Hotel Cartagena"};
    
    private int menuC;
    private int menuM;
    private int menuP;
    private int menuColom;
    
    int menu3;

    public int getMenuC() {
        menuC = Integer.parseInt(JOptionPane.showInputDialog("Viajeros Aventure\n"
                        + "-Elige el hotel de tu preferencia-\n"
                    + "1) "+hotelC[0]+"\n"
                            + "2) "+hotelC[1]+"\n"
                                    + "3) "+hotelC[2]+"\n"
                                            + "4) "+hotelC[3]+"\n"
                                                    + "5) Salir"));
        JOptionPane.showMessageDialog(null,"-Hospedaje en "+hotelC[menuC-1]+" \n"
                + "reservado correctamente-");
        return menuC;
    }

    public int getMenuM() {
        menuM = Integer.parseInt(JOptionPane.showInputDialog("Viajeros Aventure\n"
                        + "-Elige el hotel de tu preferencia-\n"
                    + "1) "+hotelM[0]+"\n"
                            + "2) "+hotelM[1]+"\n"
                                    + "3) "+hotelM[2]+"\n"
                                            + "4) "+hotelM[3]+"\n"
                                                    + "5) Salir"));
        JOptionPane.showMessageDialog(null,"-Hospedaje en "+hotelM[menuM-1]+" \n"
                + "reservado correctamente-");
        return menuM;
    }

    public int getMenuP() 
    {
        menuP = Integer.parseInt(JOptionPane.showInputDialog("Viajeros Aventure\n"
                        + "-Elige el hotel de tu preferencia-\n"
                    + "1) "+hotelP[0]+"\n"
                            + "2) "+hotelP[1]+"\n"
                                    + "3) "+hotelP[2]+"\n"
                                            + "4) "+hotelP[3]+"\n"
                                                    + "5) Salir"));
        JOptionPane.showMessageDialog(null,"-Hospedaje en "+hotelP[menuP-1]+" \n"
                + "reservado correctamente-");
        return menuP;
    }

    public int getMenuColom() {
        menuColom = Integer.parseInt(JOptionPane.showInputDialog("Viajeros Aventure\n"
                        + "-Elige el hotel de tu preferencia-\n"
                    + "1) "+hotelColom[0]+"\n"
                            + "2) "+hotelColom[1]+"\n"
                                    + "3) "+hotelColom[2]+"\n"
                                            + "4) "+hotelColom[3]+"\n"
                                                    + "5) Salir"));
        JOptionPane.showMessageDialog(null,"-Hospedaje en "+hotelColom[menuColom-1]+" \n"
                + "reservado correctamente-");
        return menuColom;
    }
    
    
    
    
    
    
    public void destino(){
    
        for(int i = 0;i<1;i++){
            
        int menu2;
           do{ menu2 = Integer.parseInt(JOptionPane.showInputDialog("Viajeros Aventure\n"
                   + "-Elige el país de preferencia-\n"
                    + "1) "+pais[0]+"\n"
                            + "2) "+pais[1]+"\n"
                                    + "3) "+pais[2]+"\n"
                                            + "4) "+pais[3]+"\n"
                                                    + "5) Salir"));

        switch (menu2){
        
            case 1: 
                
                menu3 = Integer.parseInt(JOptionPane.showInputDialog("Viajeros Aventure\n"
                        + "-Elige el destino-\n"
                    + "1) "+destino1[0]+"\n"
                            + "2) "+destino1[1]+"\n"
                                    + "3) "+destino1[2]+"\n"
                                            + "4) "+destino1[3]+"\n"
                                                    + "5) Salir"));
        JOptionPane.showMessageDialog(null,"-Destino a "+destino1[menu3-1]+"\nreservado correctamente-");
        Reservaciones llamado = new Reservaciones();
        llamado.getMenuC();
        
        break;
        
            case 2: 
                int menu4;
                menu4 = Integer.parseInt(JOptionPane.showInputDialog("Viajeros Aventure\n"
                        + "-Elige el destino-\n"
                    + "1) "+destino2[0]+"\n"
                            + "2) "+destino2[1]+"\n"
                                    + "3) "+destino2[2]+"\n"
                                            + "4) "+destino2[3]+"\n"
                                                    + "5) Salir"));
                JOptionPane.showMessageDialog(null,"-Destino a "+destino2[menu4-1]+"\nreservado correctamente-");
                Reservaciones llamado2 = new Reservaciones();
                llamado2.getMenuM();
        break; 
        
            case 3: 
                int menu5;
                menu5 = Integer.parseInt(JOptionPane.showInputDialog("Viajeros Aventure\n"
                        + "-Elige el destino-\n"
                    + "1) "+destino3[0]+"\n"
                            + "2) "+destino3[1]+"\n"
                                    + "3) "+destino3[2]+"\n"
                                            + "4) "+destino3[3]+"\n"
                                                    + "5) Salir"));
                JOptionPane.showMessageDialog(null,"-Destino a "+destino3[menu5-1]+"\nreservado correctamente-");
                Reservaciones llamado3  = new Reservaciones();
                llamado3.getMenuP();
                break;
                
            case 4: 
                int menu6;
                menu6 = Integer.parseInt(JOptionPane.showInputDialog("Viajeros Aventure\n"
                        + "-Elige el destino-\n"
                    + "1) "+destino4[0]+"\n"
                            + "2) "+destino4[1]+"\n"
                                    + "3) "+destino4[2]+"\n"
                                            + "4) "+destino4[3]+"\n"
                                                    + "5) Salir"));
                JOptionPane.showMessageDialog(null,"-Destino a "+destino4[menu6-1]+"\nreservado correctamente-");
                Reservaciones llamado4 = new Reservaciones();
                llamado4.getMenuColom();
                break;
                
        }
        
           }while(i<0);
        } 
    }

    public void fechas(){
    
    
    }
    
    public void transporte(){
    
    
    }
    
    
    
    
}
