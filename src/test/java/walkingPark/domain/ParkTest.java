package walkingPark.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ParkTest {
    @Test
    void park_생성() {
        String[] input = {"SOO", "OOO", "XXX"};
        assertThat(new Park(input)).isEqualTo(new Park(input));
    }

    @Test
    void 시작점_반환() {
        Park park = new Park(new String[]{"SOO", "OOO", "XXX"});
        assertThat(park.findStart()).isEqualTo(new Position(0,0));
    }

    @Test
    void park_가로() {
        Park park = new Park(new String[]{"SOO", "OOO", "XXX"});
        assertThat(park.getWidth()).isEqualTo(3);
    }

    @Test
    void park_세로() {
        Park park = new Park(new String[]{"SOO", "OOO", "XXX"});
        assertThat(park.getHeight()).isEqualTo(3);
    }

    @Test
    void 장애물_부딪히는지() {
        Park park = new Park(new String[]{"SOO","OOO","XOO"});
        assertThat(park.isMeetObstruction(new Row(2), new Col(0))).isTrue();
    }
}
