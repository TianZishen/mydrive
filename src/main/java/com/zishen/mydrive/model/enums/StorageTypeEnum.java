package com.zishen.mydrive.model.enums;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.HashMap;
import java.util.Map;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum StorageTypeEnum {

    /**
     * 当前系统支持的所有存储策略
     */
    LOCAL("local", "本地存储"),
    ALIYUN("aliyun", "阿里云 OSS"),
    TENCENT("tencent", "腾讯云 COS"),
    FTP("ftp", "FTP"),
    S3("s3", "S3通用协议");

    private String key;
    private String description;

    private static Map<String, StorageTypeEnum> enumMap = new HashMap<>();

    static {
        for (StorageTypeEnum type : StorageTypeEnum.values()) {
            enumMap.put(type.getKey(), type);
        }
    }

    StorageTypeEnum(String key, String description) {
        this.key = key;
        this.description = description;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static StorageTypeEnum getEnum(String value) {
        return enumMap.get(value.toLowerCase());
    }

}