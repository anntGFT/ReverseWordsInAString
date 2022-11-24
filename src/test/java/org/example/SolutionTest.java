package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    static Solution solution;
    String result, s;


    @BeforeAll
    static void setup(){

        solution = new Solution();
    }

    @Test
    public void EmptyString(){

        result = "";
        s = "";

        assertEquals(result, solution.reverseWords(s));

    }

    @Test
    public void OneWordString(){

        result = "house";
        s = "house";

        assertEquals(result, solution.reverseWords(s));

    }

    @Test
    public void TwoWordString(){

        result = "house new";
        s = "new house";

        assertEquals(result, solution.reverseWords(s));

    }

    @Test
    public void SevenWordString(){

        result = "want I what is house new A";
        s = "A new house is what I want";

        assertEquals(result, solution.reverseWords(s));

    }

    @Test
    public void SevenWordStringWithSpacesBetweenWords(){

        result = "want I what is house new A";
        s = "A  new  house     is what    I want";

        assertEquals(result, solution.reverseWords(s));

    }
}
