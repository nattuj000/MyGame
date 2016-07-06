package com.example.narendra.mygame;

/**
 * Created by Narendra on 06/07/2016.
 */
public class GameView extends GLSurfaceView {

    private final GameRenderer gameRenderer;
    public GameView(Context context) {
        super(context);
        setEGLContextClientVersion(2);
        gameRenderer = new GameRenderer(context);
        setRenderer(gameRenderer);
    }
}
