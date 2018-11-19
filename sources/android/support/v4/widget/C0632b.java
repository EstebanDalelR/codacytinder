package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build.VERSION;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

/* renamed from: android.support.v4.widget.b */
class C0632b extends ImageView {
    /* renamed from: a */
    int f1970a;
    /* renamed from: b */
    private AnimationListener f1971b;

    /* renamed from: android.support.v4.widget.b$a */
    private class C0631a extends OvalShape {
        /* renamed from: a */
        final /* synthetic */ C0632b f1967a;
        /* renamed from: b */
        private RadialGradient f1968b;
        /* renamed from: c */
        private Paint f1969c = new Paint();

        C0631a(C0632b c0632b, int i) {
            this.f1967a = c0632b;
            c0632b.f1970a = i;
            m2555a((int) rect().width());
        }

        protected void onResize(float f, float f2) {
            super.onResize(f, f2);
            m2555a((int) f);
        }

        public void draw(Canvas canvas, Paint paint) {
            int width = this.f1967a.getWidth() / 2;
            float f = (float) width;
            float height = (float) (this.f1967a.getHeight() / 2);
            canvas.drawCircle(f, height, f, this.f1969c);
            canvas.drawCircle(f, height, (float) (width - this.f1967a.f1970a), paint);
        }

        /* renamed from: a */
        private void m2555a(int i) {
            float f = (float) (i / 2);
            this.f1968b = new RadialGradient(f, f, (float) this.f1967a.f1970a, new int[]{1023410176, 0}, null, TileMode.CLAMP);
            this.f1969c.setShader(this.f1968b);
        }
    }

    C0632b(Context context, int i) {
        Drawable shapeDrawable;
        super(context);
        context = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (1.75f * context);
        int i3 = (int) (0.0f * context);
        this.f1970a = (int) (3.5f * context);
        if (m2556a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            ViewCompat.m2215i(this, context * 4.0f);
        } else {
            Drawable shapeDrawable2 = new ShapeDrawable(new C0631a(this, this.f1970a));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer((float) this.f1970a, (float) i3, (float) i2, 503316480);
            context = this.f1970a;
            setPadding(context, context, context, context);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i);
        ViewCompat.m2183a((View) this, shapeDrawable);
    }

    /* renamed from: a */
    private boolean m2556a() {
        return VERSION.SDK_INT >= 21;
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (m2556a() == 0) {
            setMeasuredDimension(getMeasuredWidth() + (this.f1970a * 2), getMeasuredHeight() + (this.f1970a * 2));
        }
    }

    /* renamed from: a */
    public void m2557a(AnimationListener animationListener) {
        this.f1971b = animationListener;
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        if (this.f1971b != null) {
            this.f1971b.onAnimationStart(getAnimation());
        }
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        if (this.f1971b != null) {
            this.f1971b.onAnimationEnd(getAnimation());
        }
    }

    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }
}
