package com.arlion.real;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.OrthographicCamera;

public class F$ckingCamera {
public float x;
public float y;
OrthographicCamera camera;
    public F$ckingCamera(OrthographicCamera camera1){
        this.camera=camera1;

    }


    public void PersonalCamera(){

        if ((Gdx.input.isKeyPressed(Input.Keys.W))||(Gdx.input.isKeyPressed(Input.Keys.UP))){
            y+=3;
        }
        if ((Gdx.input.isKeyPressed(Input.Keys.S))||(Gdx.input.isKeyPressed(Input.Keys.DOWN))){
            y-=3;
        }
        if ((Gdx.input.isKeyPressed(Input.Keys.A))||(Gdx.input.isKeyPressed(Input.Keys.LEFT))){
            x-=3;
        }
        if ((Gdx.input.isKeyPressed(Input.Keys.D))||(Gdx.input.isKeyPressed(Input.Keys.RIGHT))){
            x+=3;
        }
        camera.translate(x,y);
camera.update();
    }
    public void update(){
        PersonalCamera();
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
