package com.leanplum.messagetemplates;

import android.app.Activity;
import android.text.TextUtils;
import com.leanplum.ActionArgs;
import com.leanplum.ActionContext;
import com.leanplum.Leanplum;
import com.leanplum.utils.SizeUtil;
import java.io.File;
import java.util.Map;

/* renamed from: com.leanplum.messagetemplates.b */
final class C5749b {
    /* renamed from: a */
    private String f21377a;
    /* renamed from: b */
    private String f21378b;
    /* renamed from: c */
    private String f21379c;
    /* renamed from: d */
    private String f21380d;
    /* renamed from: e */
    private String f21381e;
    /* renamed from: f */
    private String f21382f;
    /* renamed from: g */
    private ActionContext f21383g;
    /* renamed from: h */
    private String f21384h;
    /* renamed from: i */
    private int f21385i;
    /* renamed from: j */
    private C5750c f21386j;
    /* renamed from: k */
    private C5750c f21387k;
    /* renamed from: l */
    private boolean f21388l;

    C5749b(ActionContext actionContext) {
        this.f21383g = actionContext;
        this.f21382f = C5749b.m25267a(actionContext);
        this.f21377a = actionContext.stringNamed("Close URL");
        this.f21378b = actionContext.stringNamed("Open URL");
        this.f21379c = actionContext.stringNamed("Track URL");
        this.f21380d = actionContext.stringNamed("Action URL");
        this.f21381e = actionContext.stringNamed("Track Action URL");
        this.f21384h = actionContext.stringNamed("HTML Align");
        this.f21385i = actionContext.numberNamed("HTML Height").intValue();
        this.f21386j = C5749b.m25275c(actionContext.stringNamed("HTML Width"));
        this.f21387k = C5749b.m25275c(actionContext.stringNamed("HTML Y Offset"));
        this.f21388l = actionContext.booleanNamed("Tap Outside to Close");
    }

    /* renamed from: a */
    private static java.lang.String m25268a(com.leanplum.ActionContext r4, java.lang.String r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 0;
        if (r4 == 0) goto L_0x009e;
    L_0x0003:
        r1 = android.text.TextUtils.isEmpty(r5);
        if (r1 == 0) goto L_0x000b;
    L_0x0009:
        goto L_0x009e;
    L_0x000b:
        r4 = r4.streamNamed(r5);
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r1 = new java.io.BufferedReader;	 Catch:{ IOException -> 0x004f }
        r2 = new java.io.InputStreamReader;	 Catch:{ IOException -> 0x004f }
        r3 = "UTF-8";	 Catch:{ IOException -> 0x004f }
        r2.<init>(r4, r3);	 Catch:{ IOException -> 0x004f }
        r1.<init>(r2);	 Catch:{ IOException -> 0x004f }
    L_0x0020:
        r0 = r1.readLine();	 Catch:{ IOException -> 0x004b, all -> 0x0048 }
        if (r0 == 0) goto L_0x002f;	 Catch:{ IOException -> 0x004b, all -> 0x0048 }
    L_0x0026:
        r5.append(r0);	 Catch:{ IOException -> 0x004b, all -> 0x0048 }
        r0 = "\n";	 Catch:{ IOException -> 0x004b, all -> 0x0048 }
        r5.append(r0);	 Catch:{ IOException -> 0x004b, all -> 0x0048 }
        goto L_0x0020;	 Catch:{ IOException -> 0x004b, all -> 0x0048 }
    L_0x002f:
        r1.close();	 Catch:{ IOException -> 0x004b, all -> 0x0048 }
        if (r4 == 0) goto L_0x003a;
    L_0x0034:
        r4.close();	 Catch:{ Exception -> 0x0038 }
        goto L_0x003a;	 Catch:{ Exception -> 0x0038 }
    L_0x0038:
        r4 = move-exception;	 Catch:{ Exception -> 0x0038 }
        goto L_0x003e;	 Catch:{ Exception -> 0x0038 }
    L_0x003a:
        r1.close();	 Catch:{ Exception -> 0x0038 }
        goto L_0x0077;
    L_0x003e:
        r0 = "Leanplum";
        r1 = new java.lang.StringBuilder;
        r2 = "Failed to close InputStream or BufferedReader: ";
        r1.<init>(r2);
        goto L_0x006d;
    L_0x0048:
        r5 = move-exception;
        r0 = r1;
        goto L_0x007c;
    L_0x004b:
        r0 = r1;
        goto L_0x004f;
    L_0x004d:
        r5 = move-exception;
        goto L_0x007c;
    L_0x004f:
        r1 = "Leanplum";	 Catch:{ all -> 0x004d }
        r2 = "Fail to get HTML template.";	 Catch:{ all -> 0x004d }
        android.util.Log.e(r1, r2);	 Catch:{ all -> 0x004d }
        if (r4 == 0) goto L_0x005e;
    L_0x0058:
        r4.close();	 Catch:{ Exception -> 0x005c }
        goto L_0x005e;	 Catch:{ Exception -> 0x005c }
    L_0x005c:
        r4 = move-exception;	 Catch:{ Exception -> 0x005c }
        goto L_0x0064;	 Catch:{ Exception -> 0x005c }
    L_0x005e:
        if (r0 == 0) goto L_0x0077;	 Catch:{ Exception -> 0x005c }
    L_0x0060:
        r0.close();	 Catch:{ Exception -> 0x005c }
        goto L_0x0077;
    L_0x0064:
        r0 = "Leanplum";
        r1 = new java.lang.StringBuilder;
        r2 = "Failed to close InputStream or BufferedReader: ";
        r1.<init>(r2);
    L_0x006d:
        r1.append(r4);
        r4 = r1.toString();
        android.util.Log.w(r0, r4);
    L_0x0077:
        r4 = r5.toString();
        return r4;
    L_0x007c:
        if (r4 == 0) goto L_0x0084;
    L_0x007e:
        r4.close();	 Catch:{ Exception -> 0x0082 }
        goto L_0x0084;	 Catch:{ Exception -> 0x0082 }
    L_0x0082:
        r4 = move-exception;	 Catch:{ Exception -> 0x0082 }
        goto L_0x008a;	 Catch:{ Exception -> 0x0082 }
    L_0x0084:
        if (r0 == 0) goto L_0x009d;	 Catch:{ Exception -> 0x0082 }
    L_0x0086:
        r0.close();	 Catch:{ Exception -> 0x0082 }
        goto L_0x009d;
    L_0x008a:
        r0 = "Leanplum";
        r1 = new java.lang.StringBuilder;
        r2 = "Failed to close InputStream or BufferedReader: ";
        r1.<init>(r2);
        r1.append(r4);
        r4 = r1.toString();
        android.util.Log.w(r0, r4);
    L_0x009d:
        throw r5;
    L_0x009e:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.messagetemplates.b.a(com.leanplum.ActionContext, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    private static Map<String, Object> m25269a(Map<String, Object> map, String str) {
        if (map == null) {
            return null;
        }
        for (String str2 : (String[]) map.keySet().toArray(new String[map.keySet().size()])) {
            if (map.get(str2) instanceof Map) {
                C5749b.m25269a((Map) map.get(str2), str);
            } else if (str2.contains("__file__") && !str2.equals(str)) {
                String filePath = ActionContext.filePath((String) map.get(str2));
                if (filePath != null) {
                    File file = new File(filePath);
                    StringBuilder stringBuilder = new StringBuilder("file://");
                    stringBuilder.append(file.getAbsolutePath());
                    filePath = stringBuilder.toString();
                    if (filePath.contains(Leanplum.getContext().getPackageName())) {
                        map.put(str2.replace("__file__", ""), filePath.replace(" ", "%20"));
                    }
                    map.remove(str2);
                }
            }
        }
        return map;
    }

    /* renamed from: a */
    private static java.lang.String m25267a(com.leanplum.ActionContext r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 0;
        if (r4 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = "__file__Template";
        r1 = com.leanplum.messagetemplates.C5749b.m25268a(r4, r1);
        r2 = r4.getArgs();
        r3 = "__file__Template";
        r2 = com.leanplum.messagetemplates.C5749b.m25269a(r2, r3);
        if (r2 == 0) goto L_0x0071;
    L_0x0016:
        r3 = android.text.TextUtils.isEmpty(r1);
        if (r3 == 0) goto L_0x001d;
    L_0x001c:
        goto L_0x0071;
    L_0x001d:
        r0 = "messageId";
        r3 = r4.getMessageId();
        r2.put(r0, r3);
        r0 = r4.getContextualValues();
        if (r0 == 0) goto L_0x003f;
    L_0x002c:
        r0 = r4.getContextualValues();
        r0 = r0.arguments;
        if (r0 == 0) goto L_0x003f;
    L_0x0034:
        r0 = "displayEvent";
        r3 = r4.getContextualValues();
        r3 = r3.arguments;
        r2.put(r0, r3);
    L_0x003f:
        r0 = "";
        r3 = "##Vars##";	 Catch:{ JSONException -> 0x0061, Throwable -> 0x0058 }
        r2 = com.leanplum.ActionContext.mapToJsonObject(r2);	 Catch:{ JSONException -> 0x0061, Throwable -> 0x0058 }
        r2 = r2.toString();	 Catch:{ JSONException -> 0x0061, Throwable -> 0x0058 }
        r1 = r1.replace(r3, r2);	 Catch:{ JSONException -> 0x0061, Throwable -> 0x0058 }
        r0 = r4.fillTemplate(r1);	 Catch:{ Throwable -> 0x0056, JSONException -> 0x0054 }
        goto L_0x0068;
    L_0x0054:
        r0 = r1;
        goto L_0x0061;
    L_0x0056:
        r0 = r1;
        goto L_0x0068;
    L_0x0058:
        r4 = move-exception;
        r1 = "Leanplum";
        r2 = "Cannot get html template.";
        android.util.Log.e(r1, r2, r4);
        goto L_0x0068;
    L_0x0061:
        r4 = "Leanplum";
        r1 = "Cannot convert map of arguments to JSON object.";
        android.util.Log.e(r4, r1);
    L_0x0068:
        r4 = "\\/";
        r1 = "/";
        r4 = r0.replace(r4, r1);
        return r4;
    L_0x0071:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.messagetemplates.b.a(com.leanplum.ActionContext):java.lang.String");
    }

    /* renamed from: a */
    final boolean m25285a() {
        return this.f21385i == 0;
    }

    /* renamed from: b */
    final int m25286b() {
        return this.f21385i;
    }

    /* renamed from: c */
    final C5750c m25287c() {
        return this.f21386j;
    }

    /* renamed from: a */
    private void m25271a(String str) {
        this.f21386j = C5749b.m25275c(str);
    }

    /* renamed from: a */
    final int m25284a(Activity activity) {
        int i = 0;
        if (activity == null) {
            return 0;
        }
        if (!(this.f21387k == null || TextUtils.isEmpty(this.f21387k.f21390b))) {
            i = this.f21387k.f21389a;
            i = "%".equals(this.f21387k.f21390b) ? ((SizeUtil.getDisplaySize(activity).y - SizeUtil.getStatusBarHeight(activity)) * i) / 100 : SizeUtil.dpToPx(activity, i);
        }
        return i;
    }

    /* renamed from: b */
    private void m25274b(String str) {
        this.f21387k = C5749b.m25275c(str);
    }

    /* renamed from: c */
    private static C5750c m25275c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C5750c c5750c = new C5750c();
        if (str.contains("px")) {
            str = str.split("px");
            if (str.length != 0) {
                c5750c.f21389a = Integer.parseInt(str[0]);
            }
            c5750c.f21390b = "px";
        } else if (str.contains("%")) {
            str = str.split("%");
            if (str.length != 0) {
                c5750c.f21389a = Integer.parseInt(str[0]);
            }
            c5750c.f21390b = "%";
        }
        return c5750c;
    }

    /* renamed from: d */
    final boolean m25288d() {
        return this.f21388l;
    }

    /* renamed from: a */
    private void m25272a(boolean z) {
        this.f21388l = z;
    }

    /* renamed from: a */
    private void m25270a(int i) {
        this.f21385i = i;
    }

    /* renamed from: e */
    final String m25289e() {
        return this.f21384h;
    }

    /* renamed from: d */
    private void m25276d(String str) {
        this.f21384h = str;
    }

    /* renamed from: f */
    final ActionContext m25290f() {
        return this.f21383g;
    }

    /* renamed from: b */
    private void m25273b(ActionContext actionContext) {
        this.f21383g = actionContext;
    }

    /* renamed from: g */
    final String m25291g() {
        return this.f21382f;
    }

    /* renamed from: e */
    private void m25277e(String str) {
        this.f21382f = str;
    }

    /* renamed from: h */
    final String m25292h() {
        return this.f21381e;
    }

    /* renamed from: f */
    private void m25278f(String str) {
        this.f21381e = str;
    }

    /* renamed from: i */
    final String m25293i() {
        return this.f21379c;
    }

    /* renamed from: g */
    private void m25279g(String str) {
        this.f21379c = str;
    }

    /* renamed from: j */
    final String m25294j() {
        return this.f21378b;
    }

    /* renamed from: h */
    private void m25280h(String str) {
        this.f21378b = str;
    }

    /* renamed from: k */
    final String m25295k() {
        return this.f21380d;
    }

    /* renamed from: i */
    private void m25281i(String str) {
        this.f21380d = str;
    }

    /* renamed from: l */
    final String m25296l() {
        return this.f21377a;
    }

    /* renamed from: j */
    private void m25282j(String str) {
        this.f21377a = str;
    }

    /* renamed from: m */
    public static ActionArgs m25283m() {
        return new ActionArgs().with("Close URL", "http://leanplum:close").with("Open URL", "http://leanplum:loadFinished").with("Action URL", "http://leanplum:runAction").with("Track Action URL", "http://leanplum:runTrackedAction").with("Track URL", "http://leanplum:track").with("HTML Align", "Top").with("HTML Height", Integer.valueOf(0));
    }
}
