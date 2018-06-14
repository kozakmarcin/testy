package com.kozakmarcin.checkers;

public class CheckersGame {

    private GameBoard gameBoard;
    private Players players;

    public CheckersGame() {
        // do kazdej specyficznej czynnosci tworze male metody wykonujace tylko ta mala czynnosc
        preparePlayers();
        prepareGameBoard(players);
    }

    private void prepareGameBoard(Players players) {
        this.gameBoard =  new GameBoard(players);
    }

    private void preparePlayers(){
        this.players = new Players();
    }

    public void start(){

    }

    public void stop(){

    }


}
