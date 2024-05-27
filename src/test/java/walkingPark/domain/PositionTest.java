package walkingPark.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PositionTest {
    @Test
    void position_생성() {
        int row = 0, col = 1;
        assertThat(new Position(row, col)).isEqualTo(new Position(row, col));
    }

    @Test
    void row_변경() {
        Position position = new Position(0,0);
        position.moveRow(1);
        assertThat(position).isEqualTo(new Position(1,0));
    }

    @Test
    void col_변경() {
        Position position = new Position(0,0);
        position.moveCol(1);
        assertThat(position).isEqualTo(new Position(0,1));
    }
}
