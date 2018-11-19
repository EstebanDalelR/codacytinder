package com.snapchat.kit.sdk.core.metrics.p149b;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.snapchat.kit.sdk.core.metrics.C5939b;
import java.lang.reflect.Type;
import java.util.List;
import javax.inject.Inject;

/* renamed from: com.snapchat.kit.sdk.core.metrics.b.a */
public class C5938a {
    /* renamed from: a */
    private static final Type f21710a = new C71411().getType();
    /* renamed from: b */
    private final Gson f21711b;

    /* renamed from: com.snapchat.kit.sdk.core.metrics.b.a$1 */
    static class C71411 extends TypeToken<List<C5939b<String>>> {
        C71411() {
        }
    }

    @Inject
    C5938a(Gson gson) {
        this.f21711b = gson;
    }

    @android.support.annotation.Nullable
    /* renamed from: a */
    public <T extends com.google.protobuf.MessageLite> java.lang.String m25529a(java.util.List<com.snapchat.kit.sdk.core.metrics.C5939b<T>> r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r2.f21711b;	 Catch:{ JsonParseException -> 0x000d }
        r3 = com.snapchat.kit.sdk.core.metrics.p149b.C5938a.m25528b(r3);	 Catch:{ JsonParseException -> 0x000d }
        r1 = f21710a;	 Catch:{ JsonParseException -> 0x000d }
        r3 = r0.toJson(r3, r1);	 Catch:{ JsonParseException -> 0x000d }
        return r3;
    L_0x000d:
        r3 = 0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.metrics.b.a.a(java.util.List):java.lang.String");
    }

    @android.support.annotation.Nullable
    /* renamed from: a */
    public <T extends com.google.protobuf.MessageLite> java.util.List<com.snapchat.kit.sdk.core.metrics.C5939b<T>> m25530a(@android.support.annotation.NonNull com.google.protobuf.Parser<T> r4, java.lang.String r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = 0;
        r1 = r3.f21711b;	 Catch:{ JsonParseException -> 0x0013 }
        r2 = f21710a;	 Catch:{ JsonParseException -> 0x0013 }
        r5 = r1.fromJson(r5, r2);	 Catch:{ JsonParseException -> 0x0013 }
        r5 = (java.util.List) r5;	 Catch:{ JsonParseException -> 0x0013 }
        if (r5 != 0) goto L_0x000e;	 Catch:{ JsonParseException -> 0x0013 }
    L_0x000d:
        return r0;	 Catch:{ JsonParseException -> 0x0013 }
    L_0x000e:
        r4 = com.snapchat.kit.sdk.core.metrics.p149b.C5938a.m25527a(r4, r5);	 Catch:{ JsonParseException -> 0x0013 }
        return r4;
    L_0x0013:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.metrics.b.a.a(com.google.protobuf.Parser, java.lang.String):java.util.List<com.snapchat.kit.sdk.core.metrics.b<T>>");
    }

    @android.support.annotation.NonNull
    /* renamed from: a */
    private static <T extends com.google.protobuf.MessageLite> java.util.List<com.snapchat.kit.sdk.core.metrics.C5939b<T>> m25527a(@android.support.annotation.NonNull com.google.protobuf.Parser<T> r4, @android.support.annotation.NonNull java.util.List<com.snapchat.kit.sdk.core.metrics.C5939b<java.lang.String>> r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = new java.util.ArrayList;
        r1 = r5.size();
        r0.<init>(r1);
        r5 = r5.iterator();
    L_0x000d:
        r1 = r5.hasNext();
        if (r1 == 0) goto L_0x003a;
    L_0x0013:
        r1 = r5.next();
        r1 = (com.snapchat.kit.sdk.core.metrics.C5939b) r1;
        r2 = r1.m25533c();
        r2 = (java.lang.String) r2;
        if (r2 != 0) goto L_0x0022;
    L_0x0021:
        goto L_0x000d;
    L_0x0022:
        r3 = 0;
        r2 = android.util.Base64.decode(r2, r3);	 Catch:{ Exception -> 0x000d }
        r2 = r4.parseFrom(r2);	 Catch:{ Exception -> 0x000d }
        r2 = (com.google.protobuf.MessageLite) r2;	 Catch:{ Exception -> 0x000d }
        r3 = new com.snapchat.kit.sdk.core.metrics.b;	 Catch:{ Exception -> 0x000d }
        r1 = r1.m25532b();	 Catch:{ Exception -> 0x000d }
        r3.<init>(r2, r1);	 Catch:{ Exception -> 0x000d }
        r0.add(r3);	 Catch:{ Exception -> 0x000d }
        goto L_0x000d;
    L_0x003a:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.metrics.b.a.a(com.google.protobuf.Parser, java.util.List):java.util.List<com.snapchat.kit.sdk.core.metrics.b<T>>");
    }

    @android.support.annotation.NonNull
    /* renamed from: b */
    private static <T extends com.google.protobuf.MessageLite> java.util.List<com.snapchat.kit.sdk.core.metrics.C5939b<java.lang.String>> m25528b(@android.support.annotation.NonNull java.util.List<com.snapchat.kit.sdk.core.metrics.C5939b<T>> r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = new java.util.ArrayList;
        r1 = r4.size();
        r0.<init>(r1);
        r4 = r4.iterator();
    L_0x000d:
        r1 = r4.hasNext();
        if (r1 == 0) goto L_0x0035;
    L_0x0013:
        r1 = r4.next();
        r1 = (com.snapchat.kit.sdk.core.metrics.C5939b) r1;
        r2 = r1.m25533c();	 Catch:{ Exception -> 0x000d }
        r2 = (com.google.protobuf.MessageLite) r2;	 Catch:{ Exception -> 0x000d }
        r2 = r2.toByteArray();	 Catch:{ Exception -> 0x000d }
        r3 = 0;	 Catch:{ Exception -> 0x000d }
        r2 = android.util.Base64.encodeToString(r2, r3);	 Catch:{ Exception -> 0x000d }
        r3 = new com.snapchat.kit.sdk.core.metrics.b;	 Catch:{ Exception -> 0x000d }
        r1 = r1.m25532b();	 Catch:{ Exception -> 0x000d }
        r3.<init>(r2, r1);	 Catch:{ Exception -> 0x000d }
        r0.add(r3);	 Catch:{ Exception -> 0x000d }
        goto L_0x000d;
    L_0x0035:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.metrics.b.a.b(java.util.List):java.util.List<com.snapchat.kit.sdk.core.metrics.b<java.lang.String>>");
    }
}
