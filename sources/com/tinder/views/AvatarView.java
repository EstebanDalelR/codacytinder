package com.tinder.views;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView.ScaleType;
import android.widget.ProgressBar;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.makeramen.roundedimageview.RoundedImageView;
import com.tinder.C6250b.C6249b;
import com.tinder.R;
import com.tinder.common.p192e.p193a.C10659a.C8531a;
import com.tinder.utils.ad;
import com.tinder.views.GroupAvatarsView.C15433a;
import java.util.List;

public class AvatarView extends FrameLayout implements C15433a {
    /* renamed from: a */
    private ProgressBar f52889a;
    /* renamed from: b */
    private GroupAvatarsView f52890b;
    /* renamed from: c */
    private RoundedImageView f52891c;
    /* renamed from: d */
    private int f52892d = 0;
    /* renamed from: e */
    private int f52893e = getResources().getDimensionPixelSize(R.dimen.avatar_length_matches);
    /* renamed from: f */
    private int f52894f;
    /* renamed from: g */
    private int f52895g;
    @ColorInt
    /* renamed from: h */
    private int f52896h = -1;

    /* renamed from: com.tinder.views.AvatarView$1 */
    class C172611 implements RequestListener<String, Bitmap> {
        /* renamed from: a */
        final /* synthetic */ AvatarView f52888a;

        C172611(AvatarView avatarView) {
            this.f52888a = avatarView;
        }

        public /* synthetic */ boolean onException(Exception exception, Object obj, Target target, boolean z) {
            return m63185a(exception, (String) obj, target, z);
        }

        public /* synthetic */ boolean onResourceReady(Object obj, Object obj2, Target target, boolean z, boolean z2) {
            return m63184a((Bitmap) obj, (String) obj2, target, z, z2);
        }

        /* renamed from: a */
        public boolean m63185a(Exception exception, String str, Target<Bitmap> target, boolean z) {
            ad.a(exception);
            this.f52888a.f52889a.setVisibility(8);
            return null;
        }

        /* renamed from: a */
        public boolean m63184a(Bitmap bitmap, String str, Target<Bitmap> target, boolean z, boolean z2) {
            this.f52888a.f52889a.setVisibility(8);
            return null;
        }
    }

    /* renamed from: b */
    public void mo12738b() {
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    public AvatarView(Context context) {
        super(context);
        m63187a(context, null, 0, 0);
    }

    public AvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m63187a(context, attributeSet, 0, 0);
    }

    public AvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m63187a(context, attributeSet, i, 0);
    }

    @TargetApi(21)
    public AvatarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m63187a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private void m63187a(Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        Theme theme = context.getTheme();
        int i3 = C6249b.AvatarView;
        i = theme.obtainStyledAttributes(attributeSet, i3, i, i2);
        i2 = 4;
        try {
            this.f52892d = i.getInt(4, 0);
            i2 = i.getDimensionPixelSize(2, this.f52893e);
            boolean z = true;
            this.f52894f = i.getDimensionPixelSize(z, 5);
            this.f52895g = i.getDimensionPixelSize(3, 0);
            i3 = -1;
            this.f52896h = i.getColor(0, -1);
            i = LayoutInflater.from(context).inflate(R.layout.view_avatar, this, z);
            this.f52889a = (ProgressBar) i.findViewById(R.id.avatar_view_progress);
            this.f52890b = new GroupAvatarsView(context, attributeSet);
            this.f52890b.setMode(this.f52892d);
            this.f52890b.setDefaultPixelSize(i2);
            this.f52890b.setStrokeWidth(this.f52894f);
            this.f52890b.setCornerRadius(this.f52895g);
            this.f52890b.setBorderColor(this.f52896h);
            context = new LayoutParams(i3, i3);
            context.gravity = 17;
            addView(this.f52890b, context);
            this.f52891c = (RoundedImageView) i.findViewById(R.id.avatar_view_single);
        } finally {
            i.recycle();
        }
    }

    public void setGroupAvatarsView(@Nullable @DrawableRes int... iArr) {
        if (iArr != null) {
            this.f52890b.m57894a((C15433a) this, iArr);
            this.f52890b.setVisibility(0);
            this.f52891c.setVisibility(8);
        }
    }

    public void setSingleAvatar(@NonNull Drawable drawable) {
        this.f52890b.m57893a();
        this.f52890b.setVisibility(8);
        this.f52891c.setVisibility(0);
        this.f52891c.setImageDrawable(drawable);
        this.f52889a.setVisibility(8);
        if (this.f52892d == null) {
            this.f52891c.setBorderWidth((float) this.f52894f);
            this.f52891c.setBorderColor(-1);
            this.f52891c.setOval(true);
        } else if (this.f52892d == 2) {
            this.f52891c.a((float) this.f52895g, (float) this.f52895g, 0.0f, 0.0f);
            this.f52891c.setScaleType(ScaleType.CENTER_CROP);
        } else if (this.f52892d == 4) {
            this.f52891c.a((float) this.f52895g, (float) this.f52895g, (float) this.f52895g, (float) this.f52895g);
            this.f52891c.setScaleType(ScaleType.CENTER_CROP);
        }
    }

    public void setAvatars(List<String> list) {
        if (!list.isEmpty()) {
            setAvatars((String[]) list.toArray(new String[list.size()]));
        }
    }

    public void setAvatars(@Nullable String... strArr) {
        Context context = getContext();
        if (m63188a(context) && strArr != null) {
            if (strArr.length > 1) {
                this.f52890b.setVisibility(0);
                this.f52891c.setVisibility(8);
                this.f52890b.m57895a((C15433a) this, strArr);
            } else if (this.f52892d == 3) {
                this.f52890b.setVisibility(0);
                this.f52891c.setVisibility(8);
                this.f52890b.m57895a((C15433a) this, strArr);
            } else {
                this.f52890b.setVisibility(8);
                this.f52891c.setVisibility(0);
                this.f52890b.m57893a();
                strArr = C0994i.b(context).a(strArr[0]).l();
                if (this.f52892d == 0) {
                    strArr.a(new Transformation[]{new C8531a(getContext()).a(-1).a((float) this.f52894f).b()});
                } else if (this.f52892d == 2) {
                    this.f52891c.a((float) this.f52895g, (float) this.f52895g, 0.0f, 0.0f);
                    this.f52891c.setScaleType(ScaleType.CENTER_CROP);
                } else if (this.f52892d == 4) {
                    this.f52891c.a((float) this.f52895g, (float) this.f52895g, (float) this.f52895g, (float) this.f52895g);
                    this.f52891c.setScaleType(ScaleType.CENTER_CROP);
                }
                strArr.a(new C172611(this)).a(this.f52891c);
            }
        }
    }

    @MainThread
    public void setBorderColor(@ColorInt int i) {
        this.f52890b.setBorderColor(i);
        this.f52891c.setBorderColor(i);
    }

    /* renamed from: a */
    public void mo12737a() {
        this.f52889a.setVisibility(8);
        this.f52890b.setVisibility(0);
    }

    /* renamed from: c */
    public void m63191c() {
        this.f52889a.setVisibility(0);
        this.f52890b.setVisibility(8);
        this.f52891c.setVisibility(8);
        this.f52890b.m57893a();
    }

    /* renamed from: a */
    private boolean m63188a(@NonNull Context context) {
        return (!(context instanceof Activity) || ((Activity) context).isFinishing() == null) ? true : null;
    }
}
