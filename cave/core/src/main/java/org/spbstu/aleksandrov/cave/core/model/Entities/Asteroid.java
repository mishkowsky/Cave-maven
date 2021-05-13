package org.spbstu.aleksandrov.cave.core.model.Entities;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Asteroid extends Entity{

    public Asteroid(Vector2 position) {
        super(position);
    }

    public enum State {
        IDLE, FALLING
    }

    public static final float HEIGHT = 1.5f;
    static final float SPEED = 2f;
    //static final float ACCELERATION = 2f;
    //static final float SIZE = 1f;

    Vector2 position = new Vector2();
    Vector2  velocity = new Vector2();
    Rectangle bounds = new Rectangle();

    /*public Vector2 getPosition() {
        return position;
    }*/

    Asteroid.State state = Asteroid.State.IDLE;

    /*public Asteroid(Vector2 position) {
        super();

        this.position = position;
        //this.bounds = new Sprite(new Texture("asteroid.png")).getBoundingRectangle();
    }*/
}
