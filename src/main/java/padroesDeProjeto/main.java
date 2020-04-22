package padroesDeProjeto;

public class main {
	public static void main(String[] args) {
		Calabresa calabresa = new Calabresa();
		Bacon bacon = new Bacon();
		
		Pedido pedido1 = new Pedido();
		pedido1.addPizza(bacon);
		pedido1.addPizza(calabresa);
		System.out.println(pedido1.retornaTotal());
		
	}
}
