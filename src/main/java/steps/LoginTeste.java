package steps;

import elementos.ElementosWeb;
import metodos.MetodosDeTestes;

public class LoginTeste {

public static void main(String[] args) {
	
	MetodosDeTestes metodos = new MetodosDeTestes();
	ElementosWeb el = new ElementosWeb();

	
		metodos.abrirNavegador();
		metodos.escrever(el.username, "standard_user");
		metodos.escrever(el.password, "secret_sauce");
		metodos.clicar(el.btnLogin);
	
    // login em branco
	// login invalido
	// login bloqueado
	
 }
}
