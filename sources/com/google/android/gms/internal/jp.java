package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.TextureView;

@zzzv
@TargetApi(14)
public abstract class jp extends TextureView implements kg {
    /* renamed from: a */
    protected final jw f23346a = new jw();
    /* renamed from: b */
    protected final kf f23347b;

    public jp(Context context) {
        super(context);
        this.f23347b = new kf(context, this);
    }

    /* renamed from: a */
    public abstract String mo6875a();

    /* renamed from: a */
    public abstract void mo6876a(float f, float f2);

    /* renamed from: a */
    public abstract void mo6877a(int i);

    /* renamed from: a */
    public abstract void mo6878a(zzama zzama);

    /* renamed from: b */
    public abstract void mo6879b();

    /* renamed from: c */
    public abstract void mo6880c();

    /* renamed from: d */
    public abstract void mo6881d();

    /* renamed from: e */
    public abstract void mo4635e();

    public abstract int getCurrentPosition();

    public abstract int getDuration();

    public abstract int getVideoHeight();

    public abstract int getVideoWidth();

    public abstract void setVideoPath(String str);
}
