package com.tinder.passport.p303f;

import com.tinder.domain.common.reactivex.usecase.ObservableResultUseCase;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.passport.model.C10044b;
import com.tinder.passport.model.C10045c;
import com.tinder.passport.model.PassportLocation;
import com.tinder.passport.provider.PassportLocationProvider;
import io.reactivex.C3958c;
import io.reactivex.C3959e;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/tinder/passport/usecase/ObservePassportLocation;", "Lcom/tinder/domain/common/reactivex/usecase/ObservableResultUseCase;", "Lcom/tinder/passport/model/PassportLocationInfo;", "passportLocationProvider", "Lcom/tinder/passport/provider/PassportLocationProvider;", "(Lcom/tinder/passport/provider/PassportLocationProvider;)V", "execute", "Lio/reactivex/Observable;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.passport.f.a */
public final class C12263a implements ObservableResultUseCase<C10044b> {
    /* renamed from: a */
    private final PassportLocationProvider f39674a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tinder/passport/model/PassportLocation;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.passport.f.a$a */
    static final class C10041a<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C12263a f32935a;

        C10041a(C12263a c12263a) {
            this.f32935a = c12263a;
        }

        public /* synthetic */ Object call() {
            return m41089a();
        }

        @Nullable
        /* renamed from: a */
        public final PassportLocation m41089a() {
            return this.f32935a.f39674a.currentPassportLocation();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/passport/model/PassportLocationInfo;", "it", "Lcom/tinder/passport/model/PassportLocation;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.passport.f.a$b */
    static final class C12261b<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C12261b f39672a = new C12261b();

        C12261b() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m48458a((PassportLocation) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C10044b m48458a(@NotNull PassportLocation passportLocation) {
            C2668g.b(passportLocation, "it");
            return new C10044b(passportLocation, false, 2, null);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lcom/tinder/passport/model/PassportLocationInfo;", "kotlin.jvm.PlatformType", "it", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.passport.f.a$c */
    static final class C12262c<T, R> implements Function<T, ObservableSource<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C12263a f39673a;

        C12262c(C12263a c12263a) {
            this.f39673a = c12263a;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m48459a((C10044b) obj);
        }

        /* renamed from: a */
        public final C3959e<C10044b> m48459a(@NotNull C10044b c10044b) {
            C2668g.b(c10044b, "it");
            c10044b = this.f39673a.f39674a.observeUpdates().e(c10044b);
            C2668g.a(c10044b, "passportLocationProvider…           .startWith(it)");
            return RxJavaInteropExtKt.toV2Observable(c10044b).distinctUntilChanged();
        }
    }

    @Inject
    public C12263a(@NotNull PassportLocationProvider passportLocationProvider) {
        C2668g.b(passportLocationProvider, "passportLocationProvider");
        this.f39674a = passportLocationProvider;
    }

    @NotNull
    public C3959e<C10044b> execute() {
        C3959e<C10044b> b = C3958c.a(new C10041a(this)).b(C10045c.m41097a()).f(C12261b.f39672a).b(new C12262c(this));
        C2668g.a(b, "Maybe.fromCallable {\n   …ilChanged()\n            }");
        return b;
    }
}
