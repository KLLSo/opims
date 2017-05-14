package me.opims.entity;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by kllso on 17-5-14.
 */
public class Job {
    private Integer id;
    private String name;
    private Integer firmId;
    private String catrgory;
    private String time;
    private Date date;
    private Integer peoples;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFirmId() {
        return firmId;
    }

    public void setFirmId(Integer firmId) {
        this.firmId = firmId;
    }

    public String getCatrgory() {
        return catrgory;
    }

    public void setCatrgory(String catrgory) {
        this.catrgory = catrgory;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getPeoples() {
        return peoples;
    }

    public void setPeoples(Integer peoples) {
        this.peoples = peoples;
    }
}
