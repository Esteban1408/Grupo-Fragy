package com.grupofragy.spotify.models;

public class Cancion {
	private String nombre,foto;
	private Double duracion;
	private Integer usuariosQueLaEscuchan;
	public Cancion() {
		
	}
	public void asignarNombre(String nombre) {
		this.nombre = nombre;
	}
	public void asignarFoto(String foto) {
		this.foto = foto;
	}
	public void asignarDuracion(Double duracion) {
		this.duracion = duracion;
	}
	public void asignarUsuariosQueLaEscuchan(Integer usuariosQueLaEscuchan) {
		this.usuariosQueLaEscuchan = usuariosQueLaEscuchan;
	}
	public String obtenerNombre() {
		return nombre;
	}
	public String obtenerFoto() {
		return foto;
	}
	public Double obtenerDuracion() {
		return duracion;
	}
	public Integer obtenerUsuariosQueLaEscuchan() {
		return usuariosQueLaEscuchan;
	}

}
