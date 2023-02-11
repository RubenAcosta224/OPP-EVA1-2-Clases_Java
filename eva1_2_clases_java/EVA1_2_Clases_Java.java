/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_2_clases_java;

/**
 *
 * @author invitado
 */
public class EVA1_2_Clases_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona persona1=new Persona();
        //System.out.print(persona1);
        /*persona1.nombre="Ruben";
        persona1.apellido="Acosta";
        persona1.edad=41;
        persona1.estadoCivil=false;
        
        System.out.println(persona1.apellido);*/
        
        persona1.setNombre("Ruben");
        persona1.setApellido("Acosta");
        persona1.setEdad(18);
        persona1.setEstadoCivil(false);
        
        /*
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getApellido());
        System.out.println(persona1.getEdad());
        System.out.println(persona1.getEstadoCivil());
                */
        
        persona1.imprimirDatos();
        
        
        //persona 2
        
        Persona persona2=new Persona();
        
        persona2.setNombre("Pedro");
        persona2.setApellido("Garcia");
        persona2.setEdad(19);
        persona2.setEstadoCivil(true);
        
        persona2.imprimirDatos();
    }
    
}
