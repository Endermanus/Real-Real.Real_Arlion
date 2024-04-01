package com.arlion.real;

import java.lang.reflect.Array;
import java.util.Random;

public class RndMap {
    public RndMap(int[][] mapp){}

    private void ArrayCheck()
    {
        Random rnd = new Random();
        int MapTiles = 12;
        int[][] mapp = new int[12][12];

        mapp[6][6]=9;
        for(int m=3 ; m==0;m-=1 ){for(int i=1,j=1;i==16&j==16;i+=1){if(i==17){i=1;j+=1;}
            if((mapp[i][j]==0)&(mapp[i-1][j]==0)&(mapp[i+1][j]==0)&(mapp[i][j-1]==0)&(mapp[i][j+1]==0)){mapp[i][j]=0;}
            if((mapp[i][j]==0)&(mapp[i-1][j]>0)&(mapp[i+1][j]==0)&(mapp[i][j-1]==0)&(mapp[i][j+1]==0)){mapp[i][j]=2;}
            if((mapp[i][j]==0)&(mapp[i-1][j]>0)&(mapp[i+1][j]>0)&(mapp[i][j-1]==0)&(mapp[i][j+1]==0)){mapp[i][j]=24;}
            if((mapp[i][j]==0)&(mapp[i-1][j]>0)&(mapp[i+1][j]==0)&(mapp[i][j-1]>0)&(mapp[i][j+1]==0)){mapp[i][j]=23;}
            if((mapp[i][j]==0)&(mapp[i-1][j]>0)&(mapp[i+1][j]==0)&(mapp[i][j-1]==0)&(mapp[i][j+1]>0)){mapp[i][j]=12;}
            if((mapp[i][j]==0)&(mapp[i-1][j]>0)&(mapp[i+1][j]>0)&(mapp[i][j-1]>0)&(mapp[i][j+1]==0)){mapp[i][j]=234;}
            if((mapp[i][j]==0)&(mapp[i-1][j]>0)&(mapp[i+1][j]>0)&(mapp[i][j-1]==0)&(mapp[i][j+1]>0)){mapp[i][j]=124;}
            if((mapp[i][j]==0)&(mapp[i-1][j]>0)&(mapp[i+1][j]==0)&(mapp[i][j-1]>0)&(mapp[i][j+1]>0)){mapp[i][j]=123;}
            if((mapp[i][j]==0)&(mapp[i][j+1]>0)&(mapp[i-1][j]==0)&(mapp[i][j-1]==0)&(mapp[i+1][j]==0)){mapp[i][j]=1;}
            if((mapp[i][j]==0)&(mapp[i][j+1]>0)&(mapp[i-1][j]==0)&(mapp[i][j-1]>0)&(mapp[i+1][j]==0)){mapp[i][j]=13;}
            if((mapp[i][j]==0)&(mapp[i][j+1]>0)&(mapp[i-1][j]==0)&(mapp[i][j-1]==0)&(mapp[i+1][j]>0)){mapp[i][j]=14;}
            if((mapp[i][j]==0)&(mapp[i][j+1]>0)&(mapp[i-1][j]==0)&(mapp[i][j-1]>0)&(mapp[i+1][j]>0)){mapp[i][j]=134;}
            if((mapp[i][j]==0)&(mapp[i][j+1]==0)&(mapp[i-1][j]==0)&(mapp[i][j-1]>0)&(mapp[i+1][j]==0)){mapp[i][j]=3;}
            if((mapp[i][j]==0)&(mapp[i][j+1]==0)&(mapp[i-1][j]==0)&(mapp[i][j-1]>0)&(mapp[i+1][j]>0)){mapp[i][j]=34;}
            if((mapp[i][j]==0)&(mapp[i][j+1]==0)&(mapp[i-1][j]==0)&(mapp[i][j-1]==0)&(mapp[i+1][j]>0)){mapp[i][j]=4;}






            }}







    }
    public void update(){

        ArrayCheck();
    }
}
