package org.spbstu.aleksandrov.cave.core.controller;

import com.badlogic.gdx.Gdx;
import org.spbstu.aleksandrov.cave.core.model.Entities.Rocket;
import org.spbstu.aleksandrov.cave.core.model.MyWorld;

import static com.badlogic.gdx.Input.Keys.*;

public class Controller {

    private MyWorld myWorld;
    private Rocket rocket;

    public Controller(MyWorld myWorld) {
        this.myWorld = myWorld;
        this.rocket = myWorld.getRocket();
    }

    public void update(float delta) {
        processInput();
        rocket.update(delta);
    }

    private void processInput() {

        if (Gdx.input.getX() != 0) {
            rocket.setState(Rocket.State.FLYING_UP);
        }

        if (Gdx.input.isKeyPressed(W) || Gdx.input.isKeyPressed(UP)) {
            rocket.setState(Rocket.State.FLYING_UP);
            rocket.getVelocity().y = Rocket.SPEED;
        }


        if ((Gdx.input.isKeyPressed(A) || Gdx.input.isKeyPressed(LEFT)) &&
                !(Gdx.input.isKeyPressed(D) || Gdx.input.isKeyPressed(RIGHT))) {
            rocket.setState(Rocket.State.FLYING_LEFT);
            rocket.getVelocity().x = -Rocket.SPEED;
            rocket.getVelocity().y = Rocket.SPEED;
        }

        if ((Gdx.input.isKeyPressed(D) || Gdx.input.isKeyPressed(RIGHT)) &&
                !(Gdx.input.isKeyPressed(A) || Gdx.input.isKeyPressed(LEFT))) {
            rocket.setState(Rocket.State.FLYING_RIGHT);
            rocket.getVelocity().x = Rocket.SPEED;
            rocket.getVelocity().y = Rocket.SPEED;
        }

        if (!(Gdx.input.isKeyPressed(W) || Gdx.input.isKeyPressed(UP)) &&
                !(Gdx.input.isKeyPressed(A) || Gdx.input.isKeyPressed(LEFT)) &&
                        !(Gdx.input.isKeyPressed(D) || Gdx.input.isKeyPressed(RIGHT))) {
            rocket.setState(Rocket.State.IDLE);
            rocket.getVelocity().x = 0;
            rocket.getVelocity().y = 0;
        }
    }
}
