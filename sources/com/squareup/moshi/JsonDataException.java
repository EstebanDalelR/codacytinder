package com.squareup.moshi;

import javax.annotation.Nullable;

public final class JsonDataException extends RuntimeException {
    public JsonDataException(@Nullable String str) {
        super(str);
    }
}
