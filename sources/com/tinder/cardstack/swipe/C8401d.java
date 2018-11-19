package com.tinder.cardstack.swipe;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewConfiguration;
import com.facebook.ads.AdError;
import com.tinder.cardstack.C8362a.C8359a;
import com.tinder.cardstack.model.SwipeDirection;
import com.tinder.cardstack.p182b.C8363a;

/* renamed from: com.tinder.cardstack.swipe.d */
public class C8401d {
    /* renamed from: a */
    private static final String f29823a = "d";
    /* renamed from: b */
    private final float f29824b;
    /* renamed from: c */
    private final float f29825c;
    /* renamed from: d */
    private final float f29826d;
    /* renamed from: e */
    private final float f29827e = (this.f29826d / 3.0f);

    /* renamed from: com.tinder.cardstack.swipe.d$a */
    private static class C8400a {
        /* renamed from: a */
        static float f29815a = 290.0f;
        /* renamed from: b */
        static float f29816b = 70.0f;
        /* renamed from: c */
        static float f29817c = 110.0f;
        /* renamed from: d */
        static float f29818d = 250.0f;
        /* renamed from: e */
        static float f29819e = 75.0f;
        /* renamed from: f */
        static float f29820f = 105.0f;
        /* renamed from: g */
        static float f29821g = 251.0f;
        /* renamed from: h */
        static float f29822h = 289.0f;
    }

    /* renamed from: m */
    private float m35847m() {
        return 0.03f;
    }

    /* renamed from: b */
    int m35852b() {
        return AdError.NETWORK_ERROR_CODE;
    }

    public C8401d(@NonNull Context context) {
        float b = C8363a.m35601b();
        this.f29824b = context.getResources().getDimension(C8359a.fling_escape_velocity_dp) * 6.0f;
        this.f29826d = b * 0.25f;
        this.f29825c = Math.max(8.0f, (float) (ViewConfiguration.get(context).getScaledTouchSlop() / 2));
    }

    /* renamed from: a */
    public float m35848a() {
        return this.f29826d;
    }

    /* renamed from: c */
    private float m35832c() {
        return this.f29825c;
    }

    /* renamed from: d */
    private float m35834d() {
        return C8400a.f29815a;
    }

    /* renamed from: e */
    private float m35837e() {
        return C8400a.f29816b;
    }

    /* renamed from: f */
    private float m35840f() {
        return C8400a.f29817c;
    }

    /* renamed from: g */
    private float m35841g() {
        return C8400a.f29818d;
    }

    /* renamed from: h */
    private float m35842h() {
        return C8400a.f29819e;
    }

    /* renamed from: i */
    private float m35843i() {
        return C8400a.f29820f;
    }

    /* renamed from: j */
    private float m35844j() {
        return C8400a.f29821g;
    }

    /* renamed from: k */
    private float m35845k() {
        return C8400a.f29822h;
    }

    /* renamed from: l */
    private float m35846l() {
        return this.f29824b;
    }

    /* renamed from: a */
    private float m35829a(@NonNull View view) {
        return ((float) view.getHeight()) / 2.0f;
    }

    /* renamed from: a */
    public boolean m35851a(float f, float f2, float f3, float f4) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        boolean e = m35839e(f3, f3);
        f3 = m35836d(f3, f4);
        switch (m35830a(m35849a(f, f2))) {
            case LEFT:
            case RIGHT:
                if (abs > m35848a()) {
                    return true;
                }
                if (e && abs > this.f29827e) {
                    return true;
                }
            case UP:
            case DOWN:
                if (abs2 > abs) {
                    if (abs2 > m35848a()) {
                        return true;
                    }
                    if (f3 != null && abs2 > this.f29827e) {
                        return true;
                    }
                }
                break;
        }
        return false;
    }

    /* renamed from: a */
    public float m35849a(float f, float f2) {
        f = (float) Math.toDegrees(Math.atan2((double) (-f2), (double) f));
        return f < 0.0f ? f + 360.0f : f;
    }

    /* renamed from: d */
    private boolean m35836d(float f, float f2) {
        f = Math.abs(f);
        f2 = Math.abs(f2);
        return f2 > m35846l() && f2 >= f;
    }

    /* renamed from: e */
    private boolean m35839e(float f, float f2) {
        f = Math.abs(f);
        return f > m35846l() && f >= Math.abs(f2);
    }

    /* renamed from: b */
    boolean m35854b(float f, float f2) {
        return Math.sqrt(Math.pow((double) Math.abs(f), 2.0d) + Math.pow((double) Math.abs(f2), 2.0d)) <= ((double) m35832c());
    }

    /* renamed from: a */
    public float m35850a(@NonNull View view, float f, float f2) {
        return (((float) (f2 < m35829a(view) ? true : -1)) * f) * m35847m();
    }

    @NonNull
    /* renamed from: c */
    public SwipeDirection m35855c(float f, float f2) {
        if (Math.abs(f) <= 0.0f) {
            if (Math.abs(f2) <= 0.0f) {
                return SwipeDirection.NONE;
            }
        }
        return m35830a(m35849a(f, f2));
    }

    @NonNull
    /* renamed from: b */
    SwipeDirection m35853b(float f, float f2, float f3, float f4) {
        SwipeDirection swipeDirection = SwipeDirection.NONE;
        if (Math.abs(f) > 0.0f || Math.abs(f2) > 0.0f) {
            swipeDirection = m35830a(m35849a(f, f2));
        }
        if (Math.abs(f3) <= 0.0f) {
            if (Math.abs(f4) <= 0.0f) {
                f = swipeDirection;
                return f == swipeDirection ? SwipeDirection.NONE : swipeDirection;
            }
        }
        f = m35830a(m35849a(f3, f4));
        if (f == swipeDirection) {
        }
    }

    /* renamed from: a */
    private SwipeDirection m35830a(float f) {
        if (m35835d(f)) {
            return SwipeDirection.LEFT;
        }
        if (m35833c(f)) {
            return SwipeDirection.RIGHT;
        }
        if (m35831b(f)) {
            return SwipeDirection.UP;
        }
        if (m35838e(f) != null) {
            return SwipeDirection.DOWN;
        }
        return SwipeDirection.NONE;
    }

    /* renamed from: b */
    private boolean m35831b(float f) {
        return f >= m35842h() && f <= m35843i();
    }

    /* renamed from: c */
    private boolean m35833c(float f) {
        if (f < m35834d()) {
            if (f > m35837e()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private boolean m35835d(float f) {
        return f >= m35840f() && f <= m35841g();
    }

    /* renamed from: e */
    private boolean m35838e(float f) {
        return f >= m35844j() && f <= m35845k();
    }
}
