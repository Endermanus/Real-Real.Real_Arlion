package com.arlion.real;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.awt.event.KeyAdapter;

public class Arlion extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Texture pol;
Player player;
BuG bg;
Enemy nm;
RndMap rndMap;
FakePlayer fakePlayer;
float px;
float py;
public float roomWidth = 640;
public float roomHeight = 480;

//Pixmap pixmap;
OrthographicCamera camer;

F$ckingCamera fcam;

	float frame;


	@Override
	public void create () {


		batch = new SpriteBatch();

camer = new OrthographicCamera();

fcam = new F$ckingCamera(camer);

		pol = new Texture("player_Down.png");

		int[][] mapp = new int[12][12];

		player = new Player(pol);

		fakePlayer = new FakePlayer(pol);

		rndMap = new RndMap(mapp);



nm = new Enemy(pol);

		img = new Texture("SD2.jpg");

bg = new BuG(img);



		frame = Gdx.graphics.getDeltaTime();

		py= player.getY();
		px=player.getX();

		frame(new KeyAdapter() {


		});


	}

	private void frame(KeyAdapter keyAdapter) {
	}

	public void update(){


	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(bg.getTexture(),bg.getX(),bg.getY());
		camer.update();
		fcam.update();
batch.draw(fakePlayer.getTexture(),fakePlayer.getX() ,fakePlayer.getY());
fakePlayer.update();

bg.update();
		//batch.draw(nm.getTexture(),nm.getX(),nm.getY() );
		//nm.update();
batch.draw(player.getTexture(),player.getX(),player.getY());
		player.update();


	//	batch.draw(player.getTexture(), player.getX(), player.getY(), player.getTexture().getWidth(), player.getTexture().getHeight());
		batch.end();
	}
	

}
