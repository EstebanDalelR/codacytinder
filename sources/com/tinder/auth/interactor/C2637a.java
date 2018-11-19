package com.tinder.auth.interactor;

import android.support.annotation.NonNull;
import com.tinder.account.model.UpdateAccountException;
import com.tinder.account.view.UpdateAccountPage;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.model.SparksEvent;
import com.tinder.utils.ab;
import javax.annotation.Nonnull;
import javax.inject.Inject;

/* renamed from: com.tinder.auth.interactor.a */
public class C2637a {
    /* renamed from: a */
    private final ManagerAnalytics f8223a;

    @Inject
    public C2637a(@Nonnull ManagerAnalytics managerAnalytics) {
        this.f8223a = managerAnalytics;
    }

    /* renamed from: a */
    public void m9949a(@Nonnull UpdateAccountPage updateAccountPage) {
        m9947a(m9946a("Account.CollectInfo", "view", updateAccountPage));
    }

    /* renamed from: b */
    public void m9951b(@Nonnull UpdateAccountPage updateAccountPage) {
        m9947a(m9946a("Account.CollectInfo", "start", updateAccountPage));
    }

    /* renamed from: c */
    public void m9952c(@Nonnull UpdateAccountPage updateAccountPage) {
        m9947a(m9946a("Account.CollectInfo", "success", updateAccountPage));
    }

    /* renamed from: a */
    public void m9950a(@Nonnull UpdateAccountPage updateAccountPage, @Nonnull Throwable th) {
        SparksEvent a = m9946a("Account.CollectInfo", "error", updateAccountPage);
        a.put("errorName", th.getClass().getSimpleName());
        if (th instanceof UpdateAccountException) {
            a.put("errorCode", ((UpdateAccountException) th).m9783a().getInternalCode());
        } else {
            a.put("errorCode", -1);
        }
        m9947a(a);
    }

    /* renamed from: d */
    public void m9953d(@Nonnull UpdateAccountPage updateAccountPage) {
        m9947a(m9946a("Account.CollectInfoCancel", "view", updateAccountPage));
    }

    /* renamed from: e */
    public void m9954e(@Nonnull UpdateAccountPage updateAccountPage) {
        m9947a(m9946a("Account.CollectInfoCancel", "yesButton", updateAccountPage));
    }

    /* renamed from: f */
    public void m9955f(@Nonnull UpdateAccountPage updateAccountPage) {
        m9947a(m9946a("Account.CollectInfoCancel", "noButton", updateAccountPage));
    }

    @Nonnull
    /* renamed from: a */
    private SparksEvent m9946a(@Nonnull String str, @Nonnull String str2, @Nonnull UpdateAccountPage updateAccountPage) {
        SparksEvent sparksEvent = new SparksEvent(str);
        sparksEvent.put("eventType", str2);
        sparksEvent.put("infoType", m9948g(updateAccountPage));
        return sparksEvent;
    }

    @Nonnull
    /* renamed from: g */
    private String m9948g(@Nonnull UpdateAccountPage updateAccountPage) {
        switch (a$1.f29522a[updateAccountPage.ordinal()]) {
            case 1:
                return "email";
            case 2:
                return "password";
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unable to find page name for: ");
                stringBuilder.append(updateAccountPage);
                throw new UnsupportedOperationException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    private void m9947a(@NonNull SparksEvent sparksEvent) {
        sparksEvent.put("version", "authV2");
        sparksEvent.put("localeCountry", ab.b());
        this.f8223a.a(sparksEvent);
    }
}
