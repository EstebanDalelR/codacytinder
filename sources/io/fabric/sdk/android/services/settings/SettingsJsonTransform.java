package io.fabric.sdk.android.services.settings;

import io.fabric.sdk.android.services.common.CurrentTimeProvider;
import org.json.JSONException;
import org.json.JSONObject;

public interface SettingsJsonTransform {
    C15665p buildFromJson(CurrentTimeProvider currentTimeProvider, JSONObject jSONObject) throws JSONException;

    JSONObject toJson(C15665p c15665p) throws JSONException;
}
