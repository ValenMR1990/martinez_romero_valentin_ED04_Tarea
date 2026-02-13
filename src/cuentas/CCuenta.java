package cuentas;
/**
 * Clase CCuenta que representa una cuenta bancaria.
 * Debajo están los atributos o propiedades de la cuenta.
 * @author Valentín MR
 */
public class CCuenta {

	/** Nombre del titular de la cuenta */
    private String nombre;
    /** Número de cuenta bancaria */
    private String cuenta;
    /** Saldo actual de la cuenta */
    private double saldo;
    /** Tipo de interés aplicado a la cuenta */
    private double tipoInterés;
    
    
    
    /**
     * Método Getter
	 * @return Devuelve el valor del atributo nombre.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método Setter
	 * @param nombre proporciona un valor al atributo nombre.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
     * Método Getter
	 * @return Devuelve el valor del atributo cuenta.
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * Método Setter
	 * @param cuenta, proporciona un valor al atributo cuenta.
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
     * Método Getter
	 * @return Devuelve el valor del atributo saldo.
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Método Setter
	 * @param saldo, proporciona un valor al atributo saldo.
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
     * Método Getter
	 * @return Devuelve el valor del atributo tipoInterés.
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * Método Setter
	 * @param tipoInterés proporciona un valor al atributo tipoInterés.
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	/**
	 * Constructor sin parámetros de la clase CCuenta
	 * Sirve para crear una cuenta vacía sin inicializar.
	 */
	public CCuenta()
    {
    }
	
	/**
	 * Constructor con parámetros de la clase CCuenta.
	 * Sirve para crear una cuenta con los datos que que pases por parámetros.
	 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * Método que devuelve el estado de la cuenta.
     * @return saldo, devuelve el saldo de la cuenta.
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Método para ingresar una cantidad en la cuenta.
     * @param cantidad
     * @throws Exception, lanza una excepción si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    
    /**
     * Método para retirar una cantidad de la cuenta
     * @param cantidad
     * @throws Exception, lanza excepción si la cantidad es negativa o no hay suficiente saldo
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
