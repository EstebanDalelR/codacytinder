package com.tinder.activities;

import io.branch.referral.Branch$BranchReferralInitListener;
import io.branch.referral.C15583e;
import org.json.JSONObject;

final /* synthetic */ class aa implements Branch$BranchReferralInitListener {
    /* renamed from: a */
    private final MainActivity f26204a;

    aa(MainActivity mainActivity) {
        this.f26204a = mainActivity;
    }

    public void onInitFinished(JSONObject jSONObject, C15583e c15583e) {
        this.f26204a.a(jSONObject, c15583e);
    }
}
