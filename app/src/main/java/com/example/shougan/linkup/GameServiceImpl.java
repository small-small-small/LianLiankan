package com.example.shougan.linkup;

/**
 * Created by shougan on 18-3-15.
 */

public class GameServiceImpl implements GameService {

    private Piece[][] pieces;

    private
    @Override
    public void start() {

    }

    @Override
    public Piece[][] getPieces() {
        return new Piece[0][];
    }

    @Override
    public boolean hasPieces() {
        return false;
    }

    @Override
    public Piece findPiece(float touchX, float touchY) {
        return null;
    }

    @Override
    public LinkInfo link(Piece p1, Piece p2) {
        return null;
    }
}
