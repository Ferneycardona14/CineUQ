package co.uniquindio.programacion1.asignar_Funcion.model;

import java.util.ArrayList;

public class Asignar_Peliculas_Model {
	
	
	public ArrayList getFuncion () {
		ArrayList<ArrayList<String>> funciones= new ArrayList<ArrayList<String>>();
		String laHuerfana = "La Huérfana: El Origen\n120 min\nClasificacion +15\nSinopsis: La desquiciada Leena Klammer organiza una brillante fuga de un manicomio de Estonia y viaja a Estados Unidos robando la identidad de la hija desaparecida de una familia adinerada. Sin embargo, la nueva vida de Leena como \"Esther\" llega con un giro inesperado y la enfrenta a una madre que hará cualquier cosa para proteger a su familia a toda costa.";
		String elLobo = "El Lobo\n150 min\nClasificacion +18\nSinopsis";
		String spider = "SpiderMan\\n200 min\\nClasificacion +18\\nSinopsis";
		String tres = "3:00 PM";
		String cinco = "5:00 PM";
		String ocho = "8:00 PM";
		
		ArrayList<String> funcion1 = new ArrayList<String>();
		funcion1.add("2022/10/06");
		funcion1.add(tres);
		funcion1.add(laHuerfana);
		funcion1.add("laHuerfana.jpg");
		
		
		ArrayList<String> funcion2 = new ArrayList<String>();
		funcion2.add("2022/10/06");
		funcion2.add(cinco);
		funcion2.add(elLobo);
		
		
		ArrayList<String> funcion3 = new ArrayList<String>();
		funcion3.add("2022/10/06");
		funcion3.add(ocho);
		funcion3.add(elLobo);
		
		
		funciones.add(funcion1);
		funciones.add(funcion2);	
		funciones.add(funcion3);	

		System.out.print(funciones);

		return funciones;
	}
	
	
	

}
