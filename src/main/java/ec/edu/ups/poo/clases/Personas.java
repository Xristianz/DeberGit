package ec.edu.ups.poo.clases;

import java.util.Scanner;
// Me gusta el moises
// me gusta el matias
public class Personas {
    String nombre;
    String apellido;
    String cedula;
    String direccion;

    Scanner scanner = new Scanner(System.in);

    public Personas(String nombre, String apellido, String cedula, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
    }
    public Personas(int i )
    {
        System.out.println("Ingrese la cédula " + (i+1) + ": ");
        this.cedula = scanner.next();
        System.out.println("Ingrese el nombre " + (i+1) + ": ");
        this.nombre = scanner.next();
        System.out.println("Ingrese el apellido " + (i+1) + ": ");
        this.apellido = scanner.next();
        System.out.println("Ingrese la dirección " + (i+1) + ": ");
        this.direccion = scanner.next();
    }
    public Personas(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String toString()
    {
        return ("\nNombre: " + nombre +
                "\nApellido: " + apellido +
                "\nCédula: " + cedula +
                "\nDirección: " + direccion +"\n");
    }

}
