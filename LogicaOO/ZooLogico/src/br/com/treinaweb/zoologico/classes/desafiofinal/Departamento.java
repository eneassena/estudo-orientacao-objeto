package br.com.treinaweb.zoologico.classes.desafiofinal;

import java.util.ArrayList;
import java.util.List;

public class Departamento {

	private List<Funcionario> funcionarios;
	
	
	public Departamento() {
		funcionarios = new ArrayList<Funcionario>();
	}
	
	public void adicionarFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}
	
	public void listarFuncionarios() {
		for(int row = 0; row < funcionarios.size(); row ++) {
			System.out.println(funcionarios.get(row).getNome());
		}
	}
}
