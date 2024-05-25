package walkingPark;

import java.util.Scanner;

public class InputView {
    private static final Scanner scan = new Scanner(System.in);
    public static int inputParkWidth() {
        System.out.print("공원의 가로 길이를 설정해주세요 : ");
        return scan.nextInt();
    }

    public static int inputParkHeight() {
        System.out.print("공원의 세로 길이를 설정해주세요 : ");
        return scan.nextInt();
    }

    public static String[] inputParkArea(int width, int height) {
        String[] park = new String[height];
        for (int i = 0; i < height; i++) {
            StringBuilder str = new StringBuilder();
            for (int j = 0; j < width; j++) {
                str.append(scan.next());
            }
            park[i] = str.toString();
        }
        return park;
    }
}
