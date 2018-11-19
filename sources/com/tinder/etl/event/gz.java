package com.tinder.etl.event;

import java.util.List;

class gz implements EtlField<List<?>> {
    public String description() {
        return "array of ints describing the order of exit survey 'fresh-start' reasons provided. See https://confluence.gotinder.com/display/PRODUCT/Account+Delete+Survey+v2#AccountDeleteSurveyV2-Analytics";
    }

    public String name() {
        return "freshStartReasonsOrdering";
    }

    gz() {
    }

    public Class<List<?>> type() {
        return List.class;
    }
}
