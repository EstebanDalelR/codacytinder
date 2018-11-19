package com.facebook.ads.internal.view.component;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.support.v4.graphics.C0443a;
import android.support.v7.widget.AppCompatButton;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.ads.internal.adapters.C1359i;
import com.facebook.ads.internal.p034a.C1348a;
import com.facebook.ads.internal.p034a.C1349b;
import com.facebook.ads.internal.p041h.C1425f;
import com.facebook.ads.internal.p047k.an;
import com.facebook.ads.internal.view.C1604d.C1603a;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.component.a */
public class C4189a extends AppCompatButton {
    /* renamed from: a */
    public static final int f13371a = ((int) (an.f4090b * 16.0f));
    /* renamed from: b */
    private static final int f13372b = ((int) (an.f4090b * 4.0f));
    /* renamed from: c */
    private final C1425f f13373c;
    /* renamed from: d */
    private final Paint f13374d = new Paint();
    /* renamed from: e */
    private final RectF f13375e;
    /* renamed from: f */
    private final boolean f13376f;
    /* renamed from: g */
    private C1603a f13377g;

    public C4189a(Context context, boolean z, boolean z2, C1359i c1359i, C1425f c1425f, C1603a c1603a) {
        super(context);
        this.f13373c = c1425f;
        this.f13377g = c1603a;
        this.f13376f = z;
        setTextSize(2, 16.0f);
        setTypeface(Typeface.create("sans-serif-medium", 0));
        setGravity(17);
        setPadding(f13371a, f13371a, f13371a, f13371a);
        setTextColor(c1359i.m4758f(z2));
        int e = c1359i.m4757e(z2);
        int a = C0443a.m1682a(e, -16777216, 0.1f);
        this.f13374d.setStyle(Style.FILL);
        this.f13374d.setColor(e);
        this.f13375e = new RectF();
        if (!z) {
            Drawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842919}, new ColorDrawable(a));
            stateListDrawable.addState(new int[0], new ColorDrawable(e));
            setBackgroundDrawable(stateListDrawable);
        }
    }

    /* renamed from: a */
    public void m16594a(String str, final String str2, final String str3, final Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(str2)) {
                setText(str.toUpperCase(Locale.US));
                setOnClickListener(new OnClickListener(this) {
                    /* renamed from: d */
                    final /* synthetic */ C4189a f4410d;

                    public void onClick(View view) {
                        Throwable e;
                        String valueOf;
                        String stringBuilder;
                        try {
                            C1348a a = C1349b.m4701a(this.f4410d.getContext(), this.f4410d.f13373c, str3, Uri.parse(str2), map);
                            if (a != null) {
                                a.mo1718b();
                            }
                            if (this.f4410d.f13377g != null) {
                                this.f4410d.f13377g.mo1646a("com.facebook.ads.interstitial.clicked");
                            }
                        } catch (ActivityNotFoundException e2) {
                            e = e2;
                            valueOf = String.valueOf(C4189a.class);
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("Error while opening ");
                            stringBuilder2.append(str2);
                            stringBuilder = stringBuilder2.toString();
                            Log.e(valueOf, stringBuilder, e);
                        } catch (Exception e3) {
                            e = e3;
                            valueOf = String.valueOf(C4189a.class);
                            stringBuilder = "Error executing action";
                            Log.e(valueOf, stringBuilder, e);
                        }
                    }
                });
                return;
            }
        }
        setVisibility(8);
    }

    protected void onDraw(Canvas canvas) {
        if (this.f13376f) {
            this.f13375e.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            canvas.drawRoundRect(this.f13375e, (float) f13372b, (float) f13372b, this.f13374d);
        }
        super.onDraw(canvas);
    }
}
