package com.feiyang.wanandroid.ui.login.model.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Copyright:wanandroid2
 * Author: liyang <br>
 * Date:2018/12/25 10:59 AM<br>
 * Desc:登录成功返回的数据 <br>
 */
public class LoginData implements Parcelable {

    /**
     * chapterTops : []
     * collectIds : [7700]
     * email :
     * icon :
     * id : 13096
     * password :
     * token :
     * type : 0
     * username : hanfei
     */

    private String email;

    private String icon;

    private int id;

    private String password;

    private String token;

    private int type;

    private String username;

    private List<?> chapterTops;

    private List<Integer> collectIds;

    protected LoginData(Parcel in) {
        email = in.readString();
        icon = in.readString();
        id = in.readInt();
        password = in.readString();
        token = in.readString();
        type = in.readInt();
        username = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(email);
        dest.writeString(icon);
        dest.writeInt(id);
        dest.writeString(password);
        dest.writeString(token);
        dest.writeInt(type);
        dest.writeString(username);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<LoginData> CREATOR = new Creator<LoginData>() {
        @Override
        public LoginData createFromParcel(Parcel in) {
            return new LoginData(in);
        }

        @Override
        public LoginData[] newArray(int size) {
            return new LoginData[size];
        }
    };

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<?> getChapterTops() {
        return chapterTops;
    }

    public void setChapterTops(List<?> chapterTops) {
        this.chapterTops = chapterTops;
    }

    public List<Integer> getCollectIds() {
        return collectIds;
    }

    public void setCollectIds(List<Integer> collectIds) {
        this.collectIds = collectIds;
    }
}
