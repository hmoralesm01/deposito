/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuentas;

/**
 *
 * @author Hmora
 * @version 1.0
 * @since 09-03-2021
 * Visto
 */
public class CCuenta {
    
    
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    
    
    public CCuenta() {
    }
    /**
     * @return the nombre is returned
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
     * @return the cuenta is returned
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo is returned
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInteres is returned
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    
    
    /**
     * @param tipoInteres the tipoInteres to set
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
    
    
    /**
     * Contructor nombre, cuenta, saldo
     * @param nombre
     * @param cuenta
     * @param saldo
     */
    public CCuenta(String nombre, String cuenta, double saldo) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
    }

    /**
     * @return the saldo is returned
     */

    public Double estado() {
        return getSaldo();
    }
    /**
     * @param cantidad 
     * @throws if the amount to deposit is negative
     * 
     */
    
    public void ingresar(double cantidad) throws Exception {
        
        if(cantidad<0){
            throw new Exception ("no se puede ingresar una cantidad negativa");  
        }
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * @param cantidad enters as param
     * @throws if the amount to withdraw is negative or there is not enough money.
     * 
     */
    public void retirar(double cantidad) throws Exception{
    
        if (cantidad <= 0)
            throw new Exception ("no se puede retirar una cantidad negativa");
        
        if(estado()< cantidad)
            throw new Exception ("no se tiene suficiente saldo");
            
            
        setSaldo(getSaldo() - cantidad);
            
        
    }
    
    
}
