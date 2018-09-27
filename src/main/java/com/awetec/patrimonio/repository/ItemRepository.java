package com.awetec.patrimonio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.awetec.patrimonio.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
