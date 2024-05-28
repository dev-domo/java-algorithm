package walkingPark.domain;

public class FindStart {
    private static final String START = "S";

    public static Position whereIsStart(String[] park) {
        for (int row = 0; row < park.length; row++) {
            if (isContainsStart(park[row])) {
                return new Position(row, park[row].indexOf(START));
            }
        }
        return null;
    }

    private static boolean isContainsStart(String parkLine) {
        return parkLine.contains(START);
    }
}
