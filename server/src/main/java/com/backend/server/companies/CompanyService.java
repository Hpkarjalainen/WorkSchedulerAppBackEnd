package com.backend.server.companies;


import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class CompanyService {
    private final CompanyRepository companyRepository;

    
    public Company saveCompany(Company company) {
        return companyRepository.save(company);
    }

    public Company getCompanyById(Long id) {
        return companyRepository.findById(id).orElse(null);
    }

    public String deleteCompany(Long id) {
        companyRepository.deleteById(id);
        return "Company removed !! " + id;
    }

   

    // Lisää jos tarvii, esim update
}