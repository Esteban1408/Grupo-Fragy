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
		usuario2.asignarNombre("Karmen Caldera");
		usuario2.asignarCorreo("karmen23@gmail.com");
		usuario2.asignarContraseña("safff2121");
		usuario2.asignarfechaNacimiento("12/04/2002");
		usuario2.asignarSexo("F");
		usuario2.asignarRecibirPublicidad("N");
		String nombre2="Nombre: "+usuario2.obtenerNombre();
		String correo2="Correo: "+usuario2.obtenerCorreo();
		String contraseña2="Contraseña: "+usuario2.obtenerContraseña();
		String fecha2="Fecha de nacimiento: "+usuario2.obtenerfechaNacimiento();
		String sexo2="Sexo: "+usuario2.obtenerSexo();
		String recibirPublicidad2="¿Desea recibir publicidad? S/N:  "+usuario2.obtenerRecibirPublicidad();
		imprimirResultado(nombre2);
		imprimirResultado(correo2);
		imprimirResultado(contraseña2);
		imprimirResultado(fecha2);
		imprimirResultado(sexo2);
		imprimirResultado(recibirPublicidad2);
		System.out.println("---------------------------");
		Artista artista1 = new Artista();
		artista1.asignarNombre("Martin Garrix");
		artista1.asignarFoto("Foto Chida aqui");
		artista1.asignarCancion("safff2121");
		artista1.asignarUsuariosQueLoSiguen(2131321);
		String nombre1Cancion="Nombre: "+artista1.obtenerNombre();
		String Foto1Cancion="Foto: "+artista1.obtenerFoto();
		String Cancion1="canciones: "+artista1.obtenerCancion();
		String usuariosQueLoSiguen1="Usuarios que lo siguen: "+artista1.obtenerUsuariosQueLoSiguen();
		imprimirResultado(nombre1Cancion);
		imprimirResultado(Foto1Cancion);
		imprimirResultado(Cancion1);
		imprimirResultado(usuariosQueLoSiguen1);
		System.out.println(" ");
		Artista artista2 = new Artista();
		artista2.asignarNombre("Martin Garrix");
		artista2.asignarFoto("Foto Chida aqui");
		artista2.asignarCancion("safff2121");
		artista2.asignarUsuariosQueLoSiguen(2131321);
		String nombre2Cancion="Nombre: "+artista2.obtenerNombre();
		String Foto2Cancion="Foto: "+artista2.obtenerFoto();
		String Cancion2="canciones: "+artista1.obtenerCancion();
		String usuariosQueLoSiguen2="Usuarios que lo siguen: "+artista1.obtenerUsuariosQueLoSiguen();
		imprimirResultado(nombre1Cancion);
		imprimirResultado(Foto1Cancion);
		imprimirResultado(Cancion1);
		imprimirResultado(usuariosQueLoSiguen1);

		
		
		System.out.println("---------------------------");
		Artista cancion1 = new Artista();
		cancion1.asignarNombre("Martin Garrix");
		cancion1.asignarFoto("Foto Chida aqui");
		cancion1.asignarCancion("safff2121");
		cancion1.asignarUsuariosQueLoSiguen(2131321);
		String nombre1Cancion="Nombre: "+artista2.obtenerNombre();
		String Foto1Cancion="Foto: "+artista2.obtenerFoto();
		String Cancion2="canciones: "+artista1.obtenerCancion();
		String usuariosQueLoSiguen2="Usuarios que lo siguen: "+artista1.obtenerUsuariosQueLoSiguen();
		imprimirResultado(nombre1Cancion);
		imprimirResultado(Foto1Cancion);
		imprimirResultado(Cancion1);
		imprimirResultado(usuariosQueLoSiguen1);
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
