package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

/**
 * Created by castro on 10/27/16.
 */
@Repository
@Transactional
@RepositoryRestResource(collectionResourceRel = "TimeCard")
public interface TimeCardRep extends JpaRepository<TimeCard,Long> {

    public List<TimeCard> findByName(String name);

}

