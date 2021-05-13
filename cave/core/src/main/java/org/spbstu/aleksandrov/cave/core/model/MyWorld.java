package org.spbstu.aleksandrov.cave.core.model;

import com.badlogic.gdx.math.Vector2;
import org.spbstu.aleksandrov.cave.core.model.Entities.*;

public class MyWorld {

    //MyWorld MyWorld;

    Rocket rocket;
    public Rocket getRocket(){
        return rocket;
    }

    Ground ground;
    public Ground getGround() {
        return ground;
    }

    /*Array<Ground> groundAll = new Array<Ground>();
    public Array<Ground> getGround(){
        return groundAll;
    }*/

    Platform[] platforms;
    public Platform[] getPlatforms(){
        return platforms;
    }

    Asteroid[] asteroids;
    public Asteroid[] getAsteroids(){
        return asteroids;
    }

    Coin[] coins;
    public Coin[] getCoins(){
        return coins;
    }

    Bonus[] bonuses;
    public Bonus[] getBonuses() {
        return bonuses;
    }

    public MyWorld(){
        this.rocket = new Rocket(new Vector2(0,0));
        this.ground = new Ground(new Vector2(0,0));
        this.platforms = new Platform[]{};
        this.asteroids = new Asteroid[]{};
        this.coins = new Coin[]{};
        this.bonuses = new Bonus[]{};
    }

    public MyWorld(Rocket rocket, Ground ground, Platform[] platforms, Asteroid[] asteroids, Coin[] coins, Bonus[] bonuses) {
        this.rocket = rocket;
        this.ground = ground;
        this.platforms = platforms;
        this.asteroids = asteroids;
        this.coins = coins;
    }

}
