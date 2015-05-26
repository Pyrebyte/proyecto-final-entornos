package inmobiliaria;

public class Agencia {
	
	String nombre;
	String zonaAct;
	String fax;
	String telefono;
	String direccion;
	
    public Agencia(String nombre,String zonaAct,String fax, String telefono,String direccion) {
    	this.nombre = nombre;
    	this.zonaAct = zonaAct;
    	this.fax = fax;
    	this.telefono = telefono;
    	this.direccion = direccion;
    }
    
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setZonaAct(String zonaAct) {
		this.nombre = zonaAct;
	}

	public String getZonaAct() {
		return this.zonaAct;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getFax() {
		return this.fax;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDireccion() {
		return this.direccion;
	}
	
	public String toString(){
		return "La agencia " + nombre + " cuya zona de actuacion es " + zonaAct + " tiene los siguientes datos: "
				+ "\nFax: " + fax 
				+ "\nTelefono: " + telefono
				+ "\nDireccion: " + direccion;
	}
}



