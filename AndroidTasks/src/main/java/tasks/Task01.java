package tasks;

public class Task01 {

    /**
     * Возвращает минимальное значение из массива.
     * Не использовать стандартную библиотеку!
     */
    public static int min(int[] ints) {
        int cur_min = ints[0];

        for(int i = 0; i< ints.length ; i++){
            if(ints[i] < cur_min)
                cur_min = ints[i];
        }

        return cur_min;
    }

    public static float average(int[] ints) {
        float cur_sum = 0;

        for(int i : ints){
            cur_sum += i;
        }

        return cur_sum / ints.length;
    }

}