package com.tinder.etl.event;

class on implements EtlField<String> {
    public String description() {
        return "intro_1, intro_2, intro_3, intro_final, location, faq, skip";
    }

    public String name() {
        return "onboardingStep";
    }

    on() {
    }

    public Class<String> type() {
        return String.class;
    }
}
