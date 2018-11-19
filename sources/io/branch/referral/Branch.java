package io.branch.referral;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Log;
import io.branch.indexing.BranchUniversalObject;
import io.branch.indexing.BranchUniversalObject.RegisterViewStatusListener;
import io.branch.referral.Defines.Jsonkey;
import io.branch.referral.ServerRequest.PROCESS_WAIT_LOCK;
import io.branch.referral.network.BranchRemoteInterface;
import io.branch.referral.util.BRANCH_STANDARD_EVENT;
import io.branch.referral.util.C15599a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import org.json.JSONException;
import org.json.JSONObject;

public class Branch implements BranchViewHandler$IBranchViewEvents, InstallListener$a, aa$a {
    /* renamed from: C */
    private static Branch$CUSTOM_REFERRABLE_SETTINGS f12566C = Branch$CUSTOM_REFERRABLE_SETTINGS.USE_DEFAULT;
    /* renamed from: F */
    private static String f12567F = "app.link";
    /* renamed from: G */
    private static int f12568G = 2500;
    /* renamed from: H */
    private static final String[] f12569H = new String[]{"extra_launch_uri", "branch_intent"};
    /* renamed from: M */
    private static boolean f12570M = true;
    /* renamed from: a */
    static boolean f12571a = false;
    /* renamed from: b */
    static Boolean f12572b = null;
    /* renamed from: c */
    static boolean f12573c = true;
    /* renamed from: j */
    private static boolean f12574j = false;
    /* renamed from: l */
    private static long f12575l = 1500;
    /* renamed from: m */
    private static Branch f12576m = null;
    /* renamed from: w */
    private static boolean f12577w = false;
    /* renamed from: x */
    private static boolean f12578x = false;
    /* renamed from: A */
    private Branch$SESSION_STATE f12579A = Branch$SESSION_STATE.UNINITIALISED;
    /* renamed from: B */
    private ShareLinkManager f12580B;
    /* renamed from: D */
    private final ConcurrentHashMap<String, String> f12581D;
    /* renamed from: E */
    private boolean f12582E = false;
    /* renamed from: I */
    private CountDownLatch f12583I = null;
    /* renamed from: J */
    private CountDownLatch f12584J = null;
    /* renamed from: K */
    private boolean f12585K = false;
    /* renamed from: L */
    private boolean f12586L = false;
    /* renamed from: N */
    private final ab f12587N;
    /* renamed from: d */
    final Object f12588d;
    /* renamed from: e */
    WeakReference<Activity> f12589e;
    /* renamed from: f */
    boolean f12590f = false;
    /* renamed from: g */
    String f12591g;
    /* renamed from: h */
    boolean f12592h = false;
    /* renamed from: i */
    private JSONObject f12593i;
    /* renamed from: k */
    private boolean f12594k = false;
    /* renamed from: n */
    private BranchRemoteInterface f12595n;
    /* renamed from: o */
    private C15593m f12596o;
    /* renamed from: p */
    private final aa f12597p;
    /* renamed from: q */
    private Context f12598q;
    /* renamed from: r */
    private Semaphore f12599r;
    /* renamed from: s */
    private final C15596u f12600s;
    /* renamed from: t */
    private int f12601t;
    /* renamed from: u */
    private boolean f12602u;
    /* renamed from: v */
    private Map<C15584f, String> f12603v;
    /* renamed from: y */
    private Branch$INTENT_STATE f12604y = Branch$INTENT_STATE.PENDING;
    /* renamed from: z */
    private boolean f12605z = false;

    public void onBranchViewVisible(String str, String str2) {
    }

    private Branch(@NonNull Context context) {
        this.f12596o = C15593m.a(context);
        this.f12587N = new ab(context);
        this.f12595n = BranchRemoteInterface.a(context);
        this.f12597p = new aa(context);
        this.f12600s = C15596u.a(context);
        this.f12599r = new Semaphore(1);
        this.f12588d = new Object();
        this.f12601t = 0;
        this.f12602u = true;
        this.f12603v = new HashMap();
        this.f12581D = new ConcurrentHashMap();
        if (this.f12587N.a() == null) {
            this.f12582E = this.f12597p.a(this);
        }
        if (VERSION.SDK_INT >= 15) {
            this.f12605z = true;
            this.f12604y = Branch$INTENT_STATE.PENDING;
            return;
        }
        this.f12605z = false;
        this.f12604y = Branch$INTENT_STATE.READY;
    }

    /* renamed from: a */
    public boolean m15258a() {
        return this.f12587N.a();
    }

    @TargetApi(14)
    /* renamed from: b */
    public static Branch m15210b() {
        if (f12576m == null) {
            Log.e("BranchSDK", "Branch instance is not created yet. Make sure you have initialised Branch. [Consider Calling getInstance(Context ctx) if you still have issue.]");
        } else if (f12577w && !f12578x) {
            Log.e("BranchSDK", "Branch instance is not properly initialised. Make sure your Application class is extending BranchApp class. If you are not extending BranchApp class make sure you are initialising Branch in your Applications onCreate()");
        }
        return f12576m;
    }

    /* renamed from: a */
    private static io.branch.referral.Branch m15189a(@android.support.annotation.NonNull android.content.Context r3, boolean r4, java.lang.String r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = f12576m;
        if (r0 != 0) goto L_0x0088;
    L_0x0004:
        r0 = m15228d(r3);
        f12576m = r0;
        r0 = android.text.TextUtils.isEmpty(r5);
        if (r0 == 0) goto L_0x0018;
    L_0x0010:
        r5 = f12576m;
        r5 = r5.f12596o;
        r5 = r5.a(r4);
    L_0x0018:
        if (r5 == 0) goto L_0x002c;
    L_0x001a:
        r4 = "bnc_no_value";
        r4 = r5.equalsIgnoreCase(r4);
        if (r4 == 0) goto L_0x0023;
    L_0x0022:
        goto L_0x002c;
    L_0x0023:
        r4 = f12576m;
        r4 = r4.f12596o;
        r4 = r4.b(r5);
        goto L_0x0062;
    L_0x002c:
        r4 = 0;
        r5 = r3.getResources();	 Catch:{ Exception -> 0x0042 }
        r0 = "io.branch.apiKey";	 Catch:{ Exception -> 0x0042 }
        r1 = "string";	 Catch:{ Exception -> 0x0042 }
        r2 = r3.getPackageName();	 Catch:{ Exception -> 0x0042 }
        r0 = r5.getIdentifier(r0, r1, r2);	 Catch:{ Exception -> 0x0042 }
        r5 = r5.getString(r0);	 Catch:{ Exception -> 0x0042 }
        r4 = r5;
    L_0x0042:
        r5 = android.text.TextUtils.isEmpty(r4);
        if (r5 != 0) goto L_0x0051;
    L_0x0048:
        r5 = f12576m;
        r5 = r5.f12596o;
        r4 = r5.b(r4);
        goto L_0x0062;
    L_0x0051:
        r4 = "BranchSDK";
        r5 = "Branch Warning: Please enter your branch_key in your project's Manifest file!";
        android.util.Log.i(r4, r5);
        r4 = f12576m;
        r4 = r4.f12596o;
        r5 = "bnc_no_value";
        r4 = r4.b(r5);
    L_0x0062:
        if (r4 == 0) goto L_0x0072;
    L_0x0064:
        r4 = f12576m;
        r4 = r4.f12603v;
        r4.clear();
        r4 = f12576m;
        r4 = r4.f12600s;
        r4.d();
    L_0x0072:
        r4 = f12576m;
        r5 = r3.getApplicationContext();
        r4.f12598q = r5;
        r4 = r3 instanceof android.app.Application;
        if (r4 == 0) goto L_0x0088;
    L_0x007e:
        r4 = 1;
        f12577w = r4;
        r4 = f12576m;
        r3 = (android.app.Application) r3;
        r4.m15194a(r3);
    L_0x0088:
        r3 = f12576m;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.Branch.a(android.content.Context, boolean, java.lang.String):io.branch.referral.Branch");
    }

    /* renamed from: a */
    public static Branch m15188a(@NonNull Context context) {
        return m15189a(context, true, null);
    }

    /* renamed from: b */
    public static Branch m15211b(@NonNull Context context) {
        return m15189a(context, false, null);
    }

    @TargetApi(14)
    /* renamed from: c */
    public static Branch m15222c(@NonNull Context context) {
        f12577w = true;
        f12566C = Branch$CUSTOM_REFERRABLE_SETTINGS.USE_DEFAULT;
        m15189a(context, true ^ C2666j.m10266a(context), null);
        return f12576m;
    }

    /* renamed from: d */
    private static Branch m15228d(@NonNull Context context) {
        return new Branch(context.getApplicationContext());
    }

    /* renamed from: c */
    public static boolean m15227c() {
        return f12574j;
    }

    /* renamed from: a */
    public boolean m15260a(Branch$BranchReferralInitListener branch$BranchReferralInitListener, Activity activity) {
        if (f12566C == Branch$CUSTOM_REFERRABLE_SETTINGS.USE_DEFAULT) {
            m15195a(branch$BranchReferralInitListener, activity, true);
        } else {
            m15195a(branch$BranchReferralInitListener, activity, f12566C == Branch$CUSTOM_REFERRABLE_SETTINGS.REFERRABLE);
        }
        return true;
    }

    /* renamed from: a */
    public boolean m15261a(Branch$BranchReferralInitListener branch$BranchReferralInitListener, Uri uri, Activity activity) {
        m15218b(uri, activity);
        return m15260a(branch$BranchReferralInitListener, activity);
    }

    /* renamed from: a */
    public boolean m15259a(Uri uri, Activity activity) {
        m15218b(uri, activity);
        return m15260a((Branch$BranchReferralInitListener) null, activity);
    }

    /* renamed from: a */
    private void m15195a(Branch$BranchReferralInitListener branch$BranchReferralInitListener, Activity activity, boolean z) {
        if (activity != null) {
            this.f12589e = new WeakReference(activity);
        }
        if (m15247q() == null || m15244o() == null || this.f12579A != Branch$SESSION_STATE.INITIALISED) {
            if (!(this.f12592h == null || m15206a(branch$BranchReferralInitListener) == null)) {
                m15255a(Jsonkey.InstantDeepLinkSession.getKey(), "true");
                this.f12592h = false;
                m15249s();
            }
            if (z) {
                this.f12596o.y();
            } else {
                this.f12596o.z();
            }
            if (this.f12579A != Branch$SESSION_STATE.INITIALISING) {
                this.f12579A = Branch$SESSION_STATE.INITIALISING;
                m15215b(branch$BranchReferralInitListener);
                return;
            } else if (branch$BranchReferralInitListener != null) {
                this.f12600s.a(branch$BranchReferralInitListener);
                return;
            } else {
                return;
            }
        }
        m15206a(branch$BranchReferralInitListener);
        this.f12592h = false;
    }

    /* renamed from: a */
    private boolean m15206a(Branch$BranchReferralInitListener branch$BranchReferralInitListener) {
        if (branch$BranchReferralInitListener != null) {
            if (!f12577w) {
                branch$BranchReferralInitListener.onInitFinished(new JSONObject(), null);
            } else if (this.f12590f) {
                branch$BranchReferralInitListener.onInitFinished(new JSONObject(), null);
            } else {
                branch$BranchReferralInitListener.onInitFinished(m15267i(), null);
                this.f12590f = true;
            }
        }
        return this.f12590f;
    }

    /* renamed from: d */
    void m15262d() {
        m15238l();
        this.f12591g = null;
        this.f12587N.a(this.f12598q);
    }

    /* renamed from: l */
    private void m15238l() {
        if (this.f12579A != Branch$SESSION_STATE.UNINITIALISED) {
            if (!this.f12602u) {
                ServerRequest c = this.f12600s.c();
                if ((c != null && (c instanceof C18328x)) || (c instanceof C18329y)) {
                    this.f12600s.b();
                }
            } else if (!this.f12600s.e()) {
                m15254a(new C17319w(this.f12598q));
            }
            this.f12579A = Branch$SESSION_STATE.UNINITIALISED;
        }
    }

    /* renamed from: b */
    private boolean m15218b(android.net.Uri r11, android.app.Activity r12) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r10 = this;
        r0 = f12570M;
        r1 = 0;
        r2 = 1;
        if (r0 != 0) goto L_0x00b7;
    L_0x0006:
        r0 = r10.f12604y;
        r3 = io.branch.referral.Branch$INTENT_STATE.READY;
        if (r0 == r3) goto L_0x0010;
    L_0x000c:
        r0 = r10.f12586L;
        if (r0 == 0) goto L_0x00b7;
    L_0x0010:
        if (r12 == 0) goto L_0x00b7;
    L_0x0012:
        r0 = r12.getIntent();
        if (r0 == 0) goto L_0x00b7;
    L_0x0018:
        r0 = r10.f12579A;
        r3 = io.branch.referral.Branch$SESSION_STATE.INITIALISED;
        if (r0 == r3) goto L_0x00b7;
    L_0x001e:
        r0 = r12.getIntent();
        r0 = r10.m15205a(r0);
        if (r0 != 0) goto L_0x00b7;
    L_0x0028:
        r0 = r12.getIntent();
        r3 = r0.getData();
        if (r3 == 0) goto L_0x0082;
    L_0x0032:
        r3 = r10.f12586L;
        if (r3 != 0) goto L_0x003d;
    L_0x0036:
        r3 = r10.m15204a(r12);
        if (r3 == 0) goto L_0x003d;
    L_0x003c:
        goto L_0x0082;
    L_0x003d:
        r3 = io.branch.referral.Defines.Jsonkey.BranchData;
        r3 = r3.getKey();
        r3 = r0.getStringExtra(r3);
        r3 = android.text.TextUtils.isEmpty(r3);
        if (r3 != 0) goto L_0x00b7;
    L_0x004d:
        r3 = io.branch.referral.Defines.Jsonkey.BranchData;	 Catch:{ JSONException -> 0x0071 }
        r3 = r3.getKey();	 Catch:{ JSONException -> 0x0071 }
        r3 = r0.getStringExtra(r3);	 Catch:{ JSONException -> 0x0071 }
        r4 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0071 }
        r4.<init>(r3);	 Catch:{ JSONException -> 0x0071 }
        r3 = io.branch.referral.Defines.Jsonkey.Clicked_Branch_Link;	 Catch:{ JSONException -> 0x0071 }
        r3 = r3.getKey();	 Catch:{ JSONException -> 0x0071 }
        r4.put(r3, r2);	 Catch:{ JSONException -> 0x0071 }
        r3 = r10.f12596o;	 Catch:{ JSONException -> 0x0071 }
        r4 = r4.toString();	 Catch:{ JSONException -> 0x0071 }
        r3.o(r4);	 Catch:{ JSONException -> 0x0071 }
        r10.f12592h = r2;	 Catch:{ JSONException -> 0x0071 }
        goto L_0x0075;
    L_0x0071:
        r3 = move-exception;
        r3.printStackTrace();
    L_0x0075:
        r3 = io.branch.referral.Defines.Jsonkey.BranchData;
        r3 = r3.getKey();
        r0.removeExtra(r3);
        r12.setIntent(r0);
        goto L_0x00b7;
    L_0x0082:
        r0 = r10.f12596o;
        r0 = r0.v();
        r3 = "bnc_no_value";
        r0 = r0.equals(r3);
        if (r0 != 0) goto L_0x00b7;
    L_0x0090:
        r0 = new org.json.JSONObject;
        r0.<init>();
        r3 = io.branch.referral.Defines.Jsonkey.Clicked_Branch_Link;	 Catch:{ JSONException -> 0x00b3 }
        r3 = r3.getKey();	 Catch:{ JSONException -> 0x00b3 }
        r0.put(r3, r1);	 Catch:{ JSONException -> 0x00b3 }
        r3 = io.branch.referral.Defines.Jsonkey.IsFirstSession;	 Catch:{ JSONException -> 0x00b3 }
        r3 = r3.getKey();	 Catch:{ JSONException -> 0x00b3 }
        r0.put(r3, r1);	 Catch:{ JSONException -> 0x00b3 }
        r3 = r10.f12596o;	 Catch:{ JSONException -> 0x00b3 }
        r0 = r0.toString();	 Catch:{ JSONException -> 0x00b3 }
        r3.o(r0);	 Catch:{ JSONException -> 0x00b3 }
        r10.f12592h = r2;	 Catch:{ JSONException -> 0x00b3 }
        goto L_0x00b7;
    L_0x00b3:
        r0 = move-exception;
        r0.printStackTrace();
    L_0x00b7:
        r0 = r10.f12604y;
        r3 = io.branch.referral.Branch$INTENT_STATE.READY;
        if (r0 != r3) goto L_0x02b0;
    L_0x00bd:
        if (r11 == 0) goto L_0x0136;
    L_0x00bf:
        r0 = r10.m15204a(r12);	 Catch:{ Exception -> 0x0136 }
        if (r0 != 0) goto L_0x0136;	 Catch:{ Exception -> 0x0136 }
    L_0x00c5:
        r0 = r10.f12598q;	 Catch:{ Exception -> 0x0136 }
        r0 = io.branch.referral.ac.a(r0);	 Catch:{ Exception -> 0x0136 }
        r3 = r11.toString();	 Catch:{ Exception -> 0x0136 }
        r0 = r0.b(r3);	 Catch:{ Exception -> 0x0136 }
        r10.f12591g = r0;	 Catch:{ Exception -> 0x0136 }
        r3 = r10.f12596o;	 Catch:{ Exception -> 0x0136 }
        r3.h(r0);	 Catch:{ Exception -> 0x0136 }
        if (r0 == 0) goto L_0x0136;	 Catch:{ Exception -> 0x0136 }
    L_0x00dc:
        r3 = r11.toString();	 Catch:{ Exception -> 0x0136 }
        r0 = r0.equals(r3);	 Catch:{ Exception -> 0x0136 }
        if (r0 == 0) goto L_0x0136;	 Catch:{ Exception -> 0x0136 }
    L_0x00e6:
        if (r12 == 0) goto L_0x0136;	 Catch:{ Exception -> 0x0136 }
    L_0x00e8:
        r0 = r12.getIntent();	 Catch:{ Exception -> 0x0136 }
        if (r0 == 0) goto L_0x0136;	 Catch:{ Exception -> 0x0136 }
    L_0x00ee:
        r0 = r12.getIntent();	 Catch:{ Exception -> 0x0136 }
        r0 = r0.getExtras();	 Catch:{ Exception -> 0x0136 }
        if (r0 == 0) goto L_0x0136;	 Catch:{ Exception -> 0x0136 }
    L_0x00f8:
        r0 = r12.getIntent();	 Catch:{ Exception -> 0x0136 }
        r0 = r0.getExtras();	 Catch:{ Exception -> 0x0136 }
        r3 = r0.keySet();	 Catch:{ Exception -> 0x0136 }
        r4 = r3.size();	 Catch:{ Exception -> 0x0136 }
        if (r4 <= 0) goto L_0x0136;	 Catch:{ Exception -> 0x0136 }
    L_0x010a:
        r4 = new org.json.JSONObject;	 Catch:{ Exception -> 0x0136 }
        r4.<init>();	 Catch:{ Exception -> 0x0136 }
        r5 = f12569H;	 Catch:{ Exception -> 0x0136 }
        r6 = r5.length;	 Catch:{ Exception -> 0x0136 }
        r7 = 0;	 Catch:{ Exception -> 0x0136 }
    L_0x0113:
        if (r7 >= r6) goto L_0x0127;	 Catch:{ Exception -> 0x0136 }
    L_0x0115:
        r8 = r5[r7];	 Catch:{ Exception -> 0x0136 }
        r9 = r3.contains(r8);	 Catch:{ Exception -> 0x0136 }
        if (r9 == 0) goto L_0x0124;	 Catch:{ Exception -> 0x0136 }
    L_0x011d:
        r9 = r0.get(r8);	 Catch:{ Exception -> 0x0136 }
        r4.put(r8, r9);	 Catch:{ Exception -> 0x0136 }
    L_0x0124:
        r7 = r7 + 1;	 Catch:{ Exception -> 0x0136 }
        goto L_0x0113;	 Catch:{ Exception -> 0x0136 }
    L_0x0127:
        r0 = r4.length();	 Catch:{ Exception -> 0x0136 }
        if (r0 <= 0) goto L_0x0136;	 Catch:{ Exception -> 0x0136 }
    L_0x012d:
        r0 = r10.f12596o;	 Catch:{ Exception -> 0x0136 }
        r3 = r4.toString();	 Catch:{ Exception -> 0x0136 }
        r0.i(r3);	 Catch:{ Exception -> 0x0136 }
    L_0x0136:
        if (r12 == 0) goto L_0x017e;
    L_0x0138:
        r0 = r12.getIntent();	 Catch:{ Exception -> 0x017e }
        if (r0 == 0) goto L_0x017e;	 Catch:{ Exception -> 0x017e }
    L_0x013e:
        r0 = r12.getIntent();	 Catch:{ Exception -> 0x017e }
        r0 = r0.getExtras();	 Catch:{ Exception -> 0x017e }
        if (r0 == 0) goto L_0x017e;	 Catch:{ Exception -> 0x017e }
    L_0x0148:
        r0 = r10.m15204a(r12);	 Catch:{ Exception -> 0x017e }
        if (r0 != 0) goto L_0x017e;	 Catch:{ Exception -> 0x017e }
    L_0x014e:
        r0 = r12.getIntent();	 Catch:{ Exception -> 0x017e }
        r0 = r0.getExtras();	 Catch:{ Exception -> 0x017e }
        r3 = io.branch.referral.Defines.Jsonkey.AndroidPushNotificationKey;	 Catch:{ Exception -> 0x017e }
        r3 = r3.getKey();	 Catch:{ Exception -> 0x017e }
        r0 = r0.getString(r3);	 Catch:{ Exception -> 0x017e }
        if (r0 == 0) goto L_0x017e;	 Catch:{ Exception -> 0x017e }
    L_0x0162:
        r3 = r0.length();	 Catch:{ Exception -> 0x017e }
        if (r3 <= 0) goto L_0x017e;	 Catch:{ Exception -> 0x017e }
    L_0x0168:
        r3 = r10.f12596o;	 Catch:{ Exception -> 0x017e }
        r3.n(r0);	 Catch:{ Exception -> 0x017e }
        r0 = r12.getIntent();	 Catch:{ Exception -> 0x017e }
        r3 = io.branch.referral.Defines.Jsonkey.BranchLinkUsed;	 Catch:{ Exception -> 0x017e }
        r3 = r3.getKey();	 Catch:{ Exception -> 0x017e }
        r0.putExtra(r3, r2);	 Catch:{ Exception -> 0x017e }
        r12.setIntent(r0);	 Catch:{ Exception -> 0x017e }
        return r1;
    L_0x017e:
        if (r11 == 0) goto L_0x02b0;
    L_0x0180:
        r0 = r11.isHierarchical();
        if (r0 == 0) goto L_0x02b0;
    L_0x0186:
        if (r12 == 0) goto L_0x02b0;
    L_0x0188:
        r0 = r10.m15217b(r12);
        if (r0 != 0) goto L_0x02b0;
    L_0x018e:
        r0 = io.branch.referral.Defines.Jsonkey.LinkClickID;	 Catch:{ Exception -> 0x02b0 }
        r0 = r0.getKey();	 Catch:{ Exception -> 0x02b0 }
        r0 = r11.getQueryParameter(r0);	 Catch:{ Exception -> 0x02b0 }
        if (r0 == 0) goto L_0x0250;	 Catch:{ Exception -> 0x02b0 }
    L_0x019a:
        r0 = r10.f12596o;	 Catch:{ Exception -> 0x02b0 }
        r3 = io.branch.referral.Defines.Jsonkey.LinkClickID;	 Catch:{ Exception -> 0x02b0 }
        r3 = r3.getKey();	 Catch:{ Exception -> 0x02b0 }
        r3 = r11.getQueryParameter(r3);	 Catch:{ Exception -> 0x02b0 }
        r0.j(r3);	 Catch:{ Exception -> 0x02b0 }
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x02b0 }
        r0.<init>();	 Catch:{ Exception -> 0x02b0 }
        r3 = "link_click_id=";	 Catch:{ Exception -> 0x02b0 }
        r0.append(r3);	 Catch:{ Exception -> 0x02b0 }
        r3 = io.branch.referral.Defines.Jsonkey.LinkClickID;	 Catch:{ Exception -> 0x02b0 }
        r3 = r3.getKey();	 Catch:{ Exception -> 0x02b0 }
        r3 = r11.getQueryParameter(r3);	 Catch:{ Exception -> 0x02b0 }
        r0.append(r3);	 Catch:{ Exception -> 0x02b0 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x02b0 }
        r3 = 0;	 Catch:{ Exception -> 0x02b0 }
        r4 = r12.getIntent();	 Catch:{ Exception -> 0x02b0 }
        if (r4 == 0) goto L_0x01d3;	 Catch:{ Exception -> 0x02b0 }
    L_0x01cb:
        r3 = r12.getIntent();	 Catch:{ Exception -> 0x02b0 }
        r3 = r3.getDataString();	 Catch:{ Exception -> 0x02b0 }
    L_0x01d3:
        r11 = r11.getQuery();	 Catch:{ Exception -> 0x02b0 }
        r11 = r11.length();	 Catch:{ Exception -> 0x02b0 }
        r4 = r0.length();	 Catch:{ Exception -> 0x02b0 }
        if (r11 != r4) goto L_0x01f3;	 Catch:{ Exception -> 0x02b0 }
    L_0x01e1:
        r11 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x02b0 }
        r11.<init>();	 Catch:{ Exception -> 0x02b0 }
        r4 = "\\?";	 Catch:{ Exception -> 0x02b0 }
        r11.append(r4);	 Catch:{ Exception -> 0x02b0 }
        r11.append(r0);	 Catch:{ Exception -> 0x02b0 }
        r11 = r11.toString();	 Catch:{ Exception -> 0x02b0 }
        goto L_0x0227;	 Catch:{ Exception -> 0x02b0 }
    L_0x01f3:
        if (r3 == 0) goto L_0x0216;	 Catch:{ Exception -> 0x02b0 }
    L_0x01f5:
        r11 = r3.length();	 Catch:{ Exception -> 0x02b0 }
        r4 = r0.length();	 Catch:{ Exception -> 0x02b0 }
        r11 = r11 - r4;	 Catch:{ Exception -> 0x02b0 }
        r4 = r3.indexOf(r0);	 Catch:{ Exception -> 0x02b0 }
        if (r11 != r4) goto L_0x0216;	 Catch:{ Exception -> 0x02b0 }
    L_0x0204:
        r11 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x02b0 }
        r11.<init>();	 Catch:{ Exception -> 0x02b0 }
        r4 = "&";	 Catch:{ Exception -> 0x02b0 }
        r11.append(r4);	 Catch:{ Exception -> 0x02b0 }
        r11.append(r0);	 Catch:{ Exception -> 0x02b0 }
        r11 = r11.toString();	 Catch:{ Exception -> 0x02b0 }
        goto L_0x0227;	 Catch:{ Exception -> 0x02b0 }
    L_0x0216:
        r11 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x02b0 }
        r11.<init>();	 Catch:{ Exception -> 0x02b0 }
        r11.append(r0);	 Catch:{ Exception -> 0x02b0 }
        r0 = "&";	 Catch:{ Exception -> 0x02b0 }
        r11.append(r0);	 Catch:{ Exception -> 0x02b0 }
        r11 = r11.toString();	 Catch:{ Exception -> 0x02b0 }
    L_0x0227:
        if (r3 == 0) goto L_0x0248;	 Catch:{ Exception -> 0x02b0 }
    L_0x0229:
        r0 = "";	 Catch:{ Exception -> 0x02b0 }
        r11 = r3.replaceFirst(r11, r0);	 Catch:{ Exception -> 0x02b0 }
        r11 = android.net.Uri.parse(r11);	 Catch:{ Exception -> 0x02b0 }
        r0 = r12.getIntent();	 Catch:{ Exception -> 0x02b0 }
        r0.setData(r11);	 Catch:{ Exception -> 0x02b0 }
        r11 = r12.getIntent();	 Catch:{ Exception -> 0x02b0 }
        r12 = io.branch.referral.Defines.Jsonkey.BranchLinkUsed;	 Catch:{ Exception -> 0x02b0 }
        r12 = r12.getKey();	 Catch:{ Exception -> 0x02b0 }
        r11.putExtra(r12, r2);	 Catch:{ Exception -> 0x02b0 }
        goto L_0x024f;	 Catch:{ Exception -> 0x02b0 }
    L_0x0248:
        r11 = "BranchSDK";	 Catch:{ Exception -> 0x02b0 }
        r12 = "Branch Warning. URI for the launcher activity is null. Please make sure that intent data is not set to null before calling Branch#InitSession ";	 Catch:{ Exception -> 0x02b0 }
        android.util.Log.w(r11, r12);	 Catch:{ Exception -> 0x02b0 }
    L_0x024f:
        return r2;	 Catch:{ Exception -> 0x02b0 }
    L_0x0250:
        r0 = r11.getScheme();	 Catch:{ Exception -> 0x02b0 }
        r3 = r12.getIntent();	 Catch:{ Exception -> 0x02b0 }
        if (r0 == 0) goto L_0x02b0;	 Catch:{ Exception -> 0x02b0 }
    L_0x025a:
        if (r3 == 0) goto L_0x02b0;	 Catch:{ Exception -> 0x02b0 }
    L_0x025c:
        r4 = "http";	 Catch:{ Exception -> 0x02b0 }
        r4 = r0.equalsIgnoreCase(r4);	 Catch:{ Exception -> 0x02b0 }
        if (r4 != 0) goto L_0x026c;	 Catch:{ Exception -> 0x02b0 }
    L_0x0264:
        r4 = "https";	 Catch:{ Exception -> 0x02b0 }
        r0 = r0.equalsIgnoreCase(r4);	 Catch:{ Exception -> 0x02b0 }
        if (r0 == 0) goto L_0x02b0;	 Catch:{ Exception -> 0x02b0 }
    L_0x026c:
        r0 = r11.getHost();	 Catch:{ Exception -> 0x02b0 }
        if (r0 == 0) goto L_0x02b0;	 Catch:{ Exception -> 0x02b0 }
    L_0x0272:
        r0 = r11.getHost();	 Catch:{ Exception -> 0x02b0 }
        r0 = r0.length();	 Catch:{ Exception -> 0x02b0 }
        if (r0 <= 0) goto L_0x02b0;	 Catch:{ Exception -> 0x02b0 }
    L_0x027c:
        r0 = r10.m15204a(r12);	 Catch:{ Exception -> 0x02b0 }
        if (r0 != 0) goto L_0x02b0;	 Catch:{ Exception -> 0x02b0 }
    L_0x0282:
        r0 = r10.f12598q;	 Catch:{ Exception -> 0x02b0 }
        r0 = io.branch.referral.ac.a(r0);	 Catch:{ Exception -> 0x02b0 }
        r4 = r11.toString();	 Catch:{ Exception -> 0x02b0 }
        r0 = r0.b(r4);	 Catch:{ Exception -> 0x02b0 }
        r4 = r11.toString();	 Catch:{ Exception -> 0x02b0 }
        r0 = r4.equalsIgnoreCase(r0);	 Catch:{ Exception -> 0x02b0 }
        if (r0 == 0) goto L_0x02a3;	 Catch:{ Exception -> 0x02b0 }
    L_0x029a:
        r0 = r10.f12596o;	 Catch:{ Exception -> 0x02b0 }
        r11 = r11.toString();	 Catch:{ Exception -> 0x02b0 }
        r0.m(r11);	 Catch:{ Exception -> 0x02b0 }
    L_0x02a3:
        r11 = io.branch.referral.Defines.Jsonkey.BranchLinkUsed;	 Catch:{ Exception -> 0x02b0 }
        r11 = r11.getKey();	 Catch:{ Exception -> 0x02b0 }
        r3.putExtra(r11, r2);	 Catch:{ Exception -> 0x02b0 }
        r12.setIntent(r3);	 Catch:{ Exception -> 0x02b0 }
        return r1;
    L_0x02b0:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.Branch.b(android.net.Uri, android.app.Activity):boolean");
    }

    /* renamed from: a */
    private boolean m15204a(Activity activity) {
        return (activity == null || activity.getIntent() == null || activity.getIntent().getBooleanExtra(Jsonkey.BranchLinkUsed.getKey(), false) == null) ? false : true;
    }

    /* renamed from: b */
    private boolean m15217b(Activity activity) {
        return (activity == null || activity.getIntent() == null || (activity.getIntent().getFlags() & 1048576) == null) ? null : true;
    }

    /* renamed from: e */
    public void mo2905e() {
        this.f12582E = false;
        this.f12600s.a(PROCESS_WAIT_LOCK.GAID_FETCH_WAIT_LOCK);
        if (this.f12585K) {
            m15248r();
            this.f12585K = false;
            return;
        }
        m15241m();
    }

    /* renamed from: f */
    public void mo2906f() {
        this.f12600s.a(PROCESS_WAIT_LOCK.INSTALL_REFERRER_FETCH_WAIT_LOCK);
        m15241m();
    }

    /* renamed from: a */
    public Branch m15251a(List<String> list) {
        if (list != null) {
            ac.a(this.f12598q).a(list);
        }
        return this;
    }

    /* renamed from: a */
    public Branch m15250a(String str) {
        if (!TextUtils.isEmpty(str)) {
            ac.a(this.f12598q).a(str);
        }
        return this;
    }

    /* renamed from: g */
    void m15265g() {
        ac.a(this.f12598q).b(this.f12598q);
    }

    /* renamed from: a */
    public void m15256a(@NonNull String str, JSONObject jSONObject) {
        m15257a(str, jSONObject, null);
    }

    /* renamed from: a */
    public void m15257a(@NonNull String str, JSONObject jSONObject, BranchViewHandler$IBranchViewEvents branchViewHandler$IBranchViewEvents) {
        if (jSONObject != null) {
            jSONObject = C2666j.m10269c(jSONObject);
        }
        ServerRequest c17309n = new C17309n(this.f12598q, str, jSONObject, branchViewHandler$IBranchViewEvents);
        if (c17309n.f48142e == null && c17309n.a(this.f12598q) == null) {
            m15254a(c17309n);
        }
    }

    /* renamed from: h */
    public JSONObject m15266h() {
        return m15191a(m15214b(this.f12596o.v()));
    }

    /* renamed from: i */
    public JSONObject m15267i() {
        return m15191a(m15214b(this.f12596o.u()));
    }

    /* renamed from: a */
    private org.json.JSONObject m15191a(org.json.JSONObject r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r3 = this;
        if (r4 == 0) goto L_0x0031;
    L_0x0002:
        r0 = r3.f12593i;	 Catch:{ Exception -> 0x0031 }
        if (r0 == 0) goto L_0x0031;	 Catch:{ Exception -> 0x0031 }
    L_0x0006:
        r0 = r3.f12593i;	 Catch:{ Exception -> 0x0031 }
        r0 = r0.length();	 Catch:{ Exception -> 0x0031 }
        if (r0 <= 0) goto L_0x0015;	 Catch:{ Exception -> 0x0031 }
    L_0x000e:
        r0 = "BranchSDK";	 Catch:{ Exception -> 0x0031 }
        r1 = "You're currently in deep link debug mode. Please comment out 'setDeepLinkDebugMode' to receive the deep link parameters from a real Branch link";	 Catch:{ Exception -> 0x0031 }
        android.util.Log.w(r0, r1);	 Catch:{ Exception -> 0x0031 }
    L_0x0015:
        r0 = r3.f12593i;	 Catch:{ Exception -> 0x0031 }
        r0 = r0.keys();	 Catch:{ Exception -> 0x0031 }
    L_0x001b:
        r1 = r0.hasNext();	 Catch:{ Exception -> 0x0031 }
        if (r1 == 0) goto L_0x0031;	 Catch:{ Exception -> 0x0031 }
    L_0x0021:
        r1 = r0.next();	 Catch:{ Exception -> 0x0031 }
        r1 = (java.lang.String) r1;	 Catch:{ Exception -> 0x0031 }
        r2 = r3.f12593i;	 Catch:{ Exception -> 0x0031 }
        r2 = r2.get(r1);	 Catch:{ Exception -> 0x0031 }
        r4.put(r1, r2);	 Catch:{ Exception -> 0x0031 }
        goto L_0x001b;
    L_0x0031:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.Branch.a(org.json.JSONObject):org.json.JSONObject");
    }

    /* renamed from: j */
    public JSONObject m15268j() {
        if (this.f12593i != null && this.f12593i.length() > 0) {
            Log.w("BranchSDK", "You're currently in deep link debug mode. Please comment out 'setDeepLinkDebugMode' to receive the deep link parameters from a real Branch link");
        }
        return this.f12593i;
    }

    /* renamed from: a */
    String m15252a(C17311o c17311o) {
        if (!(c17311o.e || c17311o.a(this.f12598q))) {
            if (this.f12603v.containsKey(c17311o.u())) {
                String str = (String) this.f12603v.get(c17311o.u());
                c17311o.a(str);
                return str;
            } else if (!c17311o.y()) {
                return m15213b(c17311o);
            } else {
                m15216b((ServerRequest) c17311o);
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m15197a(Branch$c branch$c) {
        if (this.f12580B != null) {
            this.f12580B.a(true);
        }
        this.f12580B = new ShareLinkManager();
        this.f12580B.a(branch$c);
    }

    /* renamed from: b */
    private java.lang.String m15213b(io.branch.referral.C17311o r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r5 = this;
        r0 = r5.f12587N;
        r0 = r0.a();
        if (r0 == 0) goto L_0x000d;
    L_0x0008:
        r6 = r6.w();
        return r6;
    L_0x000d:
        r0 = r5.f12579A;
        r1 = io.branch.referral.Branch$SESSION_STATE.INITIALISED;
        r2 = 0;
        if (r0 != r1) goto L_0x006d;
    L_0x0014:
        r0 = r5.f12596o;	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        r0 = r0.b();	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        r0 = r0 + 2000;	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        r1 = new io.branch.referral.Branch$d;	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        r1.<init>(r5, r2);	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        r3 = 1;	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        r3 = new io.branch.referral.ServerRequest[r3];	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        r4 = 0;	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        r3[r4] = r6;	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        r1 = r1.execute(r3);	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        r3 = (long) r0;	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        r0 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        r0 = r1.get(r3, r0);	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        r0 = (io.branch.referral.C15601z) r0;	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        goto L_0x0036;
    L_0x0035:
        r0 = r2;
    L_0x0036:
        r1 = r6.v();
        if (r1 == 0) goto L_0x0040;
    L_0x003c:
        r2 = r6.w();
    L_0x0040:
        if (r0 == 0) goto L_0x006c;
    L_0x0042:
        r1 = r0.a();
        r3 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r1 != r3) goto L_0x006c;
    L_0x004a:
        r0 = r0.b();	 Catch:{ JSONException -> 0x0068 }
        r1 = "url";	 Catch:{ JSONException -> 0x0068 }
        r0 = r0.getString(r1);	 Catch:{ JSONException -> 0x0068 }
        r1 = r6.u();	 Catch:{ JSONException -> 0x0065 }
        if (r1 == 0) goto L_0x0063;	 Catch:{ JSONException -> 0x0065 }
    L_0x005a:
        r1 = r5.f12603v;	 Catch:{ JSONException -> 0x0065 }
        r6 = r6.u();	 Catch:{ JSONException -> 0x0065 }
        r1.put(r6, r0);	 Catch:{ JSONException -> 0x0065 }
    L_0x0063:
        r2 = r0;
        goto L_0x006c;
    L_0x0065:
        r6 = move-exception;
        r2 = r0;
        goto L_0x0069;
    L_0x0068:
        r6 = move-exception;
    L_0x0069:
        r6.printStackTrace();
    L_0x006c:
        return r2;
    L_0x006d:
        r6 = "BranchSDK";
        r0 = "Branch Warning: User session has not been initialized";
        android.util.Log.i(r6, r0);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.Branch.b(io.branch.referral.o):java.lang.String");
    }

    /* renamed from: b */
    private void m15216b(ServerRequest serverRequest) {
        m15254a(serverRequest);
    }

    /* renamed from: b */
    private org.json.JSONObject m15214b(java.lang.String r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r2 = this;
        r0 = "bnc_no_value";
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x000e;
    L_0x0008:
        r3 = new org.json.JSONObject;
        r3.<init>();
        return r3;
    L_0x000e:
        r0 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0014 }
        r0.<init>(r3);	 Catch:{ JSONException -> 0x0014 }
        return r0;
    L_0x0014:
        r3 = r3.getBytes();
        r0 = 2;
        r3 = io.branch.referral.C15581c.a(r3, r0);
        r0 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0028 }
        r1 = new java.lang.String;	 Catch:{ JSONException -> 0x0028 }
        r1.<init>(r3);	 Catch:{ JSONException -> 0x0028 }
        r0.<init>(r1);	 Catch:{ JSONException -> 0x0028 }
        return r0;
    L_0x0028:
        r3 = move-exception;
        r3.printStackTrace();
        r3 = new org.json.JSONObject;
        r3.<init>();
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.Branch.b(java.lang.String):org.json.JSONObject");
    }

    /* renamed from: m */
    private void m15241m() {
        try {
            this.f12599r.acquire();
            if (this.f12601t != 0 || this.f12600s.a() <= 0) {
                this.f12599r.release();
                return;
            }
            this.f12601t = 1;
            ServerRequest c = this.f12600s.c();
            this.f12599r.release();
            if (c == null) {
                this.f12600s.b(null);
            } else if (c.p()) {
                this.f12601t = 0;
            } else if (!(c instanceof C18328x) && !m15247q()) {
                Log.i("BranchSDK", "Branch Error: User session has not been initialized!");
                this.f12601t = 0;
                m15192a(this.f12600s.a() - 1, -101);
            } else if ((c instanceof C17315s) || (m15244o() && m15246p())) {
                new Branch$b(this, c).a(new Void[0]);
            } else {
                this.f12601t = 0;
                m15192a(this.f12600s.a() - 1, -101);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m15192a(int i, int i2) {
        ServerRequest a;
        if (i >= this.f12600s.a()) {
            a = this.f12600s.a(this.f12600s.a() - 1);
        } else {
            a = this.f12600s.a(i);
        }
        m15202a(a, i2);
    }

    /* renamed from: a */
    private void m15202a(ServerRequest serverRequest, int i) {
        if (serverRequest != null) {
            serverRequest.a(i, "");
        }
    }

    /* renamed from: n */
    private void m15243n() {
        int i = 0;
        while (i < this.f12600s.a()) {
            try {
                ServerRequest a = this.f12600s.a(i);
                if (a != null) {
                    JSONObject h = a.h();
                    if (h != null) {
                        if (h.has(Jsonkey.SessionID.getKey())) {
                            a.h().put(Jsonkey.SessionID.getKey(), this.f12596o.h());
                        }
                        if (h.has(Jsonkey.IdentityID.getKey())) {
                            a.h().put(Jsonkey.IdentityID.getKey(), this.f12596o.i());
                        }
                        if (h.has(Jsonkey.DeviceFingerprintID.getKey())) {
                            a.h().put(Jsonkey.DeviceFingerprintID.getKey(), this.f12596o.g());
                        }
                    }
                }
                i++;
            } catch (JSONException e) {
                e.printStackTrace();
                return;
            }
        }
    }

    /* renamed from: o */
    private boolean m15244o() {
        return this.f12596o.h().equals("bnc_no_value") ^ 1;
    }

    /* renamed from: p */
    private boolean m15246p() {
        return this.f12596o.g().equals("bnc_no_value") ^ 1;
    }

    /* renamed from: q */
    private boolean m15247q() {
        return this.f12596o.i().equals("bnc_no_value") ^ 1;
    }

    /* renamed from: c */
    private void m15226c(ServerRequest serverRequest) {
        if (this.f12601t == 0) {
            this.f12600s.a(serverRequest, 0);
        } else {
            this.f12600s.a(serverRequest, 1);
        }
    }

    /* renamed from: a */
    private void m15203a(ServerRequest serverRequest, Branch$BranchReferralInitListener branch$BranchReferralInitListener) {
        if (this.f12600s.f()) {
            if (branch$BranchReferralInitListener != null) {
                this.f12600s.a(branch$BranchReferralInitListener);
            }
            this.f12600s.a(serverRequest, this.f12601t, branch$BranchReferralInitListener);
        } else {
            m15226c(serverRequest);
        }
        m15241m();
    }

    /* renamed from: b */
    private void m15215b(Branch$BranchReferralInitListener branch$BranchReferralInitListener) {
        if (this.f12596o.f() != null) {
            if (!this.f12596o.f().equalsIgnoreCase("bnc_no_value")) {
                if (this.f12596o.f() != null && this.f12596o.f().startsWith("key_test_")) {
                    Log.i("BranchSDK", "Branch Warning: You are using your test app's Branch Key. Remember to change it to live Branch Key during deployment.");
                }
                if (this.f12596o.m().equals("bnc_no_value")) {
                    if (this.f12594k) {
                        if (DeferredAppLinkDataHandler.a(this.f12598q, new Branch$1(this)).booleanValue()) {
                            m15196a(branch$BranchReferralInitListener, PROCESS_WAIT_LOCK.FB_APP_LINK_WAIT_LOCK);
                        } else {
                            m15196a(branch$BranchReferralInitListener, null);
                        }
                        return;
                    }
                }
                m15196a(branch$BranchReferralInitListener, null);
                return;
            }
        }
        this.f12579A = Branch$SESSION_STATE.UNINITIALISED;
        if (branch$BranchReferralInitListener != null) {
            branch$BranchReferralInitListener.onInitFinished(null, new C15583e("Trouble initializing Branch.", -114));
        }
        Log.i("BranchSDK", "Branch Warning: Please enter your branch_key in your project's res/values/strings.xml!");
    }

    /* renamed from: a */
    private void m15196a(Branch$BranchReferralInitListener branch$BranchReferralInitListener, PROCESS_WAIT_LOCK process_wait_lock) {
        ServerRequest c = m15223c(branch$BranchReferralInitListener);
        c.a(process_wait_lock);
        if (this.f12582E != null) {
            c.a(PROCESS_WAIT_LOCK.GAID_FETCH_WAIT_LOCK);
        }
        if (this.f12604y != Branch$INTENT_STATE.READY) {
            c.a(PROCESS_WAIT_LOCK.INTENT_PENDING_WAIT_LOCK);
        }
        if (!(f12573c == null || (c instanceof C18328x) == null || InstallListener.f48133a != null)) {
            c.a(PROCESS_WAIT_LOCK.INSTALL_REFERRER_FETCH_WAIT_LOCK);
            InstallListener.a(this.f12598q, f12575l, this);
        }
        m15203a(c, branch$BranchReferralInitListener);
    }

    /* renamed from: c */
    private ServerRequest m15223c(Branch$BranchReferralInitListener branch$BranchReferralInitListener) {
        if (m15247q()) {
            return new C18329y(this.f12598q, branch$BranchReferralInitListener, this.f12597p);
        }
        return new C18328x(this.f12598q, branch$BranchReferralInitListener, this.f12597p, InstallListener.a());
    }

    /* renamed from: a */
    private void m15193a(Activity activity, boolean z) {
        this.f12600s.a(PROCESS_WAIT_LOCK.INTENT_PENDING_WAIT_LOCK);
        if (z) {
            m15218b(activity.getIntent().getData(), activity);
            if (m15258a() != null || f12567F == null || this.f12596o.f() == null || this.f12596o.f().equalsIgnoreCase("bnc_no_value") != null) {
                m15241m();
                return;
            } else if (this.f12582E != null) {
                this.f12585K = true;
                return;
            } else {
                m15248r();
                return;
            }
        }
        m15241m();
    }

    /* renamed from: r */
    private void m15248r() {
        if (!this.f12587N.a()) {
            C15591k a = C15591k.a(this.f12596o.G(), this.f12597p, f12574j);
            Activity activity = this.f12589e != null ? (Activity) this.f12589e.get() : null;
            Context applicationContext = activity != null ? activity.getApplicationContext() : null;
            if (applicationContext != null) {
                this.f12600s.g();
                C15589h.a().a(applicationContext, f12567F, a, this.f12596o, this.f12597p, new Branch$2(this));
            }
        }
    }

    /* renamed from: a */
    public void m15254a(ServerRequest serverRequest) {
        if (this.f12587N.a()) {
            serverRequest.s();
            return;
        }
        if (!(this.f12579A == Branch$SESSION_STATE.INITIALISED || (serverRequest instanceof C17315s))) {
            if (serverRequest instanceof C17316t) {
                serverRequest.a(-101, "");
                Log.i("BranchSDK", "Branch is not initialized, cannot logout");
                return;
            } else if (serverRequest instanceof C17319w) {
                Log.i("BranchSDK", "Branch is not initialized, cannot close session");
                return;
            } else {
                Activity activity = this.f12589e != null ? (Activity) this.f12589e.get() : null;
                boolean z = true;
                if (f12566C == Branch$CUSTOM_REFERRABLE_SETTINGS.USE_DEFAULT) {
                    m15195a((Branch$BranchReferralInitListener) null, activity, true);
                } else {
                    if (f12566C != Branch$CUSTOM_REFERRABLE_SETTINGS.REFERRABLE) {
                        z = false;
                    }
                    m15195a((Branch$BranchReferralInitListener) null, activity, z);
                }
            }
        }
        this.f12600s.a(serverRequest);
        serverRequest.n();
        m15241m();
    }

    @android.annotation.TargetApi(14)
    /* renamed from: a */
    private void m15194a(android.app.Application r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r3 = this;
        r0 = new io.branch.referral.Branch$a;	 Catch:{ NoSuchMethodError -> 0x0010, NoSuchMethodError -> 0x0010 }
        r1 = 0;	 Catch:{ NoSuchMethodError -> 0x0010, NoSuchMethodError -> 0x0010 }
        r0.<init>(r3, r1);	 Catch:{ NoSuchMethodError -> 0x0010, NoSuchMethodError -> 0x0010 }
        r4.unregisterActivityLifecycleCallbacks(r0);	 Catch:{ NoSuchMethodError -> 0x0010, NoSuchMethodError -> 0x0010 }
        r4.registerActivityLifecycleCallbacks(r0);	 Catch:{ NoSuchMethodError -> 0x0010, NoSuchMethodError -> 0x0010 }
        r4 = 1;	 Catch:{ NoSuchMethodError -> 0x0010, NoSuchMethodError -> 0x0010 }
        f12578x = r4;	 Catch:{ NoSuchMethodError -> 0x0010, NoSuchMethodError -> 0x0010 }
        goto L_0x0027;
    L_0x0010:
        r4 = 0;
        f12578x = r4;
        f12577w = r4;
        r4 = "BranchSDK";
        r0 = new io.branch.referral.e;
        r1 = "";
        r2 = -108; // 0xffffffffffffff94 float:NaN double:NaN;
        r0.<init>(r1, r2);
        r0 = r0.a();
        android.util.Log.w(r4, r0);
    L_0x0027:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.Branch.a(android.app.Application):void");
    }

    /* renamed from: c */
    private void m15224c(Activity activity) {
        Uri data = activity.getIntent() != null ? activity.getIntent().getData() : null;
        this.f12590f = false;
        m15259a(data, activity);
    }

    /* renamed from: a */
    private boolean m15205a(android.content.Intent r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r3 = this;
        r0 = 0;
        if (r4 == 0) goto L_0x001b;
    L_0x0003:
        r1 = io.branch.referral.Defines.Jsonkey.ForceNewBranchSession;	 Catch:{ Throwable -> 0x000e }
        r1 = r1.getKey();	 Catch:{ Throwable -> 0x000e }
        r1 = r4.getBooleanExtra(r1, r0);	 Catch:{ Throwable -> 0x000e }
        goto L_0x000f;
    L_0x000e:
        r1 = 0;
    L_0x000f:
        if (r1 == 0) goto L_0x001a;
    L_0x0011:
        r2 = io.branch.referral.Defines.Jsonkey.ForceNewBranchSession;
        r2 = r2.getKey();
        r4.putExtra(r2, r0);
    L_0x001a:
        r0 = r1;
    L_0x001b:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.Branch.a(android.content.Intent):boolean");
    }

    /* renamed from: s */
    private void m15249s() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r9 = this;
        r0 = r9.m15267i();
        r1 = 0;
        r2 = io.branch.referral.Defines.Jsonkey.Clicked_Branch_Link;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r2 = r2.getKey();	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r2 = r0.has(r2);	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        if (r2 == 0) goto L_0x00ec;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x0011:
        r2 = io.branch.referral.Defines.Jsonkey.Clicked_Branch_Link;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r2 = r2.getKey();	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r2 = r0.getBoolean(r2);	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        if (r2 != 0) goto L_0x001f;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x001d:
        goto L_0x00ec;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x001f:
        r2 = r0.length();	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        if (r2 <= 0) goto L_0x010b;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x0025:
        r2 = r9.f12598q;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r2 = r2.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r3 = r9.f12598q;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r3 = r3.getPackageName();	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r4 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r2 = r2.getApplicationInfo(r3, r4);	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r3 = r2.metaData;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r4 = 0;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        if (r3 == 0) goto L_0x0047;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x003c:
        r2 = r2.metaData;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r3 = "io.branch.sdk.auto_link_disable";	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r2 = r2.getBoolean(r3, r4);	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        if (r2 == 0) goto L_0x0047;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x0046:
        return;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x0047:
        r2 = r9.f12598q;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r2 = r2.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r3 = r9.f12598q;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r3 = r3.getPackageName();	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r5 = 129; // 0x81 float:1.81E-43 double:6.37E-322;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r2 = r2.getPackageInfo(r3, r5);	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r2 = r2.activities;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r3 = 1501; // 0x5dd float:2.103E-42 double:7.416E-321;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        if (r2 == 0) goto L_0x009b;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x005f:
        r5 = r2.length;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x0060:
        if (r4 >= r5) goto L_0x009b;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x0062:
        r6 = r2[r4];	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        if (r6 == 0) goto L_0x0098;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x0066:
        r7 = r6.metaData;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        if (r7 == 0) goto L_0x0098;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x006a:
        r7 = r6.metaData;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r8 = "io.branch.sdk.auto_link_keys";	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r7 = r7.getString(r8);	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        if (r7 != 0) goto L_0x007e;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x0074:
        r7 = r6.metaData;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r8 = "io.branch.sdk.auto_link_path";	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r7 = r7.getString(r8);	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        if (r7 == 0) goto L_0x0098;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x007e:
        r7 = r9.m15209a(r0, r6);	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        if (r7 != 0) goto L_0x008a;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x0084:
        r7 = r9.m15221b(r0, r6);	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        if (r7 == 0) goto L_0x0098;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x008a:
        r2 = r6.name;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r1 = r6.metaData;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x0096, Exception -> 0x010b }
        r4 = "io.branch.sdk.auto_link_request_code";	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x0096, Exception -> 0x010b }
        r3 = r1.getInt(r4, r3);	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x0096, Exception -> 0x010b }
        r1 = r2;
        goto L_0x009b;
    L_0x0096:
        r1 = r2;
        goto L_0x00ed;
    L_0x0098:
        r4 = r4 + 1;
        goto L_0x0060;
    L_0x009b:
        if (r1 == 0) goto L_0x010b;
    L_0x009d:
        r2 = r9.f12589e;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        if (r2 == 0) goto L_0x010b;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x00a1:
        r2 = r9.f12589e;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r2 = r2.get();	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r2 = (android.app.Activity) r2;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        if (r2 == 0) goto L_0x00e4;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x00ab:
        r4 = new android.content.Intent;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r5 = java.lang.Class.forName(r1);	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r4.<init>(r2, r5);	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r5 = "io.branch.sdk.auto_linked";	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r6 = "true";	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r4.putExtra(r5, r6);	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r5 = io.branch.referral.Defines.Jsonkey.ReferringData;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r5 = r5.getKey();	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r6 = r0.toString();	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r4.putExtra(r5, r6);	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r5 = r0.keys();	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x00cc:
        r6 = r5.hasNext();	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        if (r6 == 0) goto L_0x00e0;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x00d2:
        r6 = r5.next();	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r6 = (java.lang.String) r6;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r7 = r0.getString(r6);	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r4.putExtra(r6, r7);	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        goto L_0x00cc;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x00e0:
        r2.startActivityForResult(r4, r3);	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        goto L_0x010b;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x00e4:
        r0 = "BranchSDK";	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r2 = "No activity reference to launch deep linked activity";	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        android.util.Log.w(r0, r2);	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        goto L_0x010b;
    L_0x00ec:
        return;
    L_0x00ed:
        r0 = "BranchSDK";
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Branch Warning: Please make sure Activity names set for auto deep link are correct! Error while looking for activity ";
        r2.append(r3);
        r2.append(r1);
        r1 = r2.toString();
        android.util.Log.i(r0, r1);
        goto L_0x010b;
    L_0x0104:
        r0 = "BranchSDK";
        r1 = "Branch Warning: Please make sure Activity names set for auto deep link are correct!";
        android.util.Log.i(r0, r1);
    L_0x010b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.Branch.s():void");
    }

    /* renamed from: a */
    private boolean m15209a(JSONObject jSONObject, ActivityInfo activityInfo) {
        if (activityInfo.metaData.getString("io.branch.sdk.auto_link_keys") != null) {
            for (String has : activityInfo.metaData.getString("io.branch.sdk.auto_link_keys").split(",")) {
                if (jSONObject.has(has)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private boolean m15221b(org.json.JSONObject r5, android.content.pm.ActivityInfo r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r4 = this;
        r0 = 0;
        r1 = io.branch.referral.Defines.Jsonkey.AndroidDeepLinkPath;	 Catch:{ JSONException -> 0x0030 }
        r1 = r1.getKey();	 Catch:{ JSONException -> 0x0030 }
        r1 = r5.has(r1);	 Catch:{ JSONException -> 0x0030 }
        if (r1 == 0) goto L_0x0019;	 Catch:{ JSONException -> 0x0030 }
    L_0x000d:
        r1 = io.branch.referral.Defines.Jsonkey.AndroidDeepLinkPath;	 Catch:{ JSONException -> 0x0030 }
        r1 = r1.getKey();	 Catch:{ JSONException -> 0x0030 }
        r5 = r5.getString(r1);	 Catch:{ JSONException -> 0x0030 }
    L_0x0017:
        r0 = r5;	 Catch:{ JSONException -> 0x0030 }
        goto L_0x0030;	 Catch:{ JSONException -> 0x0030 }
    L_0x0019:
        r1 = io.branch.referral.Defines.Jsonkey.DeepLinkPath;	 Catch:{ JSONException -> 0x0030 }
        r1 = r1.getKey();	 Catch:{ JSONException -> 0x0030 }
        r1 = r5.has(r1);	 Catch:{ JSONException -> 0x0030 }
        if (r1 == 0) goto L_0x0030;	 Catch:{ JSONException -> 0x0030 }
    L_0x0025:
        r1 = io.branch.referral.Defines.Jsonkey.DeepLinkPath;	 Catch:{ JSONException -> 0x0030 }
        r1 = r1.getKey();	 Catch:{ JSONException -> 0x0030 }
        r5 = r5.getString(r1);	 Catch:{ JSONException -> 0x0030 }
        goto L_0x0017;
    L_0x0030:
        r5 = r6.metaData;
        r1 = "io.branch.sdk.auto_link_path";
        r5 = r5.getString(r1);
        r1 = 0;
        if (r5 == 0) goto L_0x0060;
    L_0x003b:
        if (r0 == 0) goto L_0x0060;
    L_0x003d:
        r5 = r6.metaData;
        r6 = "io.branch.sdk.auto_link_path";
        r5 = r5.getString(r6);
        r6 = ",";
        r5 = r5.split(r6);
        r6 = r5.length;
        r2 = 0;
    L_0x004d:
        if (r2 >= r6) goto L_0x0060;
    L_0x004f:
        r3 = r5[r2];
        r3 = r3.trim();
        r3 = r4.m15220b(r3, r0);
        if (r3 == 0) goto L_0x005d;
    L_0x005b:
        r5 = 1;
        return r5;
    L_0x005d:
        r2 = r2 + 1;
        goto L_0x004d;
    L_0x0060:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.Branch.b(org.json.JSONObject, android.content.pm.ActivityInfo):boolean");
    }

    /* renamed from: b */
    private boolean m15220b(String str, String str2) {
        boolean z = false;
        str = str.split("\\?")[0].split("/");
        str2 = str2.split("\\?")[0].split("/");
        if (str.length != str2.length) {
            return false;
        }
        int i = 0;
        while (i < str.length && i < str2.length) {
            String str3 = str[i];
            if (!str3.equals(str2[i]) && !str3.contains("*")) {
                break;
            }
            i++;
        }
        z = true;
        return z;
    }

    /* renamed from: a */
    public void m15253a(BranchUniversalObject branchUniversalObject, RegisterViewStatusListener registerViewStatusListener) {
        if (this.f12598q != null) {
            new C15599a(BRANCH_STANDARD_EVENT.VIEW_ITEM).a(new BranchUniversalObject[]{branchUniversalObject}).a(this.f12598q);
        }
    }

    /* renamed from: a */
    public void m15255a(String str, String str2) {
        this.f12581D.put(str, str2);
    }

    public void onBranchViewAccepted(String str, String str2) {
        if (C17315s.a(str) != null) {
            m15249s();
        }
    }

    public void onBranchViewCancelled(String str, String str2) {
        if (C17315s.a(str) != null) {
            m15249s();
        }
    }

    public void onBranchViewError(int i, String str, String str2) {
        if (C17315s.a(str2) != 0) {
            m15249s();
        }
    }
}
