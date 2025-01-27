package tictactoe.winningstrategy;

public class WinningStrategyFactory {
    public static WinningStrategy getWinningStrategy(WinningStrategyType winningStrategyType) {
        if (winningStrategyType.equals(WinningStrategyType.STANDARD)) {
            return new StandardWinningStrategy();
        } else if (winningStrategyType.equals(WinningStrategyType.CORNER)) {
            return new CornerWinningStrategy();
        }
        return null;
    }
}
