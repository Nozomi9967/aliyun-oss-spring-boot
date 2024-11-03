package com.aliyun.oss.enums;

public enum OssFileNameEnum {
    USER_IMAGE("user/image/"),
    BOOK_IMAGE("book/image/");

    private String fileName;
    OssFileNameEnum(String fileName) {
        this.fileName = fileName;
    }
    public String getFileName() {
        return fileName;
    }
}
