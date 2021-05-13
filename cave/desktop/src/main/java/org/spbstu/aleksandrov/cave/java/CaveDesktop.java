package org.spbstu.aleksandrov.cave.java;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import org.spbstu.aleksandrov.cave.core.Cave;

public class CaveDesktop {
	public static void main (String[] args) {
		new LwjglApplication(new Cave(), "Cave", 480, 320);
	}
}
