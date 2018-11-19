package com.google.android.gms.internal;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.ar;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@zzzv
public final class gd {
    /* renamed from: a */
    private final Context f16076a;
    /* renamed from: b */
    private String f16077b;
    /* renamed from: c */
    private String f16078c;
    /* renamed from: d */
    private String f16079d;
    @Nullable
    /* renamed from: e */
    private String f16080e;
    /* renamed from: f */
    private final float f16081f;
    /* renamed from: g */
    private float f16082g;
    /* renamed from: h */
    private float f16083h;
    /* renamed from: i */
    private float f16084i;
    /* renamed from: j */
    private int f16085j;

    public gd(Context context) {
        this.f16085j = 0;
        this.f16076a = context;
        this.f16081f = context.getResources().getDisplayMetrics().density;
    }

    public gd(Context context, String str) {
        this(context);
        this.f16077b = str;
    }

    /* renamed from: a */
    private static int m19791a(List<String> list, String str, boolean z) {
        if (!z) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private final void m19792a(int r5, float r6, float r7) {
        /*
        r4 = this;
        if (r5 != 0) goto L_0x000c;
    L_0x0002:
        r5 = 0;
        r4.f16085j = r5;
        r4.f16082g = r6;
        r4.f16083h = r7;
        r4.f16084i = r7;
        return;
    L_0x000c:
        r0 = r4.f16085j;
        r1 = -1;
        if (r0 != r1) goto L_0x0012;
    L_0x0011:
        return;
    L_0x0012:
        r0 = 2;
        r2 = 1;
        if (r5 != r0) goto L_0x008e;
    L_0x0016:
        r5 = r4.f16083h;
        r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1));
        if (r5 <= 0) goto L_0x001f;
    L_0x001c:
        r4.f16083h = r7;
        goto L_0x0027;
    L_0x001f:
        r5 = r4.f16084i;
        r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1));
        if (r5 >= 0) goto L_0x0027;
    L_0x0025:
        r4.f16084i = r7;
    L_0x0027:
        r5 = r4.f16083h;
        r7 = r4.f16084i;
        r5 = r5 - r7;
        r7 = 1106247680; // 0x41f00000 float:30.0 double:5.465589745E-315;
        r3 = r4.f16081f;
        r3 = r3 * r7;
        r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));
        if (r5 <= 0) goto L_0x0039;
    L_0x0036:
        r4.f16085j = r1;
        return;
    L_0x0039:
        r5 = r4.f16085j;
        r7 = 3;
        if (r5 == 0) goto L_0x005a;
    L_0x003e:
        r5 = r4.f16085j;
        if (r5 != r0) goto L_0x0043;
    L_0x0042:
        goto L_0x005a;
    L_0x0043:
        r5 = r4.f16085j;
        if (r5 == r2) goto L_0x004b;
    L_0x0047:
        r5 = r4.f16085j;
        if (r5 != r7) goto L_0x006f;
    L_0x004b:
        r5 = r4.f16082g;
        r5 = r6 - r5;
        r1 = -1035468800; // 0xffffffffc2480000 float:-50.0 double:NaN;
        r3 = r4.f16081f;
        r3 = r3 * r1;
        r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));
        if (r5 > 0) goto L_0x006f;
    L_0x0059:
        goto L_0x0068;
    L_0x005a:
        r5 = r4.f16082g;
        r5 = r6 - r5;
        r1 = 1112014848; // 0x42480000 float:50.0 double:5.49408334E-315;
        r3 = r4.f16081f;
        r3 = r3 * r1;
        r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));
        if (r5 < 0) goto L_0x006f;
    L_0x0068:
        r4.f16082g = r6;
        r5 = r4.f16085j;
        r5 = r5 + r2;
        r4.f16085j = r5;
    L_0x006f:
        r5 = r4.f16085j;
        if (r5 == r2) goto L_0x0085;
    L_0x0073:
        r5 = r4.f16085j;
        if (r5 != r7) goto L_0x0078;
    L_0x0077:
        goto L_0x0085;
    L_0x0078:
        r5 = r4.f16085j;
        if (r5 != r0) goto L_0x0098;
    L_0x007c:
        r5 = r4.f16082g;
        r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1));
        if (r5 >= 0) goto L_0x0098;
    L_0x0082:
        r4.f16082g = r6;
        return;
    L_0x0085:
        r5 = r4.f16082g;
        r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1));
        if (r5 <= 0) goto L_0x0098;
    L_0x008b:
        r4.f16082g = r6;
        return;
    L_0x008e:
        if (r5 != r2) goto L_0x0098;
    L_0x0090:
        r5 = r4.f16085j;
        r6 = 4;
        if (r5 != r6) goto L_0x0098;
    L_0x0095:
        r4.m19803a();
    L_0x0098:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gd.a(int, float, float):void");
    }

    /* renamed from: b */
    private final void m19794b() {
        if (this.f16076a instanceof Activity) {
            Builder builder;
            Object obj = this.f16077b;
            if (!TextUtils.isEmpty(obj)) {
                Uri build = new Uri.Builder().encodedQuery(obj.replaceAll("\\+", "%20")).build();
                StringBuilder stringBuilder = new StringBuilder();
                ar.e();
                Map a = fk.m19691a(build);
                for (String str : a.keySet()) {
                    stringBuilder.append(str);
                    stringBuilder.append(" = ");
                    stringBuilder.append((String) a.get(str));
                    stringBuilder.append("\n\n");
                }
                obj = stringBuilder.toString().trim();
                if (!TextUtils.isEmpty(obj)) {
                    builder = new Builder(this.f16076a);
                    builder.setMessage(obj);
                    builder.setTitle("Ad Information");
                    builder.setPositiveButton("Share", new gf(this, obj));
                    builder.setNegativeButton("Close", new gg(this));
                    builder.create().show();
                    return;
                }
            }
            obj = "No debug information";
            builder = new Builder(this.f16076a);
            builder.setMessage(obj);
            builder.setTitle("Ad Information");
            builder.setPositiveButton("Share", new gf(this, obj));
            builder.setNegativeButton("Close", new gg(this));
            builder.create().show();
            return;
        }
        hx.m19915d("Can not create dialog without Activity Context");
    }

    /* renamed from: c */
    private final void m19796c() {
        hx.m19911b("Debug mode [Creative Preview] selected.");
        fe.m19676a(new gh(this));
    }

    /* renamed from: d */
    private final void m19799d() {
        hx.m19911b("Debug mode [Troubleshooting] selected.");
        fe.m19676a(new gi(this));
    }

    /* renamed from: a */
    public final void m19803a() {
        if (!((Boolean) aja.m19221f().m19334a(alo.cz)).booleanValue()) {
            if (!((Boolean) aja.m19221f().m19334a(alo.cy)).booleanValue()) {
                m19794b();
                return;
            }
        }
        if (this.f16076a instanceof Activity) {
            String str = !TextUtils.isEmpty(ar.n().m19816a()) ? "Creative Preview (Enabled)" : "Creative Preview";
            String str2 = ar.n().m19820b() ? "Troubleshooting (Enabled)" : "Troubleshooting";
            List arrayList = new ArrayList();
            int a = m19791a(arrayList, "Ad Information", true);
            int a2 = m19791a(arrayList, str, ((Boolean) aja.m19221f().m19334a(alo.cy)).booleanValue());
            int a3 = m19791a(arrayList, str2, ((Boolean) aja.m19221f().m19334a(alo.cz)).booleanValue());
            Builder builder = new Builder(this.f16076a, ar.g().mo7435f());
            builder.setTitle("Select a Debug Mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new ge(this, a, a2, a3));
            builder.create().show();
            return;
        }
        hx.m19915d("Can not create dialog without Activity Context");
    }

    /* renamed from: a */
    public final void m19804a(MotionEvent motionEvent) {
        int historySize = motionEvent.getHistorySize();
        for (int i = 0; i < historySize; i++) {
            m19792a(motionEvent.getActionMasked(), motionEvent.getHistoricalX(0, i), motionEvent.getHistoricalY(0, i));
        }
        m19792a(motionEvent.getActionMasked(), motionEvent.getX(), motionEvent.getY());
    }

    /* renamed from: a */
    public final void m19805a(String str) {
        this.f16078c = str;
    }

    /* renamed from: b */
    public final void m19806b(String str) {
        this.f16079d = str;
    }

    /* renamed from: c */
    public final void m19807c(String str) {
        this.f16077b = str;
    }

    /* renamed from: d */
    public final void m19808d(String str) {
        this.f16080e = str;
    }
}
