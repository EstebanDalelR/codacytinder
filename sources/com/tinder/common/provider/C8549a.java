package com.tinder.common.provider;

import android.support.annotation.UiThread;
import com.tinder.common.navigation.Screen;
import com.tinder.common.p078c.C2642a;
import io.reactivex.C3959e;
import io.reactivex.subjects.C19040a;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/common/provider/CurrentScreenProvider;", "", "mainThreadExecutionVerifier", "Lcom/tinder/common/concurrency/MainThreadExecutionVerifier;", "(Lcom/tinder/common/concurrency/MainThreadExecutionVerifier;)V", "currentScreenSubject", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/tinder/common/navigation/Screen;", "observe", "Lio/reactivex/Observable;", "update", "", "currentScreen", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.common.provider.a */
public final class C8549a {
    /* renamed from: a */
    private final C19040a<Screen> f30292a;
    /* renamed from: b */
    private final C2642a f30293b;

    @Inject
    public C8549a(@NotNull C2642a c2642a) {
        C2668g.b(c2642a, "mainThreadExecutionVerifier");
        this.f30293b = c2642a;
        c2642a = C19040a.a();
        C2668g.a(c2642a, "BehaviorSubject.create()");
        this.f30292a = c2642a;
    }

    @UiThread
    /* renamed from: a */
    public final void m36533a(@NotNull Screen screen) {
        C2668g.b(screen, "currentScreen");
        this.f30293b.a();
        this.f30292a.onNext(screen);
    }

    @NotNull
    /* renamed from: a */
    public final C3959e<Screen> m36532a() {
        C3959e<Screen> hide = this.f30292a.hide();
        C2668g.a(hide, "currentScreenSubject.hide()");
        return hide;
    }
}
