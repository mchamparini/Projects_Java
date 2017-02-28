package org.clinica.entity;

import java.util.Date;

public class Persona {
	
	private int dni;
	private String apyno;
	private String direccion;
	private char sexo;
	private Date fecha_nac;
	private Personapaciente personapaciente;
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
	 * @return the apyno
	 */
	public String getApyno() {
		return apyno;
	}
	/**
	 * @param apyno the apyno to set
	 */
	public void setApyno(String apyno) {
		this.apyno = apyno;
	}
	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return the sexo
	 */
	public char getSexo() {
		return sexo;
	}
	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	/**
	 * @return the fecha_nac
	 */
	public Date getFecha_nac() {
		return fecha_nac;
	}
	/**
	 * @param fecha_nac the fecha_nac to set
	 */
	public void setFecha_nac(Date fecha_nac) {
		this.fecha_nac = fecha_nac;
	}
	/**
	 * @return the personapaciente
	 */
	public Personapaciente getPersonapaciente() {
		return personapaciente;
	}
	/**
	 * @param personapaciente the personapaciente to set
	 */
	public void setPersonapaciente(Personapaciente personapaciente) {
		this.personapaciente = personapaciente;
	}
	public Persona(int dni, String apyno, String direccion, char sexo, Date fecha_nac,
			Personapaciente personapaciente) {
		super();
		this.dni = dni;
		this.apyno = apyno;
		this.direccion = direccion;
		this.sexo = sexo;
		this.fecha_nac = fecha_nac;
		this.personapaciente = personapaciente;
	}
	public Persona(){}
}
