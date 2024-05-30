package walkingPark.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RouteTest {
    @Test
    void route_생성() {
        assertThat(new Route("E", 2)).isEqualTo(new Route("E",2));
        assertThat(new Route("E 2")).isEqualTo(new Route("E", 2));
    }
}
