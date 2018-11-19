package io.fabric.sdk.android.services.events;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;

/* renamed from: io.fabric.sdk.android.services.events.d */
public class C15646d implements Runnable {
    /* renamed from: a */
    private final Context f48419a;
    /* renamed from: b */
    private final FileRollOverManager f48420b;

    public C15646d(Context context, FileRollOverManager fileRollOverManager) {
        this.f48419a = context;
        this.f48420b = fileRollOverManager;
    }

    public void run() {
        try {
            CommonUtils.m58600a(this.f48419a, "Performing time based file roll over.");
            if (!this.f48420b.rollFileOver()) {
                this.f48420b.cancelTimeBasedFileRollOver();
            }
        } catch (Throwable e) {
            CommonUtils.m58601a(this.f48419a, "Failed to roll over file", e);
        }
    }
}
