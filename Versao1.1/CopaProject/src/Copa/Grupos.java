package Copa;


public class Grupos {
	//caracteristicas
	
	private String selecoes;
	private int pontos;
	private int gols;
	private int jogos;
	
	//construtor
	public Grupos(String selecoes, int pontos, int gols, int jogos) {
		super();
		this.selecoes = selecoes;
		this.pontos = pontos;
		this.gols = gols;
		this.jogos = jogos;
	}
	//getters and setters
	public String getSelecoes() {
		return selecoes;
	}
	public void setSelecoes(String selecoes) {
		this.selecoes = selecoes;
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	public int getGols() {
		return gols;
	}
	public void setGols(int gols) {
		this.gols = gols;
	}
	public int getJogos() {
		return jogos;
	}
	public void setJogos(int jogos) {
		this.jogos = jogos;
	}
	@Override
	public String toString() {
		return selecoes + " | "+ pontos + " Pontos |  " + gols + " Gols  | " + jogos + " Jogos |" ;
	}
	
	//metodos
	
	public void Jogar1() {
	}
}
