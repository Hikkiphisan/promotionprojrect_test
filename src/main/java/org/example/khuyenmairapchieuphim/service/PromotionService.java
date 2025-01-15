package org.example.khuyenmairapchieuphim.service;

import org.example.khuyenmairapchieuphim.model.Promotion;
import org.example.khuyenmairapchieuphim.repository.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromotionService implements IPromotionService {

    @Autowired
    private PromotionRepository promotionRepository;

    @Override
    public List<Promotion> getAllPromotions() {
        return promotionRepository.findAll();
    }

    @Override
    public Promotion getPromotionById(Long id) {
        return promotionRepository.findById(id).orElseThrow(() -> new RuntimeException("Promotion not found"));
    }

    @Override
    public Promotion createPromotion(Promotion promotion) {
        return promotionRepository.save(promotion);
    }

    @Override
    public Promotion updatePromotion(Long id, Promotion updatedPromotion) {
        Promotion promotion = promotionRepository.findById(id).orElseThrow(() -> new RuntimeException("Promotion not found"));
        promotion.setTitle(updatedPromotion.getTitle());
        promotion.setStartDate(updatedPromotion.getStartDate());
        promotion.setEndDate(updatedPromotion.getEndDate());
        promotion.setDiscount(updatedPromotion.getDiscount());
        promotion.setDetails(updatedPromotion.getDetails());
        return promotionRepository.save(promotion);
    }

    @Override
    public void deletePromotion(Long id) {
        promotionRepository.deleteById(id);
    }
}