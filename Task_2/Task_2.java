package Task_2;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class Task_2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            boolean flag = false;
            // /Users/mikhailrypta/IdeaProjects/Lab-2/src/Task_2/file1.txt
            System.out.println("Введіть ім'я файлу: ");
            String str = scanner.next();
            File file = new File(str);

            while (flag != true) {
                if (file.exists()) {
                    flag = true;
                } else {
                    System.out.println("Файл не знайдено");
                    str = scanner.next();
                    file = new File(str);
                }
            }

            Scanner scanner2 = new Scanner(file);
            ArrayList<Integer> integers = new ArrayList<>() ;
            while (scanner2.hasNext()) {
                if (scanner2.hasNextInt()) {
                    integers.add(scanner2.nextInt());
                } else scanner2.next();
            }

            System.out.println(integers);

            File file2 = new File("/Users/mikhailrypta/IdeaProjects/Lab-2/src/Task_2/file2.txt"); 
            FileWriter fileWriter = new FileWriter(file2);

            for (int temp = 0; temp < integers.size(); temp++ ) {
                if((integers.get(temp) % 2) == 0){
                    int res = integers.get(temp) * 2;
                    fileWriter.write(res + " ");
                    System.out.println("Парні числа = " + integers.get(temp));
                }
                else if((integers.get(temp) % 2)  == 1){
                    int res = integers.get(temp) + 1;
                    fileWriter.write(res + " " );
                    System.out.println("Непарні числа = " + integers.get(temp));
                }
                else if((integers.get(temp) < 0)){
                    int res = integers.get(temp) * -1;
                    fileWriter.write(res + " ");
                    System.out.println("Негативні числа = " + integers.get(temp));
                }
            }
            fileWriter.close();

        } catch (FileNotFoundException e){
            System.out.println("Файл не знайдено");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
