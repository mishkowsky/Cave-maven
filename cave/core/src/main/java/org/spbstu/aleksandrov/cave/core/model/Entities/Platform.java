package org.spbstu.aleksandrov.cave.core.model.Entities;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Platform {

    public enum State {
        IDLE
    }

    Vector2 position;
    Rectangle bounds = new Rectangle();
    public static final float WIDTH = 2.5f;
    public static final float HEIGHT = 1f;

    Platform.State state = Platform.State.IDLE;

    public Platform(Vector2 position) {

        this.position = position;
        //this.bounds = new Sprite(new Texture("ground.png")).getBoundingRectangle();

    }
}
