package com.kozakmarcin.checkers;

import com.kozakmarcin.checkers.dictionary.CheckersColor;

import java.awt.*;

public class Players {

    private Player player1;
    private Player player2;

    private Player currentPlayer;

    public Players(){
        currentPlayer = player1 = preparePlayer(CheckersColor.BLACK);
        player2 = preparePlayer(CheckersColor.WHITE);
    }

    private Player preparePlayer(Color color) {
        return new Player(color);
    }

    public Player getCurrentPlayer(){
        return currentPlayer;
    }

    public Player nextPlayer(){
        return currentPlayer == player1 ? player2 : player1;
    }

}
