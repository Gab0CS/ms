package com.marte.companies_crud.repositories;

import com.marte.companies_crud.entities.WebSite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WebsitesRepository extends JpaRepository<WebSite, Long> {

}
