package app;

import data.GestorDatos;
import model.Empleado;

public class Main {

    public static void main(String[] args) {

        GestorDatos gestor = new GestorDatos();

        gestor.cargarEmpleados();

        System.out.println("=================================");
        System.out.println("LLANQUIHUE TOUR");
        System.out.println("LISTA DE EMPLEADOS");
        System.out.println("=================================\n");

        gestor.mostrarEmpleados();

        System.out.println("\n=================================");
        System.out.println("TOTAL EMPLEADOS: "
                + gestor.getEmpleados().size());
        System.out.println("=================================");

        System.out.println("\n=== EMPLEADOS Y SUELDOS ===");

        for (Empleado empleado : gestor.getEmpleados()) {
            System.out.println(
                    empleado.getNombre()
                            + " - $"
                            + empleado.getSueldo()
            );
        }

        System.out.println("\n=== EMPLEADOS Y DIRECCIÓN ===");

        for (Empleado empleado : gestor.getEmpleados()) {
            System.out.println(
                    empleado.getNombre()
                            + " - "
                            + empleado.getDireccion().getCalle()
                            + ", "
                            + empleado.getDireccion().getCiudad()
                            + ", "
                            + empleado.getDireccion().getRegion()
            );
        }
    }
}