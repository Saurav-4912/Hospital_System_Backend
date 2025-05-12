package com.mgt.service;


import com.mgt.model.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PatientService {

    public abstract Patient addPatient(Patient patient);

    public abstract List<Patient> getAllPatients();

    public abstract Patient getPatientById(Long id);

    public abstract void deletePatient(Long id);

}