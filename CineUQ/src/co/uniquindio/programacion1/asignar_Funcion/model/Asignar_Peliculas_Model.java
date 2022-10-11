package co.uniquindio.programacion1.asignar_Funcion.model;

import java.util.ArrayList;

public class Asignar_Peliculas_Model {
	
	
	public ArrayList getFuncion () {
		ArrayList<ArrayList<String>> funciones= new ArrayList<ArrayList<String>>();
		String laHuerfana = "La Huerfana\n120 min\nClasificacion +15\nSinopsis*imagen.jpg";
		String elLobo = "El Lobo\n150 min\nClasificacion +18\nSinopsis*imagen.jpg";
		String spider = "SpiderMan\\n200 min\\nClasificacion +18\\nSinopsis*imagen.jpg";
		String tres = "3:00 PM";
		String cinco = "5:00 PM";
		String ocho = "8:00 PM";
		
		ArrayList<String> funcionX = new ArrayList<String>();
		funcionX.add("2022/10/06");
		funcionX.add(tres);
		funcionX.add(laHuerfana);
		
		ArrayList<String> funcionY = new ArrayList<String>();
		funcionX.add("2022/10/06");
		funcionX.add(cinco);
		funcionX.add(elLobo);
		
		
		ArrayList<String> funcionZ = new ArrayList<String>();
		funcionZ.add("2022/10/06");
		funcionZ.add(ocho);
		funcionZ.add(elLobo);
		
		
		funciones.add(funcionX);
		funciones.add(funcionY);	
		funciones.add(funcionZ);	

		System.out.print(funciones);

		return funciones;
	}
	
	
	

}
