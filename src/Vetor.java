import java.util.Arrays;

public class Vetor {
	private String dado;

	private int tam = 16;
	private String[] vetor = new String[tam];
	private int totalElementos = 0;

	public Vetor() {}

	public Vetor(String d) {
		this.dado = d;
	}

	public String getDado() {
		return dado;
	}

	public void setDado(String dado) {
		this.dado = dado;
	}

	public void insereFinal(String dado) {
		verificaEspaco();
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == null) {
				vetor[i] = dado;
				break;
			}
		}
		totalElementos++;
		mostraVetor();
	}

	public void insereIndice(String dado, int indice) {

	}

	public void mostraVetor() {
		System.out.print("Tamanho do vetor: "+vetor.length+"\n[ ");		
		for (int i = 0; i < vetor.length; i++) {			
			if (vetor[i] != null) {
				System.out.print(vetor[i]+", ");
			}			
		}
		System.out.print("]");
	}	

	private void verificaEspaco() {
		if (this.totalElementos == this.vetor.length) {
			String[] novaArray = new String[this.vetor.length * 2];
			for (int i = 0; i < this.vetor.length; i++) {
				novaArray[i] = this.vetor[i];
			}
			this.vetor = novaArray;
		}
	}

	private boolean verificaIndice(int posicao) {
		return posicao >= 0 && posicao < this.totalElementos;
	}

	public void get(int posicao) {
		if (!this.verificaIndice(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		System.out.println(this.vetor[posicao]);
	}

	public void insereInicio(String dado) {
		verificaEspaco();
		for(int i=vetor.length-1; i > 0; i--){
			vetor[i] = vetor[i-1];
		}
		vetor[0] = dado;		
		mostraVetor();
		totalElementos++;
	}

	public void set(int pos, String dado) {
		verificaEspaco();
		for(int i=vetor.length-1; i >pos; i--){
			vetor[i] = vetor[i-1];
		}
		vetor[pos] = dado;		
		mostraVetor();
		totalElementos++;
	}	

	@Override
	public String toString() {
		return "Vetor [dado=" + dado + "]";
	}
	//	@Override
	//	public String toString() {
	//		if (this.totalElementos == 0) {
	//			return "[]";
	//		}
	//
	//		StringBuilder builder = new StringBuilder();
	//		builder.append("[");
	//
	//		for (int i = 0; i < this.totalElementos - 1; i++) {
	//			builder.append(this.vetor[i]);
	//			builder.append(", ");
	//		}
	//
	//		builder.append(this.vetor[this.totalElementos - 1]);
	//		builder.append("]");
	//
	//		return builder.toString();
	//	}

}