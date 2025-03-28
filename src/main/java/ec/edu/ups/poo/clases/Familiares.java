package ec.edu.ups.poo.clases;

import java.util.GregorianCalendar;



public class Familiares extends Personas {
    //los atributos creados
    String parentesco;
    String tipoDeSangre;
    GregorianCalendar fechaDeNacimiento;

    //metodo constructor
    public Familiares(String parentesco, String tipoDeSangre, GregorianCalendar fechaDeNacimiento) {
        this.parentesco = parentesco;
        this.tipoDeSangre = tipoDeSangre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Familiares(int k)
    {
        super(k);

        System.out.println("Ingrese el parentesco " + (k + 1) + ": ");
        this.parentesco = scanner.next();
        System.out.println("Ingrese el tipo de sangre " + (k + 1) + ": ");
        this.tipoDeSangre = scanner.next();
        System.out.println("Ingrese el año de nacimiento "+ (k +1) + ": ");
        int año = scanner.nextInt();
        System.out.println("Ingrese el mes de nacimiento "+ (k +1) + ": ");
        int mes = scanner.nextInt();
        System.out.println("Ingrese el día de nacimiento "+ (k +1) + ": ");
        int dia = scanner.nextInt();

        GregorianCalendar gregorian = new GregorianCalendar(año,mes,dia);
        this.fechaDeNacimiento = gregorian;
    }
    public double calcularEdad(GregorianCalendar fechaDeNacimiento) {
        float FDN = fechaDeNacimiento.getTimeInMillis();
        GregorianCalendar DDH = new GregorianCalendar();
        float diaDeHoy = DDH.getTimeInMillis();
        double edad = ((((((diaDeHoy - FDN) / 1000) / 60) / 60) / 24) / 365);
        return edad;
    }

    public double getEdad() {
        return calcularEdad(fechaDeNacimiento);
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getTipoDeSangre() {
        return tipoDeSangre;
    }

    public void setTipoDeSangre(String tipoDeSangre) {
        this.tipoDeSangre = tipoDeSangre;
    }

    public GregorianCalendar getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(GregorianCalendar fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    @Override
    public String toString()
    {
        return (super.toString() +
                "Parentesco: " + parentesco +
                "\nTipo de Sangre: " + tipoDeSangre +
                "\nEdad: " + calcularEdad(fechaDeNacimiento));

    }
}