package org.spbstu.aleksandrov.cave.core.model;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import org.spbstu.aleksandrov.cave.core.model.Entities.*;

public class WorldArray {

    private static final MyWorld MY_WORLD = new MyWorld(
            new Rocket(new Vector2(-100,-100)),
            new Ground(new Vector2(0,0)),
            new Platform[]{new Platform(new Vector2(0,0))},
            new Asteroid[]{new Asteroid(new Vector2(0,0))},
            new Coin[]{new Coin(new Vector2(0,0))},
            new Bonus[]{});

    private final Array<MyWorld> worldArray = new Array<MyWorld>();

    {
        worldArray.add(MY_WORLD);
    }

    public MyWorld getWorld(int i) {
        return worldArray.get(i);
    }
}
