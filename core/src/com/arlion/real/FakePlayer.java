package com.arlion.real;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;

public class FakePlayer extends Arlion{
    private float x;
    private float y;
    Texture txt;
    public float roomWidth = 640;
    public float roomHeight = 480;
    public FakePlayer(Texture t){
        x = roomWidth*5+roomWidth*(1/2);
        y = roomHeight*5+roomHeight*(1/2);
    txt = new Texture("player_Down.png");}

   public void FakeController(){
       if ((Gdx.input.isKeyPressed(Input.Keys.W))||(Gdx.input.isKeyPressed(Input.Keys.UP))){y+=3;
       }
       if (Gdx.input.isKeyPressed(Input.Keys.A)||(Gdx.input.isKeyPressed(Input.Keys.LEFT))) {x-=3;
       }
       if (Gdx.input.isKeyPressed(Input.Keys.S)||(Gdx.input.isKeyPressed(Input.Keys.DOWN))) {y-=3;
       }
       if(Gdx.input.isKeyPressed(Input.Keys.I)){System.out.println(x);System.out.println(y);}       if (Gdx.input.isKeyPressed(Input.Keys.D)||(Gdx.input.isKeyPressed(Input.Keys.RIGHT))) {x+=3;
       }}
    public void update(){

        FakeController();
    }

    public Texture getTexture() {
        return txt;
    }
    public float getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(int y){
        this.y = y;

    }
}
