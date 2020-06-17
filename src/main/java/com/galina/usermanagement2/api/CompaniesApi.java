package com.galina.usermanagement2.api;

import com.galina.usermanagement2.entities.CompanyEntity;
import com.galina.usermanagement2.entities.UserEntity;
import com.galina.usermanagement2.logic.CompaniesController;
import com.galina.usermanagement2.logic.UsersController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/companies")
public class CompaniesApi {

    @Autowired
    private CompaniesController companiesController;

    @PostMapping
    public void createCompany(@RequestBody CompanyEntity company) {
        companiesController.createCompany(company);
    }

    @PutMapping
    public void updateCompany(@RequestBody CompanyEntity company) {
    }

    @GetMapping("/{id}")
    public CompanyEntity getCompany(@PathVariable("id") Long id) {
        return companiesController.getCompany(id);
    }

    @DeleteMapping("/{id}")
    public void deleteCompany(@PathVariable("id") Long id) {
        companiesController.deleteCompany(id);
    }

}
