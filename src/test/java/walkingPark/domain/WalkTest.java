package walkingPark.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WalkTest {
    @Test
    void split() {
        assertThat(Walk.splitRoute("E 2")).containsExactly("E","2");
    }

    @Test
    void 문자열_정수로_바꾸기() {
        assertThat(Walk.parseToInt("2")).isEqualTo(2);
    }

    @Test
    void 산책() {
        String[] park = {"OSO", "XOO", "OXO"};
        String[] routes = {"E 2", "S 1"};
        assertThat(Walk.startWalking(park, routes, FindStart.whereIsStart(park))).isEqualTo(new Position(1, 1));
    }
}
