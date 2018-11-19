package com.facebook.ads.internal.view.p051b;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.ads.internal.p034a.C1348a;
import com.facebook.ads.internal.p034a.C1349b;
import com.facebook.ads.internal.p041h.C1425f;
import com.facebook.ads.internal.view.C3394u;
import com.facebook.ads.internal.view.p052c.p080a.C3328a;
import java.util.HashMap;

/* renamed from: com.facebook.ads.internal.view.b.a */
public class C1546a extends RelativeLayout {
    /* renamed from: a */
    private final String f4322a;
    /* renamed from: b */
    private C3394u f4323b;
    /* renamed from: c */
    private final Paint f4324c = new Paint();
    /* renamed from: d */
    private final RectF f4325d;

    public C1546a(Context context, String str, String str2, int i, C3394u c3394u, final C1425f c1425f, final String str3) {
        super(context);
        this.f4322a = str;
        this.f4323b = c3394u;
        View textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTextSize(16.0f);
        textView.setText(str2);
        textView.setTypeface(Typeface.defaultFromStyle(1));
        setGravity(17);
        addView(textView);
        this.f4324c.setStyle(Style.FILL);
        this.f4324c.setColor(i);
        this.f4325d = new RectF();
        setBackgroundColor(0);
        setOnClickListener(new OnClickListener(this) {
            /* renamed from: c */
            final /* synthetic */ C1546a f4321c;

            public void onClick(View view) {
                Throwable e;
                String valueOf;
                String stringBuilder;
                try {
                    Uri parse = Uri.parse(this.f4321c.f4322a);
                    this.f4321c.f4323b.getEventBus().m4994a(new C3328a(parse));
                    C1348a a = C1349b.m4701a(this.f4321c.getContext(), c1425f, str3, parse, new HashMap());
                    if (a != null) {
                        a.mo1718b();
                    }
                } catch (ActivityNotFoundException e2) {
                    e = e2;
                    valueOf = String.valueOf(C1546a.class);
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Error while opening ");
                    stringBuilder2.append(this.f4321c.f4322a);
                    stringBuilder = stringBuilder2.toString();
                    Log.e(valueOf, stringBuilder, e);
                } catch (Exception e3) {
                    e = e3;
                    valueOf = String.valueOf(C1546a.class);
                    stringBuilder = "Error executing action";
                    Log.e(valueOf, stringBuilder, e);
                }
            }
        });
    }

    protected void onDraw(Canvas canvas) {
        float f = getContext().getResources().getDisplayMetrics().density;
        this.f4325d.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        f *= 10.0f;
        canvas.drawRoundRect(this.f4325d, f, f, this.f4324c);
        super.onDraw(canvas);
    }
}
