package walkingPark.domain;

public class Walk {
    private static final String EAST = "E";
    private static final String WEST = "W";
    private static final String SOUTH = "S";
    private static final String NORTH = "N";
    private static final String SPACE = " ";
    private static final String OBSTRUCTION = "X";

    public static String[] splitRoute(String route) {
        return route.split(SPACE);
    }

    public static int parseToInt(String number) {
        return Integer.parseInt(number);
    }

    public static Position startWalking(String[] park, String[] routes, Position position) {
        for (String route : routes) {
            int[] start = {
                    position.getRow(), position.getCol()
            };
            int[] current = choiceWay(park, route, start);
            position.moveRow(current[0]);
            position.moveCol(current[1]);
        }
        return position;
    }

    private static int[] choiceWay(String[] park, String route, int[] start) {
        String direct = splitRoute(route)[0];
        int move = parseToInt(splitRoute(route)[1]);
        int ny = start[0], nx = start[1];

        for (int i = 1; i <= move; i++) {
            nx += checkColMove(direct);
            ny += checkRowMove(direct);
            if (isOutOfRange(nx, ny, park)) {
                ny = start[0];
                nx = start[1];
                break;
            }
        }
        return new int[]{ny, nx};
    }

    private static int checkColMove(String direct) {
        if (direct.equals(EAST))
            return 1;
        if (direct.equals(WEST))
            return -1;
        return 0;
    }

    private static int checkRowMove(String direct) {
        if (direct.equals(SOUTH))
            return 1;
        if (direct.equals(NORTH))
            return -1;
        return 0;
    }

    private static boolean isOutOfRange(int nx, int ny, String[] park) {
        return nx < 0 || ny < 0 || nx >= park[0].length() || ny >= park.length || String.valueOf(park[ny].charAt(nx)).equals(OBSTRUCTION);
    }
}
