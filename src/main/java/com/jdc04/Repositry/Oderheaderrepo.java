package com.jdc04.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jdc04.Entity.OderHeader;
@Repository
public interface Oderheaderrepo extends JpaRepository<OderHeader, Long>{

	
}
