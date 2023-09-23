package com.login.app.constant;

import org.apache.commons.lang3.StringUtils;

public class AppsConstants {

    public enum Status {
        ACT("Active"),
        INA("Inactive");

        private final String description;

        Status(String description) {
            this.description = description;
        }

        public static Status resolveStatus(String str) {
            Status matchingStr = null;
            if (!StringUtils.isEmpty(str)) {
                matchingStr = Status.valueOf(str.trim());
            }
            return matchingStr;
        }

        public String getDescription() {
            return description;
        }
    }

    public enum ResponseStatus {
        SUCCESS, FAILED;

        public static ResponseStatus resolveStatus(String statusStr) {
            ResponseStatus matchingStatus = null;
            if (!StringUtils.isEmpty(statusStr)) {
                matchingStatus = ResponseStatus.valueOf(statusStr.trim());
            }
            return matchingStatus;
        }
    }

    public enum YesNo {
        Y("Yes"),
        N("No");

        private final String description;

        YesNo(String description) {
            this.description = description;
        }

        public static YesNo resolveYesNo(String str) {
            YesNo matchingStr = null;
            if (!StringUtils.isEmpty(str)) {
                matchingStr = YesNo.valueOf(str.trim());
            }
            return matchingStr;
        }

        public String getDescription() {
            return description;
        }
    }

    public enum UserRole {
        MANAGER("Manager"),
        USER("User");

        private final String description;

        UserRole(String description) {
            this.description = description;
        }

        public static UserRole resolveUserType(String str) {
            UserRole matchingStr = null;
            if (!StringUtils.isEmpty(str)) {
                matchingStr = UserRole.valueOf(str.trim());
            }
            return matchingStr;
        }

        public String getDescription() {
            return description;
        }
    }
}
