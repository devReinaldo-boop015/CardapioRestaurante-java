import java.util.Scanner;
public class CardapioRestaurante {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Cárdapio do Restaurante :");
            System.out.println("1 Prato Feito -R$  25,00");
        System.out.println("Arroz+Feijão+Bife+Batatas Fritas");
            System.out.println("2 Frango Grelhado-R$ 23,00");
        System.out.println(" 3 Arroz+Feijão+Bisteca+Salada-R$ 24,00");
            System.out.println("4 Refrigerante-R$ 6,00");
        System.out.println("Escolha seu Pedido:");
        int opcao=sc.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Você escolheu Prato Feito-R$ 25,00");
                
                break;
        case 2:
            System.out.println("Você escolheu Frango Grelhado-R$ 23,00");
            break;
            case 3:
                System.out.println("Você escolheu Bisteca-R$ 24,00");
                break;
                case 4:
                    System.out.println("Você escolheu refrigerante-R$ 6,00");
                    break;

            default:
                System.out.println("Opção Inválida :");
                break;
        }

        sc.next();
    }
    
}
