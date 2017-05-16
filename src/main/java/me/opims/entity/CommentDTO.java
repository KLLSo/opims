package me.opims.entity;

/**
 * Created by tb on 17-5-16.
 */
public class CommentDTO<T> {

    T t;

    private String nameJob;

    private String nameFirm;


    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public String getNameJob() {
        return nameJob;
    }

    public void setNameJob(String nameJob) {
        this.nameJob = nameJob;
    }

    public String getNameFirm() {
        return nameFirm;
    }

    public void setNameFirm(String nameFirm) {
        this.nameFirm = nameFirm;
    }
}
