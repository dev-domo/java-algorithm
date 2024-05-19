package mostRecivedGift.domain;

import java.util.Arrays;
import java.util.Objects;

public class Record {
    private int[][] giveTakeRecord;

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
            int cnt = 0;
            for (int j = 0; j < this.giveTakeRecord[0].length; j++) {
                if (this.giveTakeRecord[i][j] > this.giveTakeRecord[j][i])
                    cnt++;
                if (this.giveTakeRecord[i][j] == this.giveTakeRecord[j][i] && score.biggerScore(i, j))
                    cnt++;
            }
            max = Math.max(max, cnt);
        }
        return max;
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
