public class method {

    public static void main(String[] args) {
      checkNumber(2);
      checkNumber(-3);
      checkNumber(0);


    }

    public static void checkNumber(int number) {

        if (number > 0){
            System.out.println("Positive");
        }
        else if (number < 0) {
            System.out.println("Negative");
        }
        System.out.println("Zero");
    }



}
