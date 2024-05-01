package com.example.a2024project.app;

import android.os.Bundle;

import com.example.a2024project.BuildConfig;
import com.example.a2024project.framework.activity.GameActivity;
import com.example.a2024project.framework.scene.Scene;

public class MainMenu extends GameActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Scene.drawsDebugInfo = BuildConfig.DEBUG;
        super.onCreate(savedInstanceState);
        // Scene.drawsDebugInfo 변경 시점에 주의한다.
        // new GameView() 가 호출되는 super.onCreate() 보다 이전에 해야 한다.
        new Scene().push();
    }
}