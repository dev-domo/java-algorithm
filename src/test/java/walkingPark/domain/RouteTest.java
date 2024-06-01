package walkingPark.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RouteTest {
    @Test
    void route_생성() {
        assertThat(new Route("E", 2)).isEqualTo(new Route("E",2));
        assertThat(new Route("E 2")).isEqualTo(new Route("E", 2));
    }

    @Test
    void 이동_시도() {
        Park park = new Park(new String[]{"SOO", "XOO", "OOO"});
        Row row = new Row(0);
        Col col = new Col(1);
        assertThat(new Route("E 2").tryMove(park, row, col)).isEqualTo(new Position(0,2));
    }
}
