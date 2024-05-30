package walkingPark.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RoutesTest {
    @Test
    void routes_생성() {
        Route[] input = {new Route("E 2"), new Route("W 3")};
        assertThat(new Routes(input)).isEqualTo(new Routes(input));
    }
}
