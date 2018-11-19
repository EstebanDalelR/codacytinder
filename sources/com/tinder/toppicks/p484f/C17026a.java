package com.tinder.toppicks.p484f;

import com.tinder.domain.toppicks.usecase.ResetScreenState;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.passport.model.C10044b;
import com.tinder.passport.provider.PassportLocationProvider;
import com.tinder.recs.domain.model.CustomRecEngineResetReason.PassportLocationUpdate;
import com.tinder.toppicks.domain.worker.TopPicksWorker;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Consumer;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/toppicks/worker/TopPicksPassportChangeWorker;", "Lcom/tinder/toppicks/domain/worker/TopPicksWorker;", "passportLocationProvider", "Lcom/tinder/passport/provider/PassportLocationProvider;", "resetScreenState", "Lcom/tinder/domain/toppicks/usecase/ResetScreenState;", "(Lcom/tinder/passport/provider/PassportLocationProvider;Lcom/tinder/domain/toppicks/usecase/ResetScreenState;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "onStart", "", "onStop", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.f.a */
public final class C17026a implements TopPicksWorker {
    /* renamed from: a */
    private C17356a f52468a = new C17356a();
    /* renamed from: b */
    private final PassportLocationProvider f52469b;
    /* renamed from: c */
    private final ResetScreenState f52470c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/passport/model/PassportLocationInfo;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.f.a$a */
    static final class C17024a<T> implements Consumer<C10044b> {
        /* renamed from: a */
        final /* synthetic */ C17026a f52466a;

        C17024a(C17026a c17026a) {
            this.f52466a = c17026a;
        }

        public /* synthetic */ void accept(Object obj) {
            m62815a((C10044b) obj);
        }

        /* renamed from: a */
        public final void m62815a(C10044b c10044b) {
            this.f52466a.f52468a.add(this.f52466a.f52470c.execute(PassportLocationUpdate.INSTANCE));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.f.a$b */
    static final class C17025b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17025b f52467a = new C17025b();

        C17025b() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62816a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62816a(Throwable th) {
            C0001a.c(th, "Error observing passport location changes.", new Object[0]);
        }
    }

    @Inject
    public C17026a(@NotNull PassportLocationProvider passportLocationProvider, @NotNull ResetScreenState resetScreenState) {
        C2668g.b(passportLocationProvider, "passportLocationProvider");
        C2668g.b(resetScreenState, "resetScreenState");
        this.f52469b = passportLocationProvider;
        this.f52470c = resetScreenState;
    }

    public void onStart() {
        this.f52468a.add(RxJavaInteropExtKt.toV2Observable(this.f52469b.observeUpdates()).subscribe(new C17024a(this), C17025b.f52467a));
    }

    public void onStop() {
        this.f52468a.m63446a();
    }
}
