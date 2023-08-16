package com.jdc04.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jdc04.Entity.OderItems;
@Repository
public interface oderItems extends JpaRepository<OderItems, Long>{

}
