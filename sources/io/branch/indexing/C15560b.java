package io.branch.indexing;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.AbsListView;
import android.widget.TextView;
import com.leanplum.BuildConfig;
import io.branch.referral.C15593m;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.branch.indexing.b */
public class C15560b {
    /* renamed from: a */
    private static C15560b f48049a;
    /* renamed from: b */
    private Handler f48050b = new Handler();
    /* renamed from: c */
    private WeakReference<Activity> f48051c;
    /* renamed from: d */
    private String f48052d;
    /* renamed from: e */
    private JSONObject f48053e;
    /* renamed from: f */
    private int f48054f;
    /* renamed from: g */
    private int f48055g = 15;
    /* renamed from: h */
    private final C15559a f48056h = new C15559a(this);
    /* renamed from: i */
    private C15562c f48057i;
    /* renamed from: j */
    private final Map<String, WeakReference<ViewTreeObserver>> f48058j = new HashMap();
    /* renamed from: k */
    private ArrayList<String> f48059k = new ArrayList();
    /* renamed from: l */
    private Runnable f48060l = new C155561(this);
    /* renamed from: m */
    private OnScrollChangedListener f48061m = new C155572(this);
    /* renamed from: n */
    private Runnable f48062n = new C155583(this);

    /* renamed from: io.branch.indexing.b$1 */
    class C155561 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C15560b f48044a;

        C155561(C15560b c15560b) {
            this.f48044a = c15560b;
        }

        public void run() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r9 = this;
            r0 = r9.f48044a;	 Catch:{ Exception -> 0x017e }
            r0.f48054f = r0.f48054f + 1;	 Catch:{ Exception -> 0x017e }
            r0 = r9.f48044a;	 Catch:{ Exception -> 0x017e }
            r0 = r0.f48057i;	 Catch:{ Exception -> 0x017e }
            r0 = r0.m58132a();	 Catch:{ Exception -> 0x017e }
            if (r0 == 0) goto L_0x017e;	 Catch:{ Exception -> 0x017e }
        L_0x0011:
            r0 = r9.f48044a;	 Catch:{ Exception -> 0x017e }
            r0 = r0.f48051c;	 Catch:{ Exception -> 0x017e }
            if (r0 == 0) goto L_0x017e;	 Catch:{ Exception -> 0x017e }
        L_0x0019:
            r0 = r9.f48044a;	 Catch:{ Exception -> 0x017e }
            r0 = r0.f48051c;	 Catch:{ Exception -> 0x017e }
            r0 = r0.get();	 Catch:{ Exception -> 0x017e }
            if (r0 == 0) goto L_0x017e;	 Catch:{ Exception -> 0x017e }
        L_0x0025:
            r0 = r9.f48044a;	 Catch:{ Exception -> 0x017e }
            r0 = r0.f48051c;	 Catch:{ Exception -> 0x017e }
            r0 = r0.get();	 Catch:{ Exception -> 0x017e }
            r0 = (android.app.Activity) r0;	 Catch:{ Exception -> 0x017e }
            r1 = r9.f48044a;	 Catch:{ Exception -> 0x017e }
            r2 = new org.json.JSONObject;	 Catch:{ Exception -> 0x017e }
            r2.<init>();	 Catch:{ Exception -> 0x017e }
            r1.f48053e = r2;	 Catch:{ Exception -> 0x017e }
            r1 = r9.f48044a;	 Catch:{ Exception -> 0x017e }
            r1 = r1.f48053e;	 Catch:{ Exception -> 0x017e }
            r2 = "ts";	 Catch:{ Exception -> 0x017e }
            r3 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x017e }
            r1.put(r2, r3);	 Catch:{ Exception -> 0x017e }
            r1 = r9.f48044a;	 Catch:{ Exception -> 0x017e }
            r1 = r1.f48052d;	 Catch:{ Exception -> 0x017e }
            r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ Exception -> 0x017e }
            if (r1 != 0) goto L_0x0067;	 Catch:{ Exception -> 0x017e }
        L_0x0056:
            r1 = r9.f48044a;	 Catch:{ Exception -> 0x017e }
            r1 = r1.f48053e;	 Catch:{ Exception -> 0x017e }
            r2 = "rl";	 Catch:{ Exception -> 0x017e }
            r3 = r9.f48044a;	 Catch:{ Exception -> 0x017e }
            r3 = r3.f48052d;	 Catch:{ Exception -> 0x017e }
            r1.put(r2, r3);	 Catch:{ Exception -> 0x017e }
        L_0x0067:
            r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x017e }
            r1.<init>();	 Catch:{ Exception -> 0x017e }
            r2 = "/";	 Catch:{ Exception -> 0x017e }
            r1.append(r2);	 Catch:{ Exception -> 0x017e }
            r2 = r0.getClass();	 Catch:{ Exception -> 0x017e }
            r2 = r2.getSimpleName();	 Catch:{ Exception -> 0x017e }
            r1.append(r2);	 Catch:{ Exception -> 0x017e }
            r7 = r1.toString();	 Catch:{ Exception -> 0x017e }
            r1 = r9.f48044a;	 Catch:{ Exception -> 0x017e }
            r1 = r1.f48053e;	 Catch:{ Exception -> 0x017e }
            r2 = "v";	 Catch:{ Exception -> 0x017e }
            r1.put(r2, r7);	 Catch:{ Exception -> 0x017e }
            r1 = 16908290; // 0x1020002 float:2.3877235E-38 double:8.353805E-317;	 Catch:{ Exception -> 0x017e }
            r1 = r0.findViewById(r1);	 Catch:{ Exception -> 0x017e }
            r1 = (android.view.ViewGroup) r1;	 Catch:{ Exception -> 0x017e }
            if (r1 == 0) goto L_0x017e;	 Catch:{ Exception -> 0x017e }
        L_0x0096:
            r2 = r9.f48044a;	 Catch:{ Exception -> 0x017e }
            r2 = r2.f48057i;	 Catch:{ Exception -> 0x017e }
            r2 = r2.m58130a(r0);	 Catch:{ Exception -> 0x017e }
            if (r2 == 0) goto L_0x00aa;	 Catch:{ Exception -> 0x017e }
        L_0x00a2:
            r3 = r2.m58125d();	 Catch:{ Exception -> 0x017e }
            if (r3 == 0) goto L_0x00aa;	 Catch:{ Exception -> 0x017e }
        L_0x00a8:
            r3 = 1;	 Catch:{ Exception -> 0x017e }
            goto L_0x00ab;	 Catch:{ Exception -> 0x017e }
        L_0x00aa:
            r3 = 0;	 Catch:{ Exception -> 0x017e }
        L_0x00ab:
            r4 = 0;	 Catch:{ Exception -> 0x017e }
            if (r2 == 0) goto L_0x00c6;	 Catch:{ Exception -> 0x017e }
        L_0x00ae:
            r3 = r2.m58125d();	 Catch:{ Exception -> 0x017e }
            r4 = r9.f48044a;	 Catch:{ Exception -> 0x017e }
            r4 = r4.f48053e;	 Catch:{ Exception -> 0x017e }
            r5 = "h";	 Catch:{ Exception -> 0x017e }
            r6 = r3 ^ 1;	 Catch:{ Exception -> 0x017e }
            r4.put(r5, r6);	 Catch:{ Exception -> 0x017e }
            r2 = r2.m58124c();	 Catch:{ Exception -> 0x017e }
            r8 = r2;	 Catch:{ Exception -> 0x017e }
            r6 = r3;	 Catch:{ Exception -> 0x017e }
            goto L_0x00c8;	 Catch:{ Exception -> 0x017e }
        L_0x00c6:
            r6 = r3;	 Catch:{ Exception -> 0x017e }
            r8 = r4;	 Catch:{ Exception -> 0x017e }
        L_0x00c8:
            if (r8 == 0) goto L_0x00f8;	 Catch:{ Exception -> 0x017e }
        L_0x00ca:
            r2 = r8.length();	 Catch:{ Exception -> 0x017e }
            if (r2 <= 0) goto L_0x00f8;	 Catch:{ Exception -> 0x017e }
        L_0x00d0:
            r4 = new org.json.JSONArray;	 Catch:{ Exception -> 0x017e }
            r4.<init>();	 Catch:{ Exception -> 0x017e }
            r1 = r9.f48044a;	 Catch:{ Exception -> 0x017e }
            r1 = r1.f48053e;	 Catch:{ Exception -> 0x017e }
            r2 = "ck";	 Catch:{ Exception -> 0x017e }
            r1.put(r2, r4);	 Catch:{ Exception -> 0x017e }
            r3 = new org.json.JSONArray;	 Catch:{ Exception -> 0x017e }
            r3.<init>();	 Catch:{ Exception -> 0x017e }
            r1 = r9.f48044a;	 Catch:{ Exception -> 0x017e }
            r1 = r1.f48053e;	 Catch:{ Exception -> 0x017e }
            r2 = "cd";	 Catch:{ Exception -> 0x017e }
            r1.put(r2, r3);	 Catch:{ Exception -> 0x017e }
            r1 = r9.f48044a;	 Catch:{ Exception -> 0x017e }
            r2 = r8;	 Catch:{ Exception -> 0x017e }
            r5 = r0;	 Catch:{ Exception -> 0x017e }
            r1.m58105a(r2, r3, r4, r5, r6);	 Catch:{ Exception -> 0x017e }
            goto L_0x011d;	 Catch:{ Exception -> 0x017e }
        L_0x00f8:
            r2 = r9.f48044a;	 Catch:{ Exception -> 0x017e }
            r2 = r2.f48059k;	 Catch:{ Exception -> 0x017e }
            r2 = r2.contains(r7);	 Catch:{ Exception -> 0x017e }
            if (r2 != 0) goto L_0x011d;	 Catch:{ Exception -> 0x017e }
        L_0x0104:
            r2 = new org.json.JSONArray;	 Catch:{ Exception -> 0x017e }
            r2.<init>();	 Catch:{ Exception -> 0x017e }
            r3 = r9.f48044a;	 Catch:{ Exception -> 0x017e }
            r3 = r3.f48053e;	 Catch:{ Exception -> 0x017e }
            r4 = "ck";	 Catch:{ Exception -> 0x017e }
            r3.put(r4, r2);	 Catch:{ Exception -> 0x017e }
            r3 = r9.f48044a;	 Catch:{ Exception -> 0x017e }
            r4 = r0.getResources();	 Catch:{ Exception -> 0x017e }
            r3.m58100a(r1, r2, r4);	 Catch:{ Exception -> 0x017e }
        L_0x011d:
            r1 = r9.f48044a;	 Catch:{ Exception -> 0x017e }
            r1 = r1.f48059k;	 Catch:{ Exception -> 0x017e }
            r1.add(r7);	 Catch:{ Exception -> 0x017e }
            r1 = io.branch.referral.C15593m.m58388a(r0);	 Catch:{ Exception -> 0x017e }
            r2 = r9.f48044a;	 Catch:{ Exception -> 0x017e }
            r2 = r2.f48053e;	 Catch:{ Exception -> 0x017e }
            r1.m58411a(r2);	 Catch:{ Exception -> 0x017e }
            r1 = r9.f48044a;	 Catch:{ Exception -> 0x017e }
            r1 = r1.f48057i;	 Catch:{ Exception -> 0x017e }
            r1 = r1.m58130a(r0);	 Catch:{ Exception -> 0x017e }
            r1 = r1.m58122a();	 Catch:{ Exception -> 0x017e }
            r2 = r9.f48044a;	 Catch:{ Exception -> 0x017e }
            r3 = r9.f48044a;	 Catch:{ Exception -> 0x017e }
            r3 = r3.f48057i;	 Catch:{ Exception -> 0x017e }
            r0 = r3.m58130a(r0);	 Catch:{ Exception -> 0x017e }
            r0 = r0.m58123b();	 Catch:{ Exception -> 0x017e }
            r2.f48055g = r0;	 Catch:{ Exception -> 0x017e }
            r0 = r9.f48044a;	 Catch:{ Exception -> 0x017e }
            r0 = r0.f48054f;	 Catch:{ Exception -> 0x017e }
            r2 = r9.f48044a;	 Catch:{ Exception -> 0x017e }
            r2 = r2.f48055g;	 Catch:{ Exception -> 0x017e }
            if (r0 >= r2) goto L_0x017e;	 Catch:{ Exception -> 0x017e }
        L_0x0162:
            r0 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;	 Catch:{ Exception -> 0x017e }
            if (r1 < r0) goto L_0x017e;	 Catch:{ Exception -> 0x017e }
        L_0x0166:
            if (r8 == 0) goto L_0x017e;	 Catch:{ Exception -> 0x017e }
        L_0x0168:
            r0 = r8.length();	 Catch:{ Exception -> 0x017e }
            if (r0 <= 0) goto L_0x017e;	 Catch:{ Exception -> 0x017e }
        L_0x016e:
            r0 = r9.f48044a;	 Catch:{ Exception -> 0x017e }
            r0 = r0.f48050b;	 Catch:{ Exception -> 0x017e }
            r2 = r9.f48044a;	 Catch:{ Exception -> 0x017e }
            r2 = r2.f48060l;	 Catch:{ Exception -> 0x017e }
            r3 = (long) r1;	 Catch:{ Exception -> 0x017e }
            r0.postDelayed(r2, r3);	 Catch:{ Exception -> 0x017e }
        L_0x017e:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.branch.indexing.b.1.run():void");
        }
    }

    /* renamed from: io.branch.indexing.b$2 */
    class C155572 implements OnScrollChangedListener {
        /* renamed from: a */
        final /* synthetic */ C15560b f48045a;

        C155572(C15560b c15560b) {
            this.f48045a = c15560b;
        }

        public void onScrollChanged() {
            this.f48045a.f48050b.removeCallbacks(this.f48045a.f48062n);
            if (this.f48045a.f48055g > this.f48045a.f48054f) {
                this.f48045a.f48050b.postDelayed(this.f48045a.f48062n, 1500);
            }
        }
    }

    /* renamed from: io.branch.indexing.b$3 */
    class C155583 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C15560b f48046a;

        C155583(C15560b c15560b) {
            this.f48046a = c15560b;
        }

        public void run() {
            this.f48046a.f48060l.run();
        }
    }

    /* renamed from: io.branch.indexing.b$a */
    private class C15559a {
        /* renamed from: a */
        MessageDigest f48047a;
        /* renamed from: b */
        final /* synthetic */ C15560b f48048b;

        C15559a(io.branch.indexing.C15560b r1) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = this;
            r0.f48048b = r1;
            r0.<init>();
            r1 = "MD5";	 Catch:{ NoSuchAlgorithmException -> 0x000d }
            r1 = java.security.MessageDigest.getInstance(r1);	 Catch:{ NoSuchAlgorithmException -> 0x000d }
            r0.f48047a = r1;	 Catch:{ NoSuchAlgorithmException -> 0x000d }
        L_0x000d:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.branch.indexing.b.a.<init>(io.branch.indexing.b):void");
        }

        /* renamed from: a */
        String m58092a(String str) {
            String str2 = "";
            if (this.f48047a == null) {
                return str2;
            }
            this.f48047a.reset();
            this.f48047a.update(str.getBytes());
            return new String(this.f48047a.digest());
        }
    }

    /* renamed from: a */
    public static C15560b m58095a() {
        if (f48049a == null) {
            f48049a = new C15560b();
        }
        return f48049a;
    }

    private C15560b() {
    }

    /* renamed from: a */
    public void m58120a(Activity activity, String str) {
        this.f48057i = C15562c.m58127a((Context) activity);
        this.f48052d = str;
        str = this.f48057i.m58130a(activity);
        if (str != null) {
            if (str.m58126e() == null) {
                m58108b(activity);
            }
        } else if (TextUtils.isEmpty(this.f48052d) == null) {
            m58108b(activity);
        }
    }

    /* renamed from: a */
    public void m58119a(Activity activity) {
        if (!(this.f48051c == null || this.f48051c.get() == null || ((Activity) this.f48051c.get()).getClass().getName().equals(activity.getClass().getName()) == null)) {
            this.f48050b.removeCallbacks(this.f48060l);
            this.f48051c = null;
        }
        m58107b();
        for (WeakReference weakReference : this.f48058j.values()) {
            ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnScrollChangedListener(this.f48061m);
            }
        }
        this.f48058j.clear();
    }

    /* renamed from: b */
    public void m58121b(Activity activity, String str) {
        this.f48059k = new ArrayList();
        m58120a(activity, str);
    }

    /* renamed from: b */
    private void m58108b(Activity activity) {
        this.f48054f = 0;
        if (this.f48059k.size() < this.f48057i.m58135d()) {
            this.f48050b.removeCallbacks(this.f48060l);
            this.f48051c = new WeakReference(activity);
            this.f48050b.postDelayed(this.f48060l, 1000);
        }
    }

    /* renamed from: b */
    private void m58107b() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = r4.f48053e;	 Catch:{ JSONException -> 0x000f }
        if (r0 == 0) goto L_0x000f;	 Catch:{ JSONException -> 0x000f }
    L_0x0004:
        r0 = r4.f48053e;	 Catch:{ JSONException -> 0x000f }
        r1 = "tc";	 Catch:{ JSONException -> 0x000f }
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ JSONException -> 0x000f }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x000f }
    L_0x000f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.indexing.b.b():void");
    }

    /* renamed from: a */
    private void m58100a(ViewGroup viewGroup, JSONArray jSONArray, Resources resources) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                if (!(childAt instanceof AbsListView)) {
                    if (!childAt.getClass().getSimpleName().equals("RecyclerView")) {
                        if (childAt instanceof ViewGroup) {
                            m58100a((ViewGroup) childAt, jSONArray, resources);
                        } else if (childAt instanceof TextView) {
                            jSONArray.put(m58096a(childAt, resources));
                        }
                    }
                }
                m58099a((ViewGroup) childAt, resources, jSONArray);
            }
        }
    }

    /* renamed from: a */
    private void m58099a(ViewGroup viewGroup, Resources resources, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        if (viewGroup != null && viewGroup.getChildCount() > -1) {
            int i = 1;
            if (viewGroup.getChildCount() <= 1) {
                i = 0;
            }
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                JSONArray jSONArray2 = new JSONArray();
                try {
                    jSONObject.put(m58096a((View) viewGroup, resources), jSONArray2);
                } catch (ViewGroup viewGroup2) {
                    viewGroup2.printStackTrace();
                }
                if ((childAt instanceof ViewGroup) != null) {
                    m58100a((ViewGroup) childAt, jSONArray2, resources);
                } else if ((childAt instanceof TextView) != null) {
                    jSONArray2.put(m58096a(childAt, resources));
                }
                if (jSONObject.length() > null) {
                    viewGroup2 = new StringBuilder();
                    viewGroup2.append("$");
                    viewGroup2.append(jSONObject);
                    jSONArray.put(viewGroup2.toString());
                }
            }
        }
    }

    /* renamed from: a */
    private void m58105a(org.json.JSONArray r9, org.json.JSONArray r10, org.json.JSONArray r11, android.app.Activity r12, boolean r13) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r8 = this;
        r0 = 0;
    L_0x0001:
        r1 = r9.length();	 Catch:{ JSONException -> 0x003c }
        if (r0 >= r1) goto L_0x003c;	 Catch:{ JSONException -> 0x003c }
    L_0x0007:
        r3 = r9.getString(r0);	 Catch:{ JSONException -> 0x003c }
        r1 = "$";	 Catch:{ JSONException -> 0x003c }
        r1 = r3.startsWith(r1);	 Catch:{ JSONException -> 0x003c }
        if (r1 == 0) goto L_0x001c;	 Catch:{ JSONException -> 0x003c }
    L_0x0013:
        r2 = r8;	 Catch:{ JSONException -> 0x003c }
        r4 = r12;	 Catch:{ JSONException -> 0x003c }
        r5 = r13;	 Catch:{ JSONException -> 0x003c }
        r6 = r10;	 Catch:{ JSONException -> 0x003c }
        r7 = r11;	 Catch:{ JSONException -> 0x003c }
        r2.m58103a(r3, r4, r5, r6, r7);	 Catch:{ JSONException -> 0x003c }
        goto L_0x0039;	 Catch:{ JSONException -> 0x003c }
    L_0x001c:
        r1 = r12.getResources();	 Catch:{ JSONException -> 0x003c }
        r2 = r9.getString(r0);	 Catch:{ JSONException -> 0x003c }
        r4 = "id";	 Catch:{ JSONException -> 0x003c }
        r5 = r12.getPackageName();	 Catch:{ JSONException -> 0x003c }
        r1 = r1.getIdentifier(r2, r4, r5);	 Catch:{ JSONException -> 0x003c }
        r4 = r12.findViewById(r1);	 Catch:{ JSONException -> 0x003c }
        r2 = r8;	 Catch:{ JSONException -> 0x003c }
        r5 = r13;	 Catch:{ JSONException -> 0x003c }
        r6 = r10;	 Catch:{ JSONException -> 0x003c }
        r7 = r11;	 Catch:{ JSONException -> 0x003c }
        r2.m58104a(r3, r4, r5, r6, r7);	 Catch:{ JSONException -> 0x003c }
    L_0x0039:
        r0 = r0 + 1;
        goto L_0x0001;
    L_0x003c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.indexing.b.a(org.json.JSONArray, org.json.JSONArray, org.json.JSONArray, android.app.Activity, boolean):void");
    }

    /* renamed from: a */
    private void m58103a(String str, Activity activity, boolean z, JSONArray jSONArray, JSONArray jSONArray2) {
        JSONObject jSONObject = new JSONObject();
        jSONArray2.put(str);
        jSONArray.put(jSONObject);
        str = str.replace("$", "");
        try {
            jSONArray = new JSONObject(str);
            if (jSONArray.length() > null) {
                String str2 = (String) jSONArray.keys().next();
                int identifier = activity.getResources().getIdentifier(str2, "id", activity.getPackageName());
                View findViewById = activity.getCurrentFocus() != null ? activity.getCurrentFocus().findViewById(identifier) : null;
                if (findViewById == null) {
                    findViewById = activity.findViewById(identifier);
                }
                if (findViewById != null && (findViewById instanceof ViewGroup)) {
                    int i;
                    ViewGroup viewGroup = (ViewGroup) findViewById;
                    jSONArray2 = jSONArray.getJSONArray(str2);
                    int[] iArr = new int[jSONArray2.length()];
                    Object obj = null;
                    for (i = 0; i < jSONArray2.length(); i++) {
                        iArr[i] = activity.getResources().getIdentifier(jSONArray2.getString(i), "id", activity.getPackageName());
                    }
                    activity = (viewGroup instanceof AbsListView) != null ? ((AbsListView) viewGroup).getFirstVisiblePosition() : null;
                    for (i = 0; i < viewGroup.getChildCount(); i++) {
                        if (viewGroup.getChildAt(i) != null) {
                            JSONObject jSONObject2 = new JSONObject();
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("");
                            stringBuilder.append(i + activity);
                            jSONObject.put(stringBuilder.toString(), jSONObject2);
                            for (int i2 = 0; i2 < iArr.length; i2++) {
                                if (viewGroup.getChildAt(i) != null) {
                                    View findViewById2 = viewGroup.getChildAt(i).findViewById(iArr[i2]);
                                    if (findViewById2 instanceof TextView) {
                                        jSONObject2.put(jSONArray2.getString(i2), m58097a(findViewById2, z));
                                    }
                                }
                            }
                        }
                    }
                    if (!(jSONArray.has("bnc_esw") == null || jSONArray.getBoolean("bnc_esw") == null)) {
                        obj = 1;
                    }
                    if (obj != null && this.f48058j.containsKey(str) == null) {
                        viewGroup.getViewTreeObserver().addOnScrollChangedListener(this.f48061m);
                        this.f48058j.put(str, new WeakReference(viewGroup.getViewTreeObserver()));
                    }
                }
            }
        } catch (String str3) {
            str3.printStackTrace();
        }
    }

    /* renamed from: a */
    private java.lang.String m58096a(android.view.View r2, android.content.res.Resources r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = r2.getId();
        r0 = java.lang.String.valueOf(r0);
        r2 = r2.getId();	 Catch:{ Exception -> 0x0011 }
        r2 = r3.getResourceEntryName(r2);	 Catch:{ Exception -> 0x0011 }
        goto L_0x0012;
    L_0x0011:
        r2 = r0;
    L_0x0012:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.indexing.b.a(android.view.View, android.content.res.Resources):java.lang.String");
    }

    /* renamed from: a */
    private String m58097a(View view, boolean z) {
        TextView textView = (TextView) view;
        if (textView.getText() == null) {
            return null;
        }
        view = textView.getText().toString().substring(0, Math.min(textView.getText().toString().length(), this.f48057i.m58133b()));
        return z ? view : this.f48056h.m58092a(view);
    }

    /* renamed from: a */
    private void m58104a(String str, View view, boolean z, JSONArray jSONArray, JSONArray jSONArray2) {
        if (view instanceof TextView) {
            jSONArray.put(m58097a(view, z));
            jSONArray2.put(str);
        }
    }

    /* renamed from: a */
    public JSONObject m58118a(Context context) {
        JSONObject jSONObject;
        JSONObject C = C15593m.m58388a(context).m58396C();
        if (C.length() <= 0 || C.toString().length() >= this.f48057i.m58134c()) {
            jSONObject = null;
        } else {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("mv", C15562c.m58127a(context).m58136e()).put("e", C);
                if (context != null) {
                    jSONObject.put(BuildConfig.LEANPLUM_PACKAGE_IDENTIFIER, context.getPackageName());
                    jSONObject.put(BuildConfig.LEANPLUM_PACKAGE_IDENTIFIER, context.getPackageName());
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        C15593m.m58388a(context).m58397D();
        return jSONObject;
    }
}
