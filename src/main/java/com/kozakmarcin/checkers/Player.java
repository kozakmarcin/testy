package com.kozakmarcin.checkers;

import java.awt.*;
import java.util.Set;

public class Player {
    private final Color checkersColor;
    private Set<GamePawn> gamePawns;

    public Player(Color checkersColor) {
        this.checkersColor = checkersColor;
    }

}
