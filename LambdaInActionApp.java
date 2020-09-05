package be.intecbrussel.lambda.demo2;

public class LambdaInActionApp
{
    @FunctionalInterface
    interface FuncInter1
    {
        public abstract int operation(int a, int b);
    }

    public static void main(String[] args)
    {
        FuncInter1 add = (int x, int y) -> x + y;

        System.out.println("Addition: " + operate(6, 3, add));
    }

    private static int operate(int number1, int number2, FuncInter1 fObject)
    {
        return fObject.operation(number1, number2);
    }
}
