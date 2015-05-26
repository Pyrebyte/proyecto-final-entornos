package inmobiliaria;

public class Local extends Inmueble {

	boolean licencia;
	
	public Local(String codInm, String direccionI, int superficie,int precio, String propietario, boolean licencia) {
		super(codInm, direccionI, superficie, precio, propietario);
		this.licencia = licencia;
	}
	
	public boolean getLicencia() {
		return licencia;
	}

	public void setLicencia(boolean licencia) {
		this.licencia = licencia;
	}
	
	public String toString(){
		return super.toString()
				+ "\nLicencia: " + (licencia ? "Tiene" : "No tiene") + "\n";	
	}
}
