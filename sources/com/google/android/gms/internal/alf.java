package com.google.android.gms.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;

final class alf extends ald<Integer> {
    alf(int i, String str, Integer num) {
        super(i, str, num);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo4350a(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(m19322a(), ((Integer) m19324b()).intValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo4351a(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(m19322a(), ((Integer) m19324b()).intValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo4352a(Editor editor, Object obj) {
        editor.putInt(m19322a(), ((Integer) obj).intValue());
    }
}
