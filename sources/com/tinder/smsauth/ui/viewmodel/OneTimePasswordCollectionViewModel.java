package com.tinder.smsauth.ui.viewmodel;

import android.arch.lifecycle.C0029n;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.LiveDataReactiveStreams;
import com.tinder.common.logger.Logger;
import com.tinder.smsauth.domain.usecase.C18098g;
import com.tinder.smsauth.domain.usecase.C18100i;
import com.tinder.smsauth.domain.usecase.C18102k;
import com.tinder.smsauth.domain.usecase.C18106p;
import com.tinder.smsauth.domain.usecase.C18110t;
import com.tinder.smsauth.entity.Flow.C14974c;
import com.tinder.smsauth.entity.Flow.C14974c.C16739a;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u0010\u001c\u001a\u00020\u001dH\u0014R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/tinder/smsauth/ui/viewmodel/OneTimePasswordCollectionViewModel;", "Landroid/arch/lifecycle/ViewModel;", "updateOneTimePasswordCodeText", "Lcom/tinder/smsauth/domain/usecase/UpdateOneTimePasswordCodeText;", "proceedToNextStep", "Lcom/tinder/smsauth/domain/usecase/ProceedToNextStep;", "resendOneTimePasswordCode", "Lcom/tinder/smsauth/domain/usecase/ResendOneTimePasswordCode;", "logger", "Lcom/tinder/common/logger/Logger;", "observeStateUpdates", "Lcom/tinder/smsauth/domain/usecase/ObserveStateUpdates;", "readOneTimePasswordFromSms", "Lcom/tinder/smsauth/domain/usecase/ReadOneTimePasswordFromSms;", "(Lcom/tinder/smsauth/domain/usecase/UpdateOneTimePasswordCodeText;Lcom/tinder/smsauth/domain/usecase/ProceedToNextStep;Lcom/tinder/smsauth/domain/usecase/ResendOneTimePasswordCode;Lcom/tinder/common/logger/Logger;Lcom/tinder/smsauth/domain/usecase/ObserveStateUpdates;Lcom/tinder/smsauth/domain/usecase/ReadOneTimePasswordFromSms;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getProceedToNextStep", "()Lcom/tinder/smsauth/domain/usecase/ProceedToNextStep;", "getResendOneTimePasswordCode", "()Lcom/tinder/smsauth/domain/usecase/ResendOneTimePasswordCode;", "stateUpdates", "Landroid/arch/lifecycle/LiveData;", "Lcom/tinder/smsauth/entity/Flow$State$CollectingOneTimePassword;", "getStateUpdates", "()Landroid/arch/lifecycle/LiveData;", "getUpdateOneTimePasswordCodeText", "()Lcom/tinder/smsauth/domain/usecase/UpdateOneTimePasswordCodeText;", "onCleared", "", "ui_release"}, k = 1, mv = {1, 1, 10})
public final class OneTimePasswordCollectionViewModel extends C0029n {
    /* renamed from: a */
    private final C17356a f51864a = new C17356a();
    @NotNull
    /* renamed from: b */
    private final LiveData<C16739a> f51865b;
    @NotNull
    /* renamed from: c */
    private final C18110t f51866c;
    @NotNull
    /* renamed from: d */
    private final C18100i f51867d;
    @NotNull
    /* renamed from: e */
    private final C18106p f51868e;
    /* renamed from: f */
    private final Logger f51869f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/smsauth/entity/Flow$State;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.viewmodel.OneTimePasswordCollectionViewModel$a */
    static final class C16815a<T> implements Predicate<C14974c> {
        /* renamed from: a */
        public static final C16815a f51863a = new C16815a();

        C16815a() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m62358a((C14974c) obj);
        }

        /* renamed from: a */
        public final boolean m62358a(@NotNull C14974c c14974c) {
            C2668g.b(c14974c, "it");
            return c14974c instanceof C16739a;
        }
    }

    @NotNull
    /* renamed from: c */
    public final C18110t m62362c() {
        return this.f51866c;
    }

    @NotNull
    /* renamed from: d */
    public final C18100i m62363d() {
        return this.f51867d;
    }

    @NotNull
    /* renamed from: e */
    public final C18106p m62364e() {
        return this.f51868e;
    }

    @Inject
    public OneTimePasswordCollectionViewModel(@NotNull C18110t c18110t, @NotNull C18100i c18100i, @NotNull C18106p c18106p, @NotNull Logger logger, @NotNull C18098g c18098g, @NotNull C18102k c18102k) {
        C2668g.b(c18110t, "updateOneTimePasswordCodeText");
        C2668g.b(c18100i, "proceedToNextStep");
        C2668g.b(c18106p, "resendOneTimePasswordCode");
        C2668g.b(logger, "logger");
        C2668g.b(c18098g, "observeStateUpdates");
        C2668g.b(c18102k, "readOneTimePasswordFromSms");
        this.f51866c = c18110t;
        this.f51867d = c18100i;
        this.f51868e = c18106p;
        this.f51869f = logger;
        c18110t = LiveDataReactiveStreams.a(c18098g.m65698a().a((Predicate) C16815a.f51863a).a(C16739a.class));
        C2668g.a(c18110t, "LiveDataReactiveStreams.…rd::class.java)\n        )");
        this.f51865b = c18110t;
        this.f51864a.add(c18102k.m65708a().subscribe((Consumer) new Consumer<String>() {
            public /* synthetic */ void accept(Object obj) {
                m62356a((String) obj);
            }

            /* renamed from: a */
            public final void m62356a(String str) {
                C18110t c = this.m62362c();
                C2668g.a(str, "code");
                c.m65724a(str, true);
            }
        }, (Consumer) new Consumer<Throwable>() {
            public /* synthetic */ void accept(Object obj) {
                m62357a((Throwable) obj);
            }

            /* renamed from: a */
            public final void m62357a(Throwable th) {
                Logger a = this.f51869f;
                C2668g.a(th, "error");
                a.error(th, "Error reading code ");
            }
        }));
    }

    @NotNull
    /* renamed from: b */
    public final LiveData<C16739a> m62361b() {
        return this.f51865b;
    }

    /* renamed from: a */
    protected void m62360a() {
        super.a();
        this.f51864a.m63446a();
    }
}
