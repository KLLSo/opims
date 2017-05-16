package me.opims.Enums;

/**
 * Created by tb on 17-5-15.
 */
public enum Category {

    FREEZE(-1),
    UNFREEZE(1),
    UNFRERZEFIRM(2);
    private int score;
     Category(int score){
        this.score = score;
    }

    public int getScore(){
        return this.score;
    }
}
