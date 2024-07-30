import java.util.ArrayList;
import java.util.Scanner;

public class Altura_e_Sexo {
    public static void main(String[] args) {
//        2. Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10
//        pessoas. Fazer um algoritmo que calcule e escreva:
//        a. a maior e a menor altura do grupo;
//        b. média de altura dos homens;
//        c. o número de mulheres.
        Scanner scanner = new Scanner(System.in);
        Lista_Pessoas lista_pessoas = new Lista_Pessoas();

        boolean exit;
        exit = false;

        System.out.println("**********************");

        while (!exit){

            System.out.println("    MENU");
            System.out.println("1. Cadastrar Pessoa");
            System.out.println("2. Excluir Pessoa");
            System.out.println("3. Mostrar Pessoa(s)");
            System.out.println("9. Sair");

            switch (scanner.nextInt()){
                case 1:
                    Pessoa pessoa = new Pessoa();
                    pessoa.cadastrar_pessoa();
                    lista_pessoas.add_pessoa_na_lista(pessoa);
                    break;
                case 2:

                    break;
                case 3:
                    System.out.println("1. Mostrar todas as pessoas");
                    System.out.println("2. Pesquisar pessoa ");
                        switch (scanner.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                        }
                    break;
                case 9:
                    exit = true;
            }
        }

    }
}
