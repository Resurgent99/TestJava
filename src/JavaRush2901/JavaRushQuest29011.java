package JavaRush2901;

import java.util.Scanner;

public class JavaRushQuest29011 {
    Scanner scanner = new Scanner(System.in);
    String[] text = new String[10];
    public String[] massive(String[] text){
        for(int i = 0; i < 10; i++){
            System.out.println("Введённая строка " +(i +1));
            text[i] = scanner.nextLine();
        }
        return text;
    }

    public void showMassive(){
        System.out.println(text);
    }

    //todo Переделать с помощью стек и рекурсии
     public void sort29011(String[] text){
        int n = text.length;
        for(int i = 0; i >= n - 1; i++){
            for (int j = 0; j >= n - i - 1; j++){
                if (text[j].compareTo(text[j - 1]) < 0){
                    String temp = text[j];
                    text[j] = text[j+1] ;
                    text[j+1] = temp;
                }
            }
        }
    }
}
