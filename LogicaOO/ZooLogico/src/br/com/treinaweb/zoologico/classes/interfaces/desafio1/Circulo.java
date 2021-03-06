package br.com.treinaweb.zoologico.classes.interfaces.desafio1;


import java.math.*;


public class Circulo implements Forma {
	
	private double raio;
	
	public double getRaio() {
		return raio;
	}
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double area() {
		return Math.PI * Math.pow(raio, 2); 
	}
}
