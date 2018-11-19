package com.tinder.model.adapter.legacy;

import com.tinder.api.model.common.School;
import java.util.ArrayList;
import java.util.List;

public class LegacySchoolAdapter {
    public School fromModelSchool(com.tinder.model.School school) {
        return School.builder().setDisplayed(Boolean.valueOf(school.isDisplayed)).setId(school.getId()).setName(school.getName()).build();
    }

    public List<School> fromModelSchoolList(List<com.tinder.model.School> list) {
        List<School> arrayList = new ArrayList();
        for (com.tinder.model.School fromModelSchool : list) {
            arrayList.add(fromModelSchool(fromModelSchool));
        }
        return arrayList;
    }
}
