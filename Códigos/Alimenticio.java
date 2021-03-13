package exercicio2;

import javax.swing.JOptionPane;

public class Alimenticio extends Produto {
	private String validade;
	public Alimenticio(int codigo, String descricao, double preco, int quantidade, String validade) {
		super(codigo, descricao, preco, quantidade);
		this.validade = validade;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public void imprimeProduto() {
		JOptionPane.showMessageDialog(null,"Codigo: "+getCodigo()+"\nDescrição: " +
				getDescricao()+"\nPreço: "+getPreco()+"\nQuantidade: " + 
				getQuantidade()+"\nValidade: "+getValidade());
	}
	public void mudaEstoque(int acrescimo) {
		setQuantidade(acrescimo+getQuantidade());
	}
}
