package com.facebook.ads.internal.view.p050a;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils.TruncateAt;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.internal.p047k.C1507t;
import com.facebook.ads.internal.p047k.C1510w;

@TargetApi(19)
/* renamed from: com.facebook.ads.internal.view.a.c */
public class C1540c extends LinearLayout {
    /* renamed from: a */
    private TextView f4309a;
    /* renamed from: b */
    private TextView f4310b;
    /* renamed from: c */
    private Drawable f4311c;

    public C1540c(Context context) {
        super(context);
        m5404a();
    }

    /* renamed from: a */
    private void m5404a() {
        float f = getResources().getDisplayMetrics().density;
        setOrientation(1);
        this.f4309a = new TextView(getContext());
        LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        this.f4309a.setTextColor(-16777216);
        this.f4309a.setTextSize(2, 20.0f);
        this.f4309a.setEllipsize(TruncateAt.END);
        this.f4309a.setSingleLine(true);
        this.f4309a.setVisibility(8);
        addView(this.f4309a, layoutParams);
        this.f4310b = new TextView(getContext());
        layoutParams = new LinearLayout.LayoutParams(-1, -2);
        this.f4310b.setAlpha(0.5f);
        this.f4310b.setTextColor(-16777216);
        this.f4310b.setTextSize(2, 15.0f);
        this.f4310b.setCompoundDrawablePadding((int) (f * 5.0f));
        this.f4310b.setEllipsize(TruncateAt.END);
        this.f4310b.setSingleLine(true);
        this.f4310b.setVisibility(8);
        addView(this.f4310b, layoutParams);
    }

    private Drawable getPadlockDrawable() {
        if (this.f4311c == null) {
            this.f4311c = C1510w.m5312b(getContext(), C1507t.BROWSER_PADLOCK);
        }
        return this.f4311c;
    }

    public void setSubtitle(java.lang.String r4) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x003c in {2, 4, 7, 8, 9} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
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
        r0 = android.text.TextUtils.isEmpty(r4);
        r1 = 0;
        if (r0 == 0) goto L_0x0014;
    L_0x0007:
        r4 = r3.f4310b;
        r4.setText(r1);
        r4 = r3.f4310b;
        r0 = 8;
    L_0x0010:
        r4.setVisibility(r0);
        return;
    L_0x0014:
        r4 = android.net.Uri.parse(r4);
        r0 = r3.f4310b;
        r2 = r4.getHost();
        r0.setText(r2);
        r0 = r3.f4310b;
        r2 = "https";
        r4 = r4.getScheme();
        r4 = r2.equals(r4);
        if (r4 == 0) goto L_0x0034;
    L_0x002f:
        r4 = r3.getPadlockDrawable();
        goto L_0x0035;
    L_0x0034:
        r4 = r1;
    L_0x0035:
        r0.setCompoundDrawablesRelativeWithIntrinsicBounds(r4, r1, r1, r1);
        r4 = r3.f4310b;
        r0 = 0;
        goto L_0x0010;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.view.a.c.setSubtitle(java.lang.String):void");
    }

    public void setTitle(java.lang.String r2) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:6:0x001d in {2, 4, 5} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
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
        r1 = this;
        r0 = android.text.TextUtils.isEmpty(r2);
        if (r0 == 0) goto L_0x0014;
    L_0x0006:
        r2 = r1.f4309a;
        r0 = 0;
        r2.setText(r0);
        r2 = r1.f4309a;
        r0 = 8;
    L_0x0010:
        r2.setVisibility(r0);
        return;
    L_0x0014:
        r0 = r1.f4309a;
        r0.setText(r2);
        r2 = r1.f4309a;
        r0 = 0;
        goto L_0x0010;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.view.a.c.setTitle(java.lang.String):void");
    }
}
