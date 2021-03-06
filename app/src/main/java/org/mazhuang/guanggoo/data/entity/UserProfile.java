package org.mazhuang.guanggoo.data.entity;

import android.text.TextUtils;

/**
 * Created by Lenovo on 2017/9/29.
 */

public class UserProfile {
    private String username;
    private String url;
    private String avatar;
    private String number;
    private String since;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSince() {
        return since;
    }

    public void setSince(String since) {
        this.since = since;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public boolean isValid() {
        return !TextUtils.isEmpty(avatar) &&
                !TextUtils.isEmpty(url) &&
                !TextUtils.isEmpty(username) &&
                !TextUtils.isEmpty(since) &&
                !TextUtils.isEmpty(number);
    }
}
