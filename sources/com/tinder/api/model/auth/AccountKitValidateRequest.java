package com.tinder.api.model.auth;

import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.auth.AutoValue_AccountKitValidateRequest.MoshiJsonAdapter;

public abstract class AccountKitValidateRequest {
    @Json(name = "token")
    public abstract String token();

    public static JsonAdapter<AccountKitValidateRequest> jsonAdapter(C5987p c5987p) {
        return new MoshiJsonAdapter(c5987p);
    }

    public static AccountKitValidateRequest create(String str) {
        return new AutoValue_AccountKitValidateRequest(str);
    }
}
