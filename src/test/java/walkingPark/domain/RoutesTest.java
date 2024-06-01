package walkingPark.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RoutesTest {
    @Test
    void routes_생성() {
        Route[] input = {new Route("E 2"), new Route("W 3")};
        assertThat(new Routes(input)).isEqualTo(new Routes(input));
    }

    @Test
    void routes_개수() {
        Route[] input = {new Route("E 2"), new Route("W 3")};
        assertThat(new Routes(input).countRoutes()).isEqualTo(2);
    }

    @Test
    void 다음_route() {
        Route[] input = {new Route("E 2"), new Route("W 3")};
        assertThat(new Routes(input).nextRoute(0)).isEqualTo(new Route("E 2"));
    }
}
