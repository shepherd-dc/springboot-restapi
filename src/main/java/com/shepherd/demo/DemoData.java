package com.shepherd.demo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.*;
import java.util.Date;

/**
 * Created by Administrator on 2019/2/27.
 */
public class DemoData {
//    @Null
    private int id;
    @NotNull
    private String name;
    @DecimalMin("1")
    private int seasonCount;

    //如果想用long型的timestamp表示日期，可用： @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    @JsonFormat(timezone="GMT+8", pattern="yyyy-MM-dd")
    //@Past表示只接受过去的时间，比当前时间还晚的被认为不合格
    @Past
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
