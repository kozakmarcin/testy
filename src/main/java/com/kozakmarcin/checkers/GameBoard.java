package com.kozakmarcin.checkers;

import java.awt.*;
import java.util.Set;

public class GameBoard {

    private static final int width = 8;
    private static final int height = 8;

    private Players players;

    // typ potencjalnie do zmiany
    private Set<Point> fieldSet;

    // plansza musi byc swiadoma graczy poniewaz gracze maja pionki, ktore musza sie narysowac na planszy
    GameBoard(Players players) {
        anchorPlayers(players);
        createGameBoard();
        renderBoard();
    }

    public static int getWidth(){
        return GameBoard.width;
    }

    public static int getHeight(){
        return GameBoard.height;
    }

    private void anchorPlayers(Players players){
        // dzieki tej metodzie do zmiennej player mamy przypisany wskaznik pamieci do obiektu players stworzonego w CheckersGame i nie musimy ciagle go "przepychac"
        this.players = players;
    }

    private void createGameBoard(){
        // algorytm do tworzenia planszy
    }

    private void cleanBoard(){
        // algorytm do wyczyszczenia obrazu planszy
    }

    private void renderBoard(){
        // algorytm do rysowania planszy
    }

    public void rerender(){
        // algorytm do przerysowania planszy
        cleanBoard();
        renderBoard();
    }

}
