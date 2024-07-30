import java.util.Scanner;

public class Pessoa {
    Lista_Pessoas pessoas = new Lista_Pessoas();
    private String name;
    private String sexo;
    private double altura;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void cadastrar_pessoa(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("NOME:");
        setName(scanner.nextLine());

        System.out.println("ALTURA:");
        setAltura(scanner.nextDouble());

        System.out.println("SEXO:");
        setSexo(scanner.nextLine());
    }
    public void mostrar_pessoa(){
        System.out.println("NOME: " + getName());
        System.out.println("ALTURA: " + getAltura());
        System.out.println("SEXO: " + getSexo());
    }
}
