package com.applibrary;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * 新版本版本检测回调
 */
public abstract class UpdateCallback {

    /**
     * 解析json,自定义协议
     *
     * @param json 服务器返回的json
     * @return UpdateAppBean
     */
    protected UpdateAppBean parseJson(String json) {
        UpdateAppBean updateAppBean = new UpdateAppBean();
        try {
            JSONObject jsonObject = new JSONObject(json);
            Log.d("jsonjsonjson",json+"");
            String isOpen=jsonObject.getString("is_open");
            String new_version=jsonObject.getString("new_version");
            String apk_file_url=jsonObject.getString("apk_file_url");
            String update_log=jsonObject.getString("update_log");
            Log.d("isOpenisOpen",isOpen+"");
            Log.d("new_versionnew_version",new_version+"");
            Log.d("apk_file_url",apk_file_url+"");
            Log.d("update_log",update_log+"");
            updateAppBean.setIs_open(jsonObject.getString("is_open"))
                    .setNew_version(jsonObject.getString("new_version"))
                    .setApk_file_url(jsonObject.getString("apk_file_url"))
                    .setTarget_size(jsonObject.getString("target_size"))
                    .setUpdate_log(jsonObject.getString("update_log"))
                    .setIs_constraint(jsonObject.getBoolean("is_constraint"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return updateAppBean;
    }

    /**
     * 有新版本
     *
     * @param updateApp        新版本信息
     * @param updateAppManager app更新管理器
     */
    protected abstract void hasNewApp(UpdateAppBean updateApp, UpdateAppManager updateAppManager);

    /**
     * 网路请求之后
     */
    protected abstract void onAfter();

    /**
     * 没有新版本
     */
    protected abstract void noNewApp();

    /**
     * 网络请求之前
     */
    protected abstract void onBefore();

}
