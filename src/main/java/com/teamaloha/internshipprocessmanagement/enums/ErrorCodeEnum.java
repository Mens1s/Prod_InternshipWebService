package com.teamaloha.internshipprocessmanagement.enums;

public enum ErrorCodeEnum {
    MAIL_EXISTS_BEFORE("10"),
    COMPANY_EXISTS_BEFORE("11"),
    COMPANY_NOT_EXISTS_BEFORE("12"),
    COMPANY_STAFF_NOT_EXISTS_BEFORE("13"),
    DEPARTMENT_EXIST_BEFORE("14"),
    FACULTY_EXIST_BEFORE("15"),

    Faculty_NOT_EXISTS_BEFORE("16"),
    DEPARTMENT_NOT_EXISTS_BEFORE("17"),
    INTERNSHIP_EXISTS_BEFORE("18"),
    INTERNSHIP_DOES_NOT_EXISTS_BEFORE("19"),
    INTERNSHIP_MAX_NUMBER("20"),
    MAIL_NOT_EXISTS_BEFORE("21"),
    MAIL_NOT_VERIFIED("22"),
    MAIL_FORMAT_NOT_VALID("23"),
    PASSWORD_FORMAT_NOT_VALID("24");

    private final String errorCode;

    ErrorCodeEnum(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
