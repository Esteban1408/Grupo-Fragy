package com.grupofragy.spotify.models;

public class Usuario {
	private String nombre,correo,contrase�a,fechaNacimiento,sexo,recibirPublicidad;
	public Usuario() {
	
	}
	public void asignarNombre(String nombre) {
		this.nombre = nombre;
	}
	public void asignarCorreo(String correo) {
		this.correo = correo;
	}
	public void asignarContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	public void asignarfechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public void asignarSexo(String sexo) {
		this.sexo = sexo;
	}
	public void asignarRecibirPublicidad(String recibirPublicidad) {
		this.recibirPublicidad = recibirPublicidad;
	}
	public String obtenerNombre() {
		return nombre;
	}
	public String obtenerCorreo() {
		return correo;
	}
	public String obtenerContrase�a() {
		return contrase�a;
	}
	public String obtenerfechaNacimiento() {
		return fechaNacimiento;
	}
	public String obtenerSexo() {
		return sexo;
	}
	public String obtenerRecibirPublicidad() {
		return recibirPublicidad;
	}
	

}
