package com.shepherd.demo;

import java.util.Date;

/**
 * Created by Administrator on 2019/2/27.
 */
public class DemoData {
    private int id;
    private String name;
    private int seasonCount;
    private Date originRelease;

    DemoData(){}
    DemoData(int id, String name, int seasonCount, Date originRelease){
        this.id = id;
        this.name = name;
        this.seasonCount = seasonCount;
        this.originRelease = originRelease;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeasonCount() {
        return seasonCount;
    }

    public void setSeasonCount(int seasonCount) {
        this.seasonCount = seasonCount;
    }

    public Date getOriginRelease() {
        return originRelease;
    }

    public void setOriginRelease(Date originRelease) {
        this.originRelease = originRelease;
    }

    @Override
    public String toString() {
        return "DemoData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", seasonCount=" + seasonCount +
                ", originRelease=" + originRelease +
                '}';
    }
}
