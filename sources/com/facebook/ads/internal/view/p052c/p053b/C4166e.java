package com.facebook.ads.internal.view.p052c.p053b;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.internal.p034a.C1348a;
import com.facebook.ads.internal.p034a.C1349b;
import com.facebook.ads.internal.p041h.C1425f;
import com.facebook.ads.internal.view.p052c.p080a.C3328a;
import java.util.HashMap;

/* renamed from: com.facebook.ads.internal.view.c.b.e */
public class C4166e extends C3361o {
    /* renamed from: a */
    private final String f13304a;
    /* renamed from: b */
    private final TextView f13305b = new TextView(getContext());
    /* renamed from: c */
    private final C1425f f13306c;
    /* renamed from: d */
    private final String f13307d;
    /* renamed from: e */
    private final Paint f13308e;
    /* renamed from: f */
    private final RectF f13309f;

    /* renamed from: com.facebook.ads.internal.view.c.b.e$1 */
    class C15731 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C4166e f4369a;

        C15731(C4166e c4166e) {
            this.f4369a = c4166e;
        }

        public void onClick(View view) {
            if (this.f4369a.getVideoView() != null) {
                Uri parse = Uri.parse(this.f4369a.f13304a);
                this.f4369a.getVideoView().getEventBus().m4994a(new C3328a(parse));
                C1348a a = C1349b.m4701a(this.f4369a.getContext(), this.f4369a.f13306c, this.f4369a.f13307d, parse, new HashMap());
                if (a != null) {
                    a.mo1718b();
                }
            }
        }
    }

    public C4166e(Context context, String str, C1425f c1425f, String str2, String str3) {
        super(context);
        this.f13304a = str;
        this.f13306c = c1425f;
        this.f13307d = str2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f13305b.setTextColor(-3355444);
        this.f13305b.setTextSize(16.0f);
        this.f13305b.setPadding((int) (displayMetrics.density * 6.0f), (int) (displayMetrics.density * 4.0f), (int) (displayMetrics.density * 6.0f), (int) (displayMetrics.density * 4.0f));
        this.f13308e = new Paint();
        this.f13308e.setStyle(Style.FILL);
        this.f13308e.setColor(-16777216);
        this.f13308e.setAlpha(178);
        this.f13309f = new RectF();
        setBackgroundColor(0);
        this.f13305b.setText(str3);
        addView(this.f13305b, new LayoutParams(-2, -2));
    }

    /* renamed from: a */
    protected void mo3339a() {
        super.mo3339a();
        this.f13305b.setOnClickListener(new C15731(this));
    }

    /* renamed from: b */
    protected void mo3340b() {
        this.f13305b.setOnClickListener(null);
        super.mo3340b();
    }

    protected void onDraw(Canvas canvas) {
        this.f13309f.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        canvas.drawRoundRect(this.f13309f, 0.0f, 0.0f, this.f13308e);
        super.onDraw(canvas);
    }
}
