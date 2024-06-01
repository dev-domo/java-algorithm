package walkingPark.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WalkTest {
    @Test
    void 산책() {
        Park park = new Park(new String[]{"SOO", "OXO", "XXO"});
        Routes routes = new Routes(new Route[]{new Route("E 1"), new Route("S 2")});
        assertThat(Walk.startWalk(park, routes)).isEqualTo(new Position(0,1));
    }
}
