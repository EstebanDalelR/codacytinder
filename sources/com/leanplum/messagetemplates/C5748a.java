package com.leanplum.messagetemplates;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import com.leanplum.ActionArgs;
import com.leanplum.ActionContext;
import com.leanplum.Leanplum;
import com.leanplum.LeanplumActivityHelper;
import com.leanplum.callbacks.ActionCallback;
import com.leanplum.callbacks.PostponableAction;
import com.leanplum.utils.SizeUtil;
import java.io.File;
import java.util.Map;

/* renamed from: com.leanplum.messagetemplates.a */
class C5748a {
    /* renamed from: a */
    private static final String f21364a = "Confirm";
    /* renamed from: b */
    private String f21365b;
    /* renamed from: c */
    private String f21366c;
    /* renamed from: d */
    private String f21367d;
    /* renamed from: e */
    private String f21368e;
    /* renamed from: f */
    private String f21369f;
    /* renamed from: g */
    private String f21370g;
    /* renamed from: h */
    private ActionContext f21371h;
    /* renamed from: i */
    private String f21372i;
    /* renamed from: j */
    private int f21373j;
    /* renamed from: k */
    private C5750c f21374k;
    /* renamed from: l */
    private C5750c f21375l;
    /* renamed from: m */
    private boolean f21376m;

    /* renamed from: com.leanplum.messagetemplates.a$1 */
    final class C70601 extends ActionCallback {
        C70601() {
        }

        public final boolean onResponse(final ActionContext actionContext) {
            LeanplumActivityHelper.queueActionUponActive(new PostponableAction(this) {
                /* renamed from: b */
                private /* synthetic */ C70601 f25667b;

                /* renamed from: com.leanplum.messagetemplates.a$1$1$1 */
                final class C57461 implements OnClickListener {
                    /* renamed from: a */
                    private /* synthetic */ C70591 f21362a;

                    C57461(C70591 c70591) {
                        this.f21362a = c70591;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        actionContext.runActionNamed("Cancel action");
                    }
                }

                /* renamed from: com.leanplum.messagetemplates.a$1$1$2 */
                final class C57472 implements OnClickListener {
                    /* renamed from: a */
                    private /* synthetic */ C70591 f21363a;

                    C57472(C70591 c70591) {
                        this.f21363a = c70591;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        actionContext.runTrackedActionNamed("Accept action");
                    }
                }

                public final void run() {
                    Context currentActivity = LeanplumActivityHelper.getCurrentActivity();
                    Builder builder = new Builder(currentActivity);
                    builder.setTitle(actionContext.stringNamed("Title")).setMessage(actionContext.stringNamed("Message")).setCancelable(false).setPositiveButton(actionContext.stringNamed("Accept text"), new C57472(this)).setNegativeButton(actionContext.stringNamed("Cancel text"), new C57461(this));
                    AlertDialog create = builder.create();
                    if (currentActivity != null && !currentActivity.isFinishing()) {
                        create.show();
                    }
                }
            });
            return true;
        }
    }

    C5748a() {
    }

    /* renamed from: a */
    public static void m25240a(Context context) {
        Leanplum.defineAction(f21364a, 3, new ActionArgs().with("Title", MessageTemplates.a(context)).with("Message", "Confirmation message goes here.").with("Accept text", "Yes").with("Cancel text", "No").withAction("Accept action", null).withAction("Cancel action", null), new C70601());
    }

    C5748a(ActionContext actionContext) {
        this.f21371h = actionContext;
        this.f21370g = C5748a.m25236a(actionContext);
        this.f21365b = actionContext.stringNamed("Close URL");
        this.f21366c = actionContext.stringNamed("Open URL");
        this.f21367d = actionContext.stringNamed("Track URL");
        this.f21368e = actionContext.stringNamed("Action URL");
        this.f21369f = actionContext.stringNamed("Track Action URL");
        this.f21372i = actionContext.stringNamed("HTML Align");
        this.f21373j = actionContext.numberNamed("HTML Height").intValue();
        this.f21374k = C5748a.m25245c(actionContext.stringNamed("HTML Width"));
        this.f21375l = C5748a.m25245c(actionContext.stringNamed("HTML Y Offset"));
        this.f21376m = actionContext.booleanNamed("Tap Outside to Close");
    }

    /* renamed from: a */
    private static java.lang.String m25237a(com.leanplum.ActionContext r4, java.lang.String r5) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.messagetemplates.a.a(com.leanplum.ActionContext, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    private static Map<String, Object> m25238a(Map<String, Object> map, String str) {
        if (map == null) {
            return null;
        }
        for (String str2 : (String[]) map.keySet().toArray(new String[map.keySet().size()])) {
            if (map.get(str2) instanceof Map) {
                C5748a.m25238a((Map) map.get(str2), str);
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
    private static java.lang.String m25236a(com.leanplum.ActionContext r4) {
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
        r1 = com.leanplum.messagetemplates.C5748a.m25237a(r4, r1);
        r2 = r4.getArgs();
        r3 = "__file__Template";
        r2 = com.leanplum.messagetemplates.C5748a.m25238a(r2, r3);
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
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.messagetemplates.a.a(com.leanplum.ActionContext):java.lang.String");
    }

    /* renamed from: a */
    boolean m25255a() {
        return this.f21373j == 0;
    }

    /* renamed from: b */
    int m25256b() {
        return this.f21373j;
    }

    /* renamed from: c */
    C5750c m25257c() {
        return this.f21374k;
    }

    /* renamed from: a */
    private void m25241a(String str) {
        this.f21374k = C5748a.m25245c(str);
    }

    /* renamed from: a */
    int m25254a(Activity activity) {
        int i = 0;
        if (activity == null) {
            return 0;
        }
        if (!(this.f21375l == null || TextUtils.isEmpty(this.f21375l.f21390b))) {
            i = this.f21375l.f21389a;
            i = "%".equals(this.f21375l.f21390b) ? ((SizeUtil.getDisplaySize(activity).y - SizeUtil.getStatusBarHeight(activity)) * i) / 100 : SizeUtil.dpToPx(activity, i);
        }
        return i;
    }

    /* renamed from: b */
    private void m25244b(String str) {
        this.f21375l = C5748a.m25245c(str);
    }

    /* renamed from: c */
    private static C5750c m25245c(String str) {
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
    boolean m25258d() {
        return this.f21376m;
    }

    /* renamed from: a */
    private void m25242a(boolean z) {
        this.f21376m = z;
    }

    /* renamed from: a */
    private void m25239a(int i) {
        this.f21373j = i;
    }

    /* renamed from: e */
    String m25259e() {
        return this.f21372i;
    }

    /* renamed from: d */
    private void m25246d(String str) {
        this.f21372i = str;
    }

    /* renamed from: f */
    ActionContext m25260f() {
        return this.f21371h;
    }

    /* renamed from: b */
    private void m25243b(ActionContext actionContext) {
        this.f21371h = actionContext;
    }

    /* renamed from: g */
    String m25261g() {
        return this.f21370g;
    }

    /* renamed from: e */
    private void m25247e(String str) {
        this.f21370g = str;
    }

    /* renamed from: h */
    String m25262h() {
        return this.f21369f;
    }

    /* renamed from: f */
    private void m25248f(String str) {
        this.f21369f = str;
    }

    /* renamed from: i */
    String m25263i() {
        return this.f21367d;
    }

    /* renamed from: g */
    private void m25249g(String str) {
        this.f21367d = str;
    }

    /* renamed from: j */
    String m25264j() {
        return this.f21366c;
    }

    /* renamed from: h */
    private void m25250h(String str) {
        this.f21366c = str;
    }

    /* renamed from: k */
    String m25265k() {
        return this.f21368e;
    }

    /* renamed from: i */
    private void m25251i(String str) {
        this.f21368e = str;
    }

    /* renamed from: l */
    String m25266l() {
        return this.f21365b;
    }

    /* renamed from: j */
    private void m25252j(String str) {
        this.f21365b = str;
    }

    /* renamed from: m */
    public static ActionArgs m25253m() {
        return new ActionArgs().with("Close URL", "http://leanplum:close").with("Open URL", "http://leanplum:loadFinished").with("Action URL", "http://leanplum:runAction").with("Track Action URL", "http://leanplum:runTrackedAction").with("Track URL", "http://leanplum:track").with("HTML Align", "Top").with("HTML Height", Integer.valueOf(0));
    }
}
