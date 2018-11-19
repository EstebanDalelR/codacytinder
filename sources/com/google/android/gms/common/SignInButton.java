package com.google.android.gms.common;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Scope;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class SignInButton extends FrameLayout implements OnClickListener {
    /* renamed from: a */
    private int f7403a;
    /* renamed from: b */
    private int f7404b;
    /* renamed from: c */
    private View f7405c;
    /* renamed from: d */
    private OnClickListener f7406d;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ButtonSize {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ColorScheme {
    }

    /* renamed from: a */
    public final void m8840a(int r3, int r4) {
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
        r2.f7403a = r3;
        r2.f7404b = r4;
        r3 = r2.getContext();
        r4 = r2.f7405c;
        if (r4 == 0) goto L_0x0011;
    L_0x000c:
        r4 = r2.f7405c;
        r2.removeView(r4);
    L_0x0011:
        r4 = r2.f7403a;	 Catch:{ zzq -> 0x001c }
        r0 = r2.f7404b;	 Catch:{ zzq -> 0x001c }
        r4 = com.google.android.gms.common.internal.ah.m14443a(r3, r4, r0);	 Catch:{ zzq -> 0x001c }
        r2.f7405c = r4;	 Catch:{ zzq -> 0x001c }
        goto L_0x0035;
    L_0x001c:
        r4 = "SignInButton";
        r0 = "Sign in button not found, using placeholder instead";
        android.util.Log.w(r4, r0);
        r4 = r2.f7403a;
        r0 = r2.f7404b;
        r1 = new com.google.android.gms.common.internal.ai;
        r1.<init>(r3);
        r3 = r3.getResources();
        r1.m9059a(r3, r4, r0);
        r2.f7405c = r1;
    L_0x0035:
        r3 = r2.f7405c;
        r2.addView(r3);
        r3 = r2.f7405c;
        r4 = r2.isEnabled();
        r3.setEnabled(r4);
        r3 = r2.f7405c;
        r3.setOnClickListener(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.SignInButton.a(int, int):void");
    }

    public final void onClick(View view) {
        if (this.f7406d != null && view == this.f7405c) {
            this.f7406d.onClick(this);
        }
    }

    public final void setColorScheme(int i) {
        m8840a(this.f7403a, i);
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f7405c.setEnabled(z);
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.f7406d = onClickListener;
        if (this.f7405c != null) {
            this.f7405c.setOnClickListener(this);
        }
    }

    @Deprecated
    public final void setScopes(Scope[] scopeArr) {
        m8840a(this.f7403a, this.f7404b);
    }

    public final void setSize(int i) {
        m8840a(i, this.f7404b);
    }
}
