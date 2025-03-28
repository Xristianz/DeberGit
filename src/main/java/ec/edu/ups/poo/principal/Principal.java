package ec.edu.ups.poo.principal;

import java.util.Arrays;
import java.util.Scanner;

import ec.edu.ups.poo.clases.Familiares;
import ec.edu.ups.poo.clases.Personas;

public class Principal
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Cuantas personas va a ingresar: ");
        int numPersonas = scan.nextInt();

        Personas[] persona = new Personas[numPersonas];

        for (int i = 0; i < numPersonas; i++) {
            persona[i] = new Personas(i);
        }
        System.out.println("Cuantos familiares va a ingresar: ");
        int numFamiliares = scan.nextInt();

        Familiares[] familiar = new Familiares[numFamiliares];

        for (int j = 0; j < numFamiliares; j++) {
            familiar[j] = new Familiares(j);
        }

        /*
        System.out.println("PERSONAS");
        System.out.print(Arrays.toString(persona));
        System.out.println("FAMILIARES");
        System.out.print(Arrays.toString(familiar));
        */

        System.out.println("\nPERSONAS");
        for (int i = 0; i < numPersonas; i++) {
            System.out.println("\nNombre de la Persona " + (i + 1) + ": " + persona[i].getNombre());
            System.out.println("Apellido de la Persona " + (i + 1) + ": " + persona[i].getApellido());
            System.out.println("Cédula de la Persona " + (i + 1) + ": " + persona[i].getCedula());
            System.out.println("Dirección de la Persona " + (i + 1) + ": " + persona[i].getDireccion());
        }
        System.out.println("\nFAMILIARES");
        for (int j = 0; j < numFamiliares; j++) {
            System.out.println("\nNombre del Familiar " + (j + 1) + ": " + familiar[j].getNombre());
            System.out.println("Apellido del Familiar " + (j + 1) + ": " + familiar[j].getApellido());
            System.out.println("Cédula del Familiar " + (j + 1) + ": " + familiar[j].getCedula());
            System.out.println("Dirección del Familiar " + (j + 1) + ": " + familiar[j].getDireccion());
            System.out.println("Parentesco del Familiar " + (j + 1) + ": " + familiar[j].getParentesco());
            System.out.println("Tipo de Sangre del Familiar " + (j + 1) + ": " + familiar[j].getTipoDeSangre());
            System.out.println("Edad del Familiar " + (j + 1) + ": " + familiar[j].getEdad());

        }

    }
}
