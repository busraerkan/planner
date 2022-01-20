package com.personal.planner.domain.constant;

public enum Status {
    TODO("TODO"),
    IN_PROGRESS("INPROGRESS"),
    DONE("DONE"),
    CANCELED("CANCELED");

    Status(String status) {
        this.status = status;
    }

    private String status;

    public String getStatus() {
        return status;
    }

    public static Status fromStatus(String inStatus) {
        for(Status itemStatus : Status.values()) {
            if(itemStatus.status.equalsIgnoreCase(inStatus)) {
                return itemStatus;
            }
        }
        return null;
    }
}
