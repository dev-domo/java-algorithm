package walkingPark.view;

import walkingPark.domain.Position;

public class ResultView {
    public static void printWalkingResult(Position position) {
        System.out.println("산책을 종료합니다.");
        System.out.println("현재 위치는 " + position.getCurrent()[0] + ", " + position.getCurrent()[1] + "입니다.");
    }
}
