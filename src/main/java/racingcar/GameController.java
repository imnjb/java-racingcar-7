package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class GameController {
    private final GameService gameService = new GameService();

    public void run() {
        try {
            System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
            String carNamesInput = Console.readLine();

            System.out.println("시도할 횟수는 몇 회인가요?");
            int tryCount = Integer.parseInt(Console.readLine());


            gameService.initCars(carNamesInput);
            gameService.play(tryCount);
            gameService.printWinners();
        } catch (IllegalArgumentException e) {
            System.out.println("잘못된 입력: " + e.getMessage());
        }
    }
}
