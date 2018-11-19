package com.tinder.onboarding.model.network;

import com.google.gson.annotations.SerializedName;

public class EmailRequestMeta {
    private static final EmailRequestMeta SKIPPED = new EmailRequestMeta(true);
    @SerializedName("skipped")
    private boolean skipped;

    public static EmailRequestMeta skipped() {
        return SKIPPED;
    }

    public EmailRequestMeta(boolean z) {
        this.skipped = z;
    }

    public boolean isSkipped() {
        return this.skipped;
    }
}
