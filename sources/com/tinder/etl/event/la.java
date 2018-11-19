package com.tinder.etl.event;

class la implements EtlField<Boolean> {
    public String description() {
        return "true if the Likes You entry point is shown.";
    }

    public String name() {
        return "LikesYouTilePresent";
    }

    la() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
