package com.example.Reservation_system.reservation.model;

import com.example.Reservation_system.reservation.entity.Reservation;
import com.example.Reservation_system.reservation.type.ReservationStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

public class StatusReservation {

    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @Data
    public static class Request {
        private Long id;
        private ReservationStatus reservationStatus;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @Data
    public static class Response {
        private Long id;
        private ReservationStatus reservationStatus;

        public static Response of(Reservation reservation) {
            return Response.builder()
                    .id(reservation.getId())
                    .reservationStatus(reservation.getReservationStatus())
                    .build();
        }
    }
}