package com.facebook.ads.internal.view.p052c.p053b;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.view.View;
import com.facebook.ads.internal.view.C3394u;
import com.facebook.ads.internal.view.p052c.p080a.C3329b;
import com.facebook.ads.internal.view.p052c.p080a.C3330c;
import com.facebook.ads.internal.view.p052c.p080a.C3341n;
import com.facebook.ads.internal.view.p052c.p080a.C3342o;

/* renamed from: com.facebook.ads.internal.view.c.b.p */
public class C3362p extends View implements C1582n {
    /* renamed from: a */
    private final Paint f10193a = new Paint();
    /* renamed from: b */
    private final Rect f10194b;
    /* renamed from: c */
    private float f10195c;
    /* renamed from: d */
    private final C3342o f10196d = new C41821(this);
    /* renamed from: e */
    private final C3330c f10197e = new C41832(this);
    @Nullable
    /* renamed from: f */
    private C3394u f10198f;

    /* renamed from: com.facebook.ads.internal.view.c.b.p$1 */
    class C41821 extends C3342o {
        /* renamed from: a */
        final /* synthetic */ C3362p f13341a;

        C41821(C3362p c3362p) {
            this.f13341a = c3362p;
        }

        /* renamed from: a */
        public void m16568a(C3341n c3341n) {
            if (this.f13341a.f10198f != null) {
                int duration = this.f13341a.f10198f.getDuration();
                if (duration > 0) {
                    this.f13341a.f10195c = ((float) this.f13341a.f10198f.getCurrentPosition()) / ((float) duration);
                } else {
                    this.f13341a.f10195c = 0.0f;
                }
                this.f13341a.postInvalidate();
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.c.b.p$2 */
    class C41832 extends C3330c {
        /* renamed from: a */
        final /* synthetic */ C3362p f13342a;

        C41832(C3362p c3362p) {
            this.f13342a = c3362p;
        }

        /* renamed from: a */
        public void m16570a(C3329b c3329b) {
            if (this.f13342a.f10198f != null) {
                this.f13342a.f10195c = 0.0f;
                this.f13342a.postInvalidate();
            }
        }
    }

    public C3362p(Context context) {
        super(context);
        this.f10193a.setStyle(Style.FILL);
        this.f10193a.setColor(-9528840);
        this.f10194b = new Rect();
    }

    /* renamed from: a */
    public void mo1788a(C3394u c3394u) {
        this.f10198f = c3394u;
        c3394u.getEventBus().m4995a(this.f10196d, this.f10197e);
    }

    /* renamed from: b */
    public void mo1789b(C3394u c3394u) {
        c3394u.getEventBus().m4997b(this.f10197e, this.f10196d);
        this.f10198f = null;
    }

    public void draw(Canvas canvas) {
        this.f10194b.set(0, 0, (int) (((float) getWidth()) * this.f10195c), getHeight());
        canvas.drawRect(this.f10194b, this.f10193a);
        super.draw(canvas);
    }
}
