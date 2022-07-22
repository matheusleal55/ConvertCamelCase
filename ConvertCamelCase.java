import java.util.List;
import java.util.Arrays;

public class ConvertCamelCase{

	public List<String> converterCamel(String original){

		EncontraNumero(original);
		EncontraCaracterEspecial(original);

		String[] separacao = original.split("(?<!(^|[A-Z0-9]))(?=[A-Z0-9])|(?<!(^|[^A-Z]))(?=[0-9])|(?<!(^|[^0-9]))(?=[A-Za-z])|(?<!^)(?=[A-Z][a-z])");
        for(int i = 0; i < separacao.length; i++){
			separacao[i] = separacao[i].toLowerCase();}
        List<String> lista = Arrays.asList(separacao);
		return lista;
	}

	public void EncontraNumero(String palavra){

		if(palavra.matches("^[0-9].*")){
			System.out.print("Palavra inválida: Não pode começar com números");}
	}

	public void EncontraCaracterEspecial(String palavra){

		if(!palavra.matches("(\\w)*")){
			System.out.print("Palavra inválida: Não pode conter caractere especial");}
	}

}


