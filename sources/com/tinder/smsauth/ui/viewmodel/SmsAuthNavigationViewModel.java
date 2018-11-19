package com.tinder.smsauth.ui.viewmodel;

import android.arch.lifecycle.C0029n;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.LiveDataReactiveStreams;
import com.tinder.smsauth.domain.usecase.C18092a;
import com.tinder.smsauth.domain.usecase.C18096e;
import com.tinder.smsauth.domain.usecase.C18098g;
import com.tinder.smsauth.entity.Flow.C14972a;
import com.tinder.smsauth.entity.Flow.C14972a.C16730f;
import com.tinder.smsauth.entity.Flow.C14974c;
import com.tinder.smsauth.entity.Flow.C14974c.C16740b;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Predicate;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/tinder/smsauth/ui/viewmodel/SmsAuthNavigationViewModel;", "Landroid/arch/lifecycle/ViewModel;", "goBackToPreviousStep", "Lcom/tinder/smsauth/domain/usecase/GoBackToPreviousStep;", "observeStateUpdates", "Lcom/tinder/smsauth/domain/usecase/ObserveStateUpdates;", "observeEvents", "Lcom/tinder/smsauth/domain/usecase/ObserveEvents;", "(Lcom/tinder/smsauth/domain/usecase/GoBackToPreviousStep;Lcom/tinder/smsauth/domain/usecase/ObserveStateUpdates;Lcom/tinder/smsauth/domain/usecase/ObserveEvents;)V", "canNavigateBack", "", "getCanNavigateBack", "()Z", "getGoBackToPreviousStep", "()Lcom/tinder/smsauth/domain/usecase/GoBackToPreviousStep;", "onOneTimePasswordRequestSucceededEvents", "Landroid/arch/lifecycle/LiveData;", "Lcom/tinder/smsauth/entity/Flow$Event$OnOneTimePasswordRequestSucceeded;", "getOnOneTimePasswordRequestSucceededEvents", "()Landroid/arch/lifecycle/LiveData;", "stateUpdates", "Lcom/tinder/smsauth/entity/Flow$State;", "getStateUpdates", "ui_release"}, k = 1, mv = {1, 1, 10})
public final class SmsAuthNavigationViewModel extends C0029n {
    @NotNull
    /* renamed from: a */
    private final LiveData<C14974c> f51879a;
    @NotNull
    /* renamed from: b */
    private final LiveData<C16730f> f51880b;
    @NotNull
    /* renamed from: c */
    private final C18092a f51881c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/smsauth/entity/Flow$Event;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.viewmodel.SmsAuthNavigationViewModel$a */
    static final class C16818a<T> implements Predicate<C14972a> {
        /* renamed from: a */
        public static final C16818a f51877a = new C16818a();

        C16818a() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m62372a((C14972a) obj);
        }

        /* renamed from: a */
        public final boolean m62372a(@NotNull C14972a c14972a) {
            C2668g.b(c14972a, "it");
            return c14972a instanceof C16730f;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "oldState", "Lcom/tinder/smsauth/entity/Flow$State;", "newState", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.viewmodel.SmsAuthNavigationViewModel$b */
    static final class C16819b<T1, T2> implements BiPredicate<C14974c, C14974c> {
        /* renamed from: a */
        public static final C16819b f51878a = new C16819b();

        C16819b() {
        }

        public /* synthetic */ boolean test(Object obj, Object obj2) {
            return m62373a((C14974c) obj, (C14974c) obj2);
        }

        /* renamed from: a */
        public final boolean m62373a(@NotNull C14974c c14974c, @NotNull C14974c c14974c2) {
            C2668g.b(c14974c, "oldState");
            C2668g.b(c14974c2, "newState");
            return C2668g.a(c14974c.getClass(), c14974c2.getClass());
        }
    }

    @NotNull
    /* renamed from: e */
    public final C18092a m62377e() {
        return this.f51881c;
    }

    @Inject
    public SmsAuthNavigationViewModel(@NotNull C18092a c18092a, @NotNull C18098g c18098g, @NotNull C18096e c18096e) {
        C2668g.b(c18092a, "goBackToPreviousStep");
        C2668g.b(c18098g, "observeStateUpdates");
        C2668g.b(c18096e, "observeEvents");
        this.f51881c = c18092a;
        c18092a = LiveDataReactiveStreams.a(c18098g.m65698a().a((BiPredicate) C16819b.f51878a));
        C2668g.a(c18092a, "LiveDataReactiveStreams.…Class\n            }\n    )");
        this.f51879a = c18092a;
        c18092a = LiveDataReactiveStreams.a(c18096e.m65694a().a((Predicate) C16818a.f51877a).a(C16730f.class));
        C2668g.a(c18092a, "LiveDataReactiveStreams.…ed::class.java)\n        )");
        this.f51880b = c18092a;
    }

    @NotNull
    /* renamed from: b */
    public final LiveData<C14974c> m62374b() {
        return this.f51879a;
    }

    @NotNull
    /* renamed from: c */
    public final LiveData<C16730f> m62375c() {
        return this.f51880b;
    }

    /* renamed from: d */
    public final boolean m62376d() {
        return !(this.f51879a.a() instanceof C16740b);
    }
}
