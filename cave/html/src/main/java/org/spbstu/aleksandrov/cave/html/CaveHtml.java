package org.spbstu.aleksandrov.cave.html;

import org.spbstu.aleksandrov.cave.core.Cave;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;

public class CaveHtml extends GwtApplication {
	@Override
	public ApplicationListener getApplicationListener () {
		return new Cave();
	}
	
	@Override
	public GwtApplicationConfiguration getConfig () {
		return new GwtApplicationConfiguration(480, 320);
	}
}
