import java.util.List;

public class Gerente extends Funcionario{
	
	private String regiao;
	private List<Vendedor> subordinados;
	private double percentualComissao;
	
	public Gerente(String nome, String sexo, Integer idade, String matricula,
			String admissao, String regiao, double percentualComissao) {
		super(nome, sexo, idade, matricula, admissao);
		this.regiao = regiao;
		this.subordinados = null;
		this.percentualComissao = percentualComissao;
	}
	
	public double getSalario(List<Vendedor> vendedores){
		double salario = 0.0;
		for (Vendedor vendedor : vendedores) {
		
			if(vendedor.getMatriculaGerente() == this.getMatricula()){
				salario += vendedor.getSomaVendas();
			}
		}
	
		salario = salario * percentualComissao;
		return salario < 0 ? 0 : salario;
		
	}
	
	
}