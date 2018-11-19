package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;

@zzzv
@TargetApi(14)
public final class kf implements OnAudioFocusChangeListener {
    /* renamed from: a */
    private final AudioManager f16267a;
    /* renamed from: b */
    private final kg f16268b;
    /* renamed from: c */
    private boolean f16269c;
    /* renamed from: d */
    private boolean f16270d;
    /* renamed from: e */
    private boolean f16271e;
    /* renamed from: f */
    private float f16272f = 1.0f;

    public kf(Context context, kg kgVar) {
        this.f16267a = (AudioManager) context.getSystemService("audio");
        this.f16268b = kgVar;
    }

    /* renamed from: d */
    private final void m19972d() {
        boolean z = false;
        Object obj = (!this.f16270d || this.f16271e || this.f16272f <= 0.0f) ? null : 1;
        if (obj == null || this.f16269c) {
            if (obj == null && this.f16269c) {
                if (this.f16267a != null) {
                    if (this.f16269c) {
                        if (this.f16267a.abandonAudioFocus(this) == 0) {
                            z = true;
                        }
                        this.f16269c = z;
                    }
                }
                this.f16268b.mo4635e();
            }
            return;
        }
        if (this.f16267a != null) {
            if (!this.f16269c) {
                if (this.f16267a.requestAudioFocus(this, 3, 2) == 1) {
                    z = true;
                }
                this.f16269c = z;
            }
        }
        this.f16268b.mo4635e();
    }

    /* renamed from: a */
    public final float m19973a() {
        return this.f16269c ? this.f16271e ? 0.0f : this.f16272f : 0.0f;
    }

    /* renamed from: a */
    public final void m19974a(float f) {
        this.f16272f = f;
        m19972d();
    }

    /* renamed from: a */
    public final void m19975a(boolean z) {
        this.f16271e = z;
        m19972d();
    }

    /* renamed from: b */
    public final void m19976b() {
        this.f16270d = true;
        m19972d();
    }

    /* renamed from: c */
    public final void m19977c() {
        this.f16270d = false;
        m19972d();
    }

    public final void onAudioFocusChange(int i) {
        this.f16269c = i > 0;
        this.f16268b.mo4635e();
    }
}
