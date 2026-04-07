package com.marte.report_ms.services;

import com.marte.report_ms.repositories.CompaniesRepository;
import com.netflix.discovery.EurekaClient;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class ReportServiceImpl implements ReportService {

    private final CompaniesRepository companiesRepository;

    @Override
    public String makeReport(String name) {
        return "";
    }

    @Override
    public String saveReport(String reportName) {
        return "";
    }

    @Override
    public void deleteReport(String name) {

    }
}
