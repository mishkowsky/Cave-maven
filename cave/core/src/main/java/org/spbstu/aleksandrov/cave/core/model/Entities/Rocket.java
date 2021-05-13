package org.spbstu.aleksandrov.cave.core.model.Entities;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Rocket {

    public enum State {
        FLYING_LEFT, FLYING_RIGHT, FLYING_UP, IDLE, DYING
    }

    public static final float SPEED = 0.1f;
    static final float ACCELERATION = -0.05f;
    //static final float FUEL = 1;
    public static final float SIZE = 1f;

    Vector2 position = new Vector2();
    Vector2  acceleration = new Vector2(0, ACCELERATION);
    Vector2  velocity = new Vector2();
    Rectangle bounds = new Rectangle();
    int fuel = 100;

    public void setState(State newState) {
        this.state = newState;
    }

    public Vector2 getVelocity() {
        return velocity;
    }

    public void update(float delta) {
        velocity.cpy().scl(delta);
        position.add(velocity.cpy().scl(delta));
        position.add(acceleration.cpy().scl(delta));
    }


    public Vector2 getPosition() {
        return position;
    }

    State state = State.IDLE;

    public Rocket(Vector2 position) {

        //this.position = position;
        this.position = new Vector2(2, 2);
        //this.bounds = new Sprite(new Texture("/rocket.png")).getBoundingRectangle();

    }
}
