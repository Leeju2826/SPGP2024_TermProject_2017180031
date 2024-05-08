package com.example.a2024project.framework.objects;

import android.graphics.Canvas;

import com.example.a2024project.framework.view.Metrics;

public class HorzScrollBackground extends Sprite {
    private final float width;
    public HorzScrollBackground(int bitmapResId){
        super(bitmapResId);
        this.width = bitmap.getWidth() * Metrics.height / bitmap.getHeight();
        setPosition(Metrics.width / 2, Metrics.height / 2, width, Metrics.height);
    }

    @Override
    public void update(float elapsedSeconds){
        this.x += elapsedSeconds;
    }

    @Override
    public void draw(Canvas canvas){
        float curr = x % width;
        if (curr > 0){
            curr -= width;
        }
        while (curr < Metrics.width){
            dstRect.set(curr, 0, curr + width, Metrics.height);
            canvas.drawBitmap(bitmap, null, dstRect, null);
            curr += width;
        }
    }
}
