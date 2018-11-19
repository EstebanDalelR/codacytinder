package com.tinder.updates;

import android.support.annotation.NonNull;
import com.tinder.app.AppVisibilityTracker$Visibility;
import com.tinder.managers.C2652a;
import io.reactivex.functions.Consumer;
import javax.inject.Inject;

/* renamed from: com.tinder.updates.b */
public class C3949b implements Consumer<AppVisibilityTracker$Visibility> {
    @NonNull
    /* renamed from: a */
    private final UpdatesScheduler f12537a;
    @NonNull
    /* renamed from: b */
    private final C2652a f12538b;

    public /* synthetic */ void accept(@NonNull Object obj) throws Exception {
        m15145a((AppVisibilityTracker$Visibility) obj);
    }

    @Inject
    C3949b(@NonNull UpdatesScheduler updatesScheduler, @NonNull C2652a c2652a) {
        this.f12537a = updatesScheduler;
        this.f12538b = c2652a;
    }

    /* renamed from: a */
    public void m15145a(@NonNull AppVisibilityTracker$Visibility appVisibilityTracker$Visibility) {
        if (m15144c()) {
            m15143b(appVisibilityTracker$Visibility);
        }
    }

    /* renamed from: b */
    private void m15143b(@NonNull AppVisibilityTracker$Visibility appVisibilityTracker$Visibility) {
        switch (b$1.f47576a[appVisibilityTracker$Visibility.ordinal()]) {
            case 1:
                m15141a();
                return;
            case 2:
                m15142b();
                return;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid visibility: ");
                stringBuilder.append(appVisibilityTracker$Visibility);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    private void m15141a() {
        this.f12537a.schedule();
    }

    /* renamed from: b */
    private void m15142b() {
        this.f12537a.unschedule();
    }

    /* renamed from: c */
    private boolean m15144c() {
        return this.f12538b.m10128d();
    }
}
