package org.clinica.entity;

import java.util.Date;

public class Paciente extends Personapaciente{
	
	private int idHClinica;
	private Personapaciente personapaciente;
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
	public Paciente(int dni, String apyno, String direccion, char sexo, Date fecha_nac, Personapaciente personapaciente,
			int dni2, int idHClinica, Paciente paciente, Persona persona, int idHClinica2,
			Personapaciente personapaciente2) {
		super(dni, apyno, direccion, sexo, fecha_nac, personapaciente, dni2, idHClinica, paciente, persona);
		idHClinica = idHClinica2;
		personapaciente = personapaciente2;
	}
	public Paciente(){}
}
