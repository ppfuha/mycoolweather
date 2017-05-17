package com.fujianzhong.mycoolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by fujianzhong on 2017/5/16.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;

    public Update update;
    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
