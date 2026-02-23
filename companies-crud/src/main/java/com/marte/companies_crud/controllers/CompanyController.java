package com.marte.companies_crud.controllers;

import com.marte.companies_crud.entities.Company;
import com.marte.companies_crud.services.CompanyService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping(path = "company")
@Tag(name = "Companies resources")

public class CompanyController {

    private final CompanyService companyService;

    @Operation(summary = "Get company by name")
    @GetMapping(path = "{name}")
    public ResponseEntity<Company> get(@PathVariable String name){
        log.info("GET: company {}",name);
        return ResponseEntity.ok(this.companyService.readByName(name));
    }

    @Operation(summary = "Post a compnay with a given body")
    @PostMapping
    public ResponseEntity<Company> post(@RequestBody Company company){
        log.info("Post: company {}", company.getName());
        return ResponseEntity.created(URI.create(this.companyService.create(company).getName())).build();
    }

    @Operation(summary = "Update a compnay with a given body")
    @PutMapping(path = "{name}")
    public ResponseEntity<Company> put(
            @RequestBody Company company,
            @PathVariable String name){
        log.info("PUT: company {}",name);
        return ResponseEntity.ok(this.companyService.update(company, name));
    }

    @Operation(summary = "Delete a company by it's name")
    @DeleteMapping(path = "{name}")
    public ResponseEntity<?> delete(@PathVariable String name){
        log.info("DELETE: company {}", name)    ;
        this.companyService.delete(name);
        return ResponseEntity.noContent().build();
    }

}
