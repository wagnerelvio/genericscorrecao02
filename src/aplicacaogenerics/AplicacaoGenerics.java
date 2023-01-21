package aplicacaogenerics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wagne
 *
 */
public class AplicacaoGenerics {

	public static void main(String args[]) {

		System.out.println("\n **********************************");
		System.out.println(" ********* Lista de Carros *********\n ");

		// =========================================
		List<Carro> carro02 = new ArrayList<>();

		carro02.add(new Audi());
		carro02.add(new Civic());
		carro02.add(new Honda());
		imprimirCarros2(carro02);

	}

	public static void imprimirCarros2(List<? extends Carro> lista) {
		for (Carro carro02 : lista) {
			System.out.println(carro02);
		}

	}

}