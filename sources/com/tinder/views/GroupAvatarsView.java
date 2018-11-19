package com.tinder.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.FutureTarget;
import com.tinder.C6250b.C6249b;
import com.tinder.R;
import com.tinder.model.DefaultObserver;
import com.tinder.utils.ad;
import java.util.ArrayList;
import java.util.List;
import rx.Observable;
import rx.Subscription;
import rx.p494a.p496b.C19397a;
import rx.schedulers.Schedulers;

public class GroupAvatarsView extends View {
    /* renamed from: a */
    int f47756a;
    /* renamed from: b */
    int f47757b;
    @Nullable
    /* renamed from: c */
    private String[] f47758c;
    @Nullable
    @DrawableRes
    /* renamed from: d */
    private int[] f47759d;
    /* renamed from: e */
    private Paint[] f47760e;
    /* renamed from: f */
    private Matrix[] f47761f;
    /* renamed from: g */
    private Paint f47762g;
    /* renamed from: h */
    private Bitmap[] f47763h;
    @Nullable
    /* renamed from: i */
    private FutureTarget<Bitmap> f47764i;
    /* renamed from: j */
    private Path f47765j = null;
    /* renamed from: k */
    private RectF f47766k = null;
    @ColorInt
    /* renamed from: l */
    private int f47767l = -1;
    /* renamed from: m */
    private int f47768m;
    /* renamed from: n */
    private int f47769n;
    /* renamed from: o */
    private int f47770o = -1;
    /* renamed from: p */
    private int f47771p;
    /* renamed from: q */
    private int f47772q;
    /* renamed from: r */
    private int f47773r = -1;
    /* renamed from: s */
    private boolean f47774s = false;
    /* renamed from: t */
    private boolean f47775t = false;
    /* renamed from: u */
    private Subscription f47776u;
    @Nullable
    /* renamed from: v */
    private C15433a f47777v;

    /* renamed from: com.tinder.views.GroupAvatarsView$1 */
    class C154311 implements OnAttachStateChangeListener {
        /* renamed from: a */
        final /* synthetic */ GroupAvatarsView f47754a;

        public void onViewAttachedToWindow(View view) {
        }

        C154311(GroupAvatarsView groupAvatarsView) {
            this.f47754a = groupAvatarsView;
        }

        public void onViewDetachedFromWindow(View view) {
            if (this.f47754a.f47776u != null && this.f47754a.f47776u.isUnsubscribed() == null) {
                this.f47754a.f47776u.unsubscribe();
            }
            this.f47754a.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: com.tinder.views.GroupAvatarsView$2 */
    class C154322 implements OnGlobalLayoutListener {
        /* renamed from: a */
        final /* synthetic */ GroupAvatarsView f47755a;

        C154322(GroupAvatarsView groupAvatarsView) {
            this.f47755a = groupAvatarsView;
        }

        public void onGlobalLayout() {
            if (this.f47755a.f47775t) {
                ad.a("Measured after layout, downloading avatars");
                this.f47755a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                this.f47755a.m57882e();
            }
        }
    }

    /* renamed from: com.tinder.views.GroupAvatarsView$a */
    interface C15433a {
        /* renamed from: a */
        void mo12737a();

        /* renamed from: b */
        void mo12738b();
    }

    /* renamed from: com.tinder.views.GroupAvatarsView$3 */
    class C182993 extends DefaultObserver<Bitmap> {
        /* renamed from: a */
        final /* synthetic */ GroupAvatarsView f56661a;

        /* renamed from: a */
        public void m66282a(Bitmap bitmap) {
        }

        C182993(GroupAvatarsView groupAvatarsView) {
            this.f56661a = groupAvatarsView;
        }

        public /* synthetic */ void onNext(Object obj) {
            m66282a((Bitmap) obj);
        }
    }

    /* renamed from: com.tinder.views.GroupAvatarsView$4 */
    class C183004 extends DefaultObserver<Bitmap> {
        /* renamed from: a */
        final /* synthetic */ GroupAvatarsView f56662a;

        /* renamed from: a */
        public void m66283a(Bitmap bitmap) {
        }

        C183004(GroupAvatarsView groupAvatarsView) {
            this.f56662a = groupAvatarsView;
        }

        public /* synthetic */ void onNext(Object obj) {
            m66283a((Bitmap) obj);
        }
    }

    public GroupAvatarsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m57870a(context, attributeSet, 0, 0);
    }

    /* renamed from: a */
    private void m57870a(Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        if (attributeSet != null) {
            context = context.getTheme().obtainStyledAttributes(attributeSet, C6249b.GroupAvatarsView, i, i2);
            attributeSet = getResources().getDimensionPixelSize(R.dimen.avatar_length_matches);
            try {
                this.f47772q = context.getInt(4, 0);
                this.f47771p = context.getDimensionPixelSize(2, attributeSet);
                this.f47769n = context.getDimensionPixelSize(1, 3);
                this.f47773r = context.getDimensionPixelSize(3, 0);
                this.f47767l = context.getColor(0, -1);
            } finally {
                context.recycle();
            }
        }
        if (this.f47773r > null) {
            this.f47765j = new Path();
            this.f47766k = new RectF();
        }
        this.f47762g = new Paint();
        this.f47762g.setColor(this.f47767l);
        this.f47762g.setStrokeWidth((float) this.f47769n);
        this.f47762g.setAntiAlias(true);
        this.f47756a = this.f47771p;
        this.f47757b = this.f47771p;
        addOnAttachStateChangeListener(new C154311(this));
    }

    @MainThread
    public void setBorderColor(@ColorInt int i) {
        this.f47767l = i;
        this.f47762g.setColor(this.f47767l);
        invalidate();
    }

    @MainThread
    public void setCornerRadius(int i) {
        this.f47773r = i;
        this.f47765j = new Path();
        this.f47766k = new RectF();
        if (this.f47775t != 0) {
            invalidate();
        }
    }

    @MainThread
    public void setMode(int i) {
        this.f47772q = i;
        if (this.f47775t != 0) {
            invalidate();
        }
    }

    @MainThread
    public void setStrokeWidth(int i) {
        this.f47769n = i;
        this.f47762g.setStrokeWidth((float) this.f47769n);
        if (this.f47775t != 0) {
            invalidate();
        }
    }

    public void setDefaultPixelSize(int i) {
        if (this.f47775t) {
            ad.a("Not setting default pixel size, already measured");
        } else {
            this.f47771p = i;
        }
    }

    protected void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        i = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        i2 = MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            this.f47756a = i;
        } else if (mode == Integer.MIN_VALUE) {
            this.f47756a = Math.min(this.f47771p, i);
        } else {
            this.f47756a = this.f47771p;
        }
        if (mode2 == 1073741824) {
            this.f47757b = i2;
        } else if (mode2 == Integer.MIN_VALUE) {
            this.f47757b = Math.min(this.f47771p, i2);
        } else {
            this.f47757b = this.f47771p;
        }
        setMeasuredDimension(this.f47756a, this.f47757b);
        this.f47775t = true;
        this.f47766k.set(0.0f, 0.0f, (float) this.f47756a, (float) this.f47757b);
        this.f47765j.addRoundRect(this.f47766k, this.f47772q == 3 ? new float[]{(float) this.f47773r, (float) this.f47773r, (float) this.f47773r, (float) this.f47773r, (float) this.f47773r, (float) this.f47773r, (float) this.f47773r, (float) this.f47773r} : new float[]{(float) this.f47773r, (float) this.f47773r, (float) this.f47773r, (float) this.f47773r, null, null, null, null}, Direction.CCW);
    }

    /* renamed from: a */
    public void m57894a(@Nullable C15433a c15433a, @DrawableRes int... iArr) {
        if (iArr.length != 0) {
            if (iArr.length <= 4) {
                this.f47774s = false;
                this.f47777v = c15433a;
                this.f47759d = iArr;
                m57880d();
                return;
            }
        }
        ad.c("Cannot create an avatar from resources with zero or more than four avatars");
    }

    /* renamed from: a */
    public void m57895a(@Nullable C15433a c15433a, String... strArr) {
        if (strArr.length != 0) {
            if (strArr.length <= 4) {
                this.f47774s = false;
                this.f47777v = c15433a;
                this.f47758c = strArr;
                m57880d();
                return;
            }
        }
        ad.c("Cannot create an avatar from url with zero or more than four avatars");
    }

    /* renamed from: d */
    private void m57880d() {
        if (this.f47775t) {
            ad.a("Measured, downloading avatars");
            m57882e();
            return;
        }
        getViewTreeObserver().addOnGlobalLayoutListener(new C154322(this));
    }

    /* renamed from: e */
    private void m57882e() {
        Object obj = null;
        Object obj2 = (this.f47758c == null || this.f47758c.length == 0) ? null : 1;
        if (!(this.f47759d == null || this.f47759d.length == 0)) {
            obj = 1;
        }
        if (obj == null && obj2 == null) {
            ad.c("Not downloading avatars, no urls set.");
            return;
        }
        if (this.f47777v != null) {
            this.f47777v.mo12738b();
        }
        if (this.f47772q == 0) {
            m57886g();
        } else if (this.f47772q == 1 || this.f47772q == 2 || this.f47772q == 3) {
            m57884f();
        }
    }

    /* renamed from: f */
    private void m57884f() {
        int i = 0;
        int length = this.f47758c != null ? this.f47758c.length : this.f47759d != null ? this.f47759d.length : 0;
        if (length == 0) {
            ad.c("No avatars passed in to draw square avatars");
            return;
        }
        this.f47763h = new Bitmap[length];
        int i2 = length - 1;
        switch (i2) {
            case 0:
                this.f47768m = 0;
                break;
            case 1:
                this.f47768m = 1;
                break;
            case 2:
                this.f47768m = 2;
                break;
            case 3:
                this.f47768m = 3;
                break;
            default:
                break;
        }
        List arrayList = new ArrayList(length);
        while (i < length) {
            int i3;
            int i4;
            if (i2 == 3) {
                i3 = (this.f47757b / 2) - this.f47769n;
                i4 = (this.f47756a / 2) - this.f47769n;
            } else if (i2 == 2) {
                if (i == 0) {
                    i3 = (this.f47757b / 2) - this.f47769n;
                    i4 = this.f47756a;
                } else {
                    i3 = (this.f47757b / 2) - this.f47769n;
                    i4 = (this.f47756a / 2) - this.f47769n;
                }
            } else if (i2 == 1) {
                i3 = (this.f47757b / 2) - this.f47769n;
                i4 = this.f47756a;
            } else {
                i3 = this.f47757b;
                i4 = this.f47756a;
            }
            if (this.f47758c != null) {
                arrayList.add(m57873b(this.f47758c[i], i4, i3));
            } else if (this.f47759d != null) {
                arrayList.add(m57872b(this.f47759d[i], i4, i3));
            }
            i++;
        }
        this.f47776u = Observable.a(arrayList, new C18303m(this)).m(null).a(C19397a.a()).a(new C18997n(this)).a(new C182993(this));
    }

    /* renamed from: b */
    final /* synthetic */ Bitmap m57897b(Object[] objArr) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            this.f47763h[i] = (Bitmap) objArr[i];
        }
        return null;
    }

    /* renamed from: c */
    final /* synthetic */ void m57899c() {
        this.f47774s = true;
        if (this.f47777v != null) {
            this.f47777v.mo12737a();
        }
        ad.a("All avatars loaded for draw, drawing.");
        invalidate();
    }

    /* renamed from: g */
    private void m57886g() {
        int i = 0;
        int length = this.f47758c != null ? this.f47758c.length : this.f47759d != null ? this.f47759d.length : 0;
        if (length == 0) {
            ad.c("No avatars passed in to load");
            return;
        }
        this.f47760e = new Paint[length];
        this.f47763h = new Bitmap[length];
        this.f47761f = new Matrix[length];
        int i2 = length - 1;
        switch (i2) {
            case 0:
                this.f47768m = 0;
                this.f47770o = (this.f47756a / 2) - this.f47769n;
                break;
            case 1:
                this.f47768m = 1;
                this.f47770o = ((int) ((((double) this.f47756a) / 1.5d) / 2.0d)) - this.f47769n;
                break;
            case 2:
                this.f47768m = 2;
                this.f47770o = ((this.f47756a / 2) / 2) - this.f47769n;
                break;
            case 3:
                this.f47768m = 3;
                this.f47770o = ((this.f47756a / 2) / 2) - this.f47769n;
                break;
            default:
                break;
        }
        if (this.f47770o == -1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("GroupAvatarsView cannot draw ");
            stringBuilder.append(i2);
            stringBuilder.append(" avatars");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        int i3 = this.f47770o * 2;
        List arrayList = new ArrayList(i2);
        while (i < length) {
            if (this.f47758c != null) {
                arrayList.add(m57873b(this.f47758c[i], i3, i3));
            } else if (this.f47759d != null) {
                arrayList.add(m57872b(this.f47759d[i], i3, i3));
            }
            i++;
        }
        this.f47776u = Observable.a(arrayList, new C18304o(this)).m(C18305p.f56687a).a(C18998q.f58773a).a(C19397a.a()).a(new C18999r(this)).a(new C183004(this));
    }

    /* renamed from: a */
    final /* synthetic */ Bitmap m57892a(Object[] objArr) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Bitmap bitmap = (Bitmap) objArr[i];
            Paint a = m57868a(bitmap);
            this.f47761f[i] = new Matrix();
            this.f47760e[i] = a;
            this.f47763h[i] = bitmap;
        }
        return null;
    }

    /* renamed from: b */
    final /* synthetic */ void m57898b() {
        this.f47774s = true;
        if (this.f47777v != null) {
            this.f47777v.mo12737a();
        }
        ad.a("All avatars loaded, drawing.");
        invalidate();
    }

    /* renamed from: b */
    private Observable<Bitmap> m57872b(@DrawableRes int i, int i2, int i3) {
        return Observable.a(new C15466s(this, i, i2, i3)).m(new C18306t(this)).b(Schedulers.io()).a(C19397a.a());
    }

    /* renamed from: a */
    final /* synthetic */ Bitmap m57889a(@DrawableRes int i, int i2, int i3) throws Exception {
        this.f47764i = C0994i.b(getContext()).a(Integer.valueOf(i)).l().b(R.drawable.ic_match_placeholder).a(DiskCacheStrategy.ALL).a().d(i2, i3);
        return (Bitmap) this.f47764i.get();
    }

    /* renamed from: b */
    final /* synthetic */ Bitmap m57896b(Throwable th) {
        if (th instanceof InterruptedException) {
            ad.a("Failed resource avatar load, thread was interrupted.");
        } else {
            ad.a("Failed to load resource for avatar, using placeholder", th);
        }
        try {
            return BitmapFactory.decodeResource(getContext().getResources(), R.drawable.ic_match_placeholder);
        } catch (Throwable th2) {
            ad.a("OOM while loading error resource for resource avatars", th2);
            return null;
        }
    }

    /* renamed from: b */
    private Observable<Bitmap> m57873b(String str, int i, int i2) {
        return Observable.a(new C15467u(this, str, i, i2)).m(new C18307v(this)).b(Schedulers.io()).a(C19397a.a());
    }

    /* renamed from: a */
    final /* synthetic */ Bitmap m57890a(String str, int i, int i2) throws Exception {
        this.f47764i = C0994i.b(getContext()).a(str).l().b(R.drawable.ic_match_placeholder).a(DiskCacheStrategy.ALL).a().d(i, i2);
        return (Bitmap) this.f47764i.get();
    }

    /* renamed from: a */
    final /* synthetic */ Bitmap m57891a(Throwable th) {
        if (th instanceof InterruptedException) {
            ad.a("Failed avatar load, thread was interrupted.");
        } else {
            ad.a("Failed to load bitmap for avatar, using placeholder", th);
        }
        try {
            return BitmapFactory.decodeResource(getContext().getResources(), R.drawable.ic_match_placeholder);
        } catch (Throwable th2) {
            ad.a("OOM while loading error resource for avatars", th2);
            return null;
        }
    }

    @NonNull
    /* renamed from: a */
    private Paint m57868a(Bitmap bitmap) {
        Shader bitmapShader = new BitmapShader(bitmap, TileMode.CLAMP, TileMode.CLAMP);
        bitmap = new Paint();
        bitmap.setAntiAlias(true);
        bitmap.setFilterBitmap(true);
        bitmap.setDither(true);
        bitmap.setShader(bitmapShader);
        bitmap.setStyle(Style.FILL);
        return bitmap;
    }

    protected void onDraw(android.graphics.Canvas r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        super.onDraw(r3);
        r0 = r2.f47774s;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return;
    L_0x0008:
        r0 = r2.f47776u;
        if (r0 == 0) goto L_0x0019;
    L_0x000c:
        r0 = r2.f47776u;
        r0 = r0.isUnsubscribed();
        if (r0 != 0) goto L_0x0019;
    L_0x0014:
        r0 = r2.f47776u;
        r0.unsubscribe();
    L_0x0019:
        r0 = r2.f47773r;
        if (r0 <= 0) goto L_0x0032;
    L_0x001d:
        r0 = com.tinder.utils.C15374w.m57704a();
        if (r0 == 0) goto L_0x0032;
    L_0x0023:
        r0 = r2.f47765j;	 Catch:{ UnsupportedOperationException -> 0x0029 }
        r3.clipPath(r0);	 Catch:{ UnsupportedOperationException -> 0x0029 }
        goto L_0x0032;
    L_0x0029:
        r0 = "Device does not support clipPath()";
        com.tinder.utils.ad.c(r0);
        r0 = 0;
        com.tinder.utils.C15374w.m57703a(r0);
    L_0x0032:
        r0 = r2.f47772q;
        if (r0 != 0) goto L_0x004c;
    L_0x0036:
        r0 = r2.f47768m;
        switch(r0) {
            case 0: goto L_0x0048;
            case 1: goto L_0x0044;
            case 2: goto L_0x0040;
            case 3: goto L_0x003c;
            default: goto L_0x003b;
        };
    L_0x003b:
        goto L_0x0070;
    L_0x003c:
        r2.m57883e(r3);
        goto L_0x0070;
    L_0x0040:
        r2.m57885f(r3);
        goto L_0x0070;
    L_0x0044:
        r2.m57887g(r3);
        goto L_0x0070;
    L_0x0048:
        r2.m57888h(r3);
        goto L_0x0070;
    L_0x004c:
        r0 = r2.f47772q;
        r1 = 1;
        if (r0 == r1) goto L_0x005b;
    L_0x0051:
        r0 = r2.f47772q;
        r1 = 2;
        if (r0 == r1) goto L_0x005b;
    L_0x0056:
        r0 = r2.f47772q;
        r1 = 3;
        if (r0 != r1) goto L_0x0070;
    L_0x005b:
        r0 = r2.f47768m;
        switch(r0) {
            case 0: goto L_0x006d;
            case 1: goto L_0x0069;
            case 2: goto L_0x0065;
            case 3: goto L_0x0061;
            default: goto L_0x0060;
        };
    L_0x0060:
        goto L_0x0070;
    L_0x0061:
        r2.m57881d(r3);
        goto L_0x0070;
    L_0x0065:
        r2.m57876c(r3);
        goto L_0x0070;
    L_0x0069:
        r2.m57874b(r3);
        goto L_0x0070;
    L_0x006d:
        r2.m57871a(r3);
    L_0x0070:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.views.GroupAvatarsView.onDraw(android.graphics.Canvas):void");
    }

    /* renamed from: a */
    public void m57893a() {
        ad.a("Resetting avatar view state");
        this.f47777v = null;
        this.f47774s = false;
        if (this.f47764i != null) {
            C0994i.a(this.f47764i);
        }
        if (this.f47776u != null && !this.f47776u.isUnsubscribed()) {
            this.f47776u.unsubscribe();
        }
    }

    /* renamed from: a */
    private void m57871a(Canvas canvas) {
        if (this.f47763h.length != 1) {
            ad.c("Cannot draw single avatar, more than one shader is set up");
            return;
        }
        RectF rectF = new RectF(0.0f, 0.0f, (float) this.f47756a, (float) this.f47757b);
        if (this.f47763h[0] != null) {
            canvas.drawBitmap(this.f47763h[0], null, rectF, null);
        }
    }

    /* renamed from: b */
    private void m57874b(Canvas canvas) {
        if (this.f47763h.length != 2) {
            ad.c("Cannot draw square double avatar, two shaders not set up");
            return;
        }
        RectF rectF = new RectF(0.0f, 0.0f, (float) this.f47756a, (float) (this.f47757b / 2));
        if (this.f47763h[0] != null) {
            canvas.drawBitmap(this.f47763h[0], null, rectF, null);
        }
        RectF rectF2 = new RectF(0.0f, (float) (this.f47757b / 2), (float) this.f47756a, (float) this.f47757b);
        if (this.f47763h[1] != null) {
            canvas.drawBitmap(this.f47763h[1], null, rectF2, null);
        }
        canvas.drawLine(0.0f, (float) (this.f47757b / 2), (float) this.f47756a, (float) (this.f47757b / 2), this.f47762g);
    }

    /* renamed from: c */
    private void m57876c(Canvas canvas) {
        if (this.f47763h.length != 3) {
            ad.c("Cannot draw triad avatar, three shaders not set up");
            return;
        }
        RectF rectF = new RectF(0.0f, 0.0f, (float) this.f47756a, (float) (this.f47757b / 2));
        if (this.f47763h[0] != null) {
            canvas.drawBitmap(this.f47763h[0], null, rectF, null);
        }
        RectF rectF2 = new RectF(0.0f, (float) (this.f47757b / 2), (float) (this.f47756a / 2), (float) this.f47757b);
        if (this.f47763h[1] != null) {
            canvas.drawBitmap(this.f47763h[1], null, rectF2, null);
        }
        RectF rectF3 = new RectF((float) (this.f47756a / 2), (float) (this.f47757b / 2), (float) this.f47756a, (float) this.f47757b);
        if (this.f47763h[2] != null) {
            canvas.drawBitmap(this.f47763h[2], null, rectF3, null);
        }
        canvas.drawLine(0.0f, (float) (this.f47757b / 2), (float) this.f47756a, (float) (this.f47757b / 2), this.f47762g);
        canvas.drawLine((float) (this.f47756a / 2), (float) (this.f47757b / 2), (float) (this.f47756a / 2), (float) this.f47757b, this.f47762g);
    }

    /* renamed from: d */
    private void m57881d(Canvas canvas) {
        if (this.f47763h.length != 4) {
            ad.c("Cannot draw quad avatar, four shaders not set up");
            return;
        }
        RectF rectF = new RectF(0.0f, 0.0f, (float) (this.f47756a / 2), (float) (this.f47757b / 2));
        if (this.f47763h[0] != null) {
            canvas.drawBitmap(this.f47763h[0], null, rectF, null);
        }
        RectF rectF2 = new RectF((float) (this.f47756a / 2), 0.0f, (float) this.f47756a, (float) (this.f47757b / 2));
        if (this.f47763h[1] != null) {
            canvas.drawBitmap(this.f47763h[1], null, rectF2, null);
        }
        rectF2 = new RectF(0.0f, (float) (this.f47757b / 2), (float) (this.f47756a / 2), (float) this.f47757b);
        if (this.f47763h[2] != null) {
            canvas.drawBitmap(this.f47763h[2], null, rectF2, null);
        }
        RectF rectF3 = new RectF((float) (this.f47756a / 2), (float) (this.f47757b / 2), (float) this.f47756a, (float) this.f47757b);
        if (this.f47763h[3] != null) {
            canvas.drawBitmap(this.f47763h[3], null, rectF3, null);
        }
        canvas.drawLines(new float[]{(float) (this.f47756a / 2), 0.0f, (float) (this.f47756a / 2), (float) this.f47757b, 0.0f, (float) (this.f47757b / 2), (float) this.f47756a, (float) (this.f47757b / 2)}, this.f47762g);
    }

    /* renamed from: e */
    private void m57883e(Canvas canvas) {
        if (this.f47760e.length != 4) {
            ad.c("Cannot draw round quad avatar, four shaders not set up");
            return;
        }
        Paint paint = this.f47760e[0];
        Paint paint2 = this.f47760e[1];
        Paint paint3 = this.f47760e[2];
        Paint paint4 = this.f47760e[3];
        float f = (float) (this.f47756a / 4);
        float f2 = (float) (this.f47757b / 4);
        Matrix matrix = this.f47761f[0];
        if (paint != null) {
            paint.getShader().getLocalMatrix(matrix);
            matrix.setTranslate(f - ((float) this.f47770o), f2 - ((float) this.f47770o));
            paint.getShader().setLocalMatrix(matrix);
            canvas.drawCircle(f, f2, (float) (this.f47770o + this.f47769n), this.f47762g);
            canvas.drawCircle(f, f2, (float) this.f47770o, paint);
        }
        float f3 = (float) (this.f47756a - (this.f47756a / 4));
        float f4 = (float) (this.f47757b / 4);
        Matrix matrix2 = this.f47761f[1];
        if (paint2 != null) {
            paint2.getShader().getLocalMatrix(matrix2);
            matrix2.setTranslate(f3 - ((float) this.f47770o), f4 - ((float) this.f47770o));
            paint2.getShader().setLocalMatrix(matrix2);
            canvas.drawCircle((float) (this.f47756a - (this.f47756a / 4)), (float) (this.f47757b / 4), (float) (this.f47770o + this.f47769n), this.f47762g);
            canvas.drawCircle((float) (this.f47756a - (this.f47756a / 4)), (float) (this.f47757b / 4), (float) this.f47770o, paint2);
        }
        f3 = (float) (this.f47756a / 4);
        f4 = (float) (this.f47757b - (this.f47757b / 4));
        Matrix matrix3 = this.f47761f[2];
        if (paint3 != null) {
            paint3.getShader().getLocalMatrix(matrix3);
            matrix3.setTranslate(f3 - ((float) this.f47770o), f4 - ((float) this.f47770o));
            paint3.getShader().setLocalMatrix(matrix3);
            canvas.drawCircle(f3, f4, (float) (this.f47770o + this.f47769n), this.f47762g);
            canvas.drawCircle((float) (this.f47756a / 4), (float) (this.f47757b - (this.f47757b / 4)), (float) this.f47770o, paint3);
        }
        f3 = (float) (this.f47756a - (this.f47756a / 4));
        float f5 = (float) (this.f47757b - (this.f47757b / 4));
        matrix = this.f47761f[3];
        if (paint4 != null) {
            paint4.getShader().getLocalMatrix(matrix);
            matrix.setTranslate(f3 - ((float) this.f47770o), f5 - ((float) this.f47770o));
            paint4.getShader().setLocalMatrix(matrix);
            canvas.drawCircle(f3, f5, (float) (this.f47770o + this.f47769n), this.f47762g);
            canvas.drawCircle(f3, f5, (float) this.f47770o, paint4);
        }
    }

    /* renamed from: f */
    private void m57885f(Canvas canvas) {
        if (this.f47760e.length != 3) {
            ad.c("Cannot draw round triple avatar, three shaders not set up");
            return;
        }
        Paint paint = this.f47760e[0];
        Paint paint2 = this.f47760e[1];
        Paint paint3 = this.f47760e[2];
        if (!(paint == null || paint2 == null)) {
            if (paint3 != null) {
                float f = ((float) this.f47770o) * 1.1f;
                float f2 = ((float) this.f47770o) * 1.1f;
                float f3 = ((float) this.f47756a) - (((float) this.f47770o) * 1.1f);
                float f4 = ((float) this.f47757b) - (((float) this.f47770o) * 1.1f);
                Matrix matrix = this.f47761f[0];
                paint.getShader().getLocalMatrix(matrix);
                matrix.setTranslate(f - ((float) this.f47770o), f2 - ((float) this.f47770o));
                paint.getShader().setLocalMatrix(matrix);
                canvas.drawCircle(f, f2, (float) (this.f47770o + this.f47769n), this.f47762g);
                canvas.drawCircle(f, f2, (float) this.f47770o, paint);
                Matrix matrix2 = this.f47761f[1];
                paint2.getShader().getLocalMatrix(matrix2);
                matrix2.setTranslate((float) ((this.f47756a / 2) - this.f47770o), (float) ((this.f47757b / 2) - this.f47770o));
                paint2.getShader().setLocalMatrix(matrix2);
                canvas.drawCircle((float) (this.f47756a / 2), (float) (this.f47757b / 2), (float) (this.f47770o + this.f47769n), this.f47762g);
                canvas.drawCircle((float) (this.f47756a / 2), (float) (this.f47757b / 2), (float) this.f47770o, paint2);
                matrix2 = this.f47761f[2];
                paint3.getShader().getLocalMatrix(matrix2);
                matrix2.setTranslate(f3 - ((float) this.f47770o), f4 - ((float) this.f47770o));
                paint3.getShader().setLocalMatrix(matrix2);
                canvas.drawCircle(f3, f4, (float) (this.f47770o + this.f47769n), this.f47762g);
                canvas.drawCircle(f3, f4, (float) this.f47770o, paint3);
                return;
            }
        }
        ad.c("Unable to draw triple avatars, null paints.");
    }

    /* renamed from: g */
    private void m57887g(Canvas canvas) {
        if (this.f47760e.length != 2) {
            ad.c("Cannot draw round double avatar, two shaders not set up");
            return;
        }
        Paint paint = this.f47760e[0];
        Paint paint2 = this.f47760e[1];
        if (paint != null) {
            if (paint2 != null) {
                float f = ((float) this.f47770o) * 1.1f;
                float f2 = ((float) this.f47770o) * 1.1f;
                float f3 = ((float) this.f47756a) - (((float) this.f47770o) * 1.1f);
                float f4 = ((float) this.f47757b) - (((float) this.f47770o) * 1.1f);
                Matrix matrix = this.f47761f[0];
                paint.getShader().getLocalMatrix(matrix);
                matrix.setTranslate(f - ((float) this.f47770o), f2 - ((float) this.f47770o));
                paint.getShader().setLocalMatrix(matrix);
                canvas.drawCircle(f, f2, (float) (this.f47770o + this.f47769n), this.f47762g);
                canvas.drawCircle(f, f2, (float) this.f47770o, paint);
                Matrix matrix2 = this.f47761f[1];
                paint2.getShader().getLocalMatrix(matrix2);
                matrix2.setTranslate(f3 - ((float) this.f47770o), f4 - ((float) this.f47770o));
                paint2.getShader().setLocalMatrix(matrix2);
                canvas.drawCircle(f3, f4, (float) (this.f47770o + this.f47769n), this.f47762g);
                canvas.drawCircle(f3, f4, (float) this.f47770o, paint2);
                return;
            }
        }
        ad.c("Unable to draw two round avatars, null paints.");
    }

    /* renamed from: h */
    private void m57888h(Canvas canvas) {
        if (this.f47760e.length != 1) {
            ad.c("Cannot draw round single avatar, more than one shader set up");
            return;
        }
        Paint paint = this.f47760e[0];
        float f = (float) (this.f47756a / 2);
        float f2 = (float) (this.f47757b / 2);
        if (paint == null) {
            ad.c("Unable to draw round single avatar, null paint.");
            return;
        }
        Matrix matrix = this.f47761f[0];
        paint.getShader().getLocalMatrix(matrix);
        matrix.setTranslate(f - ((float) this.f47770o), f2 - ((float) this.f47770o));
        paint.getShader().setLocalMatrix(matrix);
        canvas.drawCircle(f, f2, (float) (this.f47770o + this.f47769n), this.f47762g);
        canvas.drawCircle(f, f2, (float) this.f47770o, paint);
    }
}
