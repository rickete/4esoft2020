package padroesDeProjeto;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private double total = 0;
	private List<Pizza> pizzas = new ArrayList<>();
	
	public void addPizza(Pizza pizza) {
		pizzas.add(pizza);
	}
	
	public double retornaTotal() {
		for (Pizza pizza : pizzas) {
			total += pizza.retornarPreco();
		}
		return total;
	}
	
	
	
	
}
