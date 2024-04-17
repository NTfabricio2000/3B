public class Produto {
	private String Nome;
	private double Preco;
	private int Quantidade;

private Produto(String n, double p, int q) {
	this.Nome = n;
	this.Preco = p;
	this.Quantidade = q;
}

public String getNome() {
	return Nome;
}

public double getPreco() {
	return Preco;
}
	
public int getQuantidade() {
	return Quantidade;
}

public void setNome(String n) {
	this.Nome = n;
}

public void setPreco(double p) {
	this.Preco = p;
}
	
public void setQuantidade(int q) {
	this.Quantidade = q;
}

	public double multiplicar(double p, int q) {
		return (Preco*Quantidade);
	}
}
