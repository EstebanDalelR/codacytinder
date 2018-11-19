package com.tinder.etl.event;

class xq implements EtlField<String> {
    public String description() {
        return "token in superLikeable recs api response";
    }

    public String name() {
        return "superLikeableSessionId";
    }

    xq() {
    }

    public Class<String> type() {
        return String.class;
    }
}
