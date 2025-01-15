package org.example.khuyenmairapchieuphim.repository;



import org.example.khuyenmairapchieuphim.model.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PromotionRepository extends JpaRepository<Promotion, Long> {
}


