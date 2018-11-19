package com.tinder.feed.usecase;

import com.jakewharton.rxbinding.support.design.widget.TabLayoutSelectionEvent.Kind;
import com.tinder.match.provider.C9879g;
import com.tinder.match.provider.C9879g.C9878a;
import com.tinder.match.viewmodel.MatchTabsPage;
import io.reactivex.C3956a;
import io.reactivex.functions.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/feed/usecase/FeedSubTabFirstOpened;", "Lcom/tinder/feed/usecase/FeedFirstOpened;", "matchesTabSelectedProvider", "Lcom/tinder/match/provider/MatchesTabSelectedProvider;", "(Lcom/tinder/match/provider/MatchesTabSelectedProvider;)V", "execute", "Lio/reactivex/Completable;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.usecase.b */
public final class C13273b implements FeedFirstOpened {
    /* renamed from: a */
    private final C9879g f42037a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/match/provider/MatchesTabSelectedProvider$TabSelectedEvent;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.usecase.b$a */
    static final class C11706a<T> implements Predicate<C9878a> {
        /* renamed from: a */
        public static final C11706a f38216a = new C11706a();

        C11706a() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m47532a((C9878a) obj);
        }

        /* renamed from: a */
        public final boolean m47532a(@NotNull C9878a c9878a) {
            C2668g.b(c9878a, "it");
            return (c9878a.m40640a() == MatchTabsPage.FEED && c9878a.m40641b() == Kind.SELECTED) ? true : null;
        }
    }

    public C13273b(@NotNull C9879g c9879g) {
        C2668g.b(c9879g, "matchesTabSelectedProvider");
        this.f42037a = c9879g;
    }

    @NotNull
    public C3956a execute() {
        C3956a ignoreElements = this.f42037a.m40642a().filter(C11706a.f38216a).take(1).ignoreElements();
        C2668g.a(ignoreElements, "matchesTabSelectedProvid…        .ignoreElements()");
        return ignoreElements;
    }
}
