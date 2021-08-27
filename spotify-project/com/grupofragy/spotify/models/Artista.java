package com.grupofragy.spotify.models;

public class Artista {
	private String nombre,foto;
	private Integer usuariosQueLoSiguen;
	public Artista() {
		
	}
	public void asignarNombre(String nombre) {
		this.nombre = nombre;
	}
	public void asignarFoto(String foto) {
		this.foto = foto;
	}
	public void asignarUsuariosQueLoSiguen(Integer usuariosQueLoSiguen) {
		this.usuariosQueLoSiguen = usuariosQueLoSiguen;
	}
	public String obtenerNombre() {
		return nombre;
	}
	public String obtenerFoto() {
		return foto;
	}
	public Integer obtenerUsuariosQueLoSiguen() {
		return usuariosQueLoSiguen;
	}
}
