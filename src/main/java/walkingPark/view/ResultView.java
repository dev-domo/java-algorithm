package walkingPark.view;

public class ResultView {
    public static void printWalkingResult(int[] answer) {
        System.out.println("산책을 종료합니다.");
        System.out.println("현재 위치는 " + answer[0] + ", " + answer[1] + "입니다.");
    }
}
