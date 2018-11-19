package com.tinder.etl.event;

import java.util.List;

class je implements EtlField<List<?>> {
    public String description() {
        return "features / reasons that drive user to hit the T+ paywall. 0 - 'passport' 1 - 'who_sees_you' 2 - 'who_you_see' 3 - 'your_profile' 4 - 'unlimited_swipes' 5 - 'super_like' 6 - 'undo' 7 - 'hide_ads' 8 - 'boost'";
    }

    public String name() {
        return "incentives";
    }

    je() {
    }

    public Class<List<?>> type() {
        return List.class;
    }
}
