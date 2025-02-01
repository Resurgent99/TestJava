package Jun20;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class JavaRushCollection {
    Scanner scanner = new Scanner(System.in);
    List<Integer> massive= new ArrayList<>();
    public void initializeArray(){
        for(int i = 0; i< 20; i++){
            massive.add(i, scanner.nextInt());
        }
    }

    public void sort() {
        int n = massive.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (massive.get(j) > massive.get(j + 1)) {
                    int temp = massive.get(j);
                    massive.set(j, massive.get(j + 1));
                    massive.set(j + 1, temp);
                }
            }
        }



    }

    public Integer getMax(){
        sort();
        return massive.get(massive.size() - 1);
    }

    public void showMax(){
        System.out.println(getMax());
    }
    public void showMassive(){
        System.out.println(massive);
    }

    public static void main (String[] args){
        JavaRushCollection list = new JavaRushCollection();
        list.initializeArray();
        list.showMassive();
        list.showMax();
        list.showMassive();



    }
}
