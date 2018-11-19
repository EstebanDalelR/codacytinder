package com.tinder.p257g;

import com.google.gson.Gson;
import com.tinder.model.Badge;

/* renamed from: com.tinder.g.a */
public class C9644a {
    /* renamed from: a */
    public static com.tinder.model.Badge m40033a(org.json.JSONObject r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = new com.tinder.model.Badge;	 Catch:{ Exception -> 0x0019 }
        r1 = "type";	 Catch:{ Exception -> 0x0019 }
        r2 = 0;	 Catch:{ Exception -> 0x0019 }
        r1 = r5.optString(r1, r2);	 Catch:{ Exception -> 0x0019 }
        r3 = "description";	 Catch:{ Exception -> 0x0019 }
        r3 = r5.optString(r3, r2);	 Catch:{ Exception -> 0x0019 }
        r4 = "color";	 Catch:{ Exception -> 0x0019 }
        r5 = r5.optString(r4, r2);	 Catch:{ Exception -> 0x0019 }
        r0.<init>(r1, r3, r5);	 Catch:{ Exception -> 0x0019 }
        return r0;
    L_0x0019:
        r5 = new com.tinder.model.Badge;
        r5.<init>();
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.g.a.a(org.json.JSONObject):com.tinder.model.Badge");
    }

    /* renamed from: a */
    public static Badge m40032a(String str) {
        return (Badge) new Gson().fromJson(str, Badge.class);
    }
}
