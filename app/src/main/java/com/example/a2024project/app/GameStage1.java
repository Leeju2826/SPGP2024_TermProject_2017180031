package com.example.a2024project.app;

import android.os.Bundle;

import com.example.a2024project.BuildConfig;
import com.example.a2024project.framework.activity.GameActivity;
import com.example.a2024project.framework.scene.Scene;
import com.example.a2024project.framework.view.Metrics;

public class GameStage1 extends GameActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Scene.drawsDebugInfo = BuildConfig.DEBUG;
        Metrics.setGameSize(16, 9);
        super.onCreate(savedInstanceState);

        new Scene().push();
    }
}
