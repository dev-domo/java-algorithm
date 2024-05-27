package walkingPark.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FindStartTest {
    @Test
    void 산책_시작점_찾기() {
        String[] park = {"OSO", "XXO", "OXO"};
        assertThat(FindStart.whereIsStart(park)).isEqualTo(new Position(0, 1));
    }
}
