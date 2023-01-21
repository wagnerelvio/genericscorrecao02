/**
 * 
 */
package aplicacaogenerics;

/**
 * @author wagne
 *
 */
public abstract class Carro {

	private String marca;
	private String preco;

	public abstract double preco();

	public void imprimirPreco() {
		double valor = preco();
		System.out.println("Preço: " + valor);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

//
	


}