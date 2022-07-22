
public class TestCamelCase{



    public static void main(String[] args){

        ConvertCamelCase frase = new ConvertCamelCase();

        System.out.println(frase.converterCamel("nome"));
        System.out.println(frase.converterCamel("Nome" ));
        System.out.println(frase.converterCamel("nomeComposto"));
        System.out.println(frase.converterCamel("NomeComposto"));
        System.out.println(frase.converterCamel("CPF"));
        System.out.println(frase.converterCamel("numeroCPF"));
        System.out.println(frase.converterCamel("numeroCPFContribuinte"));
        System.out.println(frase.converterCamel("recupera10Primeiros" ));
        System.out.println(frase.converterCamel("10Primeiros"));
        System.out.println(frase.converterCamel("nome#Composto"));






    }


    

	

}