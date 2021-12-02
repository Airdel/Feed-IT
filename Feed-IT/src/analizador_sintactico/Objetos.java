/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizador_sintactico;

import java.util.ArrayList;

/**
 *
 * @author Enrique Miramontes
 */
public class Objetos {

    private Object Nombre;
    private Object tipo;
    private Object valor;
    
    private int linea;
    private int columna;
    
    static private ArrayList<Object> Metodos = new ArrayList<Object>();

    public Objetos() {
        this.Nombre = null;
        this.tipo = null;
        this.valor = null;        
    }    

    public Objetos(Object Nombre, Object tipo, int linea, int columna) {
        this.Nombre = Nombre;
        this.tipo = tipo;
        this.valor = null;
        this.linea = linea;
        this.columna = columna;        
    }

    public Objetos(Object Nombre, Object tipo, Object valor, int linea, int columna) {
        this.Nombre = Nombre;
        this.tipo = tipo;
        this.valor = valor;
        this.linea = linea;
        this.columna = columna;
    }

    public Object getNombre() {
        return Nombre;
    }

    public void setNombre(Object Nombre) {
        this.Nombre = Nombre;
    }

    public Object getTipo() {
        return tipo;
    }

    public void setTipo(Object tipo) {
        this.tipo = tipo;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public int getLinea() {
        return linea;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }

    public Object getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
    
    public static void addMetodo(Object m){
        Objetos.Metodos.add(m);
    }
    
    public Object getMetodo(int p){
        return Metodos.get(p);
    }
}

