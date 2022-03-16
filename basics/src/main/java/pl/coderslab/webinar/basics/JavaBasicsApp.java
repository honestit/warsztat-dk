package pl.coderslab.webinar.basics;

public class JavaBasicsApp {

    public static void main(String[] args) {

        // Deklaracja zmiennej
        String title = "Dynamit w nogach, węże w pokoju";
        String url = "https://www.rp.pl/polskie-orly/art35844171-dynamit-w-nogach-weze-w-pokoju?utm_source=rp.pl_SG&utm_medium=zajawka2";
        String content = "Jan Habdas jest największą nadzieją polskich skoków narciarskich. 18-latek podczas mistrzostw kraju wyprzedził samego Kamila Stocha.";

        for (int i = 1; i <= 3; i++) {
            System.out.println(title);
            System.out.println(url);
            if (content.length() <= 120) {
                System.out.println(content);
            } else {
                System.out.println("Opis zbyt długi. Przejdź do strony, aby przeczytać");
            }
            // Operacje mają swoje priorytety, swoją kolejność
            System.out.println("*".repeat(50));
        }
    }

}
