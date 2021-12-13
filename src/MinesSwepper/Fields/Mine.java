package MinesSwepper.Fields;

public class Mine extends Cell {
    private String symbol = " * ";
    public Mine(int row, int col) {
        super(row, col);
        super.symbol = symbol;
    }
}
