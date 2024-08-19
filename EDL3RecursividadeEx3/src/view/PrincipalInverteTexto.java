package view;
import controller.ControllerInverteTexto;

public class PrincipalInverteTexto {
	public static void main (String [] args) {
		
		ControllerInverteTexto m = new ControllerInverteTexto();
		String texto = "Maryana Querido";
		int tamanho = texto.length();
		String resp = m.InverteTexto(texto, tamanho);
		System.out.println ("Entrada = " + texto + "; Saída = " + resp);
		
	}

}
