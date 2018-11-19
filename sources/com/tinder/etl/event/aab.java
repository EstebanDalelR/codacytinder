package com.tinder.etl.event;

class aab implements EtlField<String> {
    public String description() {
        return "JSON object representing the teaser shown, e.g. for the card in the screenshot { job: \"Photographer\", school: \"Chapman University 09\", distance: \"2 miles away\" }. Keys can be chosen from (a la Recs.Rate teaserType values): job, position, jobPosition, school";
    }

    public String name() {
        return "valueProfileElementIdentity";
    }

    aab() {
    }

    public Class<String> type() {
        return String.class;
    }
}
