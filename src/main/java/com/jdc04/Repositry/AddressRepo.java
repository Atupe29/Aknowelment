package com.jdc04.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jdc04.Entity.Address;
@Repository
public interface AddressRepo extends JpaRepository<Address, Integer>{

}