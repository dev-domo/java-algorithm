package walkingPark.controller;

import walkingPark.domain.Park;
import walkingPark.domain.Routes;
import walkingPark.domain.Walk;
import walkingPark.view.InputView;
import walkingPark.view.ResultView;

public class WalkController {
    public static void controlWalk() {
        Walk.startWalk(InputView.inputParkArea(InputView.inputParkHeight()), InputView.inputRoutes());
        ResultView.printWalkingResult();
    }
}
