package walkingPark.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PositionTest {
    @Test
    void position_생성() {
        assertThat(new Position(0,0)).isEqualTo(new Position(0,0));
        assertThat(new Position(new Row(0), new Col(0))).isEqualTo(new Position(0,0));
    }
}
