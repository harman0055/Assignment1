package com.example.assignmnt1;

//
// Source code recreated from a .class file by IntelliJ IDEA
//

public class CounterModel {
    private String textInput;
    private int lineCount;
    private int wordCount;
    private int charCount;
    private int digitCount;

    public CounterModel() {
    }

    public String getTextInput() {
        return this.textInput;
    }

    public void setTextInput(String textInput) {
        this.textInput = textInput;
    }

    public int getLineCount() {
        return this.lineCount;
    }

    public int getWordCount() {
        return this.wordCount;
    }

    public int getCharCount() {
        return this.charCount;
    }

    public int getDigitCount() {
        return this.digitCount;
    }

    public void processInput() {
        this.charCount = this.textInput.length();
        this.lineCount = 1;

        int i;
        for(i = 0; i < this.charCount; ++i) {
            if (this.textInput.charAt(i) == '\n') {
                ++this.lineCount;
            }
        }

        this.wordCount = 0;

        for(i = 0; i < this.charCount; ++i) {
            boolean startOfWord;
            if (this.textInput.charAt(i) == ' ') {
                startOfWord = true;
            } else if (!Character.isLetter(this.textInput.charAt(i))) {
                startOfWord = false;
            } else if (i == 0) {
                startOfWord = true;
            } else if (Character.isLetter(this.textInput.charAt(i - 1))) {
                startOfWord = false;
            } else if (this.textInput.charAt(i - 1) == '\'' && i > 1 && Character.isLetter(this.textInput.charAt(i - 2))) {
                startOfWord = false;
            } else {
                startOfWord = true;
            }

            if (startOfWord) {
                ++this.wordCount;
            }
        }

        this.digitCount = 0;

        for(i = 0; i < this.charCount; ++i) {
            if (Character.isDigit(this.textInput.charAt(i))) {
                ++this.digitCount;
            }
        }

    }
}
