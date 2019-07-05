package com.cloud.postgresql.app.jpa.repository;

import com.cloud.postgresql.app.jpa.entity.House;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseRepository extends CrudRepository<House, Integer> {
}
