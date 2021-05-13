package org.spbstu.aleksandrov.cave.core.view.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import org.spbstu.aleksandrov.cave.core.controller.Controller;
import org.spbstu.aleksandrov.cave.core.model.MyWorld;
import org.spbstu.aleksandrov.cave.core.model.WorldArray;
import org.spbstu.aleksandrov.cave.core.view.WorldRenderer;


public class GameScreen implements Screen {
    private MyWorld myWorld;
    private WorldRenderer renderer;
    private Controller controller;

    @Override
    public void render(float v) {
        Gdx.gl.glClearColor(255f, 255f, 255f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        float delta = 1;
        controller.update(delta);
        renderer.render();
    }

    @Override
    public void resize(int width, int height) {
        renderer.setSize(width, height);
    }

    @Override
    public void show() {
        myWorld = new WorldArray().getWorld(0);
        renderer = new WorldRenderer(myWorld);
        controller = new Controller(myWorld);
    }

    @Override
    public void hide() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }
}
