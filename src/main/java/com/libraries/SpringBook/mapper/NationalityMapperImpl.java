package com.libraries.SpringBook.mapper;

import com.libraries.SpringBook.dto.NationalityRequestCreate;
import com.libraries.SpringBook.dto.NationalityRequestUpDate;
import com.libraries.SpringBook.dto.NationalityResponse;
import com.libraries.SpringBook.entities.Nationality;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NationalityMapperImpl implements NationalityMapper{

    @Override
    public NationalityResponse toNationalityResponse(Nationality nationality) {
        return NationalityResponse.builder()
                .id(nationality.getId())
                .nationalityName(nationality.getNationalityName())
                .build();
    }

    @Override
    public Nationality toNationality(NationalityRequestCreate nationalityRequest) {
        return Nationality.builder()
                .nationalityName(nationalityRequest.getNationalityName())
                .build();
    }

    @Override
    public Nationality toNationalityUpDate(NationalityRequestUpDate nationalityRequestUpDate, Nationality nationality) {
        return Nationality.builder()
                .id(nationalityRequestUpDate.getId() == null ? nationality.getId() : nationalityRequestUpDate.getId())
                .nationalityName(nationalityRequestUpDate.getNationalityName() == null ? nationality.getNationalityName() : nationalityRequestUpDate.getNationalityName())
                .build();
    }

    @Override
    public List<Nationality> toCollection(List<Nationality> nationalities) {
        return List.of();
    }
}
