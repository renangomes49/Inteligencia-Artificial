
public class RomaniaMap {
	public static void main(String[] args) {

		Grafo grafo = new Grafo();
		
		grafo.adicionarVertice("Oradea");
		grafo.adicionarVertice("Zerind");
		grafo.adicionarVertice("Arad");
		grafo.adicionarVertice("Timisoara");
		grafo.adicionarVertice("Lugoj");
		grafo.adicionarVertice("Mehadia");
		grafo.adicionarVertice("Drobeta");
		grafo.adicionarVertice("Sibiu");
		grafo.adicionarVertice("Rimnicu Vilcea");
		grafo.adicionarVertice("Craiova");
		grafo.adicionarVertice("Fagaras");
		grafo.adicionarVertice("Pitesti");
		grafo.adicionarVertice("Bucharest");
		grafo.adicionarVertice("Giurgiu");
		grafo.adicionarVertice("Neamt");
		grafo.adicionarVertice("Iasi");
		grafo.adicionarVertice("Vaslui");
		grafo.adicionarVertice("Urziceni");
		grafo.adicionarVertice("Hirsova");
		grafo.adicionarVertice("Eforie");
		
		// Adicionar Arestas
		grafo.adicionarAresta(71, "Oradea", "Zerind");
		grafo.adicionarAresta(151, "Oradea", "Sibiu");
		
		grafo.adicionarAresta(71, "Zerind", "Oradea");
		grafo.adicionarAresta(75, "Zerind", "Arad");
		
		grafo.adicionarAresta(75, "Arad", "Zerind");
		grafo.adicionarAresta(118, "Arad", "Timisoara");
		grafo.adicionarAresta(140, "Arad", "Sibiu");
		
		grafo.adicionarAresta(118, "Timisoara", "Arad");
		grafo.adicionarAresta(111, "Timisoara", "Lugoj");
		
		grafo.adicionarAresta(111, "Lugoj", "Timisoara");
		grafo.adicionarAresta(70, "Lugoj", "Mehadia");
		
		grafo.adicionarAresta(70, "Mehadia", "Lugoj");
		grafo.adicionarAresta(75, "Mehadia", "Drobeta");
		
		grafo.adicionarAresta(75, "Drobeta", "Mehadia");
		grafo.adicionarAresta(120, "Drobeta", "Craiova");
		
		grafo.adicionarAresta(120, "Craiova", "Drobeta");
		grafo.adicionarAresta(146, "Craiova", "Rimnicu Vilcea");
		grafo.adicionarAresta(138, "Craiova", "Pitesti");
		
		grafo.adicionarAresta(80, "Rimnicu Vilcea", "Sibiu");
		grafo.adicionarAresta(146, "Rimnicu Vilcea", "Craiova");
		grafo.adicionarAresta(97, "Rimnicu Vilcea", "Pitesti");
		
		grafo.adicionarAresta(151, "Sibiu", "Oradea");
		grafo.adicionarAresta(140, "Sibiu", "Arad");
		grafo.adicionarAresta(99, "Sibiu", "Fagaras");
		grafo.adicionarAresta(80, "Sibiu", "Rimnicu Vilcea");
		
		grafo.adicionarAresta(99, "Fagaras", "Sibiu");
		grafo.adicionarAresta(211, "Fagaras", "Bucharest");
		
		grafo.adicionarAresta(97, "Pitesti", "Rimnicu Vilcea");
		grafo.adicionarAresta(138, "Pitesti", "Craiova");
		grafo.adicionarAresta(101, "Pitesti", "Bucharest");
		
		grafo.adicionarAresta(211, "Bucharest", "Fagaras");
		grafo.adicionarAresta(101, "Bucharest", "Pitesti");
		grafo.adicionarAresta(90, "Bucharest", "Giurgiu");
		grafo.adicionarAresta(85, "Bucharest", "Urziceni");
		
		grafo.adicionarAresta(90, "Giurgiu", "Bucharest");
		
		grafo.adicionarAresta(85, "Urziceni", "Bucharest");
		grafo.adicionarAresta(98, "Urziceni", "Hirsova");
		grafo.adicionarAresta(142, "Urziceni", "Vaslui");
		
		grafo.adicionarAresta(87, "Neamt", "Iasi");
		
		grafo.adicionarAresta(87, "Iasi", "Neamt");
		grafo.adicionarAresta(92, "Iasi", "Vaslui");
		
		grafo.adicionarAresta(92, "Vaslui", "Iasi");
		grafo.adicionarAresta(142, "Vaslui", "Urziceni");
		
		grafo.adicionarAresta(98, "Hirsova", "Urziceni");
		grafo.adicionarAresta(86, "Hirsova", "Eforie");
		
		grafo.adicionarAresta(86, "Eforie", "Hirsova");		
		
		No no = grafo.buscaEmLargura(args[0]);
		
		System.out.println("Estado objetivo: " + no.getEstado().getCidade());
		System.out.println("Caminho: " + grafo.descreverCaminho(args[0]));
		System.out.println("Custo total: " + no.getCustoCaminho());
		
		
	}
}
