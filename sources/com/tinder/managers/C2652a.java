package com.tinder.managers;

import android.text.TextUtils;
import com.android.volley.VolleyError;
import com.facebook.AccessToken;
import com.tinder.analytics.C2634g;
import com.tinder.api.JsonObjectRequestHeader;
import com.tinder.api.ManagerNetwork;
import com.tinder.api.ManagerWebServices;
import com.tinder.auth.interactor.C10333h;
import com.tinder.auth.interactor.C8277d;
import com.tinder.auth.interactor.C8281o;
import com.tinder.common.repository.C10698c;
import com.tinder.domain.session.SessionState;
import com.tinder.listeners.ListenerDeleteAccount;
import com.tinder.model.auth.LogoutFrom;
import com.tinder.model.auth.LogoutFrom.Merge;
import com.tinder.session.p474a.C16576a;
import com.tinder.utils.RxUtils;
import com.tinder.utils.Tinteg;
import com.tinder.utils.ad;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.json.JSONObject;
import p000a.p001a.C0001a;

@Singleton
/* renamed from: com.tinder.managers.a */
public class C2652a {
    /* renamed from: a */
    private static final Object f8325a = new Object();
    /* renamed from: b */
    private boolean f8326b = this.f8328d.m14937L();
    /* renamed from: c */
    private final ManagerNetwork f8327c;
    /* renamed from: d */
    private final bk f8328d;
    /* renamed from: e */
    private final C2634g f8329e;
    /* renamed from: f */
    private final ManagerApp f8330f;
    /* renamed from: g */
    private final FacebookManager f8331g;
    /* renamed from: h */
    private final C10333h f8332h;
    /* renamed from: i */
    private final C8281o f8333i;
    /* renamed from: j */
    private final C8277d f8334j;
    /* renamed from: k */
    private final C10698c f8335k;
    /* renamed from: l */
    private final C16576a f8336l;

    /* renamed from: e */
    static final /* synthetic */ void m10118e() {
    }

    @Inject
    public C2652a(bk bkVar, C2634g c2634g, ManagerNetwork managerNetwork, ManagerApp managerApp, FacebookManager facebookManager, C10698c c10698c, C10333h c10333h, C8277d c8277d, C8281o c8281o, C16576a c16576a) {
        this.f8331g = facebookManager;
        this.f8332h = c10333h;
        this.f8333i = c8281o;
        ad.m10189a();
        this.f8328d = bkVar;
        this.f8329e = c2634g;
        this.f8327c = managerNetwork;
        this.f8330f = managerApp;
        this.f8335k = c10698c;
        this.f8334j = c8277d;
        this.f8336l = c16576a;
        if (AccessToken.getCurrentAccessToken() != null) {
            Tinteg.alt = AccessToken.getCurrentAccessToken().getToken();
            Tinteg.ali = AccessToken.getCurrentAccessToken().getUserId();
        }
    }

    /* renamed from: a */
    public static String m10116a() {
        return C10698c.a();
    }

    /* renamed from: a */
    public void m10122a(String str) {
        this.f8335k.a(str);
    }

    /* renamed from: a */
    public void m10121a(LogoutFrom logoutFrom) {
        synchronized (f8325a) {
            this.f8332h.a(logoutFrom);
            this.f8329e.m9884c();
            this.f8329e.m9874a();
            this.f8329e.m9880b();
            this.f8330f.m14875a(logoutFrom, new C9836b(this, logoutFrom));
        }
    }

    /* renamed from: b */
    final /* synthetic */ void m10125b(LogoutFrom logoutFrom) {
        ad.m10190a("cleared application data");
        if ((logoutFrom instanceof Merge) == null) {
            this.f8333i.c();
            this.f8334j.a().m10376a(RxUtils.m10183a().b()).m10381a(C14050f.f44560a, C14051g.f44561a);
        }
        m10123a((boolean) null);
        this.f8336l.a(SessionState.INACTIVE);
        this.f8332h.e();
    }

    /* renamed from: a */
    public void m10119a(ListenerDeleteAccount listenerDeleteAccount) {
        this.f8327c.addRequest(new JsonObjectRequestHeader(3, ManagerWebServices.URL_PROFILE, null, new C12023c(this, listenerDeleteAccount), new C12024d(listenerDeleteAccount), C10698c.a()));
    }

    /* renamed from: a */
    final /* synthetic */ void m10120a(ListenerDeleteAccount listenerDeleteAccount, JSONObject jSONObject) {
        this.f8329e.m9884c();
        this.f8329e.m9874a();
        this.f8329e.m9880b();
        m10123a((boolean) null);
        this.f8330f.m14875a((LogoutFrom) null, new C9837e(this, listenerDeleteAccount));
    }

    /* renamed from: b */
    final /* synthetic */ void m10124b(ListenerDeleteAccount listenerDeleteAccount) {
        this.f8333i.c();
        this.f8336l.a(SessionState.INACTIVE);
        if (listenerDeleteAccount != null) {
            listenerDeleteAccount.onDeleteAccountSuccess();
        }
        this.f8332h.e();
    }

    /* renamed from: a */
    static final /* synthetic */ void m10117a(ListenerDeleteAccount listenerDeleteAccount, VolleyError volleyError) {
        if (volleyError != null) {
            C0001a.m29c(volleyError);
        }
        listenerDeleteAccount.onDeleteAccountFailure();
    }

    /* renamed from: a */
    public void m10123a(boolean z) {
        this.f8326b = z;
        this.f8328d.m14995q(this.f8326b);
    }

    /* renamed from: b */
    public boolean m10126b() {
        return (AccessToken.getCurrentAccessToken() == null || TextUtils.isEmpty(AccessToken.getCurrentAccessToken().getToken()) || AccessToken.getCurrentAccessToken().isExpired()) ? false : true;
    }

    /* renamed from: c */
    public boolean m10127c() {
        return C10698c.a() != null;
    }

    /* renamed from: d */
    public boolean m10128d() {
        if (!(m10126b() || m10127c())) {
            this.f8326b = false;
        }
        return this.f8326b;
    }
}
