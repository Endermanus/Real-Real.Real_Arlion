package com.arlion.real;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.TextureData;

import java.awt.event.KeyEvent;

public class Player extends Arlion{
    private Texture texture;

    private float x;
    private float y;
    int Width;
    int Height;
private boolean IsCross = false;
private boolean IsGun = false;
private boolean IsArms = true;
    public Player(Texture t) {

        x = 320;
        texture = new Texture("player_Down.png");
        y = 240;


    }
public  void Controller(){
    if (Gdx.input.isKeyPressed(Input.Keys.Q)){IsCross = true;IsGun = false;IsArms=false;System.out.println("Cross mode = ON");texture = new Texture("player_Cross.png");}
    if (Gdx.input.isKeyPressed(Input.Keys.E)){IsCross = false;IsGun = true;IsArms=false;System.out.println("Gun mode = ON");}
    if (Gdx.input.isKeyPressed(Input.Keys.R)){IsCross = false;IsGun = false;IsArms=true;System.out.println("Arms mode = ON, any other = OFF");}


        if ((Gdx.input.isKeyPressed(Input.Keys.W))||(Gdx.input.isKeyPressed(Input.Keys.UP))){
          if(IsArms){texture = new Texture("player_Up.png");}
    if(IsCross){texture = new Texture("player_UpCross.png");}
           }
    if (Gdx.input.isKeyPressed(Input.Keys.A)||(Gdx.input.isKeyPressed(Input.Keys.LEFT))){
        if(IsArms){texture = new Texture("player_Left.png");}
        if(IsCross){texture = new Texture("player_LeftCross.png");}}
    if (Gdx.input.isKeyPressed(Input.Keys.S)||(Gdx.input.isKeyPressed(Input.Keys.DOWN))){
        if(IsArms){texture = new Texture("player_Down.png");}
        if(IsCross){texture = new Texture("player_DownCross.png");}}
    if (Gdx.input.isKeyPressed(Input.Keys.D)||(Gdx.input.isKeyPressed(Input.Keys.RIGHT))){
        if(IsArms) {texture = new Texture("player.png");}
        if(IsCross){texture = new Texture("player_Cross.png");}}



    if(Gdx.input.isKeyPressed(Input.Keys.ESCAPE)){System.exit(-1);}




}


public void Walls(){
if(x>530){x-=3;}
    if(x<60){x+=3;}
    if(y>400){y-=3;}
    if(y<60){y+=3;}





}


    public void keyReleased(KeyEvent e) {
        System.out.println(e.getKeyCode());
    }


    public void update() {
Controller();
Walls();

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





    public float getWidth() {
        return Width;
    }
    public void setWidth(int Width) {
        this.Width= Width;
    }
    public float getHeight() {
        return Height;
    }
    public void setHeight(int Height){
        this.Height = Height;

    }}


