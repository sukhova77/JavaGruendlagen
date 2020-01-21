package stringAufgaben;

public class HausAufgage1 {

    // Andrej Podlubnij
    public static void main(String[] args) {
        //String eingabe = "Поп";
        // String umgekehrt schreiben
        //String ausgabe;
        //ausgabe = "";
        //System.out.println(eingabe.length() - 1);
        //System.out.println(eingabe.charAt(eingabe.length() - 10));
        //ausgabe = Character.toString(eingabe.charAt(eingabe.length() - 10));
        //System.out.println(ausgabe);

        /*for (int i = eingabe.length()-1 ; i >= 0; i--) {
            ausgabe = ausgabe + Character.toString(eingabe.charAt(i));

        }
        System.out.println(ausgabe);

        // проверить на палиндром
        //
        if (eingabe.equals(ausgabe)){
            System.out.println("palindrom");
        }else{
            System.out.println("not palindrom");
        }
        System.out.print("\u0423\u0440\u0430 \n");

        String adres = "Berlin";
        String city = "London";

        boolean proverka = adres.equals(city);
        System.out.println(proverka);
*/

        // 1. Из заданного стринга удалить все гласные
        // 2. Из предложения "В Берлине проживает 3 млн человек" удалить все пробелы и написать всё больюими буквами
        // 3. Написать метод, который случайным образом создаёт случайный стринг длинной "L", равной для начала 20
        // 4. Сместить буквы в стринге на 3 позиции. Например a => г, б => д, в => е; "абв" => "где"
        String s = "Amazonka";
        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            String deleteWord = "aoejiöüä";
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'j' || ch == 'o') {
                String before = s.substring(0, i);
                String after = s.substring(i + 1);
                s = before + after;
            } else {
                i++;
            }
        }
        System.out.println(s);
    }
}