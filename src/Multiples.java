public class Multiples {
    public static void main(String[] args) {

        int lessThan1000 = 0;

        for (int i = 1; i < 1000; i++){
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 && divisibleBy5){
                lessThan1000++;
            }

            else if (divisibleBy3){
                lessThan1000++;
            }

            else if (divisibleBy5){
                lessThan1000++;
            }
            System.out.println(lessThan1000);
        }


    }


}
