package com.example.shougan.linkup;

import android.content.Context;

/**
 * Created by shougan on 18-3-15.
 */

public class GameConf {

    public static final int PIECE_WIDTH =  40;
    public static final int PIECE_HEIGHT = 40;

    public static int DEFAULT_TIME = 100;

    private int xSize;

    private int ySize;

    private int beginImageX;

    private int beginImageY;

    private long gameTime;

    private Context context;

    public GameConf(int xSize,int ySize,int beginImageX,int beginImageY,
                    long gameTime,Context context){
        this.xSize = xSize;
        this.ySize = ySize;
        this.beginImageX = beginImageX;
        this.beginImageY = beginImageY;
        this.gameTime = gameTime;
        this.context = context;
    }

    public long getGameTime(){
        return gameTime;
    }

    public int getxSize(){
        return xSize;
    }
    public int getySize(){
        return ySize;
    }

    public int getBeginImageX(){
        return beginImageX;
    }

    public int getBeginImageY(){
        return beginImageY;
    }

    public Context getContext(){
        return context;
    }
}
