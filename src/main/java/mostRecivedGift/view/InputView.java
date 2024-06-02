package mostRecivedGift.view;

import java.util.Scanner;

public class InputView {
    private static final int GIFTS = 8;
    private static final Scanner scan = new Scanner(System.in);
    public static String inputFriends() {
        System.out.print("친구들을 입력해주세요(,로 구분) : ");
        return scan.nextLine();
    }

    public static String[] inputGifts() {
        String[] gifts = new String[GIFTS];
        System.out.println("선물 주고받은 내역을 입력해주세요");
        for(int i = 0; i < gifts.length; i++) {
            gifts[i] = scan.next();
        }
        return gifts;
    }
}
