package walkingPark.domain;

import java.util.Objects;

public class Direct {
    private static final String EAST = "E";
    private static final String WEST = "W";
    private static final String SOUTH = "S";
    private static final String NORTH = "N";
    private final String keyword;
    public Direct(String keyword) {
        this.keyword = checkPossibleKeyword(keyword);
    }

    private String checkPossibleKeyword(String keyword) {
        if (!keyword.equals(EAST) && !keyword.equals(WEST) && !keyword.equals(SOUTH) && !keyword.equals(NORTH))
            throw new IllegalArgumentException("잘못된 키워드입니다.");
        return keyword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Direct))
            return false;
        Direct direct = (Direct) o;
        return Objects.equals(keyword, direct.keyword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyword);
    }
}
