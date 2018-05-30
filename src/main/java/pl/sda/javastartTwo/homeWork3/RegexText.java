package pl.sda.javastartTwo.homeWork3;

      /*  Napisz program, ktůry pozwoli uŅytkownikowi na podanie dowolnego napisu ( w konsoli - Scanner)
        i przyrůwna ten napis kolejno do wyraŅeŮ regularnych przedstawiajĻcych:
        -liczby dodatnie
        -liczby ujemne
        -liczby ca≥kowite
        -numer IP
        -data w wybranym formacie (np dd/MM/yyyy)
        -imiona (np "Adam" "Marek")
        -numer telefonu (666-666-666 lub +48666666666 lub 666666666)
        Program powinien wypisaś czy napis spe≥nia wyraŅenie regularne
                (tip: "napis".matches(regexp) da nam wartoúś boolean) - w pÍtli while do momentu wpisania "koniec" w konsoli.*/



import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexText {

    public static void main(String[] args) {

        taskInCleverWay();
    }

    private static void taskInCleverWay() {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        if (line.matches("\\d+.?\\d*")) {

            System.out.println("jest to liczba doadatnia");
        }
        if (line.matches("(-)\\d+.?\\d*")) {

            System.out.println("jest to liczba ujemna");
        }
        if (line.matches("\\d+")) {

            System.out.println("jest to liczba całkowita");
        }
        if(line.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}")){

            System.out.println("jest to numer IP");
        }
        if(line.matches("[1-3]{1}\\d?(/)\\d{1}\\d?(/)\\d{4}")){

            System.out.println("jest to data");
        }
        if(line.matches("\\w+")){

            System.out.println("Imię");
        }
        if(line.matches("\\d{3}(-)\\d{3}(-)\\d{3}")||line.matches("\\+48\\d{9}")||line.matches("\\d{9}")){

            System.out.println("Numer telefonu");
        }
    }


    private static void GiveSomeLine() {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();


        Pattern compiledPattern = Pattern.compile("/d");
        Matcher matcher = compiledPattern.matcher(line);
        line.matches("/d");
        if (matcher.find()) ;
    }
}
