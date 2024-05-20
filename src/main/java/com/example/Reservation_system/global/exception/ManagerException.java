package com.example.Reservation_system.global.exception;

import com.example.Reservation_system.global.type.ErrorCode;
import lombok.Getter;

@Getter
public class ManagerException extends RuntimeException {
    private final ErrorCode errorCode;
    private final String errorMessage;

    public ManagerException(ErrorCode errorCode) {
        this.errorCode = errorCode;
        this.errorMessage = errorCode.getDescription();
    }
}
