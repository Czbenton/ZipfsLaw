package entities;

/**
 * Created by joe on 1/3/17.
 */
public class Word {

    private String word;
    private int frequency;

    public Word() {
    }

    public Word(String word, int frequency) {
        this.word = word;
        this.frequency = frequency;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}
