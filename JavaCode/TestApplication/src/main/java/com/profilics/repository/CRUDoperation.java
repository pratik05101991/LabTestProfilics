package com.profilics.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  CRUDoperation<Information> extends  JpaRepository<Information, Long> {

}