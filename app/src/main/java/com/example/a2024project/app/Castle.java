package com.example.a2024project.app;

import com.example.a2024project.R;
import com.example.a2024project.framework.objects.Sprite;

public class Castle extends Sprite {
    private static final int[] resIds_bg = {
            R.mipmap.bg_castle,
            R.mipmap.bg_enemycastle
    };

    public Castle(){
        super(resIds_bg[0]);
        setPosition(14.0f, 5.0f, 2.0f, 3.0f);

    }
}
