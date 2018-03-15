package com.example.shougan.linkup;

/**
 * Created by shougan on 18-3-15.
 */

public interface GameService {

    void start();

    Piece[][] getPieces();

    boolean hasPieces();

    Piece findPiece(float touchX,float touchY);

    LinkInfo link(Piece p1,Piece p2);
}
