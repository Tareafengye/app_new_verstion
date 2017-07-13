package com.applibrary;

import android.text.TextUtils;

import java.io.Serializable;

/**
 * 版本信息
 */
public class UpdateAppBean implements Serializable {
    private static final long serialVersionUID = 1L;

    public String getIs_open() {
        return is_open;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public boolean is_constraint() {
        return is_constraint;
    }

    /**
     * update : Yes
     * new_version : xxxxx
     * apk_url : http://cdn.the.url.of.apk/or/patch
     * update_log : xxxx
     * delta : false
     * new_md5 : xxxxxxxxxxxxxx
     * target_size : 601132
     */
    //是否有新版本
    private String is_open;
    //新版本号
    private String new_version;
    //新app下载地址
    private String apk_file_url;
    //更新日志
    private String update_log;
    //新app大小
    private String target_size;
    //是否强制更新
    private boolean is_constraint=false;


    //md5暂时不用
    private String new_md5;
    //是否增量 暂时不用
    private boolean delta;


    //网络工具，内部使用
    private HttpManager httpManager;
    //目标地址，内部使用
    private String targetPath;

//    public boolean setIs_open() {
//        return !TextUtils.isEmpty(this.is_open) && "Yes".equals(this.is_open);
//    }

    public HttpManager getHttpManager() {
        return httpManager;
    }

    public void setHttpManager(HttpManager httpManager) {
        this.httpManager = httpManager;
    }

    public String getTargetPath() {
        return targetPath;
    }

    public void setTargetPath(String targetPath) {
        this.targetPath = targetPath;
    }

    public boolean Is_constraint() {
        return false;
    }

    public void setIs_constraint(boolean is_constraint) {
        this.is_constraint = is_constraint;
    }

    public String getUpdate() {
        return is_open;
    }
    public UpdateAppBean setIs_open(String is_open) {
        this.is_open = is_open;
        return this;
    }

    public String getNew_version() {
        return new_version;
    }

    public UpdateAppBean setNew_version(String new_version) {
        this.new_version = new_version;
        return this;
    }

    public String getApk_file_url() {
        return apk_file_url;
    }

    public UpdateAppBean setApk_file_url(String apk_file_url) {
        this.apk_file_url = apk_file_url;
        return this;
    }

    public String getUpdate_log() {
        return update_log;
    }

    public UpdateAppBean setUpdate_log(String update_log) {
        this.update_log = update_log;
        return this;
    }

    public boolean isDelta() {
        return delta;
    }

    public void setDelta(boolean delta) {
        this.delta = delta;
    }

    public String getNew_md5() {
        return new_md5;
    }

    public void setNew_md5(String new_md5) {
        this.new_md5 = new_md5;
    }

    public String getTarget_size() {
        return target_size;
    }

    public UpdateAppBean setTarget_size(String target_size) {
        this.target_size = target_size;
        return this;
    }


}
