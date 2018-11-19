package io.branch.referral;

import android.app.Application;
import android.content.Context;

public class BranchApp extends Application {
    public void onCreate() {
        super.onCreate();
        if (C2666j.m10266a((Context) this)) {
            Branch.m15211b((Context) this);
        } else {
            Branch.m15188a((Context) this);
        }
    }
}
