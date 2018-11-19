package com.facebook.ads.internal.p047k;

import android.view.InputDevice;
import android.view.InputDevice.MotionRange;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.k.ai */
public class ai {
    /* renamed from: a */
    private static final String f4061a = "ai";
    /* renamed from: b */
    private boolean f4062b;
    /* renamed from: c */
    private int f4063c = -1;
    /* renamed from: d */
    private int f4064d = -1;
    /* renamed from: e */
    private int f4065e = -1;
    /* renamed from: f */
    private int f4066f = -1;
    /* renamed from: g */
    private long f4067g = -1;
    /* renamed from: h */
    private int f4068h = -1;
    /* renamed from: i */
    private long f4069i = -1;
    /* renamed from: j */
    private long f4070j = -1;
    /* renamed from: k */
    private int f4071k = -1;
    /* renamed from: l */
    private int f4072l = -1;
    /* renamed from: m */
    private int f4073m = -1;
    /* renamed from: n */
    private int f4074n = -1;
    /* renamed from: o */
    private float f4075o = -1.0f;
    /* renamed from: p */
    private float f4076p = -1.0f;
    /* renamed from: q */
    private float f4077q = -1.0f;

    /* renamed from: a */
    public void m5183a() {
        this.f4067g = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void m5184a(MotionEvent motionEvent, View view, View view2) {
        if (!this.f4062b) {
            this.f4062b = true;
            InputDevice device = motionEvent.getDevice();
            if (device != null) {
                MotionRange motionRange = device.getMotionRange(0);
                MotionRange motionRange2 = device.getMotionRange(1);
                if (!(motionRange == null || motionRange2 == null)) {
                    this.f4077q = Math.min(motionRange.getRange(), motionRange2.getRange());
                }
            }
            if (this.f4077q <= 0.0f) {
                this.f4077q = (float) Math.min(view.getMeasuredWidth(), view.getMeasuredHeight());
            }
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationInWindow(iArr2);
        switch (motionEvent.getAction()) {
            case 0:
                this.f4063c = iArr[0];
                this.f4064d = iArr[1];
                this.f4065e = view.getWidth();
                this.f4066f = view.getHeight();
                this.f4068h = 1;
                this.f4069i = System.currentTimeMillis();
                this.f4071k = (((int) (motionEvent.getX() + 0.5f)) + iArr2[0]) - iArr[0];
                this.f4072l = (((int) (motionEvent.getY() + 0.5f)) + iArr2[1]) - iArr[1];
                this.f4075o = motionEvent.getPressure();
                this.f4076p = motionEvent.getSize();
                return;
            case 1:
            case 3:
                this.f4070j = System.currentTimeMillis();
                this.f4073m = (((int) (motionEvent.getX() + 0.5f)) + iArr2[0]) - iArr[0];
                this.f4074n = (((int) (motionEvent.getY() + 0.5f)) + iArr2[1]) - iArr[1];
                return;
            case 2:
                this.f4075o -= this.f4075o / ((float) this.f4068h);
                this.f4075o += motionEvent.getPressure() / ((float) this.f4068h);
                this.f4076p -= this.f4076p / ((float) this.f4068h);
                this.f4076p += motionEvent.getSize() / ((float) this.f4068h);
                this.f4068h++;
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    public boolean m5185b() {
        return this.f4067g != -1;
    }

    /* renamed from: c */
    public long m5186c() {
        return m5185b() ? System.currentTimeMillis() - this.f4067g : -1;
    }

    /* renamed from: d */
    public boolean m5187d() {
        return this.f4062b;
    }

    /* renamed from: e */
    public Map<String, String> m5188e() {
        if (!this.f4062b) {
            return null;
        }
        String valueOf = String.valueOf((this.f4076p * this.f4077q) / 2.0f);
        long j = (this.f4067g <= 0 || this.f4070j <= this.f4067g) ? -1 : this.f4070j - this.f4067g;
        Map<String, String> hashMap = new HashMap();
        hashMap.put("adPositionX", String.valueOf(this.f4063c));
        hashMap.put("adPositionY", String.valueOf(this.f4064d));
        hashMap.put("width", String.valueOf(this.f4065e));
        hashMap.put("height", String.valueOf(this.f4066f));
        hashMap.put("clickDelayTime", String.valueOf(j));
        hashMap.put("startTime", String.valueOf(this.f4069i));
        hashMap.put("endTime", String.valueOf(this.f4070j));
        hashMap.put("startX", String.valueOf(this.f4071k));
        hashMap.put("startY", String.valueOf(this.f4072l));
        hashMap.put("clickX", String.valueOf(this.f4073m));
        hashMap.put("clickY", String.valueOf(this.f4074n));
        hashMap.put("endX", String.valueOf(this.f4073m));
        hashMap.put("endY", String.valueOf(this.f4074n));
        hashMap.put("force", String.valueOf(this.f4075o));
        hashMap.put("radiusX", valueOf);
        hashMap.put("radiusY", valueOf);
        return hashMap;
    }
}
