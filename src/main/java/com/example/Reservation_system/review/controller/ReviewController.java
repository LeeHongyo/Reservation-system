package com.example.Reservation_system.review.controller;

import com.example.Reservation_system.review.entity.Review;
import com.example.Reservation_system.review.model.AddReview;
import com.example.Reservation_system.review.model.DeleteReview;
import com.example.Reservation_system.review.model.UpdateReview;
import com.example.Reservation_system.review.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/api/review")
@RequiredArgsConstructor
@RestController
public class ReviewController {
    private final ReviewService reviewService;

    // 리뷰 등록
    @PostMapping("/add")
    public ResponseEntity<?> addReview(@RequestBody @Valid AddReview.Request request) {
        Review review = reviewService.addReview(request, request.getReservationId());
        return ResponseEntity.ok().body(AddReview.Response.of(review));
    }

    // 리뷰 수정
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateReview(@PathVariable Long id, @RequestBody @Valid UpdateReview.Request request) {
        Review review = reviewService.updateReview(id, request);
        return ResponseEntity.ok().body(UpdateReview.Response.of(review));
    }

    // 리뷰 삭제
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteReview(@PathVariable Long id) {
        Review review = reviewService.deleteReview(id);
        return ResponseEntity.ok().body(DeleteReview.of(review));
    }
}
