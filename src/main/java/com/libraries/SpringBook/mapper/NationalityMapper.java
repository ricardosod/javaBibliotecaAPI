package com.libraries.SpringBook.mapper;

import com.libraries.SpringBook.dto.*;
import com.libraries.SpringBook.entities.Authors;
import com.libraries.SpringBook.entities.Nationality;

import java.util.List;

public interface NationalityMapper {



    NationalityResponse toNationalityResponse(Nationality nationality);
    
    Nationality toNationality(NationalityRequestCreate nationalityRequest);

    Nationality toNationalityUpDate(NationalityRequestUpDate nationalityRequestUpDate, Nationality nationality);

    List<Nationality> toCollection(List<Nationality> nationalities);
}
