package com.finalproject.springweb.repository;


import com.finalproject.springweb.model.entity.Categorytable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorytableRepository extends JpaRepository<Categorytable,Long> {

}
