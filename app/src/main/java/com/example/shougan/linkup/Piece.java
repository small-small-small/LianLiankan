package com.example.shougan.linkup;

import android.graphics.Point;

/**
 * Created by shougan on 18-3-15.
 */

public class Piece {

    //保存方块对象的所对应的图片
    private PieceImage image;

    //block's left_up coordinate X
    private int beginX;

    //block's left_up coordinate Y
    private int beginY;

    //Object's first dimension in Piece[][]
    private int indexX;

    //Object's second dimension in Piece[][]
    private int indexY;

    //Setting object Piece's index in array
    public Piece(int indexX, int indexY) {
        this.indexX = indexX;
        this.indexY = indexY;
    }

    public int getBeginX() {
        return beginX;
    }

    public void setBeginX(int beginX) {
        this.beginX = beginX;
    }

    public int getBeginY() {
        return beginY;
    }

    public void setBeginY(int beginY) {
        this.beginY = beginY;
    }

    public int getIndexX() {
        return indexX;
    }

    public void setIndexX(int indexX) {
        this.indexX = indexX;
    }

    public int getIndexY() {
        return indexY;
    }


    public PieceImage getImage() {
        return image;
    }

    public void setImage(PieceImage image) {
        this.image = image;
    }

    //get the center of Piece
    public Point getCenter() {
        return new Point(getImage().getImage().getWidth() / 2
                + getBeginX(), getBeginY()
                + getImage().getImage().getHeight() / 2);
    }

    public boolean isSameImage(Piece other) {
        if (image == null){
            if (other.image != null)
                return false;
        }
        return image.getImageId() == other.image.getImageId();
    }


}
