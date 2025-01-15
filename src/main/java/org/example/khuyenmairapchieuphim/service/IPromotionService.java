package org.example.khuyenmairapchieuphim.service;


import org.example.khuyenmairapchieuphim.model.Promotion;

import java.util.List;

public interface IPromotionService {
    List<Promotion> getAllPromotions();
    Promotion getPromotionById(Long id);
    Promotion createPromotion(Promotion promotion);
    Promotion updatePromotion(Long id, Promotion updatedPromotion);
    void deletePromotion(Long id);
}
