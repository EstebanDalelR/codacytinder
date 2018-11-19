package com.snapchat.kit.sdk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import javax.inject.Inject;

public class SnapKitActivity extends Activity {
    @Inject
    /* renamed from: a */
    OAuth2Manager f21558a;

    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        SnapKitComponent component = SnapKit.getComponent(this);
        if (component == null) {
            finish();
            return;
        }
        component.inject(this);
        if (this.f21558a.m30684a(intent)) {
            this.f21558a.m30677a(intent.getData());
        }
        finish();
    }
}
