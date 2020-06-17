package com.galina.usermanagement2.logic;

import com.galina.usermanagement2.dao.ICompaniesDao;
import com.galina.usermanagement2.dao.IUsersDao;
import com.galina.usermanagement2.entities.CompanyEntity;
import com.galina.usermanagement2.entities.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CompaniesController {
    @Autowired
    private ICompaniesDao companiesDao;

    public Long createCompany (CompanyEntity company){
        // validations
        companiesDao.save(company);
        return company.getId();
    }

    public void updateCompany (CompanyEntity company){
        //validations
        companiesDao.save(company);
    }

    public CompanyEntity getCompany (Long id){
        CompanyEntity company = companiesDao.findById(id).get();
        return company;
    }


    public void deleteCompany(Long id) {
        companiesDao.deleteById(id);
    }
}

