package ru.alatyrtseva;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

class MyScanner {

    private static final int FIRST_DIGIT_CODE = 48;
    private static final int LASR_DIGIT_CODE = 58;
    private static final int MINUS_CODE = 45;
    private InputStream inputStream;

    public MyScanner(String fileName) {
        try {
            inputStream = new FileInputStream(fileName);
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public int nextInt() {
        try {
            String resultString = "";
            int inputCharacterCode = inputStream.read();
            while (inputCharacterCode < FIRST_DIGIT_CODE || inputCharacterCode > LASR_DIGIT_CODE) {
                if (inputCharacterCode == MINUS_CODE) {
                    resultString += (char)inputCharacterCode;
                    inputCharacterCode = inputStream.read();
                    if (inputCharacterCode < FIRST_DIGIT_CODE || inputCharacterCode > LASR_DIGIT_CODE) {
                        resultString="";
                    }
                }
                else    inputCharacterCode = inputStream.read();
            };
            while (inputCharacterCode >= FIRST_DIGIT_CODE && inputCharacterCode <= LASR_DIGIT_CODE) {
                resultString += (char)inputCharacterCode;
                inputCharacterCode = inputStream.read();
            }
            int result = Integer.parseInt(resultString);
            return result;
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
            return Integer.parseInt(null);
        }
    }
}
