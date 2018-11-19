package io.branch.referral;

import android.text.TextUtils;
import com.crashlytics.android.answers.shim.KitEvent;
import io.branch.referral.Defines.Jsonkey;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.branch.referral.l */
class C15592l {
    C15592l() {
    }

    /* renamed from: a */
    public void m58384a(java.lang.String r2, org.json.JSONObject r3, java.lang.String r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = new com.crashlytics.android.answers.shim.KitEvent;	 Catch:{ Throwable -> 0x001c }
        r0.<init>(r2);	 Catch:{ Throwable -> 0x001c }
        if (r3 == 0) goto L_0x001c;	 Catch:{ Throwable -> 0x001c }
    L_0x0007:
        r2 = "";	 Catch:{ Throwable -> 0x001c }
        r1.m58383a(r0, r3, r2);	 Catch:{ Throwable -> 0x001c }
        r2 = io.branch.referral.Defines.Jsonkey.BranchIdentity;	 Catch:{ Throwable -> 0x001c }
        r2 = r2.getKey();	 Catch:{ Throwable -> 0x001c }
        r0.putAttribute(r2, r4);	 Catch:{ Throwable -> 0x001c }
        r2 = com.crashlytics.android.answers.shim.AnswersOptionalLogger.get();	 Catch:{ Throwable -> 0x001c }
        r2.logKitEvent(r0);	 Catch:{ Throwable -> 0x001c }
    L_0x001c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.l.a(java.lang.String, org.json.JSONObject, java.lang.String):void");
    }

    /* renamed from: a */
    private void m58383a(KitEvent kitEvent, JSONObject jSONObject, String str) throws JSONException {
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str2 = (String) keys.next();
            Object obj = jSONObject.get(str2);
            if (!str2.startsWith("+")) {
                StringBuilder stringBuilder;
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append(str2);
                    stringBuilder.append(".");
                    m58383a(kitEvent, jSONObject2, stringBuilder.toString());
                } else if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str2);
                    stringBuilder.append(".");
                    m58382a(kitEvent, jSONArray, stringBuilder.toString());
                } else {
                    m58381a(kitEvent, str, str2, jSONObject.getString(str2));
                }
            }
        }
    }

    /* renamed from: a */
    private void m58382a(KitEvent kitEvent, JSONArray jSONArray, String str) throws JSONException {
        for (int i = 0; i < jSONArray.length(); i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("~");
            stringBuilder.append(Integer.toString(i));
            m58381a(kitEvent, str, stringBuilder.toString(), jSONArray.getString(i));
        }
    }

    /* renamed from: a */
    private void m58381a(KitEvent kitEvent, String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str3)) {
            if (str2.startsWith("~")) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str.replaceFirst("~", ""));
                stringBuilder.append(str2.replaceFirst("~", ""));
                kitEvent.putAttribute(stringBuilder.toString(), str3);
                return;
            }
            str = new StringBuilder();
            str.append("$");
            str.append(Jsonkey.IdentityID.getKey());
            if (str2.equals(str.toString()) != null) {
                kitEvent.putAttribute(Jsonkey.ReferringBranchIdentity.getKey(), str3);
            }
        }
    }
}
