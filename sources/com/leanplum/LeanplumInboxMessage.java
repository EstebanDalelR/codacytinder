package com.leanplum;

import android.net.Uri;
import android.text.TextUtils;
import com.leanplum.p069a.C2590h;
import com.leanplum.p069a.C2594s;
import com.leanplum.p069a.C2595v;
import com.leanplum.p069a.ao;
import com.leanplum.p069a.aw;
import com.leanplum.p069a.bo;
import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class LeanplumInboxMessage {
    /* renamed from: a */
    private String f21127a;
    /* renamed from: b */
    private Long f21128b;
    /* renamed from: c */
    private Long f21129c;
    /* renamed from: d */
    private boolean f21130d;
    /* renamed from: e */
    private ActionContext f21131e;
    /* renamed from: f */
    private String f21132f;
    /* renamed from: g */
    private String f21133g;

    private LeanplumInboxMessage(java.lang.String r1, java.lang.Long r2, java.lang.Long r3, boolean r4, com.leanplum.ActionContext r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = this;
        r0.<init>();
        r0.f21127a = r1;
        r0.f21128b = r2;
        r0.f21129c = r3;
        r0.f21130d = r4;
        r0.f21131e = r5;
        r1 = "Image";
        r1 = r5.stringNamed(r1);
        r0.f21132f = r1;
        r1 = r0.f21132f;
        if (r1 == 0) goto L_0x0022;
    L_0x0019:
        r1 = r0.f21132f;	 Catch:{ Exception -> 0x0022 }
        r1 = com.leanplum.p069a.bo.a(r1);	 Catch:{ Exception -> 0x0022 }
        r0.f21133g = r1;	 Catch:{ Exception -> 0x0022 }
        return;
    L_0x0022:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.LeanplumInboxMessage.<init>(java.lang.String, java.lang.Long, java.lang.Long, boolean, com.leanplum.ActionContext):void");
    }

    public String getImageFilePath() {
        String e = C2594s.e(this.f21133g);
        if (C2594s.b(e)) {
            return new File(e).getAbsolutePath();
        }
        LeanplumInbox.a();
        if (!LeanplumInbox.b()) {
            ao.b(new Object[]{"Inbox Message image path is null because you're calling disableImagePrefetching. Consider using imageURL method or remove disableImagePrefetching."});
        }
        return null;
    }

    public Uri getImageUrl() {
        String e = C2594s.e(this.f21133g);
        if (C2594s.b(e)) {
            return Uri.fromFile(new File(e));
        }
        if (TextUtils.isEmpty(this.f21132f)) {
            return null;
        }
        return Uri.parse(this.f21132f);
    }

    public String getMessageId() {
        return this.f21127a;
    }

    public String getTitle() {
        return this.f21131e.stringNamed("Title");
    }

    public String getSubtitle() {
        return this.f21131e.stringNamed("Subtitle");
    }

    public Date getDeliveryTimestamp() {
        if (this.f21128b == null) {
            return null;
        }
        return new Date(this.f21128b.longValue());
    }

    public Date getExpirationTimestamp() {
        if (this.f21129c == null) {
            return null;
        }
        return new Date(this.f21129c.longValue());
    }

    public boolean isRead() {
        return this.f21130d;
    }

    public void read() {
        try {
            if (!C2590h.a()) {
                if (!this.f21130d) {
                    this.f21130d = true;
                    LeanplumInbox.a().a(LeanplumInbox.a().unreadCount() - 1);
                    Map hashMap = new HashMap();
                    hashMap.put("newsfeedMessageId", this.f21127a);
                    aw.b("markNewsfeedMessageAsRead", hashMap).h();
                }
                this.f21131e.runTrackedActionNamed("Open action");
            }
        } catch (Throwable th) {
            bo.a(th);
        }
    }

    public void remove() {
        try {
            LeanplumInbox.a().a(this.f21127a);
        } catch (Throwable th) {
            bo.a(th);
        }
    }

    /* renamed from: a */
    static LeanplumInboxMessage m25015a(String str, Map<String, Object> map) {
        Map map2 = (Map) map.get("messageData");
        Long l = (Long) map.get("deliveryTimestamp");
        Long l2 = (Long) map.get("expirationTimestamp");
        Boolean bool = (Boolean) map.get("isRead");
        return m25014a(str, l, l2, bool != null ? bool.booleanValue() : null, map2);
    }

    /* renamed from: a */
    final boolean m25020a() {
        if (LeanplumInbox.f7843b && !TextUtils.isEmpty(this.f21132f)) {
            if (!LeanplumInbox.f7842a.contains(this.f21132f)) {
                int a = C2594s.a(true, this.f21133g, this.f21132f, this.f21132f, null);
                LeanplumInbox.f7842a.add(this.f21132f);
                if (C2595v.f8122c == a) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: b */
    final Map<String, Object> m25021b() {
        Map<String, Object> hashMap = new HashMap();
        hashMap.put("deliveryTimestamp", this.f21128b);
        hashMap.put("expirationTimestamp", this.f21129c);
        hashMap.put("messageData", this.f21131e.getArgs());
        hashMap.put("isRead", Boolean.valueOf(isRead()));
        return hashMap;
    }

    /* renamed from: c */
    final boolean m25022c() {
        if (this.f21129c == null) {
            return true;
        }
        return new Date().before(new Date(this.f21129c.longValue()));
    }

    /* renamed from: a */
    private static boolean m25017a(String str) {
        return str.split("##").length == 2 ? true : null;
    }

    /* renamed from: d */
    private ActionContext m25018d() {
        return this.f21131e;
    }

    /* renamed from: e */
    private Map<String, Object> m25019e() {
        return this.f21131e.getArgs();
    }

    /* renamed from: a */
    private void m25016a(boolean z) {
        this.f21130d = true;
    }

    public org.json.JSONObject getData() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = r3.f21131e;	 Catch:{ Throwable -> 0x000f }
        r1 = "Data";	 Catch:{ Throwable -> 0x000f }
        r0 = r0.objectNamed(r1);	 Catch:{ Throwable -> 0x000f }
        r0 = (java.util.Map) r0;	 Catch:{ Throwable -> 0x000f }
        r0 = com.leanplum.p069a.ab.b(r0);	 Catch:{ Throwable -> 0x000f }
        goto L_0x001b;
    L_0x000f:
        r0 = 1;
        r0 = new java.lang.Object[r0];
        r1 = 0;
        r2 = "Unable to parse JSONObject for Data field of inbox message.";
        r0[r1] = r2;
        com.leanplum.p069a.ao.b(r0);
        r0 = 0;
    L_0x001b:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.LeanplumInboxMessage.getData():org.json.JSONObject");
    }

    /* renamed from: a */
    static LeanplumInboxMessage m25014a(String str, Long l, Long l2, boolean z, Map<String, Object> map) {
        if ((str.split("##").length == 2 ? 1 : null) == null) {
            l = new Object[1];
            l2 = new StringBuilder("Malformed inbox messageId: ");
            l2.append(str);
            l[0] = l2.toString();
            ao.a(l);
            return null;
        }
        ActionContext actionContext = new ActionContext((String) map.get("__name__"), map, str.split("##")[0]);
        actionContext.preventRealtimeUpdating();
        actionContext.update();
        return new LeanplumInboxMessage(str, l, l2, z, actionContext);
    }
}
