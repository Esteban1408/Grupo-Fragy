package com.grupofragy.spotify.models;

public class Artista {
	String nombre,foto;
	public Artista(String nombre,String foto) {
		this.nombre =  nombre;
		this.foto = foto;
	}
	public void imprimirArtista(String cancion,int usuariosQueLoSiguen) {
		System.out.println("Nombre: "+nombre);
		System.out.println("Foto: "+foto);
		System.out.println("Canciones: "+cancion);
		System.out.println("Usuarios que lo siguen: "+usuariosQueLoSiguen);
	}
}
