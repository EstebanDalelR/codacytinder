package com.google.android.gms.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;

final class ali extends ald<Float> {
    ali(int i, String str, Float f) {
        super(i, str, f);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo4350a(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(m19322a(), ((Float) m19324b()).floatValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo4351a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(m19322a(), (double) ((Float) m19324b()).floatValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo4352a(Editor editor, Object obj) {
        editor.putFloat(m19322a(), ((Float) obj).floatValue());
    }
}
