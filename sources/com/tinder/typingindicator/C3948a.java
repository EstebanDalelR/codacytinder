package com.tinder.typingindicator;

import com.tinder.app.AppVisibilityTracker$Visibility;
import com.tinder.managers.C2652a;
import com.tinder.typingindicator.worker.TypingIndicatorWorker;
import io.reactivex.functions.Consumer;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\b\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8BX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/typingindicator/TypingIndicatorWorkerConsumer;", "Lio/reactivex/functions/Consumer;", "Lcom/tinder/app/AppVisibilityTracker$Visibility;", "typingIndicatorWorker", "Lcom/tinder/typingindicator/worker/TypingIndicatorWorker;", "authenticationManager", "Lcom/tinder/managers/AuthenticationManager;", "(Lcom/tinder/typingindicator/worker/TypingIndicatorWorker;Lcom/tinder/managers/AuthenticationManager;)V", "isUserLoggedIn", "", "()Z", "accept", "", "visibility", "onBackground", "onForeground", "processVisibility", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.typingindicator.a */
public final class C3948a implements Consumer<AppVisibilityTracker$Visibility> {
    /* renamed from: a */
    private final TypingIndicatorWorker f12535a;
    /* renamed from: b */
    private final C2652a f12536b;

    @Inject
    public C3948a(@NotNull TypingIndicatorWorker typingIndicatorWorker, @NotNull C2652a c2652a) {
        C2668g.m10309b(typingIndicatorWorker, "typingIndicatorWorker");
        C2668g.m10309b(c2652a, "authenticationManager");
        this.f12535a = typingIndicatorWorker;
        this.f12536b = c2652a;
    }

    public /* synthetic */ void accept(Object obj) {
        m15140a((AppVisibilityTracker$Visibility) obj);
    }

    /* renamed from: a */
    private final boolean m15136a() {
        return this.f12536b.m10128d();
    }

    /* renamed from: a */
    public void m15140a(@NotNull AppVisibilityTracker$Visibility appVisibilityTracker$Visibility) {
        C2668g.m10309b(appVisibilityTracker$Visibility, "visibility");
        if (m15136a()) {
            m15138b(appVisibilityTracker$Visibility);
        }
    }

    /* renamed from: b */
    private final void m15138b(AppVisibilityTracker$Visibility appVisibilityTracker$Visibility) {
        switch (C15316b.f47529a[appVisibilityTracker$Visibility.ordinal()]) {
            case 1:
                m15137b();
                return;
            case 2:
                m15139c();
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    private final void m15137b() {
        this.f12535a.start();
    }

    /* renamed from: c */
    private final void m15139c() {
        this.f12535a.stop();
    }
}
