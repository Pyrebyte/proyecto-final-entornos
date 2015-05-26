package inmobiliaria;

import java.util.*;

public class Persona {

	String dni;
	String nombre;
	String apellidos;
	String fechaNac;
	String telefono;
	String direccionP;

	public Persona(String dni, String nombre, String apellidos, String fechaNac,String telefono, String direccionP) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNac = fechaNac;
		this.telefono = telefono;
		this.direccionP = direccionP;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDni() {
		return this.dni;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getApelidos() {
		return this.apellidos;
	}
	
	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getFechaNac() {
		return this.fechaNac;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTelefono() {
		return this.telefono;
	}
	
	public void setdireccionP(String direccionP) {
		this.direccionP = direccionP;
	}

	public String getdireccionP() {
		return this.direccionP;
	}
	
	public String toString(){
		return "Para la persona con DNI " + dni + " sus datos son los siguentes: "
				+ "\nNombre: " + nombre 
				+ "\nFecha de nacimiento: " + fechaNac
				+ "\nTelefono: " + telefono
				+ "\nDirecion: " + direccionP;
	}
}




