package pl.sda.javastartTwo.exceptions;

public class ExeptionExample {

    public static void main(String[] args) {

      //  double resoult1 = divide(2, 4);

      //  double resoult2 = divideWithStableResoult(2, 4);
      //  devideManyTimes(3, 4, 5, 6, 6);

        positiveNumbers();



    }

    private static void positiveNumbers() {

        Integer[] ints = {1, 2, 3};
        SimplePositiveNumbersBox<Integer> numbersBox = new SimplePositiveNumbersBox<>(ints);


        try {
            Integer value = numbersBox.getValue(5);

        } catch (OutOfBoxExceptions exc) {

            System.out.println(exc.getMessage());
        }

        try {
            numbersBox.setValue(1, -2);

        } catch (OutOfBoxExceptions | RuntimeException x) {

            System.out.println(x.getMessage());
        }

        System.out.println("Szczęśliwy koniec");
    }


    private static double divide(int x, int y) {

        return x / y;
    }


    private static int divideWithStableResoult(int x, int y) {

        try {

            System.out.println("Inside try");
            return x / y;
        } finally {

            System.out.println("Inside finally");
            return -1; // nie umieszczaj return w finally
        }
    }


    //varargs
    private static double devideManyTimes(int x, int... dividers) {

        double result = x;
        for (int divider : dividers) {

            result = x / divider;
        }

        return result;
    }
}
