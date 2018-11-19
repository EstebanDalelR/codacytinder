package com.facebook.ads;

import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
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
import com.facebook.ads.NativeAd.Image;
import com.facebook.ads.internal.p047k.C1490h;
import com.facebook.ads.internal.p047k.ak;
import com.facebook.ads.internal.p047k.an;

public class AdChoicesView extends RelativeLayout {
    /* renamed from: a */
    private final Context f3483a;
    /* renamed from: b */
    private final NativeAd f3484b;
    /* renamed from: c */
    private final float f3485c;
    /* renamed from: d */
    private boolean f3486d;
    /* renamed from: e */
    private TextView f3487e;
    /* renamed from: f */
    private String f3488f;

    public AdChoicesView(Context context, NativeAd nativeAd) {
        this(context, nativeAd, false);
    }

    public AdChoicesView(Context context, final NativeAd nativeAd, boolean z) {
        super(context);
        this.f3486d = false;
        this.f3483a = context;
        this.f3484b = nativeAd;
        this.f3485c = an.f4090b;
        if (!this.f3484b.isAdLoaded() || this.f3484b.m12398a().mo3307g()) {
            this.f3488f = this.f3484b.getAdChoicesText();
            if (TextUtils.isEmpty(this.f3488f)) {
                this.f3488f = "AdChoices";
            }
            Image adChoicesIcon = this.f3484b.getAdChoicesIcon();
            LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            setOnTouchListener(new OnTouchListener(this) {
                /* renamed from: b */
                final /* synthetic */ AdChoicesView f3474b;

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() != 0) {
                        return false;
                    }
                    if (!this.f3474b.f3486d) {
                        this.f3474b.m4646a();
                    } else if (!TextUtils.isEmpty(this.f3474b.f3484b.getAdChoicesLinkUrl())) {
                        C1490h.m5252a(new ak(), this.f3474b.f3483a, Uri.parse(this.f3474b.f3484b.getAdChoicesLinkUrl()), nativeAd.m12408g());
                    }
                    return true;
                }
            });
            this.f3487e = new TextView(this.f3483a);
            addView(this.f3487e);
            LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            if (!z || adChoicesIcon == null) {
                this.f3486d = true;
            } else {
                layoutParams2.addRule(11, m4645a(adChoicesIcon).getId());
                layoutParams2.width = 0;
                layoutParams.width = Math.round(((float) (adChoicesIcon.getWidth() + 4)) * this.f3485c);
                layoutParams.height = Math.round(((float) (adChoicesIcon.getHeight() + 2)) * this.f3485c);
                this.f3486d = false;
            }
            setLayoutParams(layoutParams);
            layoutParams2.addRule(15, -1);
            this.f3487e.setLayoutParams(layoutParams2);
            this.f3487e.setSingleLine();
            this.f3487e.setText(this.f3488f);
            this.f3487e.setTextSize(10.0f);
            this.f3487e.setTextColor(-4341303);
            return;
        }
        setVisibility(8);
    }

    /* renamed from: a */
    private ImageView m4645a(Image image) {
        View imageView = new ImageView(this.f3483a);
        addView(imageView);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(Math.round(((float) image.getWidth()) * this.f3485c), Math.round(((float) image.getHeight()) * this.f3485c));
        layoutParams.addRule(9);
        layoutParams.addRule(15, -1);
        layoutParams.setMargins(Math.round(this.f3485c * 4.0f), Math.round(this.f3485c * 2.0f), Math.round(this.f3485c * 2.0f), Math.round(this.f3485c * 2.0f));
        imageView.setLayoutParams(layoutParams);
        NativeAd.downloadAndDisplayImage(image, imageView);
        return imageView;
    }

    /* renamed from: a */
    private void m4646a() {
        Paint paint = new Paint();
        paint.setTextSize(this.f3487e.getTextSize());
        int round = Math.round(paint.measureText(this.f3488f) + (this.f3485c * 4.0f));
        final int width = getWidth();
        round += width;
        this.f3486d = true;
        Animation c13302 = new Animation(this) {
            /* renamed from: c */
            final /* synthetic */ AdChoicesView f3477c;

            protected void applyTransformation(float f, Transformation transformation) {
                int i = (int) (((float) width) + (((float) (round - width)) * f));
                this.f3477c.getLayoutParams().width = i;
                this.f3477c.requestLayout();
                this.f3477c.f3487e.getLayoutParams().width = i - width;
                this.f3477c.f3487e.requestLayout();
            }

            public boolean willChangeBounds() {
                return true;
            }
        };
        c13302.setAnimationListener(new AnimationListener(this) {
            /* renamed from: c */
            final /* synthetic */ AdChoicesView f3482c;

            /* renamed from: com.facebook.ads.AdChoicesView$3$1 */
            class C13321 implements Runnable {
                /* renamed from: a */
                final /* synthetic */ C13333 f3479a;

                /* renamed from: com.facebook.ads.AdChoicesView$3$1$1 */
                class C13311 extends Animation {
                    /* renamed from: a */
                    final /* synthetic */ C13321 f3478a;

                    C13311(C13321 c13321) {
                        this.f3478a = c13321;
                    }

                    protected void applyTransformation(float f, Transformation transformation) {
                        int i = (int) (((float) round) + (((float) (width - round)) * f));
                        this.f3478a.f3479a.f3482c.getLayoutParams().width = i;
                        this.f3478a.f3479a.f3482c.requestLayout();
                        this.f3478a.f3479a.f3482c.f3487e.getLayoutParams().width = i - width;
                        this.f3478a.f3479a.f3482c.f3487e.requestLayout();
                    }

                    public boolean willChangeBounds() {
                        return true;
                    }
                }

                C13321(C13333 c13333) {
                    this.f3479a = c13333;
                }

                public void run() {
                    if (this.f3479a.f3482c.f3486d) {
                        this.f3479a.f3482c.f3486d = false;
                        Animation c13311 = new C13311(this);
                        c13311.setDuration(300);
                        c13311.setFillAfter(true);
                        this.f3479a.f3482c.startAnimation(c13311);
                    }
                }
            }

            public void onAnimationEnd(Animation animation) {
                new Handler().postDelayed(new C13321(this), 3000);
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        });
        c13302.setDuration(300);
        c13302.setFillAfter(true);
        startAnimation(c13302);
    }
}
