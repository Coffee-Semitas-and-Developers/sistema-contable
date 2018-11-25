/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.text.DateFormat;
import java.util.Date;

/**
 *
 * @author jorge
 */
public class Empleado {

    private String dui, nombres, apellidos, cargo, tel, nit, nup, numIss;
    private Date fechaContrato, fechaDespido;

    public Empleado(String dui, String nombres, String apellidos, String cargo, String nit, String nup, String numIss, Date fechaContrato) {
        this.dui = dui;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cargo = cargo;
        this.nit = nit;
        this.nup = nup;
        this.numIss = numIss;
        this.fechaContrato = fechaContrato;
    }

    public Empleado() {

    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(Date fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    public Date getFechaDespido() {
        return fechaDespido;
    }

    public void setFechaDespido(Date fechaDespido) {
        this.fechaDespido = fechaDespido;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNup() {
        return nup;
    }

    public void setNup(String nup) {
        this.nup = nup;
    }

    public String getNumIss() {
        return numIss;
    }

    public void setNumIss(String numIss) {
        this.numIss = numIss;
    }

}
