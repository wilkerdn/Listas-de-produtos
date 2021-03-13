package exercicio2;

import javax.swing.JOptionPane;

public class Livro extends Produto {
	private String autor;
	private int numeroPaginas;
	
	public Livro(int codigo, String descricao, double preco, int quantidade, String autor, int numeroPaginas) {
		super(codigo, descricao, preco, quantidade);
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
	public void imprimeProduto() {
		JOptionPane.showMessageDialog(null,"Codigo: "+getCodigo()+"\nDescrição: " +
				getDescricao()+"\nPreço: "+getPreco()+"\nQuantidade: " + 
				getQuantidade()+"\nAutor: "+getAutor()+"\nNúmero de páginas: "+ getNumeroPaginas());
	}
	
	public void mudaEstoque(int acrescimo) {
		setQuantidade(acrescimo+getQuantidade());
	}

}
