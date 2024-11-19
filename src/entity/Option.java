package entity;

public class Option {
    private String optionChar;
    private String sentence;

    public Option(String optionChar, String sentence) {
        this.optionChar = optionChar;
        this.sentence = sentence;
    }

    public String getOptionChar() {
        return optionChar;
    }

    public String getSentence() {
        return sentence;
    }
}
