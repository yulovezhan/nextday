package com.xiaoyu.nextday.utils;

import com.xiaoyu.nextday.bean.APIResultBean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/6/8.
 */

public class JsonUtil {

    public List<APIResultBean> getJson(String json) {
        com.alibaba.fastjson.JSONObject jsonObject = com.alibaba.fastjson.JSONObject.parseObject(json);
        Map<String, Object> map = jsonObject.getJSONObject("result");
        map.remove("hasMore");
        List<Object> list = new ArrayList<>();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object value = entry.getValue();
            list.add(value);
        }
        String j = com.alibaba.fastjson.JSONObject.toJSONString(list);
        List<APIResultBean> apiResultBean = com.alibaba.fastjson.JSONObject.parseArray(j, APIResultBean.class);
        return apiResultBean;
    }
}
