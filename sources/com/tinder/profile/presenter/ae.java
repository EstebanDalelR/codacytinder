package com.tinder.profile.presenter;

import android.support.annotation.NonNull;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.api.EnvironmentProvider;
import com.tinder.api.ManagerWebServices;
import com.tinder.common.utils.C8578a;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.domain.profile.model.InstagramAuthResult;
import com.tinder.domain.profile.model.exception.InstagramAccountAlreadyInUseException;
import com.tinder.domain.profile.usecase.ConnectInstagram;
import com.tinder.etl.event.C11232d;
import com.tinder.etl.event.C11280e;
import com.tinder.profile.p363b.C14372a;
import com.tinder.profile.p363b.C14376b;
import com.tinder.profile.target.ProfileInstagramAuthTarget;
import io.reactivex.disposables.C17356a;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;

public class ae {
    @DeadshotTarget
    /* renamed from: a */
    ProfileInstagramAuthTarget f45638a;
    /* renamed from: b */
    private final C14376b f45639b;
    /* renamed from: c */
    private final EnvironmentProvider f45640c;
    /* renamed from: d */
    private final C14372a f45641d;
    /* renamed from: e */
    private final ConnectInstagram f45642e;
    /* renamed from: f */
    private final C2630h f45643f;
    /* renamed from: g */
    private final C17356a f45644g = new C17356a();

    /* renamed from: b */
    final /* synthetic */ void m54981b(InstagramAuthResult instagramAuthResult) {
        m54974c(instagramAuthResult);
    }

    @Inject
    public ae(C14376b c14376b, EnvironmentProvider environmentProvider, C14372a c14372a, ConnectInstagram connectInstagram, C2630h c2630h) {
        this.f45639b = c14376b;
        this.f45640c = environmentProvider;
        this.f45641d = c14372a;
        this.f45642e = connectInstagram;
        this.f45643f = c2630h;
    }

    /* renamed from: a */
    public void m54977a(Integer num) {
        if (num.intValue() != 0) {
            this.f45641d.m54748a(num.intValue());
        }
        m54984d().showInstagramLoginScreen();
    }

    @NonNull
    /* renamed from: a */
    public String m54975a() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f45640c.getUrlBase());
        stringBuilder.append(ManagerWebServices.IG_LOGIN_URL);
        return stringBuilder.toString();
    }

    /* renamed from: b */
    public void m54980b() {
        this.f45639b.m54776a();
        m54984d().showInstagramConnectError();
    }

    /* renamed from: a */
    public void m54978a(String str) {
        if (C8578a.a(str)) {
            m54980b();
        } else {
            this.f45644g.add(this.f45642e.execute(str).b(new af(this)).c(new ag(this)).b(C15756a.m59010b()).a(C15674a.m58830a()).a(new ah(this), new ai(this)));
        }
    }

    /* renamed from: b */
    final /* synthetic */ void m54982b(Throwable th) throws Exception {
        this.f45643f.a(C11232d.a().a());
    }

    /* renamed from: a */
    final /* synthetic */ void m54976a(InstagramAuthResult instagramAuthResult) throws Exception {
        this.f45638a.finishWithResultCode();
        this.f45638a.showInitialPhotosFetched(instagramAuthResult.getHasFetched());
    }

    /* renamed from: a */
    final /* synthetic */ void m54979a(Throwable th) throws Exception {
        if ((th instanceof InstagramAccountAlreadyInUseException) != null) {
            this.f45638a.showInstagramAccountInUseError();
        } else {
            this.f45638a.showInstagramConnectError();
        }
    }

    @Drop
    /* renamed from: c */
    public void m54983c() {
        this.f45644g.m63446a();
    }

    @NonNull
    /* renamed from: d */
    ProfileInstagramAuthTarget m54984d() {
        return this.f45638a;
    }

    /* renamed from: c */
    private void m54974c(InstagramAuthResult instagramAuthResult) {
        this.f45643f.a(C11280e.a().a(instagramAuthResult.getUserName()).a());
    }
}
