package com.tinder.usecase;

import com.tinder.domain.common.usecase.SimpleVoidUseCase;
import com.tinder.feed.analytics.session.C9441a;
import com.tinder.feed.analytics.session.C9458s;
import com.tinder.feed.p341b.C11695a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/usecase/MonitorCurrentScreen;", "Lcom/tinder/domain/common/usecase/SimpleVoidUseCase;", "startFeedSession", "Lcom/tinder/feed/analytics/session/StartFeedSession;", "endFeedSession", "Lcom/tinder/feed/analytics/session/EndFeedSession;", "feedExperimentUtility", "Lcom/tinder/feed/experiment/AbTestFeedExperimentUtility;", "(Lcom/tinder/feed/analytics/session/StartFeedSession;Lcom/tinder/feed/analytics/session/EndFeedSession;Lcom/tinder/feed/experiment/AbTestFeedExperimentUtility;)V", "execute", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.usecase.i */
public final class C3952i implements SimpleVoidUseCase {
    /* renamed from: a */
    private final C9458s f12543a;
    /* renamed from: b */
    private final C9441a f12544b;
    /* renamed from: c */
    private final C11695a f12545c;

    @Inject
    public C3952i(@NotNull C9458s c9458s, @NotNull C9441a c9441a, @NotNull C11695a c11695a) {
        C2668g.m10309b(c9458s, "startFeedSession");
        C2668g.m10309b(c9441a, "endFeedSession");
        C2668g.m10309b(c11695a, "feedExperimentUtility");
        this.f12543a = c9458s;
        this.f12544b = c9441a;
        this.f12545c = c11695a;
    }

    public void execute() {
        if (this.f12545c.b()) {
            this.f12543a.a();
            this.f12544b.a();
        }
    }
}
