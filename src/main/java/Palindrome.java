import java.util.ArrayList;
import java.util.List;

public class Palindrome {

    public List<Integer> palindromeFunction(Integer lowerLimit, Integer upperLimit){

        if(lowerLimit==null || upperLimit==null)
            return null;

        List<Integer> palindromeList= new ArrayList<>();

        while (lowerLimit<=upperLimit){

            String lowerLimitS = lowerLimit.toString();
            boolean palindrome=true;
            int lowerLastDigit = lowerLimitS.length() - 1;
            for(int i = 0; i< lowerLastDigit; i++){

                if(lowerLimitS.charAt(i)!= lowerLimitS.charAt(lowerLastDigit-i)){
                    palindrome=false;
                    break;
                }
            }

            if(palindrome)
                palindromeList.add(lowerLimit);

            lowerLimit++;
        }
        return palindromeList;
    }

    public void getPalindromeList(){

        palindromeFunction(10, 15);

    }
}
