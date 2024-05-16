package mostRecivedGift.util;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringUtilTest {
    @Test
    void split() {
        String input = "muzi frodo";
        String[] friends = {"muzi","frodo"};
        assertThat(input.split(" ")).isEqualTo(friends);
    }
}
