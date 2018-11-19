package com.tinder.main;

import com.tinder.common.logger.Logger;
import com.tinder.domain.match.usecase.ObserveHasUntouchedMatches;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\nH\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/main/MatchesTabBadgeTrigger;", "Lcom/tinder/main/Badgeable$Trigger;", "observeHasUntouchedMatches", "Lcom/tinder/domain/match/usecase/ObserveHasUntouchedMatches;", "logger", "Lcom/tinder/common/logger/Logger;", "(Lcom/tinder/domain/match/usecase/ObserveHasUntouchedMatches;Lcom/tinder/common/logger/Logger;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "register", "", "badgeable", "Lcom/tinder/main/Badgeable;", "unregister", "main_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.main.a */
public final class C11991a implements Badgeable$Trigger {
    /* renamed from: a */
    private Disposable f38943a;
    /* renamed from: b */
    private final ObserveHasUntouchedMatches f38944b;
    /* renamed from: c */
    private final Logger f38945c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "hasUntouchedMatches", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.main.a$a */
    static final class C11987a<T> implements Consumer<Boolean> {
        /* renamed from: a */
        final /* synthetic */ Badgeable f38939a;

        C11987a(Badgeable badgeable) {
            this.f38939a = badgeable;
        }

        public /* synthetic */ void accept(Object obj) {
            m48027a((Boolean) obj);
        }

        /* renamed from: a */
        public final void m48027a(Boolean bool) {
            C2668g.a(bool, "hasUntouchedMatches");
            if (bool.booleanValue() != null) {
                this.f38939a.showBadge();
            } else {
                this.f38939a.hideBadge();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.main.a$b */
    static final class C11988b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C11991a f38940a;

        C11988b(C11991a c11991a) {
            this.f38940a = c11991a;
        }

        public /* synthetic */ void accept(Object obj) {
            m48028a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m48028a(Throwable th) {
            Logger a = this.f38940a.f38945c;
            C2668g.a(th, "throwable");
            a.error(th, "Error observing untouched matches");
        }
    }

    @Inject
    public C11991a(@NotNull ObserveHasUntouchedMatches observeHasUntouchedMatches, @NotNull Logger logger) {
        C2668g.b(observeHasUntouchedMatches, "observeHasUntouchedMatches");
        C2668g.b(logger, "logger");
        this.f38944b = observeHasUntouchedMatches;
        this.f38945c = logger;
    }

    public void register(@NotNull Badgeable badgeable) {
        C2668g.b(badgeable, "badgeable");
        this.f38943a = this.f38944b.execute().subscribeOn(C15756a.b()).observeOn(C15674a.a()).subscribe(new C11987a(badgeable), (Consumer) new C11988b(this));
    }

    public void unregister() {
        Disposable disposable = this.f38943a;
        if (disposable != null) {
            disposable.dispose();
        }
    }
}
