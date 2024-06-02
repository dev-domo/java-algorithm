package walkingPark.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MoveTest {
    @Test
    void move_생성() {
        assertThat(new Move(3)).isEqualTo(new Move(3));
    }

    @Test
    void getNum() {
        assertThat(new Move(3).getNum()).isEqualTo(3);
    }
}
