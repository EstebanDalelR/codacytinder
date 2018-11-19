package com.tinder.p204d.p205a;

import com.tinder.core.experiment.AbTestUtility;
import com.tinder.feed.p341b.C11695a;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u0011\u0010\u0011\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u0011\u0010\u0013\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tinder/loop/experiment/LoopsExperimentUtility;", "", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "feedExperimentUtility", "Lcom/tinder/feed/experiment/AbTestFeedExperimentUtility;", "(Lcom/tinder/core/experiment/AbTestUtility;Lcom/tinder/feed/experiment/AbTestFeedExperimentUtility;)V", "autoPlayControlsEnabled", "", "getAutoPlayControlsEnabled", "()Z", "isLoopsCreationEnabled", "isLoopsDisplayEnabled", "loopsEnabled", "getLoopsEnabled", "loopsFeedEnabled", "getLoopsFeedEnabled", "loopsMessagesEnabled", "getLoopsMessagesEnabled", "loopsRecsEnabled", "getLoopsRecsEnabled", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.d.a.a */
public final class C8609a {
    /* renamed from: a */
    private final boolean f30464a;
    /* renamed from: b */
    private final boolean f30465b;
    /* renamed from: c */
    private final boolean f30466c;
    /* renamed from: d */
    private final boolean f30467d;
    /* renamed from: e */
    private final boolean f30468e;
    /* renamed from: f */
    private final boolean f30469f;
    /* renamed from: g */
    private final boolean f30470g;

    @Inject
    public C8609a(@NotNull AbTestUtility abTestUtility, @NotNull C11695a c11695a) {
        C2668g.b(abTestUtility, "abTestUtility");
        C2668g.b(c11695a, "feedExperimentUtility");
        this.f30464a = abTestUtility.loopsEnabled();
        boolean z = false;
        boolean z2 = this.f30464a && abTestUtility.loopsRecsEnabled();
        this.f30465b = z2;
        z2 = this.f30464a && abTestUtility.loopsFeedEnabled();
        this.f30466c = z2;
        c11695a = (!this.f30464a || c11695a.m47522a() == null || abTestUtility.loopsMessagesEnabled() == null) ? null : true;
        this.f30467d = c11695a;
        c11695a = (this.f30464a == null || abTestUtility.autoPlayControlsEnabled() == null) ? null : true;
        this.f30468e = c11695a;
        c11695a = (this.f30464a == null || abTestUtility.isLoopsCreationEnabled() == null) ? null : true;
        this.f30469f = c11695a;
        if (!(this.f30464a == null || abTestUtility.isLoopsDisplayEnabled() == null)) {
            z = true;
        }
        this.f30470g = z;
    }

    /* renamed from: a */
    public final boolean m36728a() {
        return this.f30465b;
    }

    /* renamed from: b */
    public final boolean m36729b() {
        return this.f30466c;
    }

    /* renamed from: c */
    public final boolean m36730c() {
        return this.f30467d;
    }

    /* renamed from: d */
    public final boolean m36731d() {
        return this.f30468e;
    }

    /* renamed from: e */
    public final boolean m36732e() {
        return this.f30470g;
    }
}
