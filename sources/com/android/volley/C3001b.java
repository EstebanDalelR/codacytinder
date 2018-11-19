package com.android.volley;

import com.tinder.api.ManagerWebServices;

/* renamed from: com.android.volley.b */
public class C3001b implements RetryPolicy {
    /* renamed from: a */
    private int f9329a;
    /* renamed from: b */
    private int f9330b;
    /* renamed from: c */
    private final int f9331c;
    /* renamed from: d */
    private final float f9332d;

    public C3001b() {
        this(ManagerWebServices.FB_WEAR_TIMEOUT, 0, 1.0f);
    }

    public C3001b(int i, int i2, float f) {
        this.f9329a = i;
        this.f9331c = i2;
        this.f9332d = f;
    }

    public int getCurrentTimeout() {
        return this.f9329a;
    }

    public int getCurrentRetryCount() {
        return this.f9330b;
    }

    public void retry(VolleyError volleyError) throws VolleyError {
        this.f9330b++;
        this.f9329a = (int) (((float) this.f9329a) + (((float) this.f9329a) * this.f9332d));
        if (!m11618a()) {
            throw volleyError;
        }
    }

    /* renamed from: a */
    protected boolean m11618a() {
        return this.f9330b <= this.f9331c;
    }
}
