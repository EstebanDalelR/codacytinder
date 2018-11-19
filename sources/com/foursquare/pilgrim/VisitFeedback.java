package com.foursquare.pilgrim;

public enum VisitFeedback {
    CONFIRM("confirm"),
    FALSE_STOP("falsestop"),
    WRONG_VENUE("wrongvenue"),
    DENY("deny");
    
    private String value;

    private VisitFeedback(String str) {
        this.value = str;
    }

    public String toString() {
        return this.value;
    }
}
