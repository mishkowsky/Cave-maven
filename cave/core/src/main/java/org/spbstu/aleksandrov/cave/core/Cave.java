package org.spbstu.aleksandrov.cave.core;

import com.badlogic.gdx.Game;
import org.spbstu.aleksandrov.cave.core.view.Screens.GameScreen;

public class Cave extends Game {

	@Override
	public void create () {
		setScreen(new GameScreen());
	}
}
