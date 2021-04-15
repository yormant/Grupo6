/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package creacionales.prototype;


public class Empleado implements Prototype{

    private int id;
    private String nombre, cargo, direccion;
    private double salario;   

    public Empleado(int id, String nombre, String cargo, String direccion, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.direccion = direccion;
        this.salario = salario;
    }
    
    public void mostrarEmpleado(){
        System.out.println(" Información del Empleado ");
        System.out.println("---------------------------");
        System.out.println("ID \t Nombre \t\t Cargo \t\t\t Dirección \t\t Salario");
        System.out.println(id+"\t"+nombre+"\t\t"+cargo+"\t\t"+direccion+"\t\t"+salario);
    }
    
    @Override
    public Prototype clonar() {
        return new Empleado(id,nombre,cargo,direccion,salario);
    }

}
