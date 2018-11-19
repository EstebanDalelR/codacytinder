package com.facebook.ads;

import android.graphics.Color;
import android.graphics.Typeface;
import com.facebook.ads.internal.p047k.C1481b;
import com.facebook.ads.internal.p047k.C1482c;
import org.json.JSONObject;

public class NativeAdViewAttributes {
    /* renamed from: a */
    private Typeface f3577a = Typeface.DEFAULT;
    /* renamed from: b */
    private int f3578b = -1;
    /* renamed from: c */
    private int f3579c = -16777216;
    /* renamed from: d */
    private int f3580d = -11643291;
    /* renamed from: e */
    private int f3581e = 0;
    /* renamed from: f */
    private int f3582f = -12420889;
    /* renamed from: g */
    private int f3583g = -12420889;
    /* renamed from: h */
    private boolean f3584h = AdSettings.isVideoAutoplay();
    /* renamed from: i */
    private boolean f3585i = AdSettings.isVideoAutoplayOnMobile();

    public NativeAdViewAttributes(JSONObject jSONObject) {
        try {
            int parseColor = jSONObject.getBoolean("background_transparent") ? 0 : Color.parseColor(jSONObject.getString("background_color"));
            int parseColor2 = Color.parseColor(jSONObject.getString("title_text_color"));
            int parseColor3 = Color.parseColor(jSONObject.getString("description_text_color"));
            int parseColor4 = jSONObject.getBoolean("button_transparent") ? 0 : Color.parseColor(jSONObject.getString("button_color"));
            int parseColor5 = jSONObject.getBoolean("button_border_transparent") ? 0 : Color.parseColor(jSONObject.getString("button_border_color"));
            int parseColor6 = Color.parseColor(jSONObject.getString("button_text_color"));
            Typeface create = Typeface.create(jSONObject.getString("android_typeface"), 0);
            this.f3578b = parseColor;
            this.f3579c = parseColor2;
            this.f3580d = parseColor3;
            this.f3581e = parseColor4;
            this.f3583g = parseColor5;
            this.f3582f = parseColor6;
            this.f3577a = create;
        } catch (Throwable e) {
            C1482c.m5218a(C1481b.m5215a(e, "Error retrieving native ui configuration data"));
        }
    }

    public boolean getAutoplay() {
        return this.f3584h;
    }

    public boolean getAutoplayOnMobile() {
        return AdSettings.isVideoAutoplayOnMobile();
    }

    public int getBackgroundColor() {
        return this.f3578b;
    }

    public int getButtonBorderColor() {
        return this.f3583g;
    }

    public int getButtonColor() {
        return this.f3581e;
    }

    public int getButtonTextColor() {
        return this.f3582f;
    }

    public int getDescriptionTextColor() {
        return this.f3580d;
    }

    public int getDescriptionTextSize() {
        return 10;
    }

    public int getTitleTextColor() {
        return this.f3579c;
    }

    public int getTitleTextSize() {
        return 16;
    }

    public Typeface getTypeface() {
        return this.f3577a;
    }

    public NativeAdViewAttributes setAutoplay(boolean z) {
        this.f3584h = z;
        return this;
    }

    public NativeAdViewAttributes setAutoplayOnMobile(boolean z) {
        this.f3585i = z;
        return this;
    }

    public NativeAdViewAttributes setBackgroundColor(int i) {
        this.f3578b = i;
        return this;
    }

    public NativeAdViewAttributes setButtonBorderColor(int i) {
        this.f3583g = i;
        return this;
    }

    public NativeAdViewAttributes setButtonColor(int i) {
        this.f3581e = i;
        return this;
    }

    public NativeAdViewAttributes setButtonTextColor(int i) {
        this.f3582f = i;
        return this;
    }

    public NativeAdViewAttributes setDescriptionTextColor(int i) {
        this.f3580d = i;
        return this;
    }

    public NativeAdViewAttributes setTitleTextColor(int i) {
        this.f3579c = i;
        return this;
    }

    public NativeAdViewAttributes setTypeface(Typeface typeface) {
        this.f3577a = typeface;
        return this;
    }
}
