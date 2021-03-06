package br.com.treinaweb.encapsulamento.exercicio;

public class Dentista {

	private String nome;
	private String sobrenome;
	private String especialidade;
	private String registroOdontologico;
	private boolean isAtivo;
	
	public void setNome(String nome) { this.nome = nome; }
	public String getNome() { return this.nome; }
	
	public void setSobrenome(String sobrenome) { this.sobrenome = sobrenome; }
	public String getSobrenome() { return this.sobrenome; }
	
	public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }
	public String getEspecialidade() { return this.especialidade; }
	
	public void setRegistroOdontologico(String registroOdontologico) { this.registroOdontologico = registroOdontologico; }
	public String getRegistroOdontologico() { return this.registroOdontologico; }
	
	public void setIsAtivo(boolean isAtivo) { this.isAtivo= isAtivo; }
	public boolean getIsAtivo() { return this.isAtivo; }

	
	// actions	
	public void atenderPacientes() { 
		// {...}		
	}
	public void marcar() { 
		// {...}		
	}
	public void remarcarConsultas() { 
		// {...}		
	}
	public void cancelarConsultas() { 
		// {...}		
	}
	public void indicar() { 
		// {...}		
	}
}
