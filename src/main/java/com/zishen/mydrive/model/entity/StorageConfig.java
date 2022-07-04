package com.zishen.mydrive.model.entity;

import com.zishen.mydrive.model.enums.StorageTypeEnum;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 存储详细信息
 */
@Data
@NoArgsConstructor
public class StorageConfig {


    private Integer id;

    private StorageTypeEnum type;


    private String key;

    private String title;

    private String value;

    private Integer driveId;

    public StorageConfig(String key, String title) {
        this.key = key;
        this.title = title;
    }
}
