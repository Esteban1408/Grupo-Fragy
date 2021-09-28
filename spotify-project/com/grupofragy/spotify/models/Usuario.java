package com.grupofragy.spotify.models;

import javax.swing.JOptionPane;

public class Usuario {
	private String nombre,correo,contraseña,fechaNacimiento,sexo,recibirPublicidad;
	public Usuario() {
	
	}
	public void asignarNombre(String nombre) {
		this.nombre = nombre;
	}
	public void verificacion() {
		String nombre1="Carlos";
		String nombre2="Pamela";
		String contraseña1="carlos123";
		String contraseña2="pamela24";
		System.out.println(nombre);
		System.out.println(contraseña);

		if (nombre.contentEquals(nombre1) || nombre.contentEquals(nombre2)) {
			if (nombre.contentEquals(nombre1) && contraseña.contentEquals(contraseña1)) {
				JOptionPane.showMessageDialog(null, "Bienvenido " + nombre1);

			} else if (nombre.contentEquals(nombre2) && contraseña.contentEquals(contraseña2)) {
				JOptionPane.showMessageDialog(null, "Bienvenido " + nombre1);

			} else {
				JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Usuario no encontrado");
		}

	}
	public void asignarCorreo(String correo) {
		this.correo = correo;
	}
	public void asignarContraseña(String contraseña) {
		this.contraseña = contraseña;
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
	public String obtenerContraseña() {
		return contraseña;
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
