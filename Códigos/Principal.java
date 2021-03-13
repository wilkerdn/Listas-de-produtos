package exercicio2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		ArrayList <Livro> livros = new ArrayList<>();
		ArrayList <PecaCarro> pcarros = new ArrayList<>();
		ArrayList <Alimenticio> alimenticios = new ArrayList<>();
		int op;
		String menu = "MENU\n1 - Criar um produto\n2 - Mudar estoque de produtos\n3 - Calcular valor total"
				+ "\n4 - Imprimir todos os produtos de uma lista\n5 - Imprimir todos os produtos\n6 - Sair\n";
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch(op) {
			case 1:{
				int list = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da lista desejada:\n"
						+ "1 - Livros\n2 - Peças de carros\n3 - Alimentícios\n"));
				if(list==1) {
					int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto"));
					String desc = JOptionPane.showInputDialog("Digite a descrição");
					double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto"));
					int quant = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));
					String autor = JOptionPane.showInputDialog("Digite o nome do autor");
					int qtdp = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de páginas"));
					Livro lv = new Livro(c, desc, preco, quant, autor, qtdp);
					livros.add(lv);
				}else if(list==2) {
					int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto"));
					String desc = JOptionPane.showInputDialog("Digite a descrição");
					double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto"));
					int quant = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));
					String tipoc = JOptionPane.showInputDialog("Digite o tipo de carro");
					String marca = JOptionPane.showInputDialog("Digite a marca");
					PecaCarro pc = new PecaCarro(c, desc, preco, quant, tipoc, marca);
					pcarros.add(pc);
				}else if(list==3) {
					int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto"));
					String desc = JOptionPane.showInputDialog("Digite a descrição");
					double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto"));
					int quant = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));
					String val = JOptionPane.showInputDialog("Digite a validade");
					Alimenticio al = new Alimenticio(c, desc, preco, quant, val);
					alimenticios.add(al);
				}else {
					JOptionPane.showMessageDialog(null,"Opção inválida");
				}
				break;
			}
			case 2:{
				int list = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da lista desejada:\n"
						+ "1 - Livros\n2 - Peças de carros\n3 - Alimentícios\n"));
				String opc = "Digite o código do produto\n";
				int i,aux;
				if(list==1) {
					for(i=0;i<livros.size();i++) {
						opc += "Código = " + livros.get(i).getCodigo() + "\nDescrição: " + livros.get(i).getDescricao() +
								"\nPreço = " + livros.get(i).getPreco() + "\nQuantidade: " + livros.get(i).getQuantidade() + 
								"\nAutor = " + livros.get(i).getAutor() + "\nQuantidade de páginas: " +
								livros.get(i).getNumeroPaginas() + "\n";
					}
					aux = Integer.parseInt(JOptionPane.showInputDialog(opc));
					for (i=0;i<livros.size();i++) {
						if(aux==livros.get(i).getCodigo()) {
							int acres = Integer.parseInt(JOptionPane.showInputDialog("Digite a quatidade para somar ao estoque"));
							livros.get(i).mudaEstoque(acres);
						}
					}
				}else if(list==2) {
					for(i=0;i<pcarros.size();i++) {
						opc += "Código = " + pcarros.get(i).getCodigo() + "\nDescrição: " + pcarros.get(i).getDescricao() +
								"\nPreço = " + pcarros.get(i).getPreco() + "\nQuantidade: " + pcarros.get(i).getQuantidade() + 
								"\nTipo de carro = " + pcarros.get(i).getTipoCarro() + "\nMarca: " +
								pcarros.get(i).getMarca() + "\n";
					}
					aux = Integer.parseInt(JOptionPane.showInputDialog(opc));
					for (i=0;i<pcarros.size();i++) {
						if(aux==pcarros.get(i).getCodigo()) {
							int acres = Integer.parseInt(JOptionPane.showInputDialog("Digite a quatidade para somar ao estoque"));
							pcarros.get(i).mudaEstoque(acres);
						}
					}
				}else if(list==3) {
					for(i=0;i<alimenticios.size();i++) {
						opc += "Código = " + alimenticios.get(i).getCodigo() + "\nDescrição: " + alimenticios.get(i).getDescricao() +
								"\nPreço = " + alimenticios.get(i).getPreco() + "\nQuantidade: " + alimenticios.get(i).getQuantidade() + 
								"\nValidade " + alimenticios.get(i).getValidade() + "\n";
					}
					aux = Integer.parseInt(JOptionPane.showInputDialog(opc));
					for (i=0;i<alimenticios.size();i++) {
						if(aux==alimenticios.get(i).getCodigo()) {
							int acres = Integer.parseInt(JOptionPane.showInputDialog("Digite a quatidade para somar ao estoque"));
							alimenticios.get(i).mudaEstoque(acres);
						}
					}
				}else {
					JOptionPane.showMessageDialog(null,"Opção inválida");
				}
				break;
			}
			case 3:{
				int list = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da lista desejada:\n"
						+ "1 - Livros\n2 - Peças de carros\n3 - Alimentícios\n"));
				if(list==1) {
					String opc = "Digite o código do produto\n";
					for(int i=0;i<livros.size();i++) {
						opc += "Código = " + livros.get(i).getCodigo() + "\nDescrição: " + livros.get(i).getDescricao() +
								"\nPreço = " + livros.get(i).getPreco() + "\nQuantidade: " + livros.get(i).getQuantidade() + 
								"\nAutor = " + livros.get(i).getAutor() + "\nQuantidade de páginas: " +
								livros.get(i).getNumeroPaginas() + "\n";
					}
					int aux = Integer.parseInt(JOptionPane.showInputDialog(opc));
					for (int i=0;i<livros.size();i++) {
						if(aux==livros.get(i).getCodigo()) {
							double total = livros.get(i).getQuantidade() * livros.get(i).getPreco();
							JOptionPane.showMessageDialog(null,"O valor total do produto é R$" + total + "\n");
						}
					}
				}else if(list==2) {
					String opc = "Digite o código do produto\n";
					for(int i=0;i<pcarros.size();i++) {
						opc += "Código = " + pcarros.get(i).getCodigo() + "\nDescrição: " + pcarros.get(i).getDescricao() +
								"\nPreço = " + pcarros.get(i).getPreco() + "\nQuantidade: " + pcarros.get(i).getQuantidade() + 
								"\nTipo de carro = " + pcarros.get(i).getTipoCarro() + "\nMarca: " +
								pcarros.get(i).getMarca() + "\n";
					}
					int aux = Integer.parseInt(JOptionPane.showInputDialog(opc));
					for (int i=0;i<pcarros.size();i++) {
						if(aux==pcarros.get(i).getCodigo()) {
							double total = pcarros.get(i).getQuantidade() * pcarros.get(i).getPreco();
							JOptionPane.showMessageDialog(null,"O valor total do produto é R$" + total + "\n");
						}
					}
				}else if(list==3) {
					String opc = "Digite o código do produto\n";
					for(int i=0;i<alimenticios.size();i++) {
						opc += "Código = " + alimenticios.get(i).getCodigo() + "\nDescrição: " + alimenticios.get(i).getDescricao() +
								"\nPreço = " + alimenticios.get(i).getPreco() + "\nQuantidade: " + alimenticios.get(i).getQuantidade() + 
								"\nValidade " + alimenticios.get(i).getValidade() + "\n";
					}
					int aux = Integer.parseInt(JOptionPane.showInputDialog(opc));
					for (int i=0;i<livros.size();i++) {
						if(aux==livros.get(i).getCodigo()) {
							double total = livros.get(i).getQuantidade() * livros.get(i).getPreco();
							JOptionPane.showMessageDialog(null,"O valor total do produto é R$" + total + "\n");
						}
					}
				}
				break;
			}
			case 4:{
				int list = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da lista desejada:\n"
						+ "1 - Livros\n2 - Peças de carros\n3 - Alimentícios\n"));
				if(list==1) {
					for(int i=0;i<livros.size();i++) {
						livros.get(i).imprimeProduto();
					}
				}else if(list==2) {
					for(int i=0;i<pcarros.size();i++) {
						pcarros.get(i).imprimeProduto();
					}
				}else if(list==3) {
					for(int i=0;i<alimenticios.size();i++) {
						alimenticios.get(i).imprimeProduto();
					}
				}else {
					JOptionPane.showMessageDialog(null,"Opção inválida");
				}
				break;
			}
			case 5:{
				int i = 0;
				JOptionPane.showMessageDialog(null,"LIVROS\n");
				for(i=0;i<livros.size();i++) {
					livros.get(i).imprimeProduto();
				}
				JOptionPane.showMessageDialog(null,"PEÇAS DE CARROS\n");
				for(i=0;i<pcarros.size();i++) {
					pcarros.get(i).imprimeProduto();
				}
				JOptionPane.showMessageDialog(null,"ALIMENTÍCIOS\n");
				for(i=0;i<alimenticios.size();i++) {
					alimenticios.get(i).imprimeProduto();
				}
				
				break;
			}
			case 6:{
				JOptionPane.showMessageDialog(null,"Programa finalizado");
				break;
			}
			default:{
				JOptionPane.showMessageDialog(null,"Opção inválida");
			}
			}
			
		}while(op!=6);

	}

}
