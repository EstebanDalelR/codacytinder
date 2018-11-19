package io.branch.referral;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.StyleRes;
import android.view.View;
import io.branch.referral.SharingHelper.SHARE_WITH;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class Branch$c {
    /* renamed from: a */
    C17307g f48080a;
    /* renamed from: b */
    private final Activity f48081b;
    /* renamed from: c */
    private final Branch f48082c;
    /* renamed from: d */
    private String f48083d;
    /* renamed from: e */
    private String f48084e;
    /* renamed from: f */
    private Branch$BranchLinkShareListener f48085f;
    /* renamed from: g */
    private Branch$IChannelProperties f48086g;
    /* renamed from: h */
    private ArrayList<SHARE_WITH> f48087h;
    /* renamed from: i */
    private String f48088i;
    /* renamed from: j */
    private Drawable f48089j;
    /* renamed from: k */
    private String f48090k;
    /* renamed from: l */
    private Drawable f48091l;
    /* renamed from: m */
    private String f48092m;
    /* renamed from: n */
    private String f48093n;
    /* renamed from: o */
    private int f48094o;
    /* renamed from: p */
    private boolean f48095p;
    /* renamed from: q */
    private int f48096q;
    /* renamed from: r */
    private int f48097r;
    /* renamed from: s */
    private String f48098s;
    /* renamed from: t */
    private View f48099t;
    /* renamed from: u */
    private int f48100u;
    /* renamed from: v */
    private List<String> f48101v;
    /* renamed from: w */
    private List<String> f48102w;

    public Branch$c(android.app.Activity r6, org.json.JSONObject r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r5.<init>();
        r0 = 0;
        r5.f48085f = r0;
        r5.f48086g = r0;
        r1 = -1;
        r5.f48097r = r1;
        r5.f48098s = r0;
        r5.f48099t = r0;
        r1 = 50;
        r5.f48100u = r1;
        r1 = new java.util.ArrayList;
        r1.<init>();
        r5.f48101v = r1;
        r1 = new java.util.ArrayList;
        r1.<init>();
        r5.f48102w = r1;
        r5.f48081b = r6;
        r1 = io.branch.referral.Branch.k();
        r5.f48082c = r1;
        r1 = new io.branch.referral.g;
        r1.<init>(r6);
        r5.f48080a = r1;
        r1 = r7.keys();	 Catch:{ Exception -> 0x004c }
    L_0x0034:
        r2 = r1.hasNext();	 Catch:{ Exception -> 0x004c }
        if (r2 == 0) goto L_0x004c;	 Catch:{ Exception -> 0x004c }
    L_0x003a:
        r2 = r1.next();	 Catch:{ Exception -> 0x004c }
        r2 = (java.lang.String) r2;	 Catch:{ Exception -> 0x004c }
        r3 = r5.f48080a;	 Catch:{ Exception -> 0x004c }
        r4 = r7.get(r2);	 Catch:{ Exception -> 0x004c }
        r4 = (java.lang.String) r4;	 Catch:{ Exception -> 0x004c }
        r3.m58358a(r2, r4);	 Catch:{ Exception -> 0x004c }
        goto L_0x0034;
    L_0x004c:
        r7 = "";
        r5.f48083d = r7;
        r5.f48085f = r0;
        r5.f48086g = r0;
        r7 = new java.util.ArrayList;
        r7.<init>();
        r5.f48087h = r7;
        r5.f48088i = r0;
        r7 = r6.getApplicationContext();
        r0 = 17301573; // 0x1080045 float:2.4979448E-38 double:8.548113E-317;
        r7 = io.branch.referral.C2666j.a(r7, r0);
        r5.f48089j = r7;
        r7 = "More...";
        r5.f48090k = r7;
        r6 = r6.getApplicationContext();
        r7 = 17301582; // 0x108004e float:2.4979474E-38 double:8.5481173E-317;
        r6 = io.branch.referral.C2666j.a(r6, r7);
        r5.f48091l = r6;
        r6 = "Copy link";
        r5.f48092m = r6;
        r6 = "Copied link to clipboard!";
        r5.f48093n = r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.Branch$c.<init>(android.app.Activity, org.json.JSONObject):void");
    }

    public Branch$c(Activity activity, C17307g c17307g) {
        this(activity, new JSONObject());
        this.f48080a = c17307g;
    }

    /* renamed from: a */
    public Branch$c m58143a(String str) {
        this.f48083d = str;
        return this;
    }

    /* renamed from: b */
    public Branch$c m58151b(String str) {
        this.f48084e = str;
        return this;
    }

    /* renamed from: a */
    public Branch$c m58141a(Branch$BranchLinkShareListener branch$BranchLinkShareListener) {
        this.f48085f = branch$BranchLinkShareListener;
        return this;
    }

    /* renamed from: a */
    public Branch$c m58142a(Branch$IChannelProperties branch$IChannelProperties) {
        this.f48086g = branch$IChannelProperties;
        return this;
    }

    /* renamed from: a */
    public Branch$c m58144a(ArrayList<SHARE_WITH> arrayList) {
        this.f48087h.addAll(arrayList);
        return this;
    }

    /* renamed from: c */
    public Branch$c m58154c(String str) {
        this.f48088i = str;
        return this;
    }

    /* renamed from: a */
    public Branch$c m58138a(Drawable drawable, String str) {
        this.f48089j = drawable;
        this.f48090k = str;
        return this;
    }

    /* renamed from: a */
    public Branch$c m58139a(Drawable drawable, String str, String str2) {
        this.f48091l = drawable;
        this.f48092m = str;
        this.f48093n = str2;
        return this;
    }

    /* renamed from: a */
    public Branch$c m58146a(boolean z) {
        this.f48095p = z;
        return this;
    }

    /* renamed from: a */
    public Branch$c m58137a(@StyleRes int i) {
        this.f48096q = i;
        return this;
    }

    /* renamed from: b */
    public Branch$c m58150b(int i) {
        this.f48097r = i;
        return this;
    }

    /* renamed from: d */
    public Branch$c m58156d(String str) {
        this.f48098s = str;
        return this;
    }

    /* renamed from: a */
    public Branch$c m58140a(View view) {
        this.f48099t = view;
        return this;
    }

    /* renamed from: c */
    public Branch$c m58153c(int i) {
        this.f48100u = i;
        return this;
    }

    /* renamed from: a */
    public Branch$c m58145a(@NonNull List<String> list) {
        this.f48102w.addAll(list);
        return this;
    }

    /* renamed from: b */
    public Branch$c m58152b(@NonNull List<String> list) {
        this.f48101v.addAll(list);
        return this;
    }

    /* renamed from: d */
    public void m58158d(@StyleRes int i) {
        this.f48094o = i;
    }

    /* renamed from: a */
    public void m58148a(C17307g c17307g) {
        this.f48080a = c17307g;
    }

    /* renamed from: a */
    public void m58147a() {
        Branch.a(Branch.k(), this);
    }

    /* renamed from: b */
    public Activity m58149b() {
        return this.f48081b;
    }

    /* renamed from: c */
    public ArrayList<SHARE_WITH> m58155c() {
        return this.f48087h;
    }

    /* renamed from: d */
    List<String> m58157d() {
        return this.f48102w;
    }

    /* renamed from: e */
    List<String> m58159e() {
        return this.f48101v;
    }

    /* renamed from: f */
    public String m58160f() {
        return this.f48083d;
    }

    /* renamed from: g */
    public String m58161g() {
        return this.f48084e;
    }

    /* renamed from: h */
    public Branch$BranchLinkShareListener m58162h() {
        return this.f48085f;
    }

    /* renamed from: i */
    public Branch$IChannelProperties m58163i() {
        return this.f48086g;
    }

    /* renamed from: j */
    public String m58164j() {
        return this.f48088i;
    }

    /* renamed from: k */
    public Drawable m58165k() {
        return this.f48089j;
    }

    /* renamed from: l */
    public String m58166l() {
        return this.f48090k;
    }

    /* renamed from: m */
    public Drawable m58167m() {
        return this.f48091l;
    }

    /* renamed from: n */
    public String m58168n() {
        return this.f48092m;
    }

    /* renamed from: o */
    public String m58169o() {
        return this.f48093n;
    }

    /* renamed from: p */
    public C17307g m58170p() {
        return this.f48080a;
    }

    /* renamed from: q */
    public boolean m58171q() {
        return this.f48095p;
    }

    /* renamed from: r */
    public int m58172r() {
        return this.f48096q;
    }

    /* renamed from: s */
    public int m58173s() {
        return this.f48097r;
    }

    /* renamed from: t */
    public String m58174t() {
        return this.f48098s;
    }

    /* renamed from: u */
    public View m58175u() {
        return this.f48099t;
    }

    /* renamed from: v */
    public int m58176v() {
        return this.f48094o;
    }

    /* renamed from: w */
    public int m58177w() {
        return this.f48100u;
    }
}
