package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.common.internal.ak;
import com.tinder.api.ManagerWebServices;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@zzzv
public final class jr extends FrameLayout implements zzama {
    /* renamed from: a */
    private final zzamp f23348a;
    /* renamed from: b */
    private final FrameLayout f23349b;
    /* renamed from: c */
    private final amb f23350c;
    /* renamed from: d */
    private final ke f23351d;
    /* renamed from: e */
    private final long f23352e;
    @Nullable
    /* renamed from: f */
    private jp f23353f;
    /* renamed from: g */
    private boolean f23354g;
    /* renamed from: h */
    private boolean f23355h;
    /* renamed from: i */
    private boolean f23356i;
    /* renamed from: j */
    private boolean f23357j;
    /* renamed from: k */
    private long f23358k;
    /* renamed from: l */
    private long f23359l;
    /* renamed from: m */
    private String f23360m;
    /* renamed from: n */
    private Bitmap f23361n;
    /* renamed from: o */
    private ImageView f23362o;
    /* renamed from: p */
    private boolean f23363p;

    public jr(Context context, zzamp zzamp, int i, boolean z, amb amb, kc kcVar) {
        Context context2 = context;
        super(context2);
        zzamp zzamp2 = zzamp;
        this.f23348a = zzamp2;
        amb amb2 = amb;
        this.f23350c = amb2;
        this.f23349b = new FrameLayout(context2);
        addView(this.f23349b, new LayoutParams(-1, -1));
        ak.a(zzamp2.zzbq());
        this.f23353f = zzamp2.zzbq().f7213b.mo4645a(context2, zzamp2, i, z, amb2, kcVar);
        if (this.f23353f != null) {
            r0.f23349b.addView(r0.f23353f, new LayoutParams(-1, -1, 17));
            if (((Boolean) aja.m19221f().m19334a(alo.f15468s)).booleanValue()) {
                m27398f();
            }
        }
        r0.f23362o = new ImageView(context2);
        r0.f23352e = ((Long) aja.m19221f().m19334a(alo.f15472w)).longValue();
        r0.f23357j = ((Boolean) aja.m19221f().m19334a(alo.f15470u)).booleanValue();
        if (r0.f23350c != null) {
            r0.f23350c.m19365a("spinner_used", r0.f23357j ? "1" : "0");
        }
        r0.f23351d = new ke(r0);
        if (r0.f23353f != null) {
            r0.f23353f.mo6878a(r0);
        }
        if (r0.f23353f == null) {
            zzg("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    /* renamed from: a */
    public static void m27381a(zzamp zzamp) {
        Map hashMap = new HashMap();
        hashMap.put("event", "no_video_view");
        zzamp.zza("onVideoEvent", hashMap);
    }

    /* renamed from: a */
    public static void m27382a(zzamp zzamp, String str) {
        Map hashMap = new HashMap();
        hashMap.put("event", "decoderProps");
        hashMap.put("error", str);
        zzamp.zza("onVideoEvent", hashMap);
    }

    /* renamed from: a */
    public static void m27383a(zzamp zzamp, Map<String, List<Map<String, Object>>> map) {
        Map hashMap = new HashMap();
        hashMap.put("event", "decoderProps");
        hashMap.put("mimeTypes", map);
        zzamp.zza("onVideoEvent", hashMap);
    }

    /* renamed from: a */
    private final void m27384a(String str, String... strArr) {
        Map hashMap = new HashMap();
        hashMap.put("event", str);
        Object obj = null;
        for (Object obj2 : strArr) {
            if (obj == null) {
                obj = obj2;
            } else {
                hashMap.put(obj, obj2);
                obj = null;
            }
        }
        this.f23348a.zza("onVideoEvent", hashMap);
    }

    /* renamed from: i */
    private final boolean m27385i() {
        return this.f23362o.getParent() != null;
    }

    /* renamed from: j */
    private final void m27386j() {
        if (!(this.f23348a.zzsi() == null || !this.f23355h || this.f23356i)) {
            this.f23348a.zzsi().getWindow().clearFlags(ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            this.f23355h = false;
        }
    }

    /* renamed from: a */
    public final void m27387a() {
        if (this.f23353f != null) {
            if (TextUtils.isEmpty(this.f23360m)) {
                m27384a("no_src", new String[0]);
            } else {
                this.f23353f.setVideoPath(this.f23360m);
            }
        }
    }

    /* renamed from: a */
    public final void m27388a(float f) {
        if (this.f23353f != null) {
            jp jpVar = this.f23353f;
            jpVar.f23347b.m19974a(f);
            jpVar.mo4635e();
        }
    }

    /* renamed from: a */
    public final void m27389a(float f, float f2) {
        if (this.f23353f != null) {
            this.f23353f.mo6876a(f, f2);
        }
    }

    /* renamed from: a */
    public final void m27390a(int i) {
        if (this.f23353f != null) {
            this.f23353f.mo6877a(i);
        }
    }

    /* renamed from: a */
    public final void m27391a(int i, int i2, int i3, int i4) {
        if (i3 != 0 && i4 != 0) {
            ViewGroup.LayoutParams layoutParams = new LayoutParams(i3, i4);
            layoutParams.setMargins(i, i2, 0, 0);
            this.f23349b.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    @TargetApi(14)
    /* renamed from: a */
    public final void m27392a(MotionEvent motionEvent) {
        if (this.f23353f != null) {
            this.f23353f.dispatchTouchEvent(motionEvent);
        }
    }

    /* renamed from: a */
    public final void m27393a(String str) {
        this.f23360m = str;
    }

    /* renamed from: b */
    public final void m27394b() {
        if (this.f23353f != null) {
            this.f23353f.mo6881d();
        }
    }

    /* renamed from: c */
    public final void m27395c() {
        if (this.f23353f != null) {
            this.f23353f.mo6880c();
        }
    }

    /* renamed from: d */
    public final void m27396d() {
        if (this.f23353f != null) {
            jp jpVar = this.f23353f;
            jpVar.f23347b.m19975a(true);
            jpVar.mo4635e();
        }
    }

    /* renamed from: e */
    public final void m27397e() {
        if (this.f23353f != null) {
            jp jpVar = this.f23353f;
            jpVar.f23347b.m19975a(false);
            jpVar.mo4635e();
        }
    }

    @TargetApi(14)
    /* renamed from: f */
    public final void m27398f() {
        if (this.f23353f != null) {
            View textView = new TextView(this.f23353f.getContext());
            String str = "AdMob - ";
            String valueOf = String.valueOf(this.f23353f.mo6875a());
            textView.setText(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            textView.setTextColor(-65536);
            textView.setBackgroundColor(-256);
            this.f23349b.addView(textView, new LayoutParams(-2, -2, 17));
            this.f23349b.bringChildToFront(textView);
        }
    }

    /* renamed from: g */
    public final void m27399g() {
        this.f23351d.m19970a();
        if (this.f23353f != null) {
            this.f23353f.mo6879b();
        }
        m27386j();
    }

    /* renamed from: h */
    final void m27400h() {
        if (this.f23353f != null) {
            long currentPosition = (long) this.f23353f.getCurrentPosition();
            if (this.f23358k != currentPosition && currentPosition > 0) {
                float f = ((float) currentPosition) / 1000.0f;
                m27384a("timeupdate", "time", String.valueOf(f));
                this.f23358k = currentPosition;
            }
        }
    }

    public final void onPaused() {
        m27384a("pause", new String[0]);
        m27386j();
        this.f23354g = false;
    }

    public final void zzf(int i, int i2) {
        if (this.f23357j) {
            i = Math.max(i / ((Integer) aja.m19221f().m19334a(alo.f15471v)).intValue(), 1);
            i2 = Math.max(i2 / ((Integer) aja.m19221f().m19334a(alo.f15471v)).intValue(), 1);
            if (this.f23361n == null || this.f23361n.getWidth() != i || this.f23361n.getHeight() != i2) {
                this.f23361n = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
                this.f23363p = false;
            }
        }
    }

    public final void zzg(String str, @Nullable String str2) {
        m27384a("error", "what", str, "extra", str2);
    }

    public final void zzrn() {
        this.f23351d.m19971b();
        fk.f16060a.post(new js(this));
    }

    public final void zzro() {
        if (this.f23353f != null && this.f23359l == 0) {
            float duration = ((float) this.f23353f.getDuration()) / 1000.0f;
            int videoWidth = this.f23353f.getVideoWidth();
            int videoHeight = this.f23353f.getVideoHeight();
            m27384a("canplaythrough", ManagerWebServices.PARAM_DURATION, String.valueOf(duration), "videoWidth", String.valueOf(videoWidth), "videoHeight", String.valueOf(videoHeight));
        }
    }

    public final void zzrp() {
        if (!(this.f23348a.zzsi() == null || this.f23355h)) {
            this.f23356i = (this.f23348a.zzsi().getWindow().getAttributes().flags & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0;
            if (!this.f23356i) {
                this.f23348a.zzsi().getWindow().addFlags(ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                this.f23355h = true;
            }
        }
        this.f23354g = true;
    }

    public final void zzrq() {
        m27384a("ended", new String[0]);
        m27386j();
    }

    public final void zzrr() {
        if (!(!this.f23363p || this.f23361n == null || m27385i())) {
            this.f23362o.setImageBitmap(this.f23361n);
            this.f23362o.invalidate();
            this.f23349b.addView(this.f23362o, new LayoutParams(-1, -1));
            this.f23349b.bringChildToFront(this.f23362o);
        }
        this.f23351d.m19970a();
        this.f23359l = this.f23358k;
        fk.f16060a.post(new jt(this));
    }

    public final void zzrs() {
        if (this.f23354g && m27385i()) {
            this.f23349b.removeView(this.f23362o);
        }
        if (this.f23361n != null) {
            long elapsedRealtime = ar.k().elapsedRealtime();
            if (this.f23353f.getBitmap(this.f23361n) != null) {
                this.f23363p = true;
            }
            long elapsedRealtime2 = ar.k().elapsedRealtime() - elapsedRealtime;
            if (ec.m27333a()) {
                StringBuilder stringBuilder = new StringBuilder(46);
                stringBuilder.append("Spinner frame grab took ");
                stringBuilder.append(elapsedRealtime2);
                stringBuilder.append("ms");
                ec.m27332a(stringBuilder.toString());
            }
            if (elapsedRealtime2 > this.f23352e) {
                hx.m19916e("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.f23357j = false;
                this.f23361n = null;
                if (this.f23350c != null) {
                    this.f23350c.m19365a("spinner_jank", Long.toString(elapsedRealtime2));
                }
            }
        }
    }
}
