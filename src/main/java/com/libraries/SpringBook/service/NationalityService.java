package com.libraries.SpringBook.service;


import com.libraries.SpringBook.dto.NationalityRequestCreate;
import com.libraries.SpringBook.dto.NationalityRequestUpDate;
import com.libraries.SpringBook.dto.NationalityResponse;
import com.libraries.SpringBook.entities.Nationality;
import com.libraries.SpringBook.exception.UserException;
import com.libraries.SpringBook.exception.error.NationalityException;
import com.libraries.SpringBook.mapper.NationalityMapper;
import com.libraries.SpringBook.repository.NationalityRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service@Slf4j
public class NationalityService {

    @Autowired
    private NationalityRepository nationalityRepository;

    @Autowired
    private NationalityMapper nationalityMapper;


    public List<Nationality> findAll(){
        List<Nationality> nationalities = (List<Nationality>) nationalityRepository.findAll();
        return nationalities;
    }


    public NationalityResponse saveNationality(NationalityRequestCreate nationalityRequestCreate){
        var national = nationalityMapper.toNationality(nationalityRequestCreate);
        national = nationalityRepository.save(national);
        return nationalityMapper.toNationalityResponse(national);

    }

    public NationalityResponse upDateNationality(Long id, NationalityRequestUpDate nationalityRequestUpDate){
        var national = nationalityRepository.findById(id)
                .orElseThrow(NationalityException::new);
        var nationality = nationalityRepository.save(nationalityMapper.toNationalityUpDate(nationalityRequestUpDate, national));
        return nationalityMapper.toNationalityResponse(nationality);


    }


    public NationalityResponse findById(Long id){
        var national = nationalityRepository.findById(id)
                .orElseThrow(() -> new NationalityException(String.format("Nacionalidade não encontrada com id: %s", id)));
        return nationalityMapper.toNationalityResponse(national);


    }


    public void deleteNationality(Long id){

        boolean exists = nationalityRepository.existsById(id);
        if(!exists){
            throw  new UserException("Id não encontrado");
        }
        nationalityRepository.deleteById(id);
    }
}
