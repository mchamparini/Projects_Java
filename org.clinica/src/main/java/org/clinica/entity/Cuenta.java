package org.clinica.entity;

public class Cuenta {
	private int idCuenta;
	private String login;
	private String password;
	private int idTipoCuenta;
	private Cuentapersona cuentapersona;
	private Tipocuenta tipocuenta;
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
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}
	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
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
	 * @return the cuentapersona
	 */
	public Cuentapersona getCuentapersona() {
		return cuentapersona;
	}
	/**
	 * @param cuentapersona the cuentapersona to set
	 */
	public void setCuentapersona(Cuentapersona cuentapersona) {
		this.cuentapersona = cuentapersona;
	}
	/**
	 * @return the tipocuenta
	 */
	public Tipocuenta getTipocuenta() {
		return tipocuenta;
	}
	/**
	 * @param tipocuenta the tipocuenta to set
	 */
	public void setTipocuenta(Tipocuenta tipocuenta) {
		this.tipocuenta = tipocuenta;
	}
	public Cuenta(int idCuenta, String login, String password, int idTipoCuenta, Cuentapersona cuentapersona,
			Tipocuenta tipocuenta) {
		super();
		this.idCuenta = idCuenta;
		this.login = login;
		this.password = password;
		this.idTipoCuenta = idTipoCuenta;
		this.cuentapersona = cuentapersona;
		this.tipocuenta = tipocuenta;
	}
	public Cuenta(){}
}
