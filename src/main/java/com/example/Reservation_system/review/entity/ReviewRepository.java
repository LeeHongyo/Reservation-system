package com.example.Reservation_system.review.entity;

import com.example.Reservation_system.reservation.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    Optional<Review> findByReservation(Reservation reservation);

    List<Review> findAllByShopId(Long shopId);
}
