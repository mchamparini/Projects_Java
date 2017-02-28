package org.clinica.controller;

import org.clinica.entity.Cuenta;
import org.clinica.entity.Cuentapersona;
import org.clinica.entity.Paciente;
import org.clinica.entity.Tipocuenta;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PacienteDao {
	Paciente paciente = new Paciente();
	Cuenta cuenta = new Cuenta();
	Cuentapersona cuentapersona = new Cuentapersona();
	Tipocuenta tipocuenta = new Tipocuenta();
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	Session session = null;// sessionFactory.openSession();

	public void crearPaciente(Paciente paciente) {
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(paciente);
			session.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			session.close();

		}
		session.close();
	}
	public void eliminarPaciente(Paciente paciente){
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.delete(paciente);
			session.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			session.close();

		}
		session.close();
	}
	public void modificarPaciente(Paciente paciente){
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.update(paciente);
			session.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			session.close();

		}
		session.close();
	}
}
