package co.uniquindio.programacion1.asignar_Funcion.model;

import java.util.ArrayList;

public class Asignar_Peliculas_Model {
	
	
	public ArrayList getFuncion () {
		ArrayList<ArrayList<String>> funciones= new ArrayList<ArrayList<String>>();
		String laHuerfana = "La Huérfana: El Origen, 120 Min, Clasificacion +15, Sinopsis: La desquiciada Leena Klammer organiza una brillante fuga de un manicomio de Estonia y viaja a Estados Unidos robando la identidad de la hija.";
		String tadeo = "Tadeo Jones 3, 90 Min, Clasificacion +7777777, Sinopsis: El sueño más grande de Tad es ser aceptado por sus colegas arqueólogos, pero su naturaleza accidentada se interpone. Cuando él, inadvertidamente, destruye un sarcófago extraño, se conjura un hechizo que pone en peligro la vida de sus amigos.";
		String superMascotas = "Súper-Mascotas, 110 Min, Clasificacion +7, Sinopsis: Cuando la Liga de la Justicia es capturada por Lex Luthor, el perro de Superman, Krypto, forma un equipo de mascotas de refugio a las que se les otorgan superpoderes.";
		String tres = "3:00 PM";
		String cinco = "5:00 PM";
		String ocho = "8:00 PM";
		
		ArrayList<String> funcion1 = new ArrayList<String>();
		funcion1.add("2022-10-13");
		funcion1.add("0");
		funcion1.add(tres);
		funcion1.add(laHuerfana);
		funcion1.add("laHuerfana.jpg");
		
		
		ArrayList<String> funcion2 = new ArrayList<String>();
		funcion2.add("2022-10-13");
		funcion2.add("1");
		funcion2.add(cinco);
		funcion2.add(tadeo);
		funcion2.add("tadeo.jpg");
		
		
		
		ArrayList<String> funcion3 = new ArrayList<String>();
		funcion3.add("2022/10/06");
		funcion3.add("2");
		funcion3.add(ocho);
		funcion3.add(superMascotas);
		funcion3.add("supermascotas.jpg");
		
	
		funciones.add(funcion1);
		funciones.add(funcion2);	
		funciones.add(funcion3);	

		return funciones;
	}
	
	
	
	
	
	

}
