package com.tinder.smsauth.ui.viewmodel;

import android.arch.lifecycle.C0029n;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.LiveDataReactiveStreams;
import com.tinder.smsauth.domain.usecase.C18092a;
import com.tinder.smsauth.domain.usecase.C18098g;
import com.tinder.smsauth.entity.Flow.C14974c;
import com.tinder.smsauth.entity.Flow.C14974c.C16741c;
import com.tinder.smsauth.entity.Flow.C14974c.C16745g;
import com.tinder.smsauth.entity.Flow.Error.Unexpected;
import io.reactivex.C3957b;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Publisher;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/tinder/smsauth/ui/viewmodel/ErrorViewModel;", "Landroid/arch/lifecycle/ViewModel;", "goBackToPreviousStep", "Lcom/tinder/smsauth/domain/usecase/GoBackToPreviousStep;", "observeStateUpdates", "Lcom/tinder/smsauth/domain/usecase/ObserveStateUpdates;", "(Lcom/tinder/smsauth/domain/usecase/GoBackToPreviousStep;Lcom/tinder/smsauth/domain/usecase/ObserveStateUpdates;)V", "errorCode", "Landroid/arch/lifecycle/LiveData;", "", "getErrorCode", "()Landroid/arch/lifecycle/LiveData;", "getGoBackToPreviousStep", "()Lcom/tinder/smsauth/domain/usecase/GoBackToPreviousStep;", "ui_release"}, k = 1, mv = {1, 1, 10})
public final class ErrorViewModel extends C0029n {
    @NotNull
    /* renamed from: a */
    private final LiveData<String> f51859a;
    @NotNull
    /* renamed from: b */
    private final C18092a f51860b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "", "kotlin.jvm.PlatformType", "it", "Lcom/tinder/smsauth/entity/Flow$State;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.viewmodel.ErrorViewModel$a */
    static final class C16810a<T, R> implements Function<T, Publisher<? extends R>> {
        /* renamed from: a */
        public static final C16810a f51856a = new C16810a();

        C16810a() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m62351a((C14974c) obj);
        }

        /* renamed from: a */
        public final C3957b<Throwable> m62351a(@NotNull C14974c c14974c) {
            C2668g.b(c14974c, "it");
            if (c14974c instanceof C16741c) {
                return C3957b.a(((C16741c) c14974c).m62252b());
            }
            if (c14974c instanceof C16745g) {
                return C3957b.a(((C16745g) c14974c).m62259c());
            }
            return C3957b.b();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.viewmodel.ErrorViewModel$b */
    static final class C16811b<T> implements Predicate<Throwable> {
        /* renamed from: a */
        public static final C16811b f51857a = new C16811b();

        C16811b() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m62352a((Throwable) obj);
        }

        /* renamed from: a */
        public final boolean m62352a(@NotNull Throwable th) {
            C2668g.b(th, "it");
            return th instanceof Unexpected;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/smsauth/entity/Flow$Error$Unexpected;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.viewmodel.ErrorViewModel$c */
    static final class C16812c<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C16812c f51858a = new C16812c();

        C16812c() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m62353a((Unexpected) obj);
        }

        @NotNull
        /* renamed from: a */
        public final String m62353a(@NotNull Unexpected unexpected) {
            C2668g.b(unexpected, "it");
            unexpected = unexpected.m62234a();
            return unexpected != null ? unexpected : "";
        }
    }

    @NotNull
    /* renamed from: c */
    public final C18092a m62355c() {
        return this.f51860b;
    }

    @Inject
    public ErrorViewModel(@NotNull C18092a c18092a, @NotNull C18098g c18098g) {
        C2668g.b(c18092a, "goBackToPreviousStep");
        C2668g.b(c18098g, "observeStateUpdates");
        this.f51860b = c18092a;
        c18092a = LiveDataReactiveStreams.a(c18098g.m65698a().b((Function) C16810a.f51856a).a((Predicate) C16811b.f51857a).a(Unexpected.class).f((Function) C16812c.f51858a));
        C2668g.a(c18092a, "LiveDataReactiveStreams.…it.code ?: \"\" }\n        )");
        this.f51859a = c18092a;
    }

    @NotNull
    /* renamed from: b */
    public final LiveData<String> m62354b() {
        return this.f51859a;
    }
}
