import org.jetbrains.annotations.NotNull;

public class SortOfSort {
    int[] array;

    SortOfSort(){

    }

    SortOfSort(@NotNull int[] array){
        for(int i = 0; i < array.length; i++){
            this.array[i] = array[i];
        }
    }

    public void sortOfSort(){
        int count1 = 0;
        int count2 = 2;
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(count1 < 2) {
                    if (array[j] > array[i]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        count2--;
                    }
                }

                if(count2 < 2) {
                    if (array[j] < array[i]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        count1++;
                    }
                }

            }
        }
    }
}
