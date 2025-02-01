public class SortingStratigymain {
    public static void main(String[] args) {
        Sortingstratigy sortingstratigy = new BubbleSort();
        int[] numbers = new int[]{1,4,6,2,9,3,10};
        sortingstratigy.sort(numbers);
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]);
        }
        System.out.println();
        System.out.println("###################");
        Sortingstratigy sortingstratigy2 = new QuickSort();
        int[] numbers2 = new int[]{1,4,6,2, 89,9,3,10};
        sortingstratigy.sort(numbers2);
        for (int i = 0; i < numbers2.length; i++){
            System.out.print(numbers2[i]);
        }

    }
}
interface Sortingstratigy{
    void sort(int[] numbers);
}
class BubbleSort implements Sortingstratigy{
    @Override
    public void sort(int[] numbers) {
        int n = numbers.length;
        for(int i = 0; i< n -1; i++){
            for (int j = 0; j < n-i-1; j++){
                if(numbers[j] > numbers[j + 1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1] ;
                    numbers[j+1] = temp;
                }
            }
        }

    }

}

class QuickSort implements Sortingstratigy{

    @Override
    public void sort(int[] numbers) {
        quicksort(numbers, 0, numbers.length - 1);
        System.out.println(numbers);
    }
    private void quicksort(int[] arr, int low, int high){
        if (low < high){
            int pi = partition(arr, low, high);
            quicksort(arr, low, pi - 1);
            quicksort(arr, pi + 1, high);

        }
    }
    private int  partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}



