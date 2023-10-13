/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.poo;

/**
 *
 * @author Sara Cardenas
 * Clase que contiene los metodos de los que hace una persona
 */
public class Persona {
    private String nombre, direccion,sexo;
    private int edad,peso;
    
    /**
     * Constructor vacio de persona
     */
    public Persona() {
    }

    /**
     * constructor lleno de persona
     * @param nombre nombre de la persona en String
     * @param direccion direccion de la persona en String
     * @param sexo sexo de la persona en String
     * @param edad edad que tiene la persona en primitivo int
     * @param peso peso de la persona en primitivo int
     */
    public Persona(String nombre, String direccion,String sexo, int edad, int peso) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
        this.peso = peso;
        this.sexo = sexo;
        
    }

    /**
     * Metodo get nombre
     * @return devuelve el nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Recibe como parametro un nombre de tipo String
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Método get direccion
     * @return devuelve la direccion de la persona
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Recibe como parámetro una direccion de tipo String
     * @param direccion 
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Método get edad
     * @return devuelve la edad de la persona
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Recibe como parametro una edad de tipo int
     * @param edad 
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Método get sexo
     * @return devuelve el sexo de la persona
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Recibe como parametro el sexo de la persona de tipo String
     * @param sexo 
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * Metodo get peso
     * @return devuelve el peso de la persona
     */
    public int getPeso() {
        return peso;
    }

    /**
     * Recibe como parametro el peso de la persona de tipo int
     * @param peso 
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    /**
     * Metodo que sirve para que la persona hable
     * @param palabras lo que la persona esta diciendo
     */
    public void hablar(String palabras){
        System.out.println(palabras);
    }
    
    /**
     * Metodo que sirve para saber los metros que va a caminar
     * @param metros 
     */
    public void caminar(int metros){
        System.out.println("Voy a caminar"+metros);
    }
    
    /**
     * Método que sirve para saber los minutos que lee la persona
     * @param minutos 
     */
    public void leer (int minutos){
        System.out.println("Yo leo" +minutos +"al dia");
    }
    
    /**
     * Método que sirve para saber cuando piensa la persona
     */
    public void pensar(){
        System.out.println("Estoy pensando");
    }
    
    /**
     * Metodo que sirve para saber cuantas horas duerme una persona al dia
     * @param horas 
     */    
    public void dormir (int horas){
        System.out.println("Dormí"+ horas + "en el dia");
    }

    
    /**
     * Metodo sobre escrito que muestra los valores de los atributos
     * @return regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", direccion=" + direccion + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso + '}';
    }
        
}
