package com.tinder.account.p072a;

import com.tinder.account.model.UpdateAccountException;
import com.tinder.account.p085b.C3876a;
import com.tinder.account.p085b.C3877b;
import com.tinder.account.provider.UpdateAccountPasswordLastShownDateProvider;
import com.tinder.account.view.UpdateAccountEmailPasswordActivity.FlowResponder;
import com.tinder.account.view.UpdateAccountPage;
import com.tinder.account.view.UpdateEmailPasswordTarget;
import com.tinder.auth.interactor.C2637a;
import com.tinder.common.provider.C8550g;
import com.tinder.managers.UserMetaManager;
import com.tinder.presenters.PresenterBase;
import com.tinder.utils.RxUtils;
import javax.annotation.Nonnull;
import javax.inject.Inject;
import rx.Completable;
import rx.Completable.Transformer;
import rx.Subscription;
import rx.functions.Action1;

/* renamed from: com.tinder.account.a.a */
public class C4298a extends PresenterBase<UpdateEmailPasswordTarget> {
    @Nonnull
    /* renamed from: a */
    private final UpdateAccountPasswordLastShownDateProvider f13998a;
    @Nonnull
    /* renamed from: b */
    private final C8550g f13999b;
    @Nonnull
    /* renamed from: c */
    private final C3876a f14000c;
    @Nonnull
    /* renamed from: d */
    private final C3877b f14001d;
    @Nonnull
    /* renamed from: e */
    private final UserMetaManager f14002e;
    @Nonnull
    /* renamed from: f */
    private final C2637a f14003f;

    /* renamed from: com.tinder.account.a.a$a */
    private static class C4402a implements Transformer {
        @Nonnull
        /* renamed from: a */
        private final C2637a f14586a;
        @Nonnull
        /* renamed from: b */
        private final UpdateAccountPage f14587b;

        public /* synthetic */ Object call(Object obj) {
            return m18167a((Completable) obj);
        }

        C4402a(@Nonnull C2637a c2637a, @Nonnull UpdateAccountPage updateAccountPage) {
            this.f14586a = c2637a;
            this.f14587b = updateAccountPage;
        }

        /* renamed from: a */
        public Completable m18167a(Completable completable) {
            return completable.m10400d(new C4413l(this)).m10397c(new C4414m(this)).m10387b(new C4415n(this));
        }

        /* renamed from: a */
        final /* synthetic */ void m18170a(Subscription subscription) {
            this.f14586a.m9951b(this.f14587b);
        }

        /* renamed from: a */
        final /* synthetic */ void m18169a(Throwable th) {
            this.f14586a.m9950a(this.f14587b, th);
        }

        /* renamed from: a */
        final /* synthetic */ void m18168a() {
            this.f14586a.m9952c(this.f14587b);
        }
    }

    @Inject
    C4298a(@Nonnull UpdateAccountPasswordLastShownDateProvider updateAccountPasswordLastShownDateProvider, @Nonnull C8550g c8550g, @Nonnull C3876a c3876a, @Nonnull C3877b c3877b, @Nonnull UserMetaManager userMetaManager, @Nonnull C2637a c2637a) {
        this.f13998a = updateAccountPasswordLastShownDateProvider;
        this.f13999b = c8550g;
        this.f14000c = c3876a;
        this.f14001d = c3877b;
        this.f14002e = userMetaManager;
        this.f14003f = c2637a;
    }

    public void q_() {
        this.f13998a.updateLastShownDate(this.f13999b.a());
        this.f14003f.m9949a(UpdateAccountPage.PASSWORD);
    }

    /* renamed from: a */
    public void m17269a(@Nonnull UpdateAccountPage updateAccountPage) {
        m15094a(new C4403b(updateAccountPage));
        this.f14003f.m9953d(updateAccountPage);
    }

    /* renamed from: a */
    public void m17270a(@Nonnull UpdateAccountPage updateAccountPage, @Nonnull FlowResponder flowResponder) {
        flowResponder = flowResponder.onActionButtonClicked();
        if (flowResponder.c()) {
            m15094a(C4404c.f14604a);
            String str = (String) flowResponder.b();
            if (updateAccountPage == UpdateAccountPage.EMAIL) {
                flowResponder = this.f14000c.m14619a(str);
            } else if (updateAccountPage == UpdateAccountPage.PASSWORD) {
                flowResponder = this.f14001d.m14620a(str);
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Use case for : ");
                stringBuilder.append(updateAccountPage);
                stringBuilder.append(" has not implemented yet");
                throw new UnsupportedOperationException(stringBuilder.toString());
            }
            flowResponder.m10376a(RxUtils.m10183a().b()).m10376a(bindToLifecycle().forCompletable()).m10376a(new C4402a(this.f14003f, updateAccountPage)).m10399d(new C4405d(this)).m10381a(new C4406e(this, updateAccountPage), new C4407f(this));
        }
    }

    /* renamed from: b */
    final /* synthetic */ void m17272b() {
        m15094a(C4412k.f14613a);
    }

    /* renamed from: d */
    final /* synthetic */ void m17275d(@Nonnull UpdateAccountPage updateAccountPage) {
        if (updateAccountPage == UpdateAccountPage.PASSWORD) {
            this.f14002e.fetchMetaData();
            m15094a((Action1) C4410i.f14611a);
            this.f14003f.m9949a(UpdateAccountPage.EMAIL);
            return;
        }
        m15094a((Action1) C4411j.f14612a);
    }

    /* renamed from: a */
    static final /* synthetic */ void m17267a(UpdateEmailPasswordTarget updateEmailPasswordTarget) {
        updateEmailPasswordTarget.showPage(UpdateAccountPage.EMAIL);
        updateEmailPasswordTarget.disableSubmitButton();
    }

    /* renamed from: a */
    final /* synthetic */ void m17271a(Throwable th) {
        if (th instanceof UpdateAccountException) {
            m15094a(new C4408g(th));
        } else {
            m15094a((Action1) C4409h.f14610a);
        }
    }

    /* renamed from: b */
    public void m17273b(UpdateAccountPage updateAccountPage) {
        this.f14003f.m9954e(updateAccountPage);
    }

    /* renamed from: c */
    public void m17274c(@Nonnull UpdateAccountPage updateAccountPage) {
        this.f14003f.m9955f(updateAccountPage);
    }
}
