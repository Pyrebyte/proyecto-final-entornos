package inmobiliaria;

import java.util.*;

public class Cliente extends Persona {

	String cuentaBanc;

	public Cliente(String dni, String nombre, String apellidos, String fechaNac,String telefono, String direccionP, String cuentaBanc) {
		super(dni, nombre, apellidos, fechaNac, telefono, direccionP);
		this.cuentaBanc = cuentaBanc;
	}
	
	public String getCuentaBanc() {
		return cuentaBanc;
	}

	public void setCuentaBanc(String cuentaBanc) {
		this.cuentaBanc = cuentaBanc;
	}
	
	public String toString(){
		return super.toString()
				+ "nCuenta bancaria nº " + cuentaBanc;
	}
}
