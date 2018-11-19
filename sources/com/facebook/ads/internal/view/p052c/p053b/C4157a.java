package com.facebook.ads.internal.view.p052c.p053b;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Transformation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.ads.internal.p047k.C1490h;
import com.facebook.ads.internal.p047k.C1507t;
import com.facebook.ads.internal.p047k.C1510w;
import com.facebook.ads.internal.p047k.ak;

/* renamed from: com.facebook.ads.internal.view.c.b.a */
public class C4157a extends C3361o {
    /* renamed from: a */
    private final C1566a f13290a;

    /* renamed from: com.facebook.ads.internal.view.c.b.a$a */
    public static class C1566a extends RelativeLayout {
        /* renamed from: a */
        private final String f4353a;
        /* renamed from: b */
        private final String f4354b;
        /* renamed from: c */
        private final String f4355c;
        /* renamed from: d */
        private final DisplayMetrics f4356d;
        /* renamed from: e */
        private ImageView f4357e;
        /* renamed from: f */
        private TextView f4358f;
        /* renamed from: g */
        private boolean f4359g = false;

        /* renamed from: com.facebook.ads.internal.view.c.b.a$a$1 */
        class C15611 implements OnTouchListener {
            /* renamed from: a */
            final /* synthetic */ C1566a f4344a;

            C15611(C1566a c1566a) {
                this.f4344a = c1566a;
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                if (!this.f4344a.f4359g) {
                    this.f4344a.m5435d();
                } else if (!TextUtils.isEmpty(this.f4344a.f4354b)) {
                    C1490h.m5252a(new ak(), this.f4344a.getContext(), Uri.parse(this.f4344a.f4354b), this.f4344a.f4355c);
                }
                return true;
            }
        }

        public C1566a(Context context, String str, String str2, float[] fArr, String str3) {
            super(context);
            this.f4353a = str;
            this.f4354b = str2;
            this.f4355c = str3;
            this.f4356d = context.getResources().getDisplayMetrics();
            Drawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-16777216);
            gradientDrawable.setAlpha(178);
            gradientDrawable.setCornerRadii(new float[]{fArr[0] * this.f4356d.density, fArr[0] * this.f4356d.density, fArr[1] * this.f4356d.density, fArr[1] * this.f4356d.density, fArr[2] * this.f4356d.density, fArr[2] * this.f4356d.density, fArr[3] * this.f4356d.density, fArr[3] * this.f4356d.density});
            if (VERSION.SDK_INT >= 16) {
                setBackground(gradientDrawable);
            } else {
                setBackgroundDrawable(gradientDrawable);
            }
            m5428a();
            m5432b();
            m5434c();
            setMinimumWidth(Math.round(this.f4356d.density * 20.0f));
            setMinimumHeight(Math.round(this.f4356d.density * 18.0f));
        }

        /* renamed from: a */
        private void m5428a() {
            setOnTouchListener(new C15611(this));
        }

        /* renamed from: b */
        private void m5432b() {
            Context context = getContext();
            this.f4357e = new ImageView(context);
            this.f4357e.setImageBitmap(C1510w.m5311a(context, C1507t.IC_AD_CHOICES));
            addView(this.f4357e);
            LayoutParams layoutParams = new RelativeLayout.LayoutParams(Math.round(this.f4356d.density * 16.0f), Math.round(this.f4356d.density * 16.0f));
            layoutParams.addRule(9);
            layoutParams.addRule(15, -1);
            layoutParams.setMargins(Math.round(this.f4356d.density * 4.0f), Math.round(this.f4356d.density * 2.0f), Math.round(this.f4356d.density * 2.0f), Math.round(this.f4356d.density * 2.0f));
            this.f4357e.setLayoutParams(layoutParams);
        }

        /* renamed from: c */
        private void m5434c() {
            this.f4358f = new TextView(getContext());
            addView(this.f4358f);
            LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.width = 0;
            layoutParams.leftMargin = (int) (this.f4356d.density * 20.0f);
            layoutParams.addRule(9);
            layoutParams.addRule(15, -1);
            this.f4358f.setLayoutParams(layoutParams);
            this.f4358f.setSingleLine();
            this.f4358f.setText(this.f4353a);
            this.f4358f.setTextSize(10.0f);
            this.f4358f.setTextColor(-4341303);
        }

        /* renamed from: d */
        private void m5435d() {
            Paint paint = new Paint();
            paint.setTextSize(this.f4358f.getTextSize());
            int round = Math.round(paint.measureText(this.f4353a) + (this.f4356d.density * 4.0f));
            final int width = getWidth();
            round += width;
            this.f4359g = true;
            Animation c15622 = new Animation(this) {
                /* renamed from: c */
                final /* synthetic */ C1566a f4347c;

                protected void applyTransformation(float f, Transformation transformation) {
                    int i = (int) (((float) width) + (((float) (round - width)) * f));
                    this.f4347c.getLayoutParams().width = i;
                    this.f4347c.requestLayout();
                    this.f4347c.f4358f.getLayoutParams().width = i - width;
                    this.f4347c.f4358f.requestLayout();
                }

                public boolean willChangeBounds() {
                    return true;
                }
            };
            c15622.setAnimationListener(new AnimationListener(this) {
                /* renamed from: c */
                final /* synthetic */ C1566a f4352c;

                /* renamed from: com.facebook.ads.internal.view.c.b.a$a$3$1 */
                class C15641 implements Runnable {
                    /* renamed from: a */
                    final /* synthetic */ C15653 f4349a;

                    /* renamed from: com.facebook.ads.internal.view.c.b.a$a$3$1$1 */
                    class C15631 extends Animation {
                        /* renamed from: a */
                        final /* synthetic */ C15641 f4348a;

                        C15631(C15641 c15641) {
                            this.f4348a = c15641;
                        }

                        protected void applyTransformation(float f, Transformation transformation) {
                            int i = (int) (((float) round) + (((float) (width - round)) * f));
                            this.f4348a.f4349a.f4352c.getLayoutParams().width = i;
                            this.f4348a.f4349a.f4352c.requestLayout();
                            this.f4348a.f4349a.f4352c.f4358f.getLayoutParams().width = i - width;
                            this.f4348a.f4349a.f4352c.f4358f.requestLayout();
                        }

                        public boolean willChangeBounds() {
                            return true;
                        }
                    }

                    C15641(C15653 c15653) {
                        this.f4349a = c15653;
                    }

                    public void run() {
                        if (this.f4349a.f4352c.f4359g) {
                            this.f4349a.f4352c.f4359g = false;
                            Animation c15631 = new C15631(this);
                            c15631.setDuration(300);
                            c15631.setFillAfter(true);
                            this.f4349a.f4352c.startAnimation(c15631);
                        }
                    }
                }

                public void onAnimationEnd(Animation animation) {
                    new Handler().postDelayed(new C15641(this), 3000);
                }

                public void onAnimationRepeat(Animation animation) {
                }

                public void onAnimationStart(Animation animation) {
                }
            });
            c15622.setDuration(300);
            c15622.setFillAfter(true);
            startAnimation(c15622);
        }
    }

    public C4157a(Context context, String str, String str2, float[] fArr) {
        super(context);
        this.f13290a = new C1566a(context, "AdChoices", str, fArr, str2);
        addView(this.f13290a);
    }
}
