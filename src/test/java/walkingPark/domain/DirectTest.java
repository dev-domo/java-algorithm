package walkingPark.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class DirectTest {
    @ParameterizedTest
    @ValueSource(strings = {"E", "W", "S", "N"})
    void direct_생성(String keyword) {
        assertThat(new Direct(keyword)).isEqualTo(new Direct(keyword));
    }

    @Test
    void 잘못된_direct_생성() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new Direct("e"))
                .withMessageMatching("잘못된 키워드입니다.");
    }
}
