package com.kozakmarcin.checkers;

import com.kozakmarcin.checkers.dictionary.CheckersColor;

import java.awt.*;

public class Players {

    private Node<Player> currentPlayer;

    public Players(){
        Player player1 = preparePlayer(CheckersColor.BLACK);
        Player player2 = preparePlayer(CheckersColor.WHITE);

        Node<Player> playerNode1 = new Node<>(player1);
        Node<Player> playerNode2 = new Node<>(player2);

        playerNode1.setNext(playerNode2);
        playerNode2.setNext(playerNode1);

        currentPlayer = playerNode1;
    }

    private Player preparePlayer(Color color) {
        return new Player(color);
    }

    public Player getCurrentPlayer(){
        return currentPlayer.get();
    }

    public void nextPlayer(){
        currentPlayer = currentPlayer.getNext();
    }

}
