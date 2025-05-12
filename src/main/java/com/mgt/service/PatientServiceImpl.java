
package com.mgt.service;

import com.mgt.model.Patient;
import com.mgt.repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService
{
    @Autowired
    private PatientRepo patientRepository;

    @Override
    public Patient addPatient(Patient patient)
    {
        if(patient!=null)
            return patientRepository.save(patient);
        else
            return null;
    }

    @Override
    public List<Patient> getAllPatients()
    {
        return patientRepository.findAll();
    }

    @Override
    public Patient getPatientById(Long id)
    {
        Optional<Patient> optionalPatient = patientRepository.findById(id);
        return optionalPatient.orElse(null);
    }

    @Override
    public void deletePatient(Long id)
    {
        patientRepository.deleteById(id);
    }
}