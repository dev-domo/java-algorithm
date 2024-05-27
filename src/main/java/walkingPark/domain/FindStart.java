package walkingPark.domain;

public class FindStart {
    private static final String START = "S";

    public static Position whereIsStart(String[] park) {
        Position position = null;
        for (int i = 0; i < park.length; i++) {
            int idx = park[i].indexOf(START);
            if (idx > 0) {
                position = new Position(i, idx);
            }
        }
        return position;
    }
}
