import java.util.Scanner;

public class Temperatura {
    public Temperatura() {
    }

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        Calculos calculos = new Calculos();
        boolean exit = false;
        System.out.println("===================================================");

        while(!exit) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Digitar a temperatura em Celsius");
            System.out.println("2. Digitar a temperatura em Kelvin");
            System.out.println("3. Digitar a temperatura em Réaumur");
            System.out.println("4. Digitar a temperatura em Rankine");
            System.out.println("5. Digitar a temperatura em Fahrenheit");
            System.out.println("6. Sair");
            System.out.print(":");
            int resposta_menu = scanner.nextInt();
            System.out.println("===================================================");
            switch (resposta_menu) {
                case 1:
                    System.out.print("Digite a temperatura em Celsius:");
                    calculos.calcular_temperaturas(scanner.nextDouble(), "Celsius");
                    System.out.println("===================================================");
                    calculos.mostrar_temperaturas();
                    break;
                case 2:
                    System.out.print("Digite a temperatura em Kelvin:");
                    calculos.calcular_temperaturas(scanner.nextDouble(), "Kelvin");
                    System.out.println("===================================================");
                    calculos.mostrar_temperaturas();
                    break;
                case 3:
                    System.out.print("Digite a temperatura em Reaumur:");
                    calculos.calcular_temperaturas(scanner.nextDouble(), "Reaumur");
                    System.out.println("===================================================");
                    calculos.mostrar_temperaturas();
                    break;
                case 4:
                    System.out.print("Digite a temperatura em Rankine:");
                    calculos.calcular_temperaturas(scanner.nextDouble(), "Rankine");
                    System.out.println("===================================================");
                    calculos.mostrar_temperaturas();
                    break;
                case 5:
                    System.out.print("Digite a temperatura em Fahrenheit:");
                    calculos.calcular_temperaturas(scanner.nextDouble(), "Fahrenheit");
                    System.out.println("===================================================");
                    calculos.mostrar_temperaturas();
                    break;
                case 6:
                    exit = true;
            }
        }

    }
}
