package app;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public void main(String[] args) {

        //Exercise 1
        MathOperation mathOperation = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        int sumNum = mathOperation.operate(2, 3);
        System.out.println(sumNum);

        //Exercise 2
        StringManipulator manipulator = s -> s.toUpperCase();
        String textManipul = manipulator.upper("hello!");
        System.out.println(textManipul);

        //Exercise 3
        Function<String, Integer> function = StringListProcessor::countUppercase;
        int countUpper = function.apply("I Love Programming!");
        System.out.println(countUpper);

        //Exercise 4
        Supplier<Integer> supplier = () -> RandomNumberGenerator.generateRandomNumber(1, 100);
        int randomNumber = supplier.get();
        System.out.println(randomNumber);
    }
}
