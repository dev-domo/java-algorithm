package walkingPark.view;

import java.util.Scanner;

public class InputView {
    private static final Scanner scan = new Scanner(System.in);
    private static final int MAX_ROUTES = 3;

    public static int inputParkWidth() {
        System.out.print("공원의 가로 길이를 설정해주세요 : ");
        return scan.nextInt();
    }

    public static int inputParkHeight() {
        System.out.print("공원의 세로 길이를 설정해주세요 : ");
        return scan.nextInt();
    }

    public static String[] inputParkArea(int width, int height) {
        System.out.println("공원을 조성해주세요 : ");
        String[] park = new String[height];
        for (int i = 0; i < height; i++) {
            park[i] = scan.next();
        }
        scan.nextLine();
        return park;
    }

    public static String[] inputRoutes() {
        System.out.println("루트를 설정해주세요 : ");
        String[] routes = new String[MAX_ROUTES];
        for (int i = 0; i < routes.length; i++) {
            routes[i] = scan.nextLine();
        }
        return routes;
    }
}
