package inmobiliaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		int opcion;
		Empleado empleado;
		Inmueble inmueble;
		ArrayList<Empleado> bdEmp = new ArrayList<Empleado>();
		ArrayList<Inmueble> bdInm = new ArrayList<Inmueble>();
		Scanner teclado = new Scanner(System.in);
		
		
		do{
			System.out.print("=============================================\n\n");
	        System.out.print(
	        		"Introduzca la opción que desee realizar: \n"
	        		+ "\n1) Ver datos de la agencia"
	                + "\n2) Contratar empleado"
	                + "\n3) Ver empleados"			
	                + "\n4) Despedir empleado"	
	                + "\n5) Añadir inmueble"
	                + "\n6) Ver inmuebles"
	                + "\n0) Salir"
	                + "\n\nOPCION: ");
	        
	        opcion = teclado.nextInt();
	        teclado.nextLine();
	        System.out.print("\n=============================================\n\n");
	        switch (opcion){
	        
	        	case 1:
	        		Agencia agencia = new Agencia("TodoInmueble S.L.","Granada Capital","652492209","+34 652942290","Camino de Ronda, 137");
	        		System.out.println(agencia + "\n\n(Pulse ENTER)");
	        		teclado.nextLine();
	        		break;
	            case 2: 
	                System.out.print("Añadir empleado\n\n");	           
	                System.out.print("Introduzca su código: ");
	                String codEmp = teclado.nextLine();
	                System.out.print("Introduzca su DNI: ");
	                String dni = teclado.nextLine();
	                System.out.print("Introduzca su nombre: ");
	                String nombre = teclado.nextLine();
	                System.out.print("Introduzca sus apellidos: ");
	                String apellidos = teclado.nextLine();
	                System.out.print("Introduzca su fecha de nacimiento: ");
	                String fechaNac = teclado.nextLine();
	                System.out.print("Introduzca su telefono: ");
	                String telefono = teclado.nextLine();
	                System.out.print("Introduzca su direccion: ");
	                String direccionP = teclado.nextLine();   
	                
	                empleado = new Empleado(dni, nombre, apellidos, fechaNac, telefono, direccionP, codEmp);	
	                bdEmp.add(empleado);
	                           
	                System.out.print("\nEmpleado contratado. (Pulse ENTER)\n");
	                teclado.nextLine();
	                break;
	                
	            case 3: 
	                System.out.print("Lista de empleados\n\n");
	                for (Empleado i : bdEmp) {
	                	System.out.println(i);
	                }
	                
	                System.out.print("\n(Pulse ENTER)\n");
	                teclado.nextLine(); 
	                break; 
	                
	            case 4: 
	            	System.out.print("Teclee la posición del empleado a despedir"
	            					+ "\n\nPOSICION: ");
	            	bdEmp.remove(teclado.nextInt() - 1);
	            	
	            	System.out.print("\nEmpleado despedido. (Pulse ENTER)\n");
	                teclado.nextLine();
	                break;
	                
	            case 5: 
	                System.out.print("Añadir inmueble\n\n");	           
	                System.out.print("Introduzca su código: ");
	                String codInm = teclado.nextLine();
	                System.out.print("Introduzca su direccion: ");
	                String direccionI = teclado.nextLine();
	                System.out.print("Introduzca su superficie: ");
	                int superficie = teclado.nextInt();
	                teclado.nextLine();
	                System.out.print("Introduzca su precio: ");
	                int precio = teclado.nextInt();
	                teclado.nextLine();
	                System.out.print("Introduzca el nombre del propietario: ");
	                String propietario = teclado.nextLine();		               

	                inmueble = new Inmueble(codInm,direccionI,superficie,precio,propietario);
	                inmueble.precioInm();
	                inmueble.setAdquirido(true);
	                bdInm.add(inmueble);
	                           
	                System.out.print("\nInmueble añadido. (Pulse ENTER)\n");
	                teclado.nextLine();
	                break;
	                
	            case 6: 
	                System.out.print("Lista de inmuebles\n\n");
	                for (Inmueble i : bdInm) {
	                	System.out.println(i);
	                }
	                
	                System.out.print("\n(Pulse ENTER)\n");
	                teclado.nextLine();
	                
	                break; 
	            
	            case 0:
	                System.out.println("\nSaliendo");
	                break;

	            default:
	                System.out.println("\nOpción incorrecta");
	        }      
	                
	        }while (opcion!=0); 
	}
	

}

