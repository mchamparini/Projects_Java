package org.clinica.entity;

public class Tipocuenta {
	private int idTipoCuenta;
	private String nombre;
	private String descripcion;
	private Cuenta cuenta;
	/**
	 * @return the idTipoCuenta
	 */
	public int getIdTipoCuenta() {
		return idTipoCuenta;
	}
	/**
	 * @param idTipoCuenta the idTipoCuenta to set
	 */
	public void setIdTipoCuenta(int idTipoCuenta) {
		this.idTipoCuenta = idTipoCuenta;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
	public Tipocuenta(int idTipoCuenta, String nombre, String descripcion, Cuenta cuenta) {
		super();
		this.idTipoCuenta = idTipoCuenta;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.cuenta = cuenta;
	}
	public Tipocuenta(){}
}
