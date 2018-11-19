package com.tinder.toppicks.domain.worker;

import com.tinder.domain.meta.model.DiscoverySettings;
import com.tinder.domain.profile.usecase.ObserveDiscoverySettings;
import com.tinder.domain.toppicks.usecase.ResetScreenState;
import com.tinder.recs.domain.model.CustomRecEngineResetReason.DiscoverySettingsUpdate;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/toppicks/domain/worker/TopPicksDiscoverySettingWorker;", "Lcom/tinder/toppicks/domain/worker/TopPicksWorker;", "observeDiscoverySettings", "Lcom/tinder/domain/profile/usecase/ObserveDiscoverySettings;", "resetScreenState", "Lcom/tinder/domain/toppicks/usecase/ResetScreenState;", "(Lcom/tinder/domain/profile/usecase/ObserveDiscoverySettings;Lcom/tinder/domain/toppicks/usecase/ResetScreenState;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "onStart", "", "onStop", "domain_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.domain.worker.a */
public final class C17007a implements TopPicksWorker {
    /* renamed from: a */
    private C17356a f52426a = new C17356a();
    /* renamed from: b */
    private final ObserveDiscoverySettings f52427b;
    /* renamed from: c */
    private final ResetScreenState f52428c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/meta/model/DiscoverySettings;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.domain.worker.a$a */
    static final class C17005a<T> implements Consumer<DiscoverySettings> {
        /* renamed from: a */
        final /* synthetic */ C17007a f52424a;

        C17005a(C17007a c17007a) {
            this.f52424a = c17007a;
        }

        public /* synthetic */ void accept(Object obj) {
            m62783a((DiscoverySettings) obj);
        }

        /* renamed from: a */
        public final void m62783a(DiscoverySettings discoverySettings) {
            this.f52424a.f52426a.add(this.f52424a.f52428c.execute(DiscoverySettingsUpdate.INSTANCE));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.domain.worker.a$b */
    static final class C17006b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17006b f52425a = new C17006b();

        C17006b() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62784a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62784a(Throwable th) {
            C0001a.c(th, "Error observing discovery settings.", new Object[0]);
        }
    }

    @Inject
    public C17007a(@NotNull ObserveDiscoverySettings observeDiscoverySettings, @NotNull ResetScreenState resetScreenState) {
        C2668g.b(observeDiscoverySettings, "observeDiscoverySettings");
        C2668g.b(resetScreenState, "resetScreenState");
        this.f52427b = observeDiscoverySettings;
        this.f52428c = resetScreenState;
    }

    public void onStart() {
        this.f52426a.add(this.f52427b.execute().distinctUntilChanged().skip(1).subscribeOn(C15756a.m59010b()).subscribe(new C17005a(this), C17006b.f52425a));
    }

    public void onStop() {
        this.f52426a.m63446a();
    }
}
