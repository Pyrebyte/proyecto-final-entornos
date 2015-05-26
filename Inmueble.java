package inmobiliaria;

public class Inmueble {

	static final int iva1 = 18;
	static final int iva2 = 21;
	String codInm;
	String direccionI;
	int superficie;
	String propietario;
	int precio;
	boolean adquirido = false;

	public Inmueble(String codInm, String direccionI, int superficie,int precio, String propietario) {
		this.codInm = codInm;
		this.direccionI = direccionI;
		this.superficie = superficie;
		this.precio = precio;
		this.propietario = propietario;
	}
	
	public String getCodInm() {
		return codInm;
	}

	public void setCodInm(String codInm) {
		this.codInm = codInm;
	}

	public String getdireccionI() {
		return direccionI;
	}

	public void setDireccion(String direccionI) {
		this.direccionI = direccionI;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	
	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public boolean getAdquirido() {
		return adquirido;
	}

	public void setAdquirido(boolean adquirido) {
		this.adquirido = adquirido;
	}
	
	public int precioInm(){
		if ((superficie < 100) && (superficie != 0))
			precio = precio * iva1;
		else
			precio = precio * iva2;
		return precio;	
	}
	
	public String toString(){
		return "El inmueble con codigo " + codInm + " situado en " + direccionI + " tiene las siguientes caracteristicas: "
				+ "\nSuperficie: " + superficie + " m2"
				+ "\nPropietario: " + propietario
				+ "\nPrecio: " + precio
				+ "\nComprado o alquilado: " + (adquirido ? "Si" : "No")
				+ "\n";	
	}
}


