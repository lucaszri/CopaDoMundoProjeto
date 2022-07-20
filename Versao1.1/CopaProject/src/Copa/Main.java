package Copa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Grupos {

	public Main(String selecoes, int pontos, int gols, int jogos) {
		super(selecoes, pontos, gols, jogos);
		
	}

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		Grupos catar = new Grupos("Catar", 0, 0, 0);
		Grupos equador = new Grupos("Equador", 0, 0, 0);
		Grupos senegal = new Grupos("Senegal", 0, 0, 0);
		Grupos holanda = new Grupos("Holanda", 0, 0, 0);
		
		ArrayList<Grupos> grupoA = new ArrayList<>();
		grupoA.add(catar);
		grupoA.add(equador);
		grupoA.add(senegal);
		grupoA.add(holanda);
		
		//dia 1 grupo A  [catar x equador] e [senegal x holanda]
		
		int dia1gA = 0;
		do {
			System.out.println("Digite o resultado do jogo: ");
			System.out.println("Catar: ");
			int golCatar = entrada.nextInt();
			System.out.println("Equador: ");
			int golEquador = entrada.nextInt();
				if(golCatar > golEquador) {
				catar.setPontos(catar.getPontos() + 3);
				} else if(golEquador > golCatar) {
				equador.setPontos(equador.getPontos() + 3);
				} else {
				catar.setPontos(catar.getPontos() + 1);
				equador.setPontos(equador.getPontos() + 1);
				}
			catar.setGols(catar.getGols() + golCatar);
			equador.setGols(equador.getGols() + golEquador);
			catar.setJogos(catar.getJogos() + 1);
			equador.setJogos(equador.getJogos() + 1); 
			
			System.out.println("Digite o resultado do jogo: ");
			System.out.println("Senegal: ");
			int golSenegal = entrada.nextInt();
			System.out.println("Holanda: ");
			int golHolanda = entrada.nextInt();
				if(golSenegal > golHolanda) {
				senegal.setPontos(senegal.getPontos() + 3);
				} else if(golHolanda > golSenegal) {
				holanda.setPontos(holanda.getPontos() + 3);
				} else {
				senegal.setPontos(senegal.getPontos() + 1);
				holanda.setPontos(holanda.getPontos() + 1);
				}
			senegal.setGols(senegal.getGols() + golSenegal);
			holanda.setGols(holanda.getGols() + golHolanda);
			senegal.setJogos(senegal.getJogos() + 1);
			holanda.setJogos(holanda.getJogos() + 1);
			
			dia1gA++;
		} while (dia1gA < 1);
		
			
		
		
		
		
		
	}

}
