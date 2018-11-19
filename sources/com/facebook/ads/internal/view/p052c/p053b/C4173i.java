package com.facebook.ads.internal.view.p052c.p053b;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.p041h.C1429s;
import com.facebook.ads.internal.view.p052c.p080a.C3341n;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.internal.view.c.b.i */
public class C4173i extends C3361o {
    /* renamed from: a */
    private final C1576a f13322a;
    /* renamed from: b */
    private final int f13323b;
    /* renamed from: c */
    private final String f13324c;
    /* renamed from: d */
    private final String f13325d;
    /* renamed from: e */
    private final AtomicBoolean f13326e;
    /* renamed from: f */
    private final C1429s<C3341n> f13327f = new C33581(this);

    /* renamed from: com.facebook.ads.internal.view.c.b.i$2 */
    class C15752 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C4173i f4371a;

        C15752(C4173i c4173i) {
            this.f4371a = c4173i;
        }

        public void onClick(View view) {
            if (this.f4371a.f13326e.get()) {
                if (this.f4371a.getVideoView() != null) {
                    this.f4371a.getVideoView().m13063g();
                }
                return;
            }
            Log.i("SkipPlugin", "User clicked skip before the ads is allowed to skip.");
        }
    }

    /* renamed from: com.facebook.ads.internal.view.c.b.i$a */
    private static class C1576a extends TextView {
        /* renamed from: a */
        private final Paint f4372a = new Paint();
        /* renamed from: b */
        private final Paint f4373b;
        /* renamed from: c */
        private final RectF f4374c;

        public C1576a(Context context) {
            super(context);
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            setBackgroundColor(0);
            setTextColor(-3355444);
            setPadding((int) (displayMetrics.density * 9.0f), (int) (displayMetrics.density * 5.0f), (int) (displayMetrics.density * 9.0f), (int) (displayMetrics.density * 5.0f));
            setTextSize(18.0f);
            this.f4372a.setStyle(Style.STROKE);
            this.f4372a.setColor(-10066330);
            this.f4372a.setStrokeWidth(1.0f);
            this.f4372a.setAntiAlias(true);
            this.f4373b = new Paint();
            this.f4373b.setStyle(Style.FILL);
            this.f4373b.setColor(-1895825408);
            this.f4374c = new RectF();
        }

        protected void onDraw(Canvas canvas) {
            if (getText().length() != 0) {
                int width = getWidth();
                int height = getHeight();
                float f = (float) 0;
                this.f4374c.set(f, f, (float) width, (float) height);
                canvas.drawRoundRect(this.f4374c, 6.0f, 6.0f, this.f4373b);
                float f2 = (float) 2;
                this.f4374c.set(f2, f2, (float) (width - 2), (float) (height - 2));
                canvas.drawRoundRect(this.f4374c, 6.0f, 6.0f, this.f4372a);
                super.onDraw(canvas);
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.c.b.i$1 */
    class C33581 extends C1429s<C3341n> {
        /* renamed from: a */
        final /* synthetic */ C4173i f10177a;

        C33581(C4173i c4173i) {
            this.f10177a = c4173i;
        }

        /* renamed from: a */
        public Class<C3341n> mo1725a() {
            return C3341n.class;
        }

        /* renamed from: a */
        public void m12911a(C3341n c3341n) {
            if (!this.f10177a.f13326e.get() && this.f10177a.getVideoView() != null) {
                int b = this.f10177a.f13323b - (this.f10177a.getVideoView().getCurrentPosition() / AdError.NETWORK_ERROR_CODE);
                if (b > 0) {
                    C1576a d = this.f10177a.f13322a;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(this.f10177a.f13324c);
                    stringBuilder.append(' ');
                    stringBuilder.append(b);
                    d.setText(stringBuilder.toString());
                    return;
                }
                this.f10177a.f13322a.setText(this.f10177a.f13325d);
                this.f10177a.f13326e.set(true);
            }
        }
    }

    public C4173i(Context context, int i, String str, String str2) {
        super(context);
        this.f13323b = i;
        this.f13324c = str;
        this.f13325d = str2;
        this.f13326e = new AtomicBoolean(false);
        this.f13322a = new C1576a(context);
        C1576a c1576a = this.f13322a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f13324c);
        stringBuilder.append(' ');
        stringBuilder.append(i);
        c1576a.setText(stringBuilder.toString());
        addView(this.f13322a, new LayoutParams(-2, -2));
    }

    /* renamed from: a */
    public void mo3339a() {
        super.mo3339a();
        if (getVideoView() != null) {
            getVideoView().getEventBus().m4996a(this.f13327f);
        }
        this.f13322a.setOnClickListener(new C15752(this));
    }

    /* renamed from: b */
    public void mo3340b() {
        if (getVideoView() != null) {
            this.f13322a.setOnClickListener(null);
            getVideoView().getEventBus().m4998b(this.f13327f);
        }
        super.mo3340b();
    }
}
