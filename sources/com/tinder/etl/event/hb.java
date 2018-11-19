package com.tinder.etl.event;

import java.util.List;

class hb implements EtlField<List<?>> {
    public String description() {
        return "array of ints describing which exit survey 'fresh-start' reasons were shown (always in numerical order). See https://confluence.gotinder.com/display/PRODUCT/Account+Delete+Survey+v2#AccountDeleteSurveyV2-Analytics";
    }

    public String name() {
        return "freshStartReasonsShown";
    }

    hb() {
    }

    public Class<List<?>> type() {
        return List.class;
    }
}
