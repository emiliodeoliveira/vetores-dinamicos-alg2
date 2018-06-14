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

	public void insereInicio(String dado) {
		set(0, dado);
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

	public void get(int posicao) throws Exception {
		if (!this.verificaIndice(posicao)) {
			throw new ArrayIndexOutOfBoundsException("Posição inválida!");
		}
		System.out.println(this.vetor[posicao]);
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

	public void inserePosicao() {
		int pos = Teste.readInteger("Digite a posição: ");
		String dado = Teste.readString("Digite o valor: ");
		set(pos, dado);
	}

	public void remove(int pos) {
		String[] vetorAux = new String[vetor.length -1];
		int index = 0;
		for(int i = 0; i < vetor.length; i++){
			if(i != pos){
				vetorAux[index] = vetor[i];
				index++;
			}
		}
		vetor = vetorAux;
		mostraVetor();
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