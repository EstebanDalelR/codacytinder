package com.tinder.match.presenter;

import com.tinder.deadshot.DeadshotTarget;
import com.tinder.domain.config.TopPicksConfig;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.match.analytics.C12036c;
import com.tinder.match.target.NewMatchRowTarget;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/tinder/match/presenter/NewMatchRowPresenter;", "", "fastMatchConfigProvider", "Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;", "topPicksConfig", "Lcom/tinder/domain/config/TopPicksConfig;", "addMatchSearchSelectEvent", "Lcom/tinder/match/analytics/AddMatchSearchSelectEvent;", "(Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;Lcom/tinder/domain/config/TopPicksConfig;Lcom/tinder/match/analytics/AddMatchSearchSelectEvent;)V", "target", "Lcom/tinder/match/target/NewMatchRowTarget;", "getTarget$Tinder_release", "()Lcom/tinder/match/target/NewMatchRowTarget;", "setTarget$Tinder_release", "(Lcom/tinder/match/target/NewMatchRowTarget;)V", "handleNewMatchRowClick", "", "matchId", "", "shouldShowFastMatchAttribution", "", "shouldShowTopPicksAttribution", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.match.presenter.q */
public final class C9874q {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public NewMatchRowTarget f32694a;
    /* renamed from: b */
    private final FastMatchConfigProvider f32695b;
    /* renamed from: c */
    private final TopPicksConfig f32696c;
    /* renamed from: d */
    private final C12036c f32697d;

    @Inject
    public C9874q(@NotNull FastMatchConfigProvider fastMatchConfigProvider, @NotNull TopPicksConfig topPicksConfig, @NotNull C12036c c12036c) {
        C2668g.b(fastMatchConfigProvider, "fastMatchConfigProvider");
        C2668g.b(topPicksConfig, "topPicksConfig");
        C2668g.b(c12036c, "addMatchSearchSelectEvent");
        this.f32695b = fastMatchConfigProvider;
        this.f32696c = topPicksConfig;
        this.f32697d = c12036c;
    }

    /* renamed from: a */
    public final void m40630a(@NotNull String str) {
        C2668g.b(str, "matchId");
        NewMatchRowTarget newMatchRowTarget = this.f32694a;
        if (newMatchRowTarget == null) {
            C2668g.b("target");
        }
        newMatchRowTarget.navigateToChat(str);
        this.f32697d.m48137a(str);
    }

    /* renamed from: a */
    public final boolean m40631a() {
        return this.f32695b.get().isEnabled();
    }

    /* renamed from: b */
    public final boolean m40632b() {
        return this.f32696c.isEnabled();
    }
}
