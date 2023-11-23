package com.projecthr.hrnew.Service;

import com.projecthr.hrnew.Entity.Vacation;

import java.util.List;

public interface VacationService {
    Vacation createVacation(Vacation vacation);
    Vacation updateVacation(Vacation vacation);
    Vacation getVacationById(Long vacationId);
    List<Vacation> getAllVacations();
    void deleteVacation(Long vacationId);
}
