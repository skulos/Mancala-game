package nel.marco.mancala.controller.v1.model;

import lombok.Data;

@Data
public class Match {

    private String uniqueMatchId;
    private PlayerModel playerModelA;
    private PlayerModel playerModelB;

    private boolean isPlayerATurn;

    private PIT lastStoneLocation;
    private Player lastStonePlayerBoard;


}