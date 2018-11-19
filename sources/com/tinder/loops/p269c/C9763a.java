package com.tinder.loops.p269c;

import android.support.annotation.UiThread;
import com.tinder.base.p172b.C8301a;
import com.tinder.loops.views.MediaTabsView.MediaTab;
import io.reactivex.C3959e;
import io.reactivex.subjects.C19040a;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R2\u0010\u0005\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/loops/provider/MediaTabSelectedProvider;", "", "mainThreadExecutionVerifier", "Lcom/tinder/base/concurrency/MainThreadExecutionVerifier;", "(Lcom/tinder/base/concurrency/MainThreadExecutionVerifier;)V", "subject", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/tinder/loops/views/MediaTabsView$MediaTab;", "kotlin.jvm.PlatformType", "observe", "Lio/reactivex/Observable;", "update", "", "tab", "loops_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.c.a */
public final class C9763a {
    /* renamed from: a */
    private final C19040a<MediaTab> f32397a = C19040a.a(MediaTab.ALL);
    /* renamed from: b */
    private final C8301a f32398b;

    @Inject
    public C9763a(@NotNull C8301a c8301a) {
        C2668g.b(c8301a, "mainThreadExecutionVerifier");
        this.f32398b = c8301a;
    }

    @NotNull
    /* renamed from: a */
    public final C3959e<MediaTab> m40294a() {
        C3959e<MediaTab> hide = this.f32397a.hide();
        C2668g.a(hide, "subject.hide()");
        return hide;
    }

    @UiThread
    /* renamed from: a */
    public final void m40295a(@NotNull MediaTab mediaTab) {
        C2668g.b(mediaTab, "tab");
        this.f32398b.m35392a();
        this.f32397a.onNext(mediaTab);
    }
}
