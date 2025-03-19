package org.multiplication.test;

import io.qameta.allure.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.lafed.Solution;
import java.io.*;

@Epic("Multiplication tables")
@Feature("Basic multiplication tests")
public class SolutionTest {

    private String executeProgram(String input) throws IOException {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        ByteArrayInputStream testIn = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream testOut = new ByteArrayOutputStream();

        System.setIn(testIn);
        System.setOut(new PrintStream(testOut));

        Solution.main(new String[]{});

        System.setIn(originalIn);
        System.setOut(originalOut);

        return testOut.toString().trim();
    }

    @Test
    @Story("Test multiplication for n=5")
    @Description("Verify that the multiplication table works correctly when input equals 5")
    @Severity(SeverityLevel.NORMAL)
    @Step("Checking multiplication results for input = 5")
    public void testTable5() throws IOException {
        String expected = "5 x 1 = 5\n5 x 2 = 10\n5 x 3 = 15\n5 x 4 = 20\n5 x 5 = 25\n5 x 6 = 30\n5 x 7 = 35\n5 x 8 = 40\n5 x 9 = 45\n5 x 10 = 50";
        assertEquals(expected, executeProgram("5"));
        Allure.addAttachment("Multiplication Output for n=5", executeProgram("5"));
    }

    @Test
    @Story("Test multiplication for n=10")
    @Description("Verify that the multiplication table works correctly when input equals 10")
    @Severity(SeverityLevel.NORMAL)
    @Step("Checking multiplication results for input = 10")
    public void testTable10() throws IOException {
        String expected = "10 x 1 = 10\n10 x 2 = 20\n10 x 3 = 30\n10 x 4 = 40\n10 x 5 = 50\n10 x 6 = 60\n10 x 7 = 70\n10 x 8 = 80\n10 x 9 = 90\n10 x 10 = 100";
        assertEquals(expected, executeProgram("10"));
        Allure.addAttachment("Multiplication Output for n=10", executeProgram("10"));
    }

    @Test
    @Story("Test multiplication for n=15")
    @Description("Verify that the multiplication table works correctly when input equals 15")
    @Severity(SeverityLevel.NORMAL)
    @Step("Checking multiplication results for input = 15")
    public void testTable15() throws IOException {
        String expected = "15 x 1 = 15\n15 x 2 = 30\n15 x 3 = 45\n15 x 4 = 60\n15 x 5 = 75\n15 x 6 = 90\n15 x 7 = 105\n15 x 8 = 120\n15 x 9 = 135\n15 x 10 = 150";
        assertEquals(expected, executeProgram("15"));
        Allure.addAttachment("Multiplication Output for n=15", executeProgram("15"));
    }
}
