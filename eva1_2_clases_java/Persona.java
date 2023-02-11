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
public class Persona {
    //atributos
    private String nombre;
    private String apellido;
    private int edad;
    private boolean estadoCivil;
    //metodos: comportamiento
    //metodos get-->leer, metodo set--> escribir
    
    //modificador valor de retorno, nombre(argumentos){implementacion}
    
    public String getNombre(){
        return nombre;
    }
    
    //void vacio, no retorna nada
    public void setNombre(String valor){
        nombre=valor;
    }
    
    
    public String getApellido(){
        return apellido;
    }
    
    //void vacio, no retorna nada
    public void setApellido(String valor){
        apellido=valor;
    }
    
    public int getEdad(){
        return edad;
    }
    
    //void vacio, no retorna nada
    public void setEdad(int valor){
        edad=valor;
    }
    
    public boolean getEstadoCivil(){
        return estadoCivil;
    }
    
    //void vacio, no retorna nada
    public void setEstadoCivil(boolean valor){
        estadoCivil=valor;
    }
    
    public void imprimirDatos(){
        System.out.println("Nombre completo: "+nombre+" "+apellido);
        System.out.println("Edad: "+edad);
        
        if(estadoCivil==true) System.out.println("Casado");   
        else System.out.println("Soltero");

    }
    
}
