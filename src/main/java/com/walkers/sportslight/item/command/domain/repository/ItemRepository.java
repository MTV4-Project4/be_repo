package com.walkers.sportslight.item.command.domain.repository;

import com.walkers.sportslight.item.command.domain.aggregate.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
