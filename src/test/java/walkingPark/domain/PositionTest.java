package walkingPark.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PositionTest {
    @Test
    void position_생성() {
        assertThat(new Position(0,0)).isEqualTo(new Position(0,0));
        assertThat(new Position(new Row(0), new Col(0))).isEqualTo(new Position(0,0));
    }

    @Test
    void position_이동_성공() {
        Park park = new Park(new String[]{"SOO", "XOO", "OOO"});
        Position current = new Position(0,0);
        Route route = new Route("E 1");
        assertThat(current.move(park, route)).isEqualTo(new Position(0,1));
    }

    @Test
    void position_이동_실패() {
        Park park = new Park(new String[]{"SOO", "XOO", "OOO"});
        Position current = new Position(0,0);
        Route route = new Route("S 1");
        assertThat(current.move(park, route)).isEqualTo(current);
    }
}
