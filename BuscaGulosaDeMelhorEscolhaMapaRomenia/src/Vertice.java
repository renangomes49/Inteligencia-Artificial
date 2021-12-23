import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(cidade);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vertice other = (Vertice) obj;
		return Objects.equals(cidade, other.cidade);
	}

}
