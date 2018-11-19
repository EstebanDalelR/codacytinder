package com.tinder.etl.event;

class si implements EtlField<Number> {
    public String description() {
        return "0 = onboarded, 1 = onboarding started, 3 = onboarding, rewind unlocked, 7 = onboarding, superlike unlocked, 15 = onboarding, boost unlocked (swiping toward T+ paywall)";
    }

    public String name() {
        return "progressiveOnboarding";
    }

    si() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
