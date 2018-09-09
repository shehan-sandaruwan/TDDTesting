
public class StringCalculator {

    public static final int add(final String numbers){
        String[] numbersArray = numbers.split(",|n"); // n is added
        int sum = 0;
        for(String number : numbersArray){
            if(!number.trim().isEmpty()){
                sum += Integer.parseInt(number);
            }
        }
        return sum;
    }
}
