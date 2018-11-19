package com.tinder.etl.event;

import java.util.List;

class ha implements EtlField<List<?>> {
    public String description() {
        return "array of ints describing the exit survey 'fresh-start' reasons selected. See https://confluence.gotinder.com/display/PRODUCT/Account+Delete+Survey+v2#AccountDeleteSurveyV2-Analytics";
    }

    public String name() {
        return "freshStartReasonsSelected";
    }

    ha() {
    }

    public Class<List<?>> type() {
        return List.class;
    }
}
