
public class Aresta {

	private int peso;
	private Vertice cidadeInicio;
	private Vertice cidadeFim;
	
	public Aresta(int peso, Vertice cidadeInicio, Vertice cidadeFim) {
		this.peso = peso;
		this.cidadeInicio = cidadeInicio;
		this.cidadeFim = cidadeFim;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public Vertice getCidadeInicio() {
		return cidadeInicio;
	}

	public void setCidadeInicio(Vertice cidadeInicio) {
		this.cidadeInicio = cidadeInicio;
	}

	public Vertice getCidadeFim() {
		return cidadeFim;
	}

	public void setCidadeFim(Vertice cidadeFim) {
		this.cidadeFim = cidadeFim;
	}
	
	
	
}
