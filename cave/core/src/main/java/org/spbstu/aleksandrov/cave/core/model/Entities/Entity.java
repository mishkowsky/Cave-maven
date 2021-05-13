package org.spbstu.aleksandrov.cave.core.model.Entities;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public abstract class Entity {

    public enum State {
        IDLE
    }

    public float WIDTH;
    public float HEIGHT;

    Vector2 position;
    Rectangle bounds = new Rectangle();

    Entity.State state = Entity.State.IDLE;

    public Entity(Vector2 position) {

        this.position = position;
        //this.bounds = new Sprite(new Texture("entity.png")).getBoundingRectangle();

    }

    public Vector2 getPosition() {
        return position;
    }
}
