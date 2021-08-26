package com.grupofragy.spotify.models;

public class Cancion {
	String nombre,foto;
	public Cancion(String nombre,String foto) {
		this.nombre = nombre;
		this.foto = foto;
	}
	public void imprimirCancion(double duracion,int usuariosQueLoEscuchan) {
		System.out.println("Nombre: "+nombre);
		System.out.println("Foto: "+foto);
		System.out.println("Canciones: "+duracion);
		System.out.println("Usuarios que lo siguen: "+usuariosQueLoEscuchan);
	}

}
