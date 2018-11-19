package io.branch.referral;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: io.branch.referral.i */
abstract class C15590i<T extends C15590i> {
    /* renamed from: a */
    protected JSONObject f48223a;
    /* renamed from: b */
    protected String f48224b;
    /* renamed from: c */
    protected String f48225c;
    /* renamed from: d */
    protected String f48226d;
    /* renamed from: e */
    protected String f48227e;
    /* renamed from: f */
    protected String f48228f;
    /* renamed from: g */
    protected int f48229g = 0;
    /* renamed from: h */
    protected int f48230h = 0;
    /* renamed from: i */
    protected ArrayList<String> f48231i;
    /* renamed from: j */
    protected Branch f48232j = Branch.b();
    /* renamed from: k */
    private boolean f48233k;
    /* renamed from: l */
    private final Context f48234l;

    protected C15590i(Context context) {
        this.f48234l = context.getApplicationContext();
        this.f48233k = true;
    }

    /* renamed from: a */
    public T m58359a(List<String> list) {
        if (this.f48231i == null) {
            this.f48231i = new ArrayList();
        }
        this.f48231i.addAll(list);
        return this;
    }

    /* renamed from: a */
    public T m58358a(java.lang.String r2, java.lang.Object r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = r1.f48223a;	 Catch:{ JSONException -> 0x0010 }
        if (r0 != 0) goto L_0x000b;	 Catch:{ JSONException -> 0x0010 }
    L_0x0004:
        r0 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0010 }
        r0.<init>();	 Catch:{ JSONException -> 0x0010 }
        r1.f48223a = r0;	 Catch:{ JSONException -> 0x0010 }
    L_0x000b:
        r0 = r1.f48223a;	 Catch:{ JSONException -> 0x0010 }
        r0.put(r2, r3);	 Catch:{ JSONException -> 0x0010 }
    L_0x0010:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.i.a(java.lang.String, java.lang.Object):T");
    }

    /* renamed from: a */
    public T m58360a(boolean z) {
        this.f48233k = z;
        return this;
    }

    /* renamed from: b */
    protected String m58361b() {
        if (this.f48232j == null) {
            return null;
        }
        return this.f48232j.a(new C17311o(this.f48234l, this.f48228f, this.f48229g, this.f48230h, this.f48231i, this.f48224b, this.f48225c, this.f48226d, this.f48227e, C2666j.a(this.f48223a), null, false, this.f48233k));
    }

    /* renamed from: b */
    protected void m58362b(Branch$BranchLinkCreateListener branch$BranchLinkCreateListener) {
        m58363b(branch$BranchLinkCreateListener, false);
    }

    /* renamed from: b */
    protected void m58363b(Branch$BranchLinkCreateListener branch$BranchLinkCreateListener, boolean z) {
        Branch$BranchLinkCreateListener branch$BranchLinkCreateListener2 = branch$BranchLinkCreateListener;
        if (this.f48232j != null) {
            C17311o c17311o = new C17311o(r0.f48234l, r0.f48228f, r0.f48229g, r0.f48230h, r0.f48231i, r0.f48224b, r0.f48225c, r0.f48226d, r0.f48227e, C2666j.a(r0.f48223a), branch$BranchLinkCreateListener2, true, r0.f48233k);
            c17311o.m63299a(z);
            r0.f48232j.a(c17311o);
            return;
        }
        if (branch$BranchLinkCreateListener2 != null) {
            branch$BranchLinkCreateListener2.onLinkCreate(null, new C15583e("session has not been initialized", -101));
        }
        Log.i("BranchSDK", "Branch Warning: User session has not been initialized");
    }
}
