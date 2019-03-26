import org.hamcrest.collection.IsEmptyCollection;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PalindromeTest {


    @Test
    void testPalindromeSuccess(){

        Palindrome test=mock(Palindrome.class);
        int x=10;
        int y=14;

        // define return value for method getUniqueId()
        when(test.palindromeFunction(10,14)).thenReturn(Collections.singletonList(11));

        List<Integer> palindromeList = test.palindromeFunction(x,y);


        assertEquals(1, palindromeList.size() );
        assertThat(palindromeList, hasItems(11));
    }

    @Test
    void testPalindromeFull(){

        Palindrome palindrome= new Palindrome();

        int x=9;
        int y=12;

        List<Integer> palindromeList = palindrome.palindromeFunction(x,y);

        assertThat(palindromeList, hasItems(9,11));
    }

    @Test
    void testPalindromeTreeDigits(){

        Palindrome palindrome = new Palindrome();

        int x=100;
        int y=112;

        List<Integer> palindromeList = palindrome.palindromeFunction(x, y);

        assertThat(palindromeList, hasItems(101,111));
    }

    @Test
    void testPalindromeNull(){

        Palindrome palindrome= new Palindrome();
        assertNull(palindrome.palindromeFunction(null,null));
    }


    @Test
    void testEmptyList(){

        int x=10;
        int y=10;

        Palindrome palindrome=new Palindrome();
        List<Integer> palindromeList = palindrome.palindromeFunction(x,y);
        assertThat(palindromeList, IsEmptyCollection.<Integer>empty());
    }

}
