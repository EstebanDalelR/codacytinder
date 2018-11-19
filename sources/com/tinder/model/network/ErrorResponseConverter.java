package com.tinder.model.network;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.tinder.utils.ad;
import javax.inject.Inject;
import okhttp3.C15968t;

public class ErrorResponseConverter {
    private final Gson mGson;

    @Inject
    public ErrorResponseConverter(Gson gson) {
        this.mGson = gson;
    }

    @Nullable
    public ErrorResponse fromWire(@Nullable C15968t c15968t) {
        if (c15968t == null) {
            return null;
        }
        try {
            c15968t = c15968t.string();
        } catch (C15968t c15968t2) {
            ad.a("Something went wrong decoding error response body", c15968t2);
            c15968t2 = null;
        }
        if (c15968t2 != null) {
            return (ErrorResponse) this.mGson.fromJson(c15968t2, ErrorResponse.class);
        }
        return null;
    }
}
