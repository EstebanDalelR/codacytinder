package com.tinder.settings.model;

public enum ExitSurveyDetailsMode {
    FEEDBACK(0),
    DISLIKE(1),
    OTHER(2),
    FRESH_START(3);
    
    private int id;

    private ExitSurveyDetailsMode(int i) {
        this.id = i;
    }

    public int getId() {
        return this.id;
    }

    public static ExitSurveyDetailsMode findByValue(int i) {
        for (ExitSurveyDetailsMode exitSurveyDetailsMode : values()) {
            if (exitSurveyDetailsMode.getId() == i) {
                return exitSurveyDetailsMode;
            }
        }
        return FEEDBACK;
    }
}
