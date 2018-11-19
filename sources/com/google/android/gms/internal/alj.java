package com.google.android.gms.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;

final class alj extends ald<String> {
    alj(int i, String str, String str2) {
        super(i, str, str2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo4350a(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(m19322a(), (String) m19324b());
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo4351a(JSONObject jSONObject) {
        return jSONObject.optString(m19322a(), (String) m19324b());
    }

    /* renamed from: a */
    public final /* synthetic */ void mo4352a(Editor editor, Object obj) {
        editor.putString(m19322a(), (String) obj);
    }
}
