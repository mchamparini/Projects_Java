package org.clinica.controller;

import java.util.GregorianCalendar;

import org.clinica.entity.Cuenta;
import org.clinica.entity.Cuentapersona;
import org.clinica.entity.Paciente;
import org.clinica.entity.Tipocuenta;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainTest {

	public static void main(String[] args) {
		  Paciente paciente = new Paciente();
		  Cuenta cuenta = new Cuenta();
		  Cuentapersona cuentapersona = new Cuentapersona();
	      SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	      Session session = null;//sessionFactory.openSession();		  
		  try {
			  session = sessionFactory.openSession();
			  session.beginTransaction();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		  if(session.isOpen()){
			  System.out.print("Session open ! ! !");
			  paciente.setApyno("Pedro Cortez");
			  paciente.setDireccion("Maipu 333");
			  paciente.setDni(3213123);
			  paciente.setSexo('M');
			  paciente.setFecha_nac(new GregorianCalendar(1990,8,10).getTime());
			  paciente.setIdHClinica(1);			  
			  
			  cuenta.setIdCuenta(1);
			  cuenta.setIdTipoCuenta(1);
			  cuenta.setLogin("pepe");
			  cuenta.setPassword("123");
			  
			  cuentapersona.setDni(3213123);
			  cuentapersona.setIdCuenta(1);
			  cuentapersona.setCuenta(cuenta);
			  cuenta.setCuentapersona(cuentapersona);
		  }else{
			  System.out.println("Session is not open...");
			  System.out.println("Connection aborted ! ! !");			  
			  session.close();
		  }
		  try{	
			  session.save(cuenta);
			  session.save(paciente);
			  session.getTransaction().commit(); 		 
			  System.out.print("Transaction commit success!!!");
		  }catch(Exception ex){
			  System.out.println("session aborted...");
			  System.out.println(ex.getMessage());
			  session.close();  
		  }
		  System.out.println("session close successfull ! ! !");
		  session.close();
	}

}
