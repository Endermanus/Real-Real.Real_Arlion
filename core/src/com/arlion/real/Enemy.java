package com.arlion.real;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;

public class Enemy extends Arlion{
    public Texture tulnado;
    protected float x;
    protected float y;
    boolean Rage;
    Player player;
    public Enemy(Texture pol){
x=500;
y=200;

player = new Player(tulnado);


    }


public void MoveSet(){
        if((Gdx.input.isKeyPressed(Input.Keys.Q))){Rage=true;}

    if ((Gdx.input.isKeyPressed(Input.Keys.W))||(Gdx.input.isKeyPressed(Input.Keys.UP))){
     y-=2;
    }
        if ((Gdx.input.isKeyPressed(Input.Keys.S))||(Gdx.input.isKeyPressed(Input.Keys.DOWN))){
        y+=2;

        }
            if ((Gdx.input.isKeyPressed(Input.Keys.A))||(Gdx.input.isKeyPressed(Input.Keys.LEFT))){
               x+=2;
            }
                if ((Gdx.input.isKeyPressed(Input.Keys.D))||(Gdx.input.isKeyPressed(Input.Keys.RIGHT))){
                 x-=2;
                }}
    public void Rage(){
if(Rage) {
    if (player.getX() > x) {
        x += 1;
    }
    if (player.getX() < x) {
        x -= 1;
    }
    if (player.getY() > y) {
        x += 1;
    }
    if (player.getY() < y) {
        y -= 1;
    }
}







}




public void update(){
        MoveSet();
        Rage();
}


    public Texture getTexture() {
        return tulnado;
    }

    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int x) {
        this.y = y;
    }



}
