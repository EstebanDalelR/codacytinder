package com.facebook.ads.internal.view.p052c.p053b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.facebook.ads.internal.p047k.C1507t;
import com.facebook.ads.internal.p047k.C1510w;
import com.facebook.ads.internal.view.C3394u;

/* renamed from: com.facebook.ads.internal.view.c.b.f */
public class C3355f extends ImageView implements C1582n {
    /* renamed from: a */
    private static final int f10172a = ((int) (Resources.getSystem().getDisplayMetrics().density * 4.0f));
    /* renamed from: b */
    private final Paint f10173b = new Paint();
    @Nullable
    /* renamed from: c */
    private C3394u f10174c;

    /* renamed from: com.facebook.ads.internal.view.c.b.f$1 */
    class C15741 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C3355f f4370a;

        C15741(C3355f c3355f) {
            this.f4370a = c3355f;
        }

        public void onClick(android.view.View r2) {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:9:0x0035 in {2, 5, 7, 8} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r1 = this;
            r2 = r1.f4370a;
            r2 = r2.f10174c;
            if (r2 != 0) goto L_0x0009;
        L_0x0008:
            return;
        L_0x0009:
            r2 = r1.f4370a;
            r2 = r2.f10174c;
            r2 = r2.getVolume();
            r0 = 0;
            r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
            if (r2 != 0) goto L_0x0029;
        L_0x0018:
            r2 = r1.f4370a;
            r2.m12897a();
            r2 = r1.f4370a;
            r2 = r2.f10174c;
            r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        L_0x0025:
            r2.setVolume(r0);
            return;
        L_0x0029:
            r2 = r1.f4370a;
            r2.m12898b();
            r2 = r1.f4370a;
            r2 = r2.f10174c;
            goto L_0x0025;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.view.c.b.f.1.onClick(android.view.View):void");
        }
    }

    public C3355f(Context context) {
        super(context);
        this.f10173b.setColor(Integer.MIN_VALUE);
        setColorFilter(-1);
        setPadding(f10172a, f10172a, f10172a, f10172a);
        m12897a();
        setOnClickListener(new C15741(this));
    }

    /* renamed from: a */
    private void m12897a() {
        setImageBitmap(C1510w.m5311a(getContext(), C1507t.SOUND_ON));
    }

    /* renamed from: b */
    private void m12898b() {
        setImageBitmap(C1510w.m5311a(getContext(), C1507t.SOUND_OFF));
    }

    /* renamed from: a */
    public void mo1788a(C3394u c3394u) {
        this.f10174c = c3394u;
    }

    /* renamed from: b */
    public void mo1789b(C3394u c3394u) {
        this.f10174c = null;
    }

    protected void onDraw(Canvas canvas) {
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        canvas.drawCircle((float) width, (float) height, (float) Math.min(width, height), this.f10173b);
        super.onDraw(canvas);
    }
}
