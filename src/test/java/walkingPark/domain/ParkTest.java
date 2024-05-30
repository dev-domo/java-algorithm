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
}
