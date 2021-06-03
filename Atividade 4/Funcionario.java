public class Funcionario extends Pessoa{
	
	private String matricula;
	private String admissao;
	
	public Funcionario(String nome, String sexo, Integer idade, String matricula, String admissao) {
		super(nome, sexo, idade);
		this.matricula = matricula;
		this.admissao = admissao;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getAdmissao() {
		return admissao;
	}

	public void setAdmissao(String admissao) {
		this.admissao = admissao;
	}
    		
}