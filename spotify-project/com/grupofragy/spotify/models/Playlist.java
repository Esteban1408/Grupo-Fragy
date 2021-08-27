package com.grupofragy.spotify.models;

public class Playlist {
	private String fotoAlbum,nombre,iconoFavorito;
	public Playlist() {
		
	}
	public void asignarFotoAlbum(String fotoAlbum) {
		this.fotoAlbum = fotoAlbum;
	}
	public void asignarNombre(String nombre) {
		this.nombre = nombre;
	}
	public void asignarIconoFavorito(String iconoFavorito) {
		this.iconoFavorito = iconoFavorito;
	}
	public String obtenerFotoAlbum() {
		return fotoAlbum;
	}
	public String obtenerNombre() {
		return nombre;
	}
	public String obtenerIconoFavorito() {
		return iconoFavorito;
	}
	

}
