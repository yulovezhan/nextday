package com.xiaoyu.nextday.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.xiaoyu.nextday.utils.HeaderUtil;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.Callback;

import okhttp3.Call;
import okhttp3.Response;

/**
 * Created by Administrator on 2018/6/8.
 */

public class TestActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        OkHttpUtils
                .get()
                .url("http://api.nextday.im/api/calendar?from=20180401&to=20180405")
                .headers(HeaderUtil.getHeader("from=20180401&to=20180405"))
                .build()
                .execute(new Callback() {
                    @Override
                    public Object parseNetworkResponse(Response response, int id) throws Exception {
                        return response.body().string();
                    }

                    @Override
                    public void onError(Call call, Exception e, int id) {
                        Log.d("TAG", e.toString());
                    }

                    @Override
                    public void onResponse(Object response, int id) {
                        Log.d("TAG", response.toString());
                    }
                });
    }
}
