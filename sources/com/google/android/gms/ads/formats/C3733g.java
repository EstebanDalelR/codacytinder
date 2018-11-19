package com.google.android.gms.ads.formats;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.hx;

/* renamed from: com.google.android.gms.ads.formats.g */
public final class C3733g extends C2357d {
    public C3733g(Context context) {
        super(context);
    }

    public final View getAdvertiserView() {
        return super.m8605a("1004");
    }

    public final View getBodyView() {
        return super.m8605a("1002");
    }

    public final View getCallToActionView() {
        return super.m8605a("1003");
    }

    public final View getHeadlineView() {
        return super.m8605a("1001");
    }

    public final View getImageView() {
        return super.m8605a("1005");
    }

    public final View getLogoView() {
        return super.m8605a("1006");
    }

    public final C2353b getMediaView() {
        View a = super.m8605a("1009");
        if (a instanceof C2353b) {
            return (C2353b) a;
        }
        if (a != null) {
            hx.b("View is not an instance of MediaView");
        }
        return null;
    }

    public final void setAdvertiserView(View view) {
        super.m8606a("1004", view);
    }

    public final void setBodyView(View view) {
        super.m8606a("1002", view);
    }

    public final void setCallToActionView(View view) {
        super.m8606a("1003", view);
    }

    public final void setHeadlineView(View view) {
        super.m8606a("1001", view);
    }

    public final void setImageView(View view) {
        super.m8606a("1005", view);
    }

    public final void setLogoView(View view) {
        super.m8606a("1006", view);
    }

    public final void setMediaView(C2353b c2353b) {
        super.m8606a("1009", c2353b);
    }
}
