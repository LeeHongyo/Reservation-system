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
public class SearchShopList {
    private Long totalCount;
    private List<SearchShop> list;

    public static SearchShopList of(long countShop, List<SearchShop> searchShopList) {
        return SearchShopList.builder()
                .totalCount(countShop)
                .list(searchShopList)
                .build();
    }
}
