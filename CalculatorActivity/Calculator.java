package CalculatorActivity;

public class Calculator<T extends Number> {
    T [] numbers;

    public Calculator (T[] numbers) {
        this.numbers = numbers;
    }

    public double average (){
        double result = 0;
        for(T number : numbers) {
            result += number.doubleValue();
        }
        return result / numbers.length;
    }
}
