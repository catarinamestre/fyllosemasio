import java.util.Arrays;

public class Exercise {
    public Exercise() {
    }

    public static String calculateMaximumProductWhenMultipleByThree(int[] inputNumbers){
        //The array was sorted because it is not necessary to iterate through all numbers
        Arrays.sort(inputNumbers);
        int product, firstNumber, secondNumber;
        for (int i =inputNumbers.length-1; i>0; i--){
            firstNumber= inputNumbers[i];
            for (int j=i-1; j>=0;j--){
                secondNumber= inputNumbers[j];
                product= firstNumber*secondNumber;
                if(product%3==0)
                    return Integer.toString(product);
            }
            
        }
        return "No maximum product multiple by 3.";
    }
}
