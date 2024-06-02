package walkingPark.domain;

import java.math.BigDecimal;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Park {
    private static final String START = "S";
    private static final String OBSTRUCTION = "X";

    private final String[] input;
    public Park(String[] input) {
        this.input = input;
    }

    public Position findStart() {
        for (int i = 0; i < this.input.length; i++) {
            if (this.input[i].contains(START)) {
                return new Position(i, this.input[i].indexOf(START));
            }
        }
        return null;
    }

    public int getWidth() {
        return this.input[0].length();
    }

    public int getHeight() {
        return this.input.length;
    }

    public boolean isMeetObstruction(Row row, Col col) {
        return col.findLocation(row.getParkLine(this.input)).equals(OBSTRUCTION);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Park))
            return false;
        Park park = (Park) o;
        return Arrays.equals(input, park.input);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(input);
    }
}
