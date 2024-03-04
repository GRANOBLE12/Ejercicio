/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basico;

import java.util.Scanner;

/**
 *
 * @author 1059356842
 */
public class Estudiante {

    //Declaro la Matriz que contiene tipos String y Double
    String estudiantes[][] = new String[4][4];

    Scanner scan = new Scanner(System.in);

    //Método para guardar la Información del Estudiante
    void registrar() {
        for (int i = 0; i < estudiantes.length; i++) {

            //Pido los datos
            System.out.print("Digite el Código del Estudiante " + (i + 1) + ": ");
            String código = scan.next();
            System.out.print("Digite el Apellido del Estudiante " + (i + 1) + ": ");
            String apellido = scan.next();
            System.out.print("Digite el Nombre del Estudiante " + (i + 1) + ": ");
            String nombre = scan.next();
            System.out.print("Digite la Definitiva del Estudiante " + (i + 1) + ": ");
            String definitiva = scan.next();
            System.out.println();

            //Guardó los datos en la Matriz
            estudiantes[i][0] = código;
            estudiantes[i][1] = apellido;
            estudiantes[i][2] = nombre;
            estudiantes[i][3] = definitiva;
        }
        System.out.println("Información Registrada exitosamente!");
    }

    //Método para Listar la Información del Estudiante
    void listar() {
        System.out.println("\n*Estudiantes*");
        System.out.println("Código / Apellido / Nombre / Definitiva");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println(estudiantes[i][0] + " / "
                    + estudiantes[i][1] + " / "
                    + estudiantes[i][2] + " / "
                    + estudiantes[i][3]);
        }
    }

    //Método para Buscar al Estudiante por el Código
    void buscar() {

        //Pido el Código a Buscar
        System.out.print("Digite el Código para Buscar al Estudiante: ");
        String códigoBuscar = scan.next();
        System.out.println();

        boolean bandera = false; //Variable Auxiliar
        for (int i = 0; i < estudiantes.length; i++) {

            //Comparo
            if (códigoBuscar.equals(estudiantes[i][0])) {
                System.out.println("Código del Estudiante: " + estudiantes[i][0]
                        + " / " + "Apellido del Estudiante: " + estudiantes[i][1]
                        + " / " + "Nombre del Estudiante: " + estudiantes[i][2]
                        + " / " + "Definitiva del Estudiante: " + estudiantes[i][3]);
                bandera = true;
            }
        }
        //Revisó la bandera
        if (bandera == false) {
            System.out.println("No se encontró ningún Estudiante con el Código digitado");
            System.out.println();
        }
    }

    // Método para Hallar el Promedio de las Definitivas de los Estudiantes
    void promediar() {
        double suma = 0;
        System.out.println("Promedio de las Notas Definitivas de los Estudiantes");
        for (int i = 0; i < estudiantes.length; i++) {
            // Convertir el valor de la columna de definitivas a double
            double definitiva = Double.parseDouble(estudiantes[i][3]);
            suma += definitiva;
        }
        double promedio = suma / estudiantes.length;
        System.out.println("El Promedio de las Definitivas de los Estudiantes es: " + promedio);
    }

    //Menú
    void menu() {
        int opcion = 0;
        do {
            System.out.println("""
                               \n*MENÚ OPCIONES*
                               GESTIÓN DE ESTUDIANTES
                               
                               1. Registrar Estudiantes
                               2. Listar Estudiantes
                               3. Buscar Estudiante
                               4. Promedio Definitivas
                               5. Salir
                               
                               Opción:""");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    this.registrar();
                    break;
                case 2:
                    this.listar();
                    break;
                case 3:
                    this.buscar();
                    break;
                case 4:
                    this.promediar();
                    break;
            }
        } while (opcion > 0 && opcion < 5);
    }
}
