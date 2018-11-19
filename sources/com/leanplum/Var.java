package com.leanplum;

import android.text.TextUtils;
import com.leanplum.callbacks.VariableCallback;
import com.leanplum.p069a.C2590h;
import com.leanplum.p069a.C2594s;
import com.leanplum.p069a.C2595v;
import com.leanplum.p069a.ag;
import com.leanplum.p069a.ao;
import com.leanplum.p069a.aq;
import com.leanplum.p069a.bo;
import com.leanplum.p069a.bq;
import com.tinder.api.ManagerWebServices;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Var<T> {
    /* renamed from: r */
    private static boolean f7869r;
    /* renamed from: a */
    private String f7870a;
    /* renamed from: b */
    private String[] f7871b;
    /* renamed from: c */
    private Double f7872c;
    /* renamed from: d */
    private T f7873d;
    /* renamed from: e */
    private T f7874e;
    /* renamed from: f */
    private String f7875f;
    /* renamed from: g */
    private final List<VariableCallback<T>> f7876g = new ArrayList();
    /* renamed from: h */
    private final List<VariableCallback<T>> f7877h = new ArrayList();
    /* renamed from: i */
    private boolean f7878i;
    public boolean isResource;
    /* renamed from: j */
    private boolean f7879j;
    /* renamed from: k */
    private boolean f7880k;
    /* renamed from: l */
    private int f7881l;
    /* renamed from: m */
    private String f7882m;
    /* renamed from: n */
    private byte[] f7883n;
    /* renamed from: o */
    private boolean f7884o = false;
    /* renamed from: p */
    private boolean f7885p;
    /* renamed from: q */
    private int f7886q;
    public String stringValue;

    /* renamed from: com.leanplum.Var$4 */
    final class C25724 implements Runnable {
        /* renamed from: a */
        private /* synthetic */ Var f7868a;

        C25724(Var var) {
            this.f7868a = var;
        }

        public final void run() {
            this.f7868a.m9440d();
        }
    }

    /* renamed from: com.leanplum.Var$1 */
    final class C38511 implements C2597k<String> {
        C38511() {
        }

        /* renamed from: a */
        public final void mo2614a(Var<String> var) {
            var.f7880k = true;
        }
    }

    /* renamed from: com.leanplum.Var$2 */
    final class C38522 implements C2597k<String> {
        C38522() {
        }

        /* renamed from: a */
        public final void mo2614a(Var<String> var) {
            var.isResource = true;
        }
    }

    /* renamed from: com.leanplum.Var$3 */
    final class C38533 implements C2597k<String> {
        /* renamed from: a */
        private /* synthetic */ int f12095a;
        /* renamed from: b */
        private /* synthetic */ String f12096b;
        /* renamed from: c */
        private /* synthetic */ byte[] f12097c;

        C38533(int i, String str, byte[] bArr) {
            this.f12095a = i;
            this.f12096b = str;
            this.f12097c = bArr;
        }

        /* renamed from: a */
        public final void mo2614a(Var<String> var) {
            var.isResource = true;
            var.f7881l = this.f12095a;
            var.f7882m = this.f12096b;
            var.f7883n = this.f12097c;
        }
    }

    /* renamed from: a */
    private void m9434a() {
        if (!this.f7885p && !Leanplum.hasStarted() && !f7869r) {
            Object[] objArr = new Object[1];
            StringBuilder stringBuilder = new StringBuilder("Leanplum hasn't finished retrieving values from the server. You should use a callback to make sure the value for '");
            stringBuilder.append(this.f7870a);
            stringBuilder.append("' is ready. Otherwise, your app may not use the most up-to-date value.");
            objArr[0] = stringBuilder.toString();
            ao.m9517b(objArr);
            f7869r = true;
        }
    }

    /* renamed from: a */
    private static <T> Var<T> m9432a(String str, T t, String str2, C2597k<T> c2597k) {
        Var<T> var = null;
        if (TextUtils.isEmpty(str)) {
            ao.m9516a("Empty name parameter provided.");
            return null;
        }
        Var<T> b = bq.m9654b(str);
        if (b != null) {
            return b;
        }
        if (ag.m9501j() && !str.startsWith("__Android Resources")) {
            Object[] objArr = new Object[1];
            StringBuilder stringBuilder = new StringBuilder("You should not create new variables after calling start (name=");
            stringBuilder.append(str);
            stringBuilder.append(")");
            objArr[0] = stringBuilder.toString();
            ao.m9517b(objArr);
        }
        Var var2 = new Var();
        try {
            var2.f7870a = str;
            var2.f7871b = bq.m9653a(str);
            var2.f7873d = t;
            var2.f7874e = t;
            var2.f7875f = str2;
            if (str.startsWith("__Android Resources") != null) {
                var2.f7885p = true;
            }
            if (c2597k != null) {
                c2597k.mo2614a(var2);
            }
            var2.m9438b();
            bq.m9643a(var2);
            if (ManagerWebServices.PARAM_FILE.equals(var2.f7875f) != null) {
                String str3 = var2.stringValue;
                if (var2.defaultValue() != null) {
                    var = var2.defaultValue().toString();
                }
                bq.m9650a(str3, (String) var, var2.m9441e(), var2.isResource, var2.f7882m, var2.f7881l);
            }
            var2.update();
        } catch (Throwable th) {
            bo.m9608a(th);
        }
        return var2;
    }

    public static <T> Var<T> define(String str, T t) {
        return m9432a(str, t, bq.m9640a((Object) t), null);
    }

    public static <T> Var<T> define(String str, T t, String str2) {
        return m9432a(str, t, str2, null);
    }

    public static Var<Integer> defineColor(String str, int i) {
        return m9432a(str, Integer.valueOf(i), ManagerWebServices.PARAM_BADGE_COLOR, null);
    }

    public static Var<String> defineFile(String str, String str2) {
        return m9432a(str, str2, ManagerWebServices.PARAM_FILE, null);
    }

    public static Var<String> defineAsset(String str, String str2) {
        return m9432a(str, str2, ManagerWebServices.PARAM_FILE, new C38511());
    }

    public static Var<String> defineResource(String str, int i) {
        return m9432a(str, bo.m9597a(i), ManagerWebServices.PARAM_FILE, new C38522());
    }

    public static Var<String> defineResource(String str, String str2, int i, String str3, byte[] bArr) {
        return m9432a(str, str2, ManagerWebServices.PARAM_FILE, new C38533(i, str3, bArr));
    }

    protected Var() {
    }

    public String name() {
        return this.f7870a;
    }

    public String[] nameComponents() {
        return this.f7871b;
    }

    public String kind() {
        return this.f7875f;
    }

    public T defaultValue() {
        return this.f7873d;
    }

    public T value() {
        m9434a();
        return this.f7874e;
    }

    public int overrideResId() {
        return this.f7886q;
    }

    public void setOverrideResId(int i) {
        this.f7886q = i;
    }

    /* renamed from: b */
    private void m9438b() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r2 = this;
        r0 = r2.f7874e;
        r0 = r0 instanceof java.lang.String;
        r1 = 0;
        if (r0 == 0) goto L_0x0019;
    L_0x0007:
        r0 = r2.f7874e;
        r0 = (java.lang.String) r0;
        r2.stringValue = r0;
        r0 = r2.stringValue;	 Catch:{ NumberFormatException -> 0x0016 }
        r0 = java.lang.Double.valueOf(r0);	 Catch:{ NumberFormatException -> 0x0016 }
        r2.f7872c = r0;	 Catch:{ NumberFormatException -> 0x0016 }
        return;
    L_0x0016:
        r2.f7872c = r1;
        return;
    L_0x0019:
        r0 = r2.f7874e;
        r0 = r0 instanceof java.lang.Number;
        if (r0 == 0) goto L_0x00d1;
    L_0x001f:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = r2.f7874e;
        r0.append(r1);
        r0 = r0.toString();
        r2.stringValue = r0;
        r0 = r2.f7874e;
        r0 = (java.lang.Number) r0;
        r0 = r0.doubleValue();
        r0 = java.lang.Double.valueOf(r0);
        r2.f7872c = r0;
        r0 = r2.f7873d;
        r0 = r0 instanceof java.lang.Byte;
        if (r0 == 0) goto L_0x0052;
    L_0x0043:
        r0 = r2.f7874e;
        r0 = (java.lang.Number) r0;
        r0 = r0.byteValue();
        r0 = java.lang.Byte.valueOf(r0);
        r2.f7874e = r0;
        return;
    L_0x0052:
        r0 = r2.f7873d;
        r0 = r0 instanceof java.lang.Short;
        if (r0 == 0) goto L_0x0067;
    L_0x0058:
        r0 = r2.f7874e;
        r0 = (java.lang.Number) r0;
        r0 = r0.shortValue();
        r0 = java.lang.Short.valueOf(r0);
        r2.f7874e = r0;
        return;
    L_0x0067:
        r0 = r2.f7873d;
        r0 = r0 instanceof java.lang.Integer;
        if (r0 == 0) goto L_0x007c;
    L_0x006d:
        r0 = r2.f7874e;
        r0 = (java.lang.Number) r0;
        r0 = r0.intValue();
        r0 = java.lang.Integer.valueOf(r0);
        r2.f7874e = r0;
        return;
    L_0x007c:
        r0 = r2.f7873d;
        r0 = r0 instanceof java.lang.Long;
        if (r0 == 0) goto L_0x0091;
    L_0x0082:
        r0 = r2.f7874e;
        r0 = (java.lang.Number) r0;
        r0 = r0.longValue();
        r0 = java.lang.Long.valueOf(r0);
        r2.f7874e = r0;
        return;
    L_0x0091:
        r0 = r2.f7873d;
        r0 = r0 instanceof java.lang.Float;
        if (r0 == 0) goto L_0x00a6;
    L_0x0097:
        r0 = r2.f7874e;
        r0 = (java.lang.Number) r0;
        r0 = r0.floatValue();
        r0 = java.lang.Float.valueOf(r0);
        r2.f7874e = r0;
        return;
    L_0x00a6:
        r0 = r2.f7873d;
        r0 = r0 instanceof java.lang.Double;
        if (r0 == 0) goto L_0x00bb;
    L_0x00ac:
        r0 = r2.f7874e;
        r0 = (java.lang.Number) r0;
        r0 = r0.doubleValue();
        r0 = java.lang.Double.valueOf(r0);
        r2.f7874e = r0;
        return;
    L_0x00bb:
        r0 = r2.f7873d;
        r0 = r0 instanceof java.lang.Character;
        if (r0 == 0) goto L_0x00f0;
    L_0x00c1:
        r0 = r2.f7874e;
        r0 = (java.lang.Number) r0;
        r0 = r0.intValue();
        r0 = (char) r0;
        r0 = java.lang.Character.valueOf(r0);
        r2.f7874e = r0;
        return;
    L_0x00d1:
        r0 = r2.f7874e;
        if (r0 == 0) goto L_0x00ec;
    L_0x00d5:
        r0 = r2.f7874e;
        r0 = r0 instanceof java.lang.Iterable;
        if (r0 != 0) goto L_0x00ec;
    L_0x00db:
        r0 = r2.f7874e;
        r0 = r0 instanceof java.util.Map;
        if (r0 != 0) goto L_0x00ec;
    L_0x00e1:
        r0 = r2.f7874e;
        r0 = r0.toString();
        r2.stringValue = r0;
        r2.f7872c = r1;
        return;
    L_0x00ec:
        r2.stringValue = r1;
        r2.f7872c = r1;
    L_0x00f0:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.Var.b():void");
    }

    public void update() {
        Object obj = this.f7874e;
        this.f7874e = bq.m9638a(this.f7871b);
        if (this.f7874e != null || obj != null) {
            if (this.f7874e == null || obj == null || !this.f7874e.equals(obj) || !this.f7879j) {
                m9438b();
                if (bq.m9669m() && this.f7870a.startsWith("__Android Resources") && ManagerWebServices.PARAM_FILE.equals(this.f7875f) && !this.f7878i) {
                    m9440d();
                }
                if (!bq.m9669m()) {
                    if (Leanplum.hasStarted()) {
                        synchronized (this.f7877h) {
                            for (VariableCallback variableCallback : this.f7877h) {
                                variableCallback.setVariable(this);
                                aq.m9522a().m9523a(variableCallback);
                            }
                        }
                    }
                    if (ManagerWebServices.PARAM_FILE.equals(this.f7875f)) {
                        if (!C2590h.m9712a()) {
                            int a = C2594s.m9717a(this.isResource, this.stringValue, (String) this.f7873d, null, new C25724(this));
                            this.f7884o = false;
                            if (a == C2595v.f8122c) {
                                this.f7878i = true;
                            } else if (a == C2595v.f8121b) {
                                this.f7884o = true;
                            }
                        }
                        if (Leanplum.hasStarted() && !this.f7878i) {
                            m9440d();
                        }
                    }
                    if (Leanplum.hasStarted()) {
                        this.f7879j = true;
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private void m9439c() {
        synchronized (this.f7877h) {
            for (VariableCallback variableCallback : this.f7877h) {
                variableCallback.setVariable(this);
                aq.m9522a().m9523a(variableCallback);
            }
        }
    }

    public void addValueChangedHandler(VariableCallback<T> variableCallback) {
        if (variableCallback == null) {
            ao.m9516a("Invalid handler parameter provided.");
            return;
        }
        synchronized (this.f7877h) {
            this.f7877h.add(variableCallback);
        }
        if (Leanplum.hasStarted()) {
            variableCallback.handle(this);
        }
    }

    public void removeValueChangedHandler(VariableCallback<T> variableCallback) {
        synchronized (this.f7877h) {
            this.f7877h.remove(variableCallback);
        }
    }

    /* renamed from: d */
    private void m9440d() {
        synchronized (this.f7876g) {
            this.f7878i = false;
            for (VariableCallback variableCallback : this.f7876g) {
                variableCallback.setVariable(this);
                aq.m9522a().m9523a(variableCallback);
            }
        }
    }

    public void addFileReadyHandler(VariableCallback<T> variableCallback) {
        if (variableCallback == null) {
            ao.m9516a("Invalid handler parameter provided.");
            return;
        }
        synchronized (this.f7876g) {
            this.f7876g.add(variableCallback);
        }
        if (Leanplum.hasStarted() && !this.f7878i) {
            variableCallback.handle(this);
        }
    }

    public void removeFileReadyHandler(VariableCallback<T> variableCallback) {
        if (variableCallback == null) {
            ao.m9516a("Invalid handler parameter provided.");
            return;
        }
        synchronized (this.f7876g) {
            this.f7876g.remove(variableCallback);
        }
    }

    public String fileValue() {
        try {
            m9434a();
            if (ManagerWebServices.PARAM_FILE.equals(this.f7875f)) {
                return C2594s.m9721a(this.stringValue, (String) this.f7873d, Boolean.valueOf(this.f7884o));
            }
        } catch (Throwable th) {
            bo.m9608a(th);
        }
        return null;
    }

    public Object objectForKeyPath(Object... objArr) {
        try {
            m9434a();
            List arrayList = new ArrayList();
            Collections.addAll(arrayList, this.f7871b);
            if (objArr != null && objArr.length > 0) {
                Collections.addAll(arrayList, objArr);
            }
            return bq.m9638a(arrayList.toArray(new Object[arrayList.size()]));
        } catch (Throwable th) {
            bo.m9608a(th);
            return null;
        }
    }

    public int count() {
        try {
            m9434a();
            Object a = bq.m9638a(this.f7871b);
            if (a instanceof List) {
                return ((List) a).size();
            }
            ag.m9478a(new UnsupportedOperationException("This variable is not a list."));
            return 0;
        } catch (Throwable th) {
            bo.m9608a(th);
            return 0;
        }
    }

    public Number numberValue() {
        m9434a();
        return this.f7872c;
    }

    public String stringValue() {
        m9434a();
        return this.stringValue;
    }

    public InputStream stream() {
        try {
            if (!ManagerWebServices.PARAM_FILE.equals(this.f7875f)) {
                return null;
            }
            m9434a();
            InputStream a = C2594s.m9719a(this.isResource, Boolean.valueOf(this.f7880k), Boolean.valueOf(this.f7884o), fileValue(), (String) this.f7873d, this.f7883n);
            return a == null ? m9441e() : a;
        } catch (Throwable th) {
            bo.m9608a(th);
            return null;
        }
    }

    /* renamed from: e */
    private InputStream m9441e() {
        try {
            if (ManagerWebServices.PARAM_FILE.equals(this.f7875f)) {
                return C2594s.m9719a(this.isResource, Boolean.valueOf(this.f7880k), Boolean.valueOf(this.f7884o), (String) this.f7873d, (String) this.f7873d, this.f7883n);
            }
            return null;
        } catch (Throwable th) {
            bo.m9608a(th);
            return null;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Var(");
        stringBuilder.append(this.f7870a);
        stringBuilder.append(")=");
        stringBuilder.append(this.f7874e);
        return stringBuilder.toString();
    }
}
