package exercicio2;

import javax.swing.JOptionPane;

public class PecaCarro extends Produto {
	private String tipoCarro;
	private String marca;
	
	public PecaCarro(int codigo, String descricao, double preco, int quantidade, String tipoCarro, String marca) {
		super(codigo, descricao, preco, quantidade);
		this.tipoCarro = tipoCarro;
		this.marca = marca;
	}

	public String getTipoCarro() {
		return tipoCarro;
	}

	public void setTipoCarro(String tipoCarro) {
		this.tipoCarro = tipoCarro;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void imprimeProduto() {
		JOptionPane.showMessageDialog(null,"Codigo: "+getCodigo()+"\nDescrição: " +
				getDescricao()+"\nPreço: "+getPreco()+"\nQuantidade: " + 
				getQuantidade()+"\nTipo de carro: "+getTipoCarro()+"\nQuantidade: "+
				getQuantidade());
	}
	public void mudaEstoque(int acrescimo) {
		setQuantidade(acrescimo+getQuantidade());
	}

}
