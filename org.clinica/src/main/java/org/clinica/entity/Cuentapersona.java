package org.clinica.entity;

public class Cuentapersona {
	private int idCuenta;
	private int dni;
	private Cuenta cuenta;
	private Persona persona;
	/**
	 * @return the idCuenta
	 */
	public int getIdCuenta() {
		return idCuenta;
	}
	/**
	 * @param idCuenta the idCuenta to set
	 */
	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}
	/**
	 * @return the dni
	 */
	public int getDni() {
		return dni;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(int dni) {
		this.dni = dni;
	}
	/**
	 * @return the cuenta
	 */
	public Cuenta getCuenta() {
		return cuenta;
	}
	/**
	 * @param cuenta the cuenta to set
	 */
	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	/**
	 * @return the persona
	 */
	public Persona getPersona() {
		return persona;
	}
	/**
	 * @param persona the persona to set
	 */
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public Cuentapersona(int idCuenta, int dni, Cuenta cuenta, Persona persona) {
		super();
		this.idCuenta = idCuenta;
		this.dni = dni;
		this.cuenta = cuenta;
		this.persona = persona;
	}
	public Cuentapersona(){}
}
