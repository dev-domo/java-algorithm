package mostRecivedGift.domain;

import java.util.Arrays;

public class Score {
    private int[] giftScore;

    public Score(int[] giftScore) {
        this.giftScore = giftScore;
    }

    public Score(int capacity) {
        this.giftScore = makeScore(capacity);
    }

    private int[] makeScore(int capacity) {
        this.giftScore = new int[capacity];
        return this.giftScore;
    }

    public void add(int index) {
        this.giftScore[index]++;
    }

    public void minus(int index) {
        this.giftScore[index]--;
    }

    public boolean biggerScore(int index1, int index2) {
        return this.giftScore[index1] > this.giftScore[index2];
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Score)) return false;
        Score score = (Score) object;
        return Arrays.equals(giftScore, score.giftScore);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(giftScore);
    }
}
