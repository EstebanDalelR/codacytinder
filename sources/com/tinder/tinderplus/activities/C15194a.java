package com.tinder.tinderplus.activities;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tinder.views.FeatureRow;

/* renamed from: com.tinder.tinderplus.activities.a */
final /* synthetic */ class C15194a implements OnClickListener {
    /* renamed from: a */
    private final ActivityTPlusControl f47257a;
    /* renamed from: b */
    private final FeatureRow f47258b;
    /* renamed from: c */
    private final FeatureRow f47259c;

    C15194a(ActivityTPlusControl activityTPlusControl, FeatureRow featureRow, FeatureRow featureRow2) {
        this.f47257a = activityTPlusControl;
        this.f47258b = featureRow;
        this.f47259c = featureRow2;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f47257a.m68733a(this.f47258b, this.f47259c, dialogInterface, i);
    }
}
