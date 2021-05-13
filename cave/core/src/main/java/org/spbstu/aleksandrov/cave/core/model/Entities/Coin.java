package org.spbstu.aleksandrov.cave.core.model.Entities;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Coin {

    public enum State {
        IDLE
    }

    public static final float WIDTH = 0.5f;
    public static final float HEIGHT = 0.5f;

    Vector2 position;
    Rectangle bounds = new Rectangle();

    Coin.State state = Coin.State.IDLE;

    public Coin(Vector2 position) {

        this.position = position;
        //this.bounds = new Sprite(new Texture("coin.png")).getBoundingRectangle();

    }
}
