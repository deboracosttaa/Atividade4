import java.util.List;

public class Vendedor extends Funcionario{
	
	private double somaVendas;
	private double comissao;
	private String matriculaGerente;

	public Vendedor(String nome, String sexo, Integer idade, String matricula,
			String admissao, double somaVendas, double d, String matriculaGerente) {
		super(nome, sexo, idade, matricula, admissao);
		this.somaVendas = somaVendas;
		this.comissao = d;
		this.matriculaGerente = matriculaGerente;
	}
	
	public double getSalario(){
		double salario = 0.0;
		salario = this.somaVendas * this.comissao;
		return salario < 0 ? 0 : salario;
	}

	public String getMatriculaGerente() {
		return matriculaGerente;
	}

	public double getSomaVendas() {
		return somaVendas;
	}

	public void setSomaVendas(double somaVendas) {
		this.somaVendas = somaVendas;
	}
			
}