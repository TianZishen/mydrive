package com.zishen.mydrive.model.entity;


import com.zishen.mydrive.model.enums.StorageTypeEnum;
import lombok.Data;

/**
 * 驱动器配置信息项实体类
 * （驱动器是在项目里挂载的存储源，可以有多种来源，如本地，S3，等等，都代表了一个存储文件的地方，通过驱动器这一实体在系统里存在）
 */
@Data
public class DriveConfig {

    private Integer id;

    private Boolean enable;

    private String name;

    private Boolean enableCache;

    private Boolean autoRefreshCache;

    private StorageTypeEnum type;

    private Boolean searchEnable;

    private Boolean searchIgnoreCase;

    private Boolean searchContainEncryptedFile;

    private Integer orderNum;

    private Boolean defaultSwitchToImgMode;

}
