package metodos;

import drivers.DriversFactory;

public class MetodosDeTestes extends DriversFactory {

	public void abrirNavegador() {
     System.out.println("Abrindo o site https://www.saucedemo.com");
	}

	public void escrever(String elemento, String texto) {
       System.out.println("No elemento " + elemento + " escrevemos " + texto);
	}

	public void clicar(String elemento) {
       System.out.println("No elemento " + elemento + " clicamos");
	}

}
