package com.crashlytics.android.answers;

public class SearchEvent extends PredefinedEvent<SearchEvent> {
    static final String QUERY_ATTRIBUTE = "query";
    static final String TYPE = "search";

    String getPredefinedType() {
        return TYPE;
    }

    public SearchEvent putQuery(String str) {
        this.predefinedAttributes.put(QUERY_ATTRIBUTE, str);
        return this;
    }
}
