import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner opcaoSelecionada = new Scanner(System.in);
        Integer opcao = 0;
    
            while(opcao != 3){

                System.out.println("|  Selecione uma opção:  |");
                System.out.println("|  Menu                  |");
                System.out.println("|  Opções:               |");
                System.out.println("|       1.Hamburguer     |");
                System.out.println("|       2.Hot Dog        |");
                System.out.println("|       3.Sair           |");
    
                opcao = opcaoSelecionada.nextInt();
    
            switch(opcao) {
                case 1: System.out.println("Hamburguer selecionada!"); 
                        break;
                case 2: System.out.println("Hot Dog selecionada!"); 
                        break;
                case 3: System.out.println("Saindo...");
                        break;
                default: System.out.println("Opção inválida!");
                        break;
                }
            }
        }
}
