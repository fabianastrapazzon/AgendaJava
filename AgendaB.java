package pooExercicio04B;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AgendaB {

	protected Scanner leitor;

	private String nome;
	private int idade;
	private double altura;
	private String removerNome;
	private String buscarPessoa;
	private int imprimirDadosId;
	private int opcaoMenu;

	public int getOpcaoMenu() {
		return opcaoMenu;
	}

	public void setOpcaoMenu(int opcaoMenu) {
		this.opcaoMenu = opcaoMenu;
	}

	public String getRemoverNome() {
		return removerNome;
	}

	public void setRemoverNome(String removerNome) {
		this.removerNome = removerNome;
	}

	public String getBuscarPessoa() {
		return buscarPessoa;
	}

	public void setBuscarPessoa(String buscarPessoa) {
		this.buscarPessoa = buscarPessoa;
	}

	public int getImprimirDadosId() {
		return imprimirDadosId;
	}

	public void setImprimirDadosId(int imprimirDadosId) {
		this.imprimirDadosId = imprimirDadosId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	List<String> nomes = new ArrayList<String>();
	List<Integer> idades = new ArrayList<Integer>();
	List<Double> alturas = new ArrayList<Double>();
	List<String> lista = new ArrayList<String>();

	public AgendaB() {
		super();
		leitor = new Scanner(System.in);
	}

	public void menu() {
		while (getOpcaoMenu() != 6) {
			System.out.println("Escolha uma das opções" + "\n1 - Armazenar pessoa na agenda;"
					+ "\n2 - Remover pessoa da agenda;" + "\n3 - Localizar nome;" + "\n4 - Imprimir agenda completo;"
					+ "\n5 - Imprimir pessoa pelo index;" + "\n6 - Fechar agenda;");
			setOpcaoMenu(leitor.nextInt());

			switch (getOpcaoMenu()) {
			case 1:
				armazenaPessoa();
				break;
			case 2:
				removerPessoa();
				break;
			case 3:
				buscarPessoa();
				break;
			case 4:
				imprimirAgenda();
				break;
			case 5:
				imprimirPessoa();
				break;
			case 6:
				System.out.println("Agenda encerrada");
				break;
			}
		}
	}

	public void armazenaPessoa() {

		for (int i = 0; i < 1; i++) {

			System.out.println("Informe o nome da pessoa: ");
			setNome(leitor.next());
			nomes.add(getNome());

			System.out.println("Informe a sua idade: ");
			setIdade(leitor.nextInt());
			idades.add(getIdade());
			System.out.println("Informe a sua altura: ");
			setAltura(leitor.nextDouble());
			alturas.add(getAltura());

			System.out.println("=|=|=|=|=|=|=|=|=|=|=|=|=|");
			System.out.println();

		}

	}

	public void removerPessoa() {
		System.out.println("Nomes que constam na agenda:" + "\n" + nomes);
		System.out.println("\nDigite qual nome deseja remover da lista:");
		setRemoverNome(leitor.next());

		int removerID = nomes.indexOf(getRemoverNome());

		nomes.remove(getRemoverNome());
		idades.remove(removerID);
		alturas.remove(removerID);

		System.out.println();
	}

	public void buscarPessoa() {
		System.out.println("De qual pessoa você deseja saber o seu Index: ");
		setBuscarPessoa(leitor.next());

		int index = (nomes.indexOf(getBuscarPessoa()));

		System.out.println("...");
		System.out.println(getBuscarPessoa() + " possui index " + index);
		System.out.println();

	}

	public void imprimirAgenda() {
		System.out.println("Agenda Completa");
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(
					"Nome: " + nomes.get(i) + "; Idade: " + idades.get(i) + " anos; Altura: " + alturas.get(i) + "m");
			System.out.println();
		}
		System.out.println();
	}

	public void imprimirPessoa() {
		System.out.println("Qual o index da pessoa que deseja imprimir: ");
		setImprimirDadosId(leitor.nextInt());

		System.out.println("Nome: " + nomes.get(getImprimirDadosId()) + "; Idade: " + idades.get(getImprimirDadosId())
				+ "anos; Altura: " + alturas.get(getImprimirDadosId()) + "m");

		System.out.println();
	}

}
