import java.util.ArrayList;
import java.util.List;

public class Vertice {

	private String cidade;
	private List<Vertice> verticesAdjacentes;
	
	public Vertice(String cidade) {
	
		this.cidade = cidade;
		this.verticesAdjacentes = new ArrayList<Vertice>();
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public List<Vertice> getVerticesAdjacentes() {
		return verticesAdjacentes;
	}

	public void setVerticesAdjacentes(List<Vertice> verticesAdjacentes) {
		this.verticesAdjacentes = verticesAdjacentes;
	}

	public void adicionarVerticeAdjacente(Vertice vertice) {
		this.verticesAdjacentes.add(vertice);
	}
}
