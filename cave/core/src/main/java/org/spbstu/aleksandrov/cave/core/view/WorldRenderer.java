package org.spbstu.aleksandrov.cave.core.view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.*;
import com.codeandweb.physicseditor.PhysicsShapeCache;
import org.spbstu.aleksandrov.cave.core.model.Entities.Ground;
import org.spbstu.aleksandrov.cave.core.model.Entities.Rocket;
import org.spbstu.aleksandrov.cave.core.model.MyWorld;


public class WorldRenderer {

    private World world;
    private MyWorld myWorld;
    private OrthographicCamera camera;
    private Box2DDebugRenderer debugRenderer;

    private PhysicsShapeCache physicsBodies;
    private Body rocketBody;
    private Body groundBody;

    private Texture rocketTexture;
    private Texture groundTexture;
    private Texture platformTexture;

    private SpriteBatch batch;

    private int width;
    private int height;
    private float accumulator = 0;

    static final float STEP_TIME = 1f / 60f;
    static final int VELOCITY_ITERATIONS = 6;
    static final int POSITION_ITERATIONS = 2;
    private static final float CAMERA_WIDTH = 500f;
    private static final float CAMERA_HEIGHT = 250f;
    static final float SCALE = 0.05f;


    private float ppuX;
    private float ppuY;

    public void create() {
        Box2D.init();

        batch = new SpriteBatch();
        camera = new OrthographicCamera(CAMERA_WIDTH, CAMERA_HEIGHT);
        world = new World(new Vector2(0, -10f), true);
        physicsBodies = new PhysicsShapeCache("rocket.xml");
        rocketBody = createBody("rocket", 0f,0f, 0);

        debugRenderer = new Box2DDebugRenderer();
    }

    private Body createBody(String name, float x, float y, float rotation) {

        Body body = physicsBodies.createBody(name, world, SCALE, SCALE);
        body.setTransform(x, y, rotation);

        body.setFixedRotation(true);

        return body;
    }

    public void setSize (int w, int h) {
        this.width = w;
        this.height = h;
        ppuX = (float)width / CAMERA_WIDTH;
        ppuY = (float)height / CAMERA_HEIGHT;
    }

    public WorldRenderer(MyWorld myWorld) {
        this.myWorld = myWorld;

        create();

        loadTextures();
    }

    private void loadTextures() {
        rocketTexture = new Texture(Gdx.files.internal("rocket.png"));
        platformTexture = new Texture(Gdx.files.internal("platform.png"));
    }

    public void render() {

        stepWorld();
        moveCamera();

        batch.begin();

        drawRocket();
        drawGround();
        drawPlatform();
        drawBonus();
        drawCoin();

        batch.end();
    }

    private void moveCamera() {
        Vector2 position = rocketBody.getPosition();
        camera.position.set(position.x + Rocket.SIZE / 2, position.y + Rocket.SIZE / 2, 0);
        camera.update();
        batch.setProjectionMatrix(camera.combined);
    }

    private void stepWorld() {


    }

    private void drawRocket() {
        Vector2 position = rocketBody.getPosition();
        batch.draw(rocketTexture, position.x, position.y,
                Rocket.SIZE, Rocket.SIZE);
    }

    private void drawGround() {
        Ground ground = myWorld.getGround();
        batch.draw(groundTexture, ground.getPosition().x, ground.getPosition().y,
                Ground.SIZE, Ground.SIZE);
    }

    private void drawPlatform(){
        //TODO
    }

    private void drawCoin(){
        //TODO
    }

    private void drawBonus(){
        //TODO
    }
}

