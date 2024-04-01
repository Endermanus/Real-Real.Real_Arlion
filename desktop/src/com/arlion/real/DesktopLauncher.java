package com.arlion.real;

import com.badlogic.gdx.Graphics;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.arlion.real.Arlion;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();

		Graphics.DisplayMode displayMode = Lwjgl3ApplicationConfiguration.getDisplayMode();
		config.setForegroundFPS(60);
		config.setResizable(false);
		config.setDecorated(false);
		config.setWindowedMode(640,480);
		config.setTitle("IT MOVES!");

		//config.setFullscreenMode(displayMode);
		new Lwjgl3Application(new Arlion(), config);


	}
}
