package com.galina.usermanagement2.dao;

import com.galina.usermanagement2.entities.CompanyEntity;
import com.galina.usermanagement2.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface ICompaniesDao extends CrudRepository<CompanyEntity, Long> {
}
