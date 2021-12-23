import java.util.HashMap;

public class Heuristica {

	public HashMap<String, Integer> getDistancias() {
		HashMap<String, Integer> lista = new HashMap<>();

		lista.put("Arad", 366);
		lista.put("Bucharest", 0);
		lista.put("Craiova", 160);
		lista.put("Drobeta", 242);
		lista.put("Eforie", 161);
		lista.put("Fagaras", 176);
		lista.put("Giurgiu", 77);
		lista.put("Hirsova", 151);
		lista.put("Iasi", 226);
		lista.put("Lugoj", 244);
		lista.put("Mehadia", 241);
		lista.put("Neamt", 234);
		lista.put("Oradea", 380);
		lista.put("Pitesti", 100);
		lista.put("Rimnicu Vilcea", 193);
		lista.put("Sibiu", 253);
		lista.put("Timisoara", 329);
		lista.put("Urziceni", 80);
		lista.put("Vaslui", 199);
		lista.put("Zerind", 374);

		return lista;
	}

}
