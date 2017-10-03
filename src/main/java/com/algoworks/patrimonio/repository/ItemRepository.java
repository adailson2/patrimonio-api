package com.algoworks.patrimonio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algoworks.patrimonio.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
