package org.spbstu.aleksandrov.cave.core.model.Entities;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Ground {

    public static final float SIZE = 30;

    public enum State {
        IDLE
    }



    Vector2 position = new Vector2();
    Rectangle bounds = new Rectangle();

    Ground.State state = Ground.State.IDLE;

    public Vector2 getPosition() {
        return position;
    }

    public Ground(Vector2 position) {

        this.position = position;
        //this.bounds = new Sprite(new Texture("ground.png")).getBoundingRectangle();

    }
}
