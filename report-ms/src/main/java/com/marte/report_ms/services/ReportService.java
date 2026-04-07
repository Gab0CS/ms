package com.marte.report_ms.services;

public interface ReportService {

    String makeReport(String name);
    String saveReport(String reportName);
    void deleteReport(String name);
}
