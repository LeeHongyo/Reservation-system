package com.example.Reservation_system.global.exception;

import com.example.Reservation_system.global.type.ErrorCode;
import lombok.Getter;

@Getter
public class ReservationException extends RuntimeException {
    private final ErrorCode errorCode;
    private final String errorMessage;

    public ReservationException(ErrorCode errorCode) {
        this.errorCode = errorCode;
        this.errorMessage = errorCode.getDescription();
    }
}
