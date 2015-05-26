package inmobiliaria;

public class Piso extends Inmueble {

	int numHab;
	int numBan;
	boolean calefaccion;
	int antiguedad;

	public Piso(String codInm, String direccionI, int superficie,int precio, String propietario, int numHab, int numBan, boolean calefaccion,int antiguedad) {
		super(codInm, direccionI, superficie, precio, propietario);
		this.numHab = numHab;
		this.numBan = numBan;
		this.calefaccion = calefaccion;
		this.antiguedad = antiguedad;
	}
	
	public int getNumHab() {
		return numHab;
	}

	public void setNumHab(int numHab) {
		this.numHab = numHab;
	}

	public int getNumBan() {
		return numBan;
	}

	public void setNumBan(int numBan) {
		this.numBan = numBan;
	}

	public boolean getCalefaccion() {
		return calefaccion;
	}

	public void setCalefaccion(boolean calefaccion) {
		this.calefaccion = calefaccion;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	public String toString(){
		return super.toString()
				+ "\nNumero de habitaciones: " + numHab
				+ "\nNumero de baños: " + numBan
				+ "\nTiene calefaccion: " + (calefaccion ? "Si" : "No")
				+ "nAntigüedad: " + antiguedad + " años";
	}
}


