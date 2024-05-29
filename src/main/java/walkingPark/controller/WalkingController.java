package walkingPark.controller;

import walkingPark.domain.FindStart;
import walkingPark.domain.Position;
import walkingPark.domain.Walk;
import walkingPark.view.InputView;
import walkingPark.view.ResultView;

public class WalkingController {
    public static void control() {
        String[] park = InputView.inputParkArea(InputView.inputParkWidth(), InputView.inputParkHeight());
        String[] routes = InputView.inputRoutes();

        Position start = FindStart.whereIsStart(park);
        Position end = Walk.startWalking(park, routes, start);

        ResultView.printWalkingResult(end);
    }
}
