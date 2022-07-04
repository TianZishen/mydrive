package com.zishen.mydrive.model.dto;

import com.zishen.mydrive.model.enums.FileTypeEnum;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class FileItemDTO implements Serializable {
    private String name;
    private Date time;
    private Long size;
    private FileTypeEnum type;
    private String path;
    private String url;

    @Override
    public String toString(){
        return "FileItemDTO{" +
                "name='" + name + '\'' +
                ", time=" + time +
                ", size=" + size +
                ", type=" + type +
                ", path='" + path + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
