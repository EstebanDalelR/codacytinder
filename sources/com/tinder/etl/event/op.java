package com.tinder.etl.event;

class op implements EtlField<Number> {
    public String description() {
        return "enum source of an action.  (1:match_screen, 2:messages, 3:new_matches, 4:going_out, 5: profile, 6: in_app_notification, 7:push_notification)";
    }

    public String name() {
        return "origin";
    }

    op() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
