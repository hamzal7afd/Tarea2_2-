package ProyectoTarea2;

import javax.swing.JOptionPane;

public class VectoresNombres {

	public class VectorNombres { 
		 
		 String[] nombre; 
		int posicion=0; 
		 
		public VectorNombres(int numero) { 
		 
		 nombre=new String[numero]; 
		 } 
		 
		public void setGuardarNombre(String valNombre) { 
		 
		 nombre[posicion]=valNombre; 
		 posicion+=1; 
		 } 
		 
		public void getNombres() { 
		 
		 String cadena=""; 
		 System.out.println("Los nombres son: "); 
		 
		 for(int j=0;j<nombre.length;j++){ 
		 
		 cadena=cadena + nombre[j] + "; "; 
		 } 
		 JOptionPane.showMessageDialog(null, "Los nombres son: " + cadena); 
		 } 
		}
}
