package Task_1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Введіть текст: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("Рядок : " + str);
        String[] array = str.split(" ");
        ArrayList<String> arrayList = new ArrayList<>();
        Pattern input = Pattern.compile("^[^AEIYOUaeiyo]");

        for(int i = 0; i < array.length; i++) {
            Matcher matcher = input.matcher(array[i]);
            if(matcher.find()) {
                arrayList.add(array[i]);
            }
        }
        System.out.println("Тільки слова які не починаються на голосну");
        System.out.println(arrayList);
        System.out.println("Кількість слів в тексті = " + array.length);
    }
}


