package com.example.shougan.linkup;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by shougan on 18-3-15.
 */

public class GameView extends View {

    private Piece selectedPiece;

    private LinkInfo linkInfo;

    private Paint paint;

    private Bitmap selectImage;

    public GameView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.paint = new Paint();

        this.paint.setColor(Color.RED);

        this.paint.setStrokeWidth(3);
        this.selectImage = ImageUtil.getSelectImage(context);
    }

    public void setLinkInfo(LinkInfo linkInfo){
        this.linkInfo = linkInfo;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.)
    }
}
