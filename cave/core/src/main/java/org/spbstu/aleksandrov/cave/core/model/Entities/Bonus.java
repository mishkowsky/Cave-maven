package org.spbstu.aleksandrov.cave.core.model.Entities;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Bonus {

    public enum State {
        IDLE
    }

    public static final float WIDTH = 1.5f;
    public static final float HEIGHT = 1.5f;

    Vector2 position;
    Rectangle bounds = new Rectangle();

    Bonus.State state = Bonus.State.IDLE;

    public Bonus(Vector2 position) {

        this.position = position;
        //this.bounds = new Sprite(new Texture("bonus.png")).getBoundingRectangle();

    }
}
