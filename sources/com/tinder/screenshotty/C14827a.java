package com.tinder.screenshotty;

import com.tinder.screenshotty.p401a.C14826a;
import io.reactivex.C3959e;
import io.reactivex.subjects.PublishSubject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bR2\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/screenshotty/ScreenshotNotifierAndProvider;", "", "()V", "screenshotSubject", "Lio/reactivex/subjects/PublishSubject;", "Lcom/tinder/screenshotty/model/Screenshot;", "kotlin.jvm.PlatformType", "notify", "", "screenshot", "observe", "Lio/reactivex/Observable;", "screenshotty_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.screenshotty.a */
public final class C14827a {
    /* renamed from: a */
    private final PublishSubject<C14826a> f46426a = PublishSubject.m67682a();

    /* renamed from: a */
    public final void m56180a(@NotNull C14826a c14826a) {
        C2668g.b(c14826a, "screenshot");
        C0001a.b("New screenshot captured: %s", new Object[]{c14826a});
        this.f46426a.onNext(c14826a);
    }

    @NotNull
    /* renamed from: a */
    public final C3959e<C14826a> m56179a() {
        C3959e<C14826a> hide = this.f46426a.hide();
        C2668g.a(hide, "screenshotSubject.hide()");
        return hide;
    }
}
