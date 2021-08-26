package com.grupofragy.spotify.models;

public class Playlist {
	String fotoAlbum,nombre,artista;
	public Playlist(String fotoAlbum,String nombre,String artista) {
		this.fotoAlbum = fotoAlbum;
		this.nombre = nombre;
		this.artista = artista;
	}
	public void imprimirPlaylist(String iconoFavorito,String cancion) {
		System.out.println("Foto: "+fotoAlbum);
		System.out.println("Nombre: "+nombre);
		System.out.println("Artista: "+artista);
		System.out.println("Icono: "+iconoFavorito);
		System.out.println("Canciones: "+ cancion);
	}

}
