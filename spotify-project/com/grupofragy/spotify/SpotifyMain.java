package com.grupofragy.spotify;

import javax.swing.JOptionPane;

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
		nombre=JOptionPane.showInputDialog("Ingrese nombre del usuario");
		contraseña=JOptionPane.showInputDialog("Ingrese la contraseña del usuario");
		usuario1.asignarNombre(nombre);
		usuario1.asignarCorreo("pepe@gmail.com");
		usuario1.asignarContraseña(contraseña);
		usuario1.asignarfechaNacimiento("25/08/2001");
		usuario1.asignarSexo("M");
		usuario1.asignarRecibirPublicidad("S");
		usuario1.verificacion();
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
		
		Cancion cancion1 = new Cancion();
		cancion1.asignarNombre("Latency");
		cancion1.asignarFoto("Foto Chida aqui");
		cancion1.asignarDuracion(3.1);
		cancion1.asignarUsuariosQueLaEscuchan(654321);
		String nombre1Cancion="Nombre: "+cancion1.obtenerNombre();
		String Foto1Cancion="Foto: "+cancion1.obtenerFoto();
		String Duracion1="Duración: "+cancion1.obtenerDuracion();
		String usuariosQueLaEscuchan1="Usuarios que la Escuchan: "+cancion1.obtenerUsuariosQueLaEscuchan();
		imprimirResultado(nombre1Cancion);
		imprimirResultado(Foto1Cancion);
		imprimirResultado(Duracion1);
		imprimirResultado(usuariosQueLaEscuchan1);
		System.out.println(" ");
		Cancion cancion2 = new Cancion();
		cancion2.asignarNombre("Higher Ground");
		cancion2.asignarFoto("Foto Chida aqui");
		cancion2.asignarDuracion(3.4);
		cancion2.asignarUsuariosQueLaEscuchan(2131321);
		String nombre2Cancion="Nombre: "+cancion1.obtenerNombre();
		String Foto2Cancion="Foto: "+cancion1.obtenerFoto();
		String Duracion2="Duración: "+cancion1.obtenerDuracion();
		String usuariosQueLaEscuchan2="Usuarios que la Escuchan: "+cancion1.obtenerUsuariosQueLaEscuchan();
		imprimirResultado(nombre2Cancion);
		imprimirResultado(Foto2Cancion);
		imprimirResultado(Duracion2);
		imprimirResultado(usuariosQueLaEscuchan2);
		
		System.out.println("---------------------------");
		
		Artista artista1 = new Artista();
		artista1.asignarNombre("Martin Garrix");
		artista1.asignarFoto("Foto Chida aqui");
		artista1.asignarUsuariosQueLoSiguen(2131321);
		String nombre1Artista="Nombre: "+artista1.obtenerNombre();
		String Foto1Artista="Foto: "+artista1.obtenerFoto();
		String usuariosQueLoSiguen1="Usuarios que lo siguen: "+artista1.obtenerUsuariosQueLoSiguen();
		imprimirResultado(nombre1Artista);
		imprimirResultado(Foto1Artista);
		imprimirResultado(nombre1Cancion);
		imprimirResultado(Foto1Cancion);
		imprimirResultado(Duracion1);
		imprimirResultado(usuariosQueLaEscuchan1);
		imprimirResultado(usuariosQueLoSiguen1);
		System.out.println(" ");
		Artista artista2 = new Artista();
		artista2.asignarNombre("Martin Garrix");
		artista2.asignarFoto("Foto Chida aqui");
		artista2.asignarUsuariosQueLoSiguen(2131321);
		String nombre2Artista="Nombre: "+artista2.obtenerNombre();
		String Foto2Artista="Foto: "+artista2.obtenerFoto();
		String usuariosQueLoSiguen2="Usuarios que lo siguen: "+artista1.obtenerUsuariosQueLoSiguen();
		imprimirResultado(nombre2Artista);
		imprimirResultado(Foto2Artista);
		imprimirResultado(nombre2Cancion);
		imprimirResultado(Foto2Cancion);
		imprimirResultado(Duracion2);
		imprimirResultado(usuariosQueLaEscuchan2);
		imprimirResultado(usuariosQueLoSiguen2);
	
		System.out.println("---------------------------");
		
		Playlist playlist1 = new Playlist();
		playlist1.asignarFotoAlbum("Foto chida aqui x2");
		playlist1.asignarNombre("Se fue con otro");
		playlist1.asignarIconoFavorito("S");
		String fotoalbum1="Foto: "+playlist1.obtenerFotoAlbum();
		String nombreAlbum1="Album: "+playlist1.obtenerNombre();
		String iconoFavorito1="Le gusta? S/N: "+playlist1.obtenerIconoFavorito();
		imprimirResultado(fotoalbum1);
		imprimirResultado(nombreAlbum1);
		imprimirResultado(iconoFavorito1);
		System.out.println(" ");
		Playlist playlist2 = new Playlist();
		playlist2.asignarFotoAlbum("Foto chida aqui x2");
		playlist2.asignarNombre("Grupo marrano");
		playlist2.asignarIconoFavorito("N");
		String fotoalbum2="Foto: "+playlist2.obtenerFotoAlbum();
		String nombreAlbum2="Album: "+playlist2.obtenerNombre();
		String iconoFavorito2="Le gusta? S/N: "+playlist2.obtenerIconoFavorito();
		imprimirResultado(fotoalbum2);
		imprimirResultado(nombreAlbum2);
		imprimirResultado(iconoFavorito2);
		
	}
	public static void imprimirResultado(String resultado) {
		System.out.println(resultado);
	}

}
