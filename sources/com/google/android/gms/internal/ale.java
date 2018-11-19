package com.google.android.gms.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;

final class ale extends ald<Boolean> {
    ale(int i, String str, Boolean bool) {
        super(i, str, bool);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo4350a(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(m19322a(), ((Boolean) m19324b()).booleanValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo4351a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(m19322a(), ((Boolean) m19324b()).booleanValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo4352a(Editor editor, Object obj) {
        editor.putBoolean(m19322a(), ((Boolean) obj).booleanValue());
    }
}
