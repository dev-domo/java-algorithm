package walkingPark.view;

import walkingPark.domain.Park;
import walkingPark.domain.Route;
import walkingPark.domain.Routes;

import java.util.Scanner;

public class InputView {
    private static final Scanner scan = new Scanner(System.in);
    private static final int MAX_ROUTES = 3;

    public static int inputParkHeight() {
        System.out.print("공원의 세로 길이를 설정해주세요 : ");
        return scan.nextInt();
    }

    public static Park inputParkArea(int height) {
        System.out.println("공원을 조성해주세요 : ");
        String[] parkArea = new String[height];
        for (int i = 0; i < height; i++) {
            parkArea[i] = scan.next();
        }
        scan.nextLine();
        return new Park(parkArea);
    }

    public static Routes inputRoutes() {
        System.out.println("루트를 설정해주세요 : ");
        Route[] routes = new Route[MAX_ROUTES];
        for (int i = 0; i < routes.length; i++) {
            routes[i] = new Route(scan.nextLine());
        }
        return new Routes(routes);
    }
}
