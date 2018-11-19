package com.crashlytics.android.answers;

import com.tinder.api.ManagerWebServices;

public class RatingEvent extends PredefinedEvent<RatingEvent> {
    static final String CONTENT_ID_ATTRIBUTE = "contentId";
    static final String CONTENT_NAME_ATTRIBUTE = "contentName";
    static final String CONTENT_TYPE_ATTRIBUTE = "contentType";
    static final String RATING_ATTRIBUTE = "rating";
    static final String TYPE = "rating";

    String getPredefinedType() {
        return ManagerWebServices.PARAM_RATING;
    }

    public RatingEvent putContentId(String str) {
        this.predefinedAttributes.put(CONTENT_ID_ATTRIBUTE, str);
        return this;
    }

    public RatingEvent putContentName(String str) {
        this.predefinedAttributes.put(CONTENT_NAME_ATTRIBUTE, str);
        return this;
    }

    public RatingEvent putContentType(String str) {
        this.predefinedAttributes.put(CONTENT_TYPE_ATTRIBUTE, str);
        return this;
    }

    public RatingEvent putRating(int i) {
        this.predefinedAttributes.put(ManagerWebServices.PARAM_RATING, Integer.valueOf(i));
        return this;
    }
}