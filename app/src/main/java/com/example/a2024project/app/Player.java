package com.example.a2024project.app;

import com.example.a2024project.R;
import com.example.a2024project.framework.objects.Sprite;

public class Player extends Sprite {
    private static final float SPEED = -1.0f;
    private static final int[] resIds = {
            R.mipmap.cat1_move1,
            R.mipmap.cat1_move2,
            R.mipmap.cat1_move3
    };


    public Player(){
        super(resIds[0]);
        setPosition(12.0f, 6.0f, 2.0f, 2.0f);
        //dx = SPEED;

    }

    //@Override
    //public void update(float elapsedSeconds){
    //    super.update(elapsedSeconds);
    //    if(dstRect.top > Metrics.height);
    //    Scene.top().remove(this);
    //}
}
