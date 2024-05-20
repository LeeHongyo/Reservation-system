package com.example.Reservation_system.shop.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ReviewShopList {
    private Long totalCount;
    private List<ReviewShop> list;

    public static ReviewShopList of(long countReview, List<ReviewShop> reviewShopList) {
        return ReviewShopList.builder()
                .totalCount(countReview)
                .list(reviewShopList)
                .build();
    }
}
