package com.example.a2024project.app;

import com.example.a2024project.R;
import com.example.a2024project.framework.objects.HorzScrollBackground;
import com.example.a2024project.framework.scene.Scene;

public class MainScene extends Scene {
    public enum Layer{
        bg, player, castle, COUNT
    }

    public MainScene(){
        initLayers(Layer.COUNT);

        add(Layer.bg, new HorzScrollBackground(R.mipmap.bg_stage1));
        add(Layer.castle, new Castle());
        add(Layer.player, new Player());

    }

   //@Override
   //public void update(float elapsedSeconds){
   //    super.update(elapsedSeconds);
   //    add(new Player());
   //}

   // @Override
   // public boolean onTouch(MotionEvent event){
   //     return player.onTouch(event);
   // }
}
