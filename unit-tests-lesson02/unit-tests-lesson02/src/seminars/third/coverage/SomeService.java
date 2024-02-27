package seminars.third.coverage;

public class SomeService {
    public String fizzBuzz(int i) {
        if(i % 15 == 0){
            return "FizzBuzz";
        }
        if(i % 3 == 0){
            return "Fizz";
        }
        if(i % 5 == 0){
            return "Buzz";
        }
        return Integer.toString(i);
    }
//    * 3.2. Метод возвращает true для массивов, которые начинаются или заканчиваются 6, и false - если 6 нет ни в начале ни в конце массива

    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        }
        return false;
    }

    public double calculatingDiscount( double purchaseAmount, int discountAmount) {
// purchaseAmount - сумма покупки
// discountAmount - размер скидки
        double discountedAmount = 0; // Сумма со скидкой (первоначальная сумма - скидка%)
        if (purchaseAmount >= 0) {
            if (discountAmount >= 0 && discountAmount <= 100) {
                discountedAmount = purchaseAmount - (purchaseAmount * discountAmount) / 100;
            } else {
                throw new ArithmeticException( "Скидка должна быть в диапазоне от 0 до 100%");
            }
        } else {
// Сумма покупки не может быть отрицательной
            throw new ArithmeticException( "Сумма покупки не может быть отрицательной");
        }
        return discountedAmount; // Метод должен возвращать сумму покупки со скидкой
    }
    public int luckySum(int a, int b, int c) {
        if (a == 13) {
            return b + c;
        }
        return a + b + c;
    }


}