public class Quiz3 {
    // ! Instance Method1: no "static" keyword ,must new object to call method
    public int multiply(int number) {
        return number * number;
    }

    public int normalMethod(int n) {
        int[] arr = new int[] {1, 3, 5, 7, 9, 11, 13};
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += arr[i];
        }
        return total;
    }

    // ! Static Method: with "static" keyword
    public static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        // !Object q3 is calling instance multiply() method:
        Quiz3 q3 = new Quiz3();
        System.out.println("Object q3 is calling instance multiply() method: "
                + q3.multiply(5));// 25

        // !Invoking static square() method within same Class or invoke with Class name if not in the main of same class
        int result = square(5);
        int result2 = Quiz3.square(5);//invoked with Class name if not in the same class's main
        System.out.println(
                "Invoking static square() method within same Class :" + result);// 25
        System.out.println(result2);
        
        // !Instance method: must create class object to call the instance method
        Quiz3 q4 = new Quiz3();
        System.out.println(q4.normalMethod(4));// 16
        // Quiz3.normalMethod(4); //!compile error
        //instance method can not be invoked with Class name.


    }
}
