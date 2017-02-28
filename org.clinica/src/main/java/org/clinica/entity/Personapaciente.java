package org.clinica.entity;

import java.util.Date;

public class Personapaciente extends Persona{
	private int dni;
	private int idHClinica;
	private Paciente paciente;
	private Persona persona;
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
	 * @return the idHClinica
	 */
	public int getIdHClinica() {
		return idHClinica;
	}
	/**
	 * @param idHClinica the idHClinica to set
	 */
	public void setIdHClinica(int idHClinica) {
		this.idHClinica = idHClinica;
	}
	/**
	 * @return the paciente
	 */
	public Paciente getPaciente() {
		return paciente;
	}
	/**
	 * @param paciente the paciente to set
	 */
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
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
	public Personapaciente(int dni, String apyno, String direccion, char sexo, Date fecha_nac,
			Personapaciente personapaciente, int dni2, int idHClinica, Paciente paciente, Persona persona) {
		super(dni, apyno, direccion, sexo, fecha_nac, personapaciente);
		dni = dni2;
		this.idHClinica = idHClinica;
		this.paciente = paciente;
		this.persona = persona;
	}
	public Personapaciente(){}
}
