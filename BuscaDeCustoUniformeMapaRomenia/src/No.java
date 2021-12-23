import java.util.Objects;

public class No implements Comparable<No> {

	private Vertice estado;
	private No pai;
	private int custoCaminho;

	public No(Vertice estado, No pai, int custoCaminho) {
		this.estado = estado;
		this.pai = pai;
		this.custoCaminho = custoCaminho;
	}

	public Vertice getEstado() {
		return estado;
	}

	public void setEstado(Vertice estado) {
		this.estado = estado;
	}

	public No getPai() {
		return pai;
	}

	public void setPai(No pai) {
		this.pai = pai;
	}

	public int getCustoCaminho() {
		return custoCaminho;
	}

	public void setCustoCaminho(int custoCaminho) {
		this.custoCaminho = custoCaminho;
	}

	@Override
	public int compareTo(No no) {

		if (this.getCustoCaminho() < no.getCustoCaminho()) {
			return -1;
		}

		if (this.getCustoCaminho() > no.getCustoCaminho()) {
			return 1;
		}

		return 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(estado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		No other = (No) obj;
		return Objects.equals(estado, other.estado);
	}

}
