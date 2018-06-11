package com.xiaoyu.nextday.utils;

import android.text.TextUtils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by BigRain on 2018/6/8.
 */

public class HeaderUtil {
    public static Map getHeader(String times) {
        Map<String, String> headers = new HashMap<>();
        String date = new Date().toGMTString();

        headers.put("date", date);
        headers.put("Authorization", getAuthorization(times, date));
        headers.put("host", "api.nextday.im");
        headers.put("connection", "keep-alive");
        return headers;
    }

    //生成authorization
    private static String getAuthorization(String times, String date) {
        String url = "/api/calendar?" + times;
        String name = "bigRain";
        String dates = date;
        String secret = "72BDC8A2-BA4B-481A-8B52-269B1B600228";
        String authorization = md5(url + "&" + name + "&" + dates + "&" + secret);
        return name + ":" + authorization;
    }

    public static String md5(String string) {
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
            byte[] bytes = md5.digest(string.getBytes());
            String result = "";
            for (byte b : bytes) {
                String temp = Integer.toHexString(b & 0xff);
                if (temp.length() == 1) {
                    temp = "0" + temp;
                }
                result += temp;
            }
            return result;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }
}
