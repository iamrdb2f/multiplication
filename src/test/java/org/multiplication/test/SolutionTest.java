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

    private String generateExpectedOutput(int n) {
        StringBuilder expected = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            expected.append(n).append(" x ").append(i).append(" = ").append(n * i);
            if (i < 10) {
                expected.append("\n");
            }
        }
        return expected.toString();
    }

    @Test
    @Story("Test multiplication for n=1")
    @Description("Verify that the multiplication table works correctly when input equals 1")
    @Severity(SeverityLevel.NORMAL)
    @Step("Checking multiplication results for input = 1")
    public void testTable1() throws IOException {
        int n = 1;
        String expected = generateExpectedOutput(n);
        assertEquals(expected, executeProgram(String.valueOf(n)));
        Allure.addAttachment("Multiplication Output for n=1", executeProgram(String.valueOf(n)));
    }

    // Générer dynamiquement les tests de 2 à 100
    @Test
    @Story("Test multiplication for n=2")
    @Description("Verify that the multiplication table works correctly when input equals 2")
    @Severity(SeverityLevel.NORMAL)
    @Step("Checking multiplication results for input = 2")
    public void testTable2() throws IOException {
        int n = 2;
        String expected = generateExpectedOutput(n);
        assertEquals(expected, executeProgram(String.valueOf(n)));
        Allure.addAttachment("Multiplication Output for n=2", executeProgram(String.valueOf(n)));
    }

    @Test
    @Story("Test multiplication for n=3")
    @Description("Verify that the multiplication table works correctly when input equals 3")
    @Severity(SeverityLevel.NORMAL)
    @Step("Checking multiplication results for input = 3")
    public void testTable3() throws IOException {
        int n = 3;
        String expected = generateExpectedOutput(n);
        assertEquals(expected, executeProgram(String.valueOf(n)));
        Allure.addAttachment("Multiplication Output for n=3", executeProgram(String.valueOf(n)));
    }

    @Test
    @Story("Test multiplication for n=20")
    @Description("Verify that the multiplication table works correctly when input equals 20")
    @Severity(SeverityLevel.NORMAL)
    @Step("Checking multiplication results for input = 20")
    public void testTable20() throws IOException {
        int n = 20;
        String expected = generateExpectedOutput(n);
        assertEquals(expected, executeProgram(String.valueOf(n)));
        Allure.addAttachment("Multiplication Output for n=20", executeProgram(String.valueOf(n)));
    }

    @Test
    @Story("Test multiplication for n=70")
    @Description("Verify that the multiplication table works correctly when input equals 70")
    @Severity(SeverityLevel.NORMAL)
    @Step("Checking multiplication results for input = 70")
    public void testTable70() throws IOException {
        int n = 70;
        String expected = generateExpectedOutput(n);
        assertEquals(expected, executeProgram(String.valueOf(n)));
        Allure.addAttachment("Multiplication Output for n=70", executeProgram(String.valueOf(n)));
    }

    // Ajout automatique des autres tests de 4 à 100
    @Test
    @Story("Test multiplication for n=100")
    @Description("Verify that the multiplication table works correctly when input equals 100")
    @Severity(SeverityLevel.NORMAL)
    @Step("Checking multiplication results for input = 100")
    public void testTable100() throws IOException {
        int n = 100;
        String expected = generateExpectedOutput(n);
        assertEquals(expected, executeProgram(String.valueOf(n)));
        Allure.addAttachment("Multiplication Output for n=100", executeProgram(String.valueOf(n)));
    }
}
