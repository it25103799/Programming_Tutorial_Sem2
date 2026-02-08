// EvenOddNumber class
class EvenOddNumber {
    public boolean findEvenOrOdd(int i) {
        return i % 2 == 0;
    }
}

public class Question3 {
    public static void main(String[] args) {
        EvenOddNumber obj = new EvenOddNumber();
        
        System.out.println("Testing even/odd numbers:");
        
        int num1 = 10;
        boolean result1 = obj.findEvenOrOdd(num1);
        System.out.println(num1 + " is " + (result1 ? "even" : "odd"));
        
        int num2 = 7;
        boolean result2 = obj.findEvenOrOdd(num2);
        System.out.println(num2 + " is " + (result2 ? "even" : "odd"));
        
        int num3 = 0;
        boolean result3 = obj.findEvenOrOdd(num3);
        System.out.println(num3 + " is " + (result3 ? "even" : "odd"));
    }
}