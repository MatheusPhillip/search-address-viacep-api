import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SearchByCep searchByCep = new SearchByCep();

        System.out.println("Digit a CEP number: ");
        var cep = scanner.nextLine();

        try {
            Address newAddress = searchByCep.searchAddress(cep);
            System.out.println(newAddress);

            FileGenerator fileGenerator = new FileGenerator();
            fileGenerator.generateJsonFile(newAddress);
        }catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finishing search...");
        }
    }
}
