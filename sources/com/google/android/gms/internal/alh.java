package com.google.android.gms.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;

final class alh extends ald<Long> {
    alh(int i, String str, Long l) {
        super(i, str, l);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo4350a(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(m19322a(), ((Long) m19324b()).longValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo4351a(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(m19322a(), ((Long) m19324b()).longValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo4352a(Editor editor, Object obj) {
        editor.putLong(m19322a(), ((Long) obj).longValue());
    }
}
