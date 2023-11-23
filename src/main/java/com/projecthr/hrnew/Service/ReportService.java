package com.projecthr.hrnew.Service;

import com.projecthr.hrnew.Entity.Reports;

import java.util.List;

public interface ReportService {
    Reports createReport(Reports report);
    Reports updateReport(Reports report);
    Reports getReportById(Long reportId);
    List<Reports> getAllReports();
    void deleteReport(Long reportId);
}
