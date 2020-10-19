package tasks;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Напишите класс, конструктор которого принимает два массива:
 * массив значений и массив весов значений.
 * Класс должен содержать метод, который будет возвращать элемент
 * из первого массива случайным образом, с учётом его веса.
 * Пример:
 * Дан массив [1, 2, 3], и массив весов [1, 2, 10].
 * В среднем, значение «1» должно возвращаться в 2 раза реже,
 * чем значение «2» и в десять раз реже, чем значение «3».
 */
class RandomFromArray {

    private int[] values;
    private int[] weights;

    public RandomFromArray(int[] values, int[] weights){
        this.values = values;
        this.weights = weights;
    }

    public int sumOfWeights() {
        int cur_sum = 0;
        for(int weight : weights)
            cur_sum += weight;
        return cur_sum;
    }

    public int getElement(){
        int cur_sum = 0;
        int cur_rand_index = ThreadLocalRandom.current().nextInt(0, this.sumOfWeights()+ 1);
        for(int i = 0; i < weights.length ; i++) {
            cur_sum += weights[i];
            if(cur_sum > cur_rand_index)
                return values[i];
        }
        return values[0];
    }

}

public class Task05 {

}