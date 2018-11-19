package com.tinder.model.adapter.domain;

import android.support.annotation.Nullable;
import com.tinder.data.adapter.C2645i;
import com.tinder.domain.common.model.School;
import javax.inject.Inject;

class SchoolLegacySchoolAdapter extends C2645i<School, com.tinder.model.School> {
    @Inject
    SchoolLegacySchoolAdapter() {
    }

    @Nullable
    public School adapt(com.tinder.model.School school) {
        return School.builder().displayed(school.isDisplayed()).id(school.getId()).name(school.getName() == null ? "" : school.getName()).build();
    }
}
