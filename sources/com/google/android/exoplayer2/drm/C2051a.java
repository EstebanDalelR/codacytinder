package com.google.android.exoplayer2.drm;

import android.util.Log;
import com.google.android.exoplayer2.util.C2314v;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.exoplayer2.drm.a */
final class C2051a {
    /* renamed from: a */
    public static byte[] m7367a(byte[] bArr) {
        if (C2314v.f6956a >= 27) {
            return bArr;
        }
        return C2314v.m8491c(C2051a.m7366a(C2314v.m8468a(bArr)));
    }

    /* renamed from: b */
    public static byte[] m7369b(byte[] bArr) {
        if (C2314v.f6956a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(C2314v.m8468a(bArr));
            StringBuilder stringBuilder = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    stringBuilder.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                stringBuilder.append("{\"k\":\"");
                stringBuilder.append(C2051a.m7368b(jSONObject2.getString("k")));
                stringBuilder.append("\",\"kid\":\"");
                stringBuilder.append(C2051a.m7368b(jSONObject2.getString("kid")));
                stringBuilder.append("\",\"kty\":\"");
                stringBuilder.append(jSONObject2.getString("kty"));
                stringBuilder.append("\"}");
            }
            stringBuilder.append("]}");
            return C2314v.m8491c(stringBuilder.toString());
        } catch (Throwable e) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Failed to adjust response data: ");
            stringBuilder2.append(C2314v.m8468a(bArr));
            Log.e("ClearKeyUtil", stringBuilder2.toString(), e);
            return bArr;
        }
    }

    /* renamed from: a */
    private static String m7366a(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    /* renamed from: b */
    private static String m7368b(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
