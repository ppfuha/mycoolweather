package com.fujianzhong.mycoolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by fujianzhong on 2017/5/16.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }

}
