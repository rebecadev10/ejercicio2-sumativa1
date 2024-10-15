package ejercicio2;

import java.util.Scanner;

public class Estudiante {
//	definimos nuestros atributos privados, datos sensibles
	private int id;
    private String nombre;
    private String apellido;
    private int cedula;
    private int diaNacimiento;
    private String mesNacimiento;
    private int yearNacimiento;
    private String carrera;
    
//    inicializamos
    public Estudiante(int id,String nombre, String apellido, int cedula, int diaNacimiento, String mesNacimiento, int yearNacimiento, String carrera) {
    	this.id=id;
        this.nombre = " ";
        this.apellido = " ";
        this.cedula = 0;
        this.diaNacimiento = 0;
        this.mesNacimiento = " ";
        this.yearNacimiento = 0;
        this.carrera = " ";
    }
//generamos nuestros getters y setters
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public String getMesNacimiento() {
        return mesNacimiento;
    }

    public void setMesNacimiento(String mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int getYearNacimiento() {
        return yearNacimiento;
    }

    public void setYearNacimiento(int yearNacimiento) {
        this.yearNacimiento = yearNacimiento;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
//creamos nuestro metodo de registro y hacemos uso de la libreria scanner para el ingreso de datos
    public void registrarDatos() {
    	
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la información del estudiante numero "+this.id+": ");

        System.out.println("Ingrese el nombre del estudiante: ");
        this.nombre = scanner.nextLine();

        System.out.println("Ingrese el apellido del estudiante: ");
        this.apellido = scanner.nextLine();

        System.out.println("Ingrese la cédula del estudiante: ");
        this.cedula = scanner.nextInt();

        System.out.println("Ingrese la fecha de nacimiento del estudiante:");
        System.out.print("Día: ");
        this.diaNacimiento = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea restante

        System.out.println("Mes: ");
        this.mesNacimiento = scanner.nextLine();

        System.out.print("Año: ");
        this.yearNacimiento = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea restante

        System.out.println("Ingrese la carrera a cursar: ");
        this.carrera = scanner.nextLine();

        System.out.println("Registrado Exitosamente!");
    }
//tenemos otro metodo para mostrar la informacion en pantalla de los datos ingresados 
    public void mostrarInformacion() {
    	
        System.out.println(id+"        " + nombre + "          " + apellido + "          " + cedula + "        " + diaNacimiento + " de " + mesNacimiento + " de " + yearNacimiento + "           " + carrera);
    }
}
