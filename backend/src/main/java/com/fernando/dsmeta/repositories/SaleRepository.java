package com.fernando.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fernando.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
}
