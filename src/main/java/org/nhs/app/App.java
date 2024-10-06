public class App {

    public static void main (String [] args) {
        

        for (int number  =  1; number <= 5; number ++) {
            for (int counter = 1; counter <= number; counter ++){
            System.out.print(number);
        }
        System.out.println();
    }

        for (int number = 1; number <= 5; number ++) {
            for (int dot = 1; dot <= 5-number; dot ++) {
                System.out.print(".");
            }
        for (int counter = 1; counter <= number; counter ++) {
            System.out.print(number);
        }
        System.out.println();
        }

        for (int number = 1; number <= 5; number ++) {
            for (int beforeDot = 1; beforeDot <= 5 - number; beforeDot ++) {
                System.out.print(".");
            }
            for (int counter = 1; counter == 1; counter++) {
                System.out.print(number);
            }
            for (int endDot = 1; endDot <= number-1; endDot++) {
                System.out.print(".");
            }
            System.out.println();
        }

}
}

