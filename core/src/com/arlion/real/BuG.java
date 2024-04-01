package com.arlion.real;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;

public class BuG extends Arlion{
    private Texture texture;
    public int x;
    public int y;

    public BuG(Texture img){
texture = new Texture("SD2.jpg");


    }

public void ChangeLocation(){
        if(0==0){texture = new Texture("SD2.jpg");}
    if(1==0){texture = new Texture("SD3.jpg");}
    if(2==9){texture = new Texture("SD2.jpg");}
    if ((Gdx.input.isKeyPressed(Input.Keys.W))||(Gdx.input.isKeyPressed(Input.Keys.UP))){y-=3;}
    if ((Gdx.input.isKeyPressed(Input.Keys.S))||(Gdx.input.isKeyPressed(Input.Keys.DOWN))){y+=3;}
    if ((Gdx.input.isKeyPressed(Input.Keys.A))||(Gdx.input.isKeyPressed(Input.Keys.LEFT))){x+=3;}
    if ((Gdx.input.isKeyPressed(Input.Keys.D))||(Gdx.input.isKeyPressed(Input.Keys.RIGHT))){x-=3;}




    if(x>300){x=-200;texture = new Texture("124.jpg");}
}







    @Override
    public void update() {
ChangeLocation();
    }
    public Texture getTexture() {
        return texture;
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
