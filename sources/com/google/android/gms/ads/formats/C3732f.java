package com.google.android.gms.ads.formats;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.hx;

/* renamed from: com.google.android.gms.ads.formats.f */
public final class C3732f extends C2357d {
    public C3732f(Context context) {
        super(context);
    }

    public final View getBodyView() {
        return super.m8605a("2004");
    }

    public final View getCallToActionView() {
        return super.m8605a("2002");
    }

    public final View getHeadlineView() {
        return super.m8605a("2001");
    }

    public final View getIconView() {
        return super.m8605a("2003");
    }

    public final View getImageView() {
        return super.m8605a("2007");
    }

    public final C2353b getMediaView() {
        View a = super.m8605a("2011");
        if (a instanceof C2353b) {
            return (C2353b) a;
        }
        if (a != null) {
            hx.b("View is not an instance of MediaView");
        }
        return null;
    }

    public final View getPriceView() {
        return super.m8605a("2006");
    }

    public final View getStarRatingView() {
        return super.m8605a("2008");
    }

    public final View getStoreView() {
        return super.m8605a("2005");
    }

    public final void setBodyView(View view) {
        super.m8606a("2004", view);
    }

    public final void setCallToActionView(View view) {
        super.m8606a("2002", view);
    }

    public final void setHeadlineView(View view) {
        super.m8606a("2001", view);
    }

    public final void setIconView(View view) {
        super.m8606a("2003", view);
    }

    public final void setImageView(View view) {
        super.m8606a("2007", view);
    }

    public final void setMediaView(C2353b c2353b) {
        super.m8606a("2011", c2353b);
    }

    public final void setPriceView(View view) {
        super.m8606a("2006", view);
    }

    public final void setStarRatingView(View view) {
        super.m8606a("2008", view);
    }

    public final void setStoreView(View view) {
        super.m8606a("2005", view);
    }
}
