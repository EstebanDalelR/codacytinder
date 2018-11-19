package com.facebook.ads.internal.view.p052c.p053b;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import com.facebook.ads.VideoStartReason;
import com.facebook.ads.internal.view.p052c.p080a.C3329b;
import com.facebook.ads.internal.view.p052c.p080a.C3330c;
import com.facebook.ads.internal.view.p052c.p080a.C3335h;
import com.facebook.ads.internal.view.p052c.p080a.C3336i;
import com.facebook.ads.internal.view.p052c.p080a.C3337j;
import com.facebook.ads.internal.view.p052c.p080a.C3338k;

/* renamed from: com.facebook.ads.internal.view.c.b.l */
public class C4181l extends C3361o {
    /* renamed from: a */
    private final C1581m f13335a;
    /* renamed from: b */
    private final C3336i f13336b;
    /* renamed from: c */
    private final C3338k f13337c;
    /* renamed from: d */
    private final C3330c f13338d;
    /* renamed from: e */
    private final Paint f13339e;
    /* renamed from: f */
    private final RectF f13340f;

    /* renamed from: com.facebook.ads.internal.view.c.b.l$4 */
    class C15784 implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ C4181l f4378a;

        C15784(C4181l c4181l) {
            this.f4378a = c4181l;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f4378a.getVideoView() == null) {
                return false;
            }
            if (motionEvent.getAction() == 0) {
                return true;
            }
            if (motionEvent.getAction() != 1) {
                return false;
            }
            switch (this.f4378a.getVideoView().getState()) {
                case PREPARED:
                case IDLE:
                case PAUSED:
                case PLAYBACK_COMPLETED:
                    this.f4378a.getVideoView().m13055a(VideoStartReason.USER_STARTED);
                    return true;
                case STARTED:
                    this.f4378a.getVideoView().m13058a(true);
                    return true;
                default:
                    return false;
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.c.b.l$1 */
    class C41781 extends C3336i {
        /* renamed from: a */
        final /* synthetic */ C4181l f13332a;

        C41781(C4181l c4181l) {
            this.f13332a = c4181l;
        }

        /* renamed from: a */
        public void m16559a(C3335h c3335h) {
            this.f13332a.f13335a.setChecked(true);
        }
    }

    /* renamed from: com.facebook.ads.internal.view.c.b.l$2 */
    class C41792 extends C3338k {
        /* renamed from: a */
        final /* synthetic */ C4181l f13333a;

        C41792(C4181l c4181l) {
            this.f13333a = c4181l;
        }

        /* renamed from: a */
        public void m16561a(C3337j c3337j) {
            this.f13333a.f13335a.setChecked(false);
        }
    }

    /* renamed from: com.facebook.ads.internal.view.c.b.l$3 */
    class C41803 extends C3330c {
        /* renamed from: a */
        final /* synthetic */ C4181l f13334a;

        C41803(C4181l c4181l) {
            this.f13334a = c4181l;
        }

        /* renamed from: a */
        public void m16563a(C3329b c3329b) {
            this.f13334a.f13335a.setChecked(true);
        }
    }

    public C4181l(Context context) {
        this(context, false);
    }

    public C4181l(Context context, boolean z) {
        super(context);
        this.f13336b = new C41781(this);
        this.f13337c = new C41792(this);
        this.f13338d = new C41803(this);
        this.f13335a = new C1581m(context, z);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 36.0f), (int) (displayMetrics.density * 36.0f));
        layoutParams.addRule(13);
        this.f13335a.setLayoutParams(layoutParams);
        this.f13335a.setChecked(true);
        this.f13339e = new Paint();
        this.f13339e.setStyle(Style.FILL);
        if (z) {
            this.f13339e.setColor(Integer.MIN_VALUE);
        } else {
            this.f13339e.setColor(-1);
            this.f13339e.setAlpha(204);
        }
        this.f13340f = new RectF();
        setBackgroundColor(0);
        addView(this.f13335a);
        setGravity(17);
        LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 72.0f), (int) (displayMetrics.density * 72.0f));
        layoutParams2.addRule(13);
        setLayoutParams(layoutParams2);
    }

    /* renamed from: a */
    protected void mo3339a() {
        super.mo3339a();
        if (getVideoView() != null) {
            getVideoView().getEventBus().m4995a(this.f13336b, this.f13337c, this.f13338d);
        }
        this.f13335a.setOnTouchListener(new C15784(this));
    }

    /* renamed from: b */
    protected void mo3340b() {
        this.f13335a.setOnTouchListener(null);
        if (getVideoView() != null) {
            getVideoView().getEventBus().m4997b(this.f13338d, this.f13337c, this.f13336b);
        }
        super.mo3340b();
    }

    protected void onDraw(Canvas canvas) {
        int min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2;
        canvas.drawCircle((float) (getPaddingLeft() + min), (float) (getPaddingTop() + min), (float) min, this.f13339e);
        super.onDraw(canvas);
    }
}
