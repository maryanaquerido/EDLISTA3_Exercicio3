package controller;

public class ControllerInverteTexto {
	public ControllerInverteTexto() {
		super();
	}
	
	public String InverteTexto (String texto, int tamanho) {
		if (tamanho == 1) { // CONDIÇÃO DE PARADA: 	QUANDO O TAMANHO FOR 0 QUER DIZER QUE NÃO TEMOS MAIS CARACTERES PARA ANALISAR, RETORNANDO A PRÓPRIA STRING.
			return texto;
		}
		else {
			return texto.substring(tamanho - 1) + InverteTexto(texto.substring(0, tamanho - 1), tamanho - 1);
		}
	}
	

}

// COMO ESCREVER A FUNÇÃO PARA O TERMO N EM FUNÇÃO DO TERMO ANTERIOR? 
// QUANDO CHAMAMOS A FUNÇÃO ELA PEGA O ÚLTIMO CARACTERE DA STRING INICIAL, E COM A RECURSIVA
// ELA VAI CHAMANDO A FUNÇÃO INVERTENDO O RESTANTE DA STRING, MENOS O CARACTERE FINAL, JA QUE
// ENVIAMOS TAMANHO - 1.
