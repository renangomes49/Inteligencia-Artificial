import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class Grafo {

	private List<Vertice> vertices = new ArrayList<Vertice>();
	private List<Aresta> arestas = new ArrayList<Aresta>();

	public List<Vertice> getVertices() {
		return vertices;
	}

	public void setVertices(List<Vertice> vertices) {
		this.vertices = vertices;
	}

	public List<Aresta> getArestas() {
		return arestas;
	}

	public void setArestas(List<Aresta> arestas) {
		this.arestas = arestas;
	}

	public No buscaGulosaDeMelhorEscolha(String cidade, HashMap<String, Integer> listaDistancias) {

		Vertice inicio = this.encontrarVertice(cidade);

		No no = new No(inicio, null, 0);

		List<No> borda = new ArrayList<No>();
		List<No> explorados = new ArrayList<No>();

		borda.add(no);

		while (borda.size() > 0) {

			borda = this.ordenarBorda(borda, listaDistancias);

			No pai = borda.remove(0);

			if (pai.getEstado().getCidade().equals("Bucharest")) {
				return pai;
			}

			explorados.add(pai);

			for (Vertice vertice : pai.getEstado().getVerticesAdjacentes()) {

				int valorAresta = valorAresta(pai.getEstado(), vertice);

				No filho = new No(vertice, pai, pai.getCustoCaminho() + valorAresta);

				if (!explorados.contains(filho) || !borda.contains(filho)) {
					borda.add(filho);
				} else {

					for (No no2 : borda) {
						if (no2.equals(filho) && no2.getCustoCaminho() > filho.getCustoCaminho()) {
							no2 = filho;
						}
					}
				}

			}

		}

		return null;
	}

	public List<No> ordenarBorda(List<No> borda, HashMap<String, Integer> listaDistancias) {

		for (int i = 0; i < borda.size() - 1; i++) {
			for (int j = 0; j < borda.size() - 1 - i; j++) {

				int valorNo = listaDistancias.get(borda.get(j).getEstado().getCidade());
				int valorNo2 = listaDistancias.get(borda.get(j + 1).getEstado().getCidade());

				if (valorNo > valorNo2) {

					No aux = borda.get(j);
					borda.set(j, borda.get(j + 1));
					borda.set(j + 1, aux);
				}
			}
		}

		return borda;
	}

	public void adicionarVertice(String cidade) {

		Vertice v = new Vertice(cidade);
		this.vertices.add(v);
	}

	public void adicionarAresta(int peso, String cidadeInicio, String cidadeFim) {

		Vertice v1 = this.encontrarVertice(cidadeInicio);
		Vertice v2 = this.encontrarVertice(cidadeFim);

		v1.adicionarVerticeAdjacente(v2);

		Aresta aresta = new Aresta(peso, v1, v2);

		this.arestas.add(aresta);

	}

	public Vertice encontrarVertice(String vertice) {

		for (Vertice v2 : this.vertices) {
			if (v2.getCidade().equals(vertice)) {
				return v2;
			}
		}
		return null;
	}

	public int valorAresta(Vertice v1, Vertice v2) {

		for (Aresta aresta : arestas) {
			if (aresta.getCidadeInicio().getCidade().equals(v1.getCidade())
					&& aresta.getCidadeFim().getCidade().equals(v2.getCidade())) {

				return aresta.getPeso();
			}
		}

		return 0;
	}

	public String descreverCaminho(String cidade, HashMap<String, Integer> listaDistancias) {

		No no = this.buscaGulosaDeMelhorEscolha(cidade, listaDistancias);

		Stack<No> pilha = new Stack<>();
		String caminho = "";

		while (no != null) {
			pilha.add(no);
			no = no.getPai();
		}

		while (!pilha.isEmpty()) {
			No no2 = pilha.pop();
			caminho += no2.getEstado().getCidade() + " => ";
		}
		return caminho;

	}

}
