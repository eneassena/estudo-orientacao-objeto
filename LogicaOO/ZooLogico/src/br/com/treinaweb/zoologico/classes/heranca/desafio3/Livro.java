package br.com.treinaweb.zoologico.classes.heranca.desafio3;

public abstract class Livro
{
    public String titulo;
    
    public abstract void setTitulo(String s);
    
    public String getTitulo(){
        return titulo;
    }
}
