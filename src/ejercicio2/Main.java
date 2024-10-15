//Ejercicio numero 2 Estudiante, similiar a los ejercicios de la clase, Rebeca rodriguez CI:30.051.282 Programacion II UBA SAN ANTONIO DE LOS ALTOS
package ejercicio2;

public class Main {

    public static void main(String[] args) {
        System.out.println("Este sistema registrará e imprimirá la información de 5 estudiantes:");

        // Creamos nuestros objetos de estudiantes, y e inicializamos los valores, el id es el unico atributo que no se modificara 
        Estudiante estudiante1 = new Estudiante(1,null, null, 0, 0, null, 0, null);
        Estudiante estudiante2 = new Estudiante(2,null, null, 0, 0, null, 0, null);
        Estudiante estudiante3 = new Estudiante(3,null, null, 0, 0, null, 0, null);
        Estudiante estudiante4 = new Estudiante(4,null, null, 0, 0, null, 0, null);
        Estudiante estudiante5 = new Estudiante(5,null, null, 0, 0, null, 0, null);

        //llamamos nuestro metodo de registro mediante nuestro objeto 
        estudiante1.registrarDatos();
        estudiante2.registrarDatos();
        estudiante3.registrarDatos();
        estudiante4.registrarDatos();
        estudiante5.registrarDatos();

        // Mostramos la información de los estudiantes con el metodo de mostrar informacion , procurando que en pantalla se muestre una tabla con los datos :)
        System.out.println("\nID        Nombre        Apellido          Cédula      Fecha de Nacimiento        Carrera");
        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();
        estudiante3.mostrarInformacion();
        estudiante4.mostrarInformacion();
        estudiante5.mostrarInformacion();
    }
}
