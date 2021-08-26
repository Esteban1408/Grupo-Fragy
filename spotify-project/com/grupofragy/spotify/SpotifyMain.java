package com.grupofragy.spotify;

import com.grupofragy.spotify.models.Artista;
import com.grupofragy.spotify.models.Cancion;
import com.grupofragy.spotify.models.Playlist;
import com.grupofragy.spotify.models.Usuario;

public class SpotifyMain {
	static String nombre,correo,contraseña;
	public static void Datos() {
	}
	public static void main(String[] args) {
		Usuario usuario1 = new Usuario();
		usuario1.asignarNombre("Pepe Casillas");
		usuario1.asignarCorreo("pepe@gmail.com");
		usuario1.asignarContraseña("qweqwe231");
		usuario1.asignarfechaNacimiento("25/08/2001");
		usuario1.asignarSexo("M");
		usuario1.asignarRecibirPublicidad("S");
		String nombre1="Nombre: "+usuario1.obtenerNombre();
		String correo1="Correo: "+usuario1.obtenerCorreo();
		String contraseña1="Contraseña: "+usuario1.obtenerContraseña();
		String fecha1="Fecha de nacimiento: "+usuario1.obtenerfechaNacimiento();
		String sexo1="Sexo: "+usuario1.obtenerSexo();
		String recibirPublicidad1="¿Desea recibir publicidad? S/N:  "+usuario1.obtenerRecibirPublicidad();
		imprimirResultado(nombre1);
		imprimirResultado(correo1);
		imprimirResultado(contraseña1);
		imprimirResultado(fecha1);
		imprimirResultado(sexo1);
		imprimirResultado(recibirPublicidad1);
		System.out.println(" ");
		Usuario usuario2 = new Usuario();
		usuario2.asignarNombre("Marco Casillas");
		usuario2.asignarfechaNacimiento("8/03/2004");
		String nombre2="Nombre: "+usuario1.obtenerNombre();
		String fecha2="Fecha de nacimiento: "+usuario1.obtenerfechaNacimiento();
		imprimirResultado(nombre2);
		imprimirResultado(fecha2);
		System.out.println("---------------------------");
		Artista artista1 = new Artista("Martin Garrix","Foto");
		artista1.imprimirArtista("Higher Ground,Latency", 30040120);
		System.out.println(" ");
		Artista artista2 = new Artista("David Guetta","Foto");
		artista2.imprimirArtista("Titanium,Remember", 60340580);
		System.out.println("---------------------------");
		Cancion cancion1 = new Cancion("Higher Ground","Foto");
		cancion1.imprimirCancion(3.50, 1002002);
		System.out.println(" ");
		Cancion cancion2 = new Cancion("Latency","Foto");
		cancion2.imprimirCancion(3.34, 3042302);
		System.out.println("---------------------------");
		Playlist playlist1 = new Playlist("Foto Album","El rascacielos","Metalica");
		playlist1.imprimirPlaylist("<3", "Muchas canciones aqui");
		System.out.println(" ");
		Playlist playlist2 = new Playlist("Foto Album","You are not Alone","David Guetta");
		playlist2.imprimirPlaylist("<3", "Muchas canciones aqui");
		
	}
	public static void imprimirResultado(String resultado) {
		System.out.println(resultado);
	}

}
