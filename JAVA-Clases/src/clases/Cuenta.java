package clases;

import java.util.Date;

public class Cuenta {
	//Atributos globales PRIVADAS
	private String numCuenta;
	private String nombre;
	private String iban;
	private boolean activo;
	private float saldo;
	private Date fechaRegistro;
	private String[] movimientos;
	
	//Constructor
	public Cuenta() {
		this.movimientos = new String[100];
	}
	
	//Métodos Getters & Setters
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNumCuenta() {
		return this.numCuenta;
	}
	
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
		//Mi setter también da valor al iban 
		//Mediante su setter PRIVADO
		this.setIban();
	}
	
	public boolean isActivo() {
		return this.activo;
	}
	
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	private void setIban() {
		this.iban = "ES" + this.numCuenta;
	}
	
	public String getIban() {
		return this.iban;
	}
	
	//Métodos y Funciones propios
	public void toogleActivo() {
		this.activo = !this.activo;
	}
	
}
