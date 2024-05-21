package mostRecivedGift.domain;

import java.util.Arrays;
import java.util.Objects;

public class Record {
    private final int[][] giveTakeRecord;

    public Record(int[][] example) {
        this.giveTakeRecord = example;
    }

    public Record(int capacity) {
        this.giveTakeRecord = new int[capacity][capacity];
    }

    public void writeRecord(int index1, int index2) {
        this.giveTakeRecord[index1][index2]++;
    }

    public int findMax(Score score) {
        int max = 0;
        for (int i = 0; i < this.giveTakeRecord.length; i++) {
            max = Math.max(max, countGift(i, score));
        }
        return max;
    }

    private int countGift(int i, Score score) {
        int cnt = 0;
        for (int j = 0; j < this.giveTakeRecord[0].length; j++) {
            int[] index = {i,j};
            cnt += canReceiveGift(index, score);
        }
        return cnt;
    }

    private int canReceiveGift(int[] index, Score score) {
        int i = index[0], j = index[1];
        if (giveMoreGift(i, j) || (sameGiveCount(i, j) && score.biggerScore(i, j)))
            return 1;
        return 0;
    }

    private boolean giveMoreGift(int i, int j) {
        return this.giveTakeRecord[i][j] > this.giveTakeRecord[j][i];
    }

    private boolean sameGiveCount(int i, int j) {
        return this.giveTakeRecord[i][j] == this.giveTakeRecord[j][i];
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Record)) return false;
        Record record = (Record) object;
        return Arrays.deepEquals(giveTakeRecord, record.giveTakeRecord);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(giveTakeRecord);
    }
}
