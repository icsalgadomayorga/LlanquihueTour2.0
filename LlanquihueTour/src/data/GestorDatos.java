package data;

/**
 * Clase que gestiona los datos de las personas
 * del sistema LlanquihueTour.
 */

import model.Direccion;
import model.Empleado;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GestorDatos {

    private ArrayList<Empleado> empleados;

    public GestorDatos() {
        empleados = new ArrayList<>();
    }

    public void cargarEmpleados() {

        empleados.clear();

        try {

            BufferedReader br =
                    new BufferedReader(
                            new FileReader("Resources/empleados.txt")
                    );

            String linea;

            while ((linea = br.readLine()) != null) {

                if (linea.trim().isEmpty()) {
                    continue;
                }

                String[] datos = linea.split(";");

                if (datos.length != 7) {
                    System.out.println("Formato incorrecto: " + linea);
                    continue;
                }

                String nombre = datos[0].trim();
                String rut = datos[1].trim();
                String calle = datos[2].trim();
                String ciudad = datos[3].trim();
                String region = datos[4].trim();
                String cargo = datos[5].trim();

                // Permite leer sueldos con puntos de miles
                String sueldoTexto = datos[6].trim().replace(".", "");
                double sueldo = Double.parseDouble(sueldoTexto);

                Direccion direccion = new Direccion(
                        calle,
                        ciudad,
                        region
                );

                Empleado empleado = new Empleado(
                        nombre,
                        rut,
                        direccion,
                        cargo,
                        sueldo
                );

                empleados.add(empleado);
            }

            br.close();

            System.out.println("Se cargaron "
                    + empleados.size()
                    + " empleados.");

        } catch (IOException e) {

            System.out.println("Error al abrir el archivo.");
            System.out.println(e.getMessage());
        }
    }

    public void mostrarEmpleados() {

        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
}