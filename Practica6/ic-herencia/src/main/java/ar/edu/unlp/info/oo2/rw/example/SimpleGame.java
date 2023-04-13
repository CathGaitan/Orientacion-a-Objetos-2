package ar.edu.unlp.info.oo2.rw.example;

import ar.edu.unlp.info.oo2.rw.model.GameBoard;
import ar.edu.unlp.info.oo2.rw.model.*;

public class SimpleGame {
    public static void main(String[] args) {
        GameBoard board = new GameBoard();
        board.add(new NuclearCaterpillarRobotWithBombs("Twonky"));
        board.add(new NuclearOvercraftRobotWithLasers("Hammer Bot"));
        board.add(new SolarOvercraftRobotWithBombs("Phoenix"));
        board.add(new SolarCaterpillarRobotWithLasers("Edgeworth"));
        board.runForCicles(3);
    }
}
