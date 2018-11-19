package com.tinder.presenters;

import android.support.annotation.Nullable;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.common.utils.C8578a;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.domain.profile.model.InstagramAuthResult;
import com.tinder.domain.profile.model.ProfileOption.Instagram;
import com.tinder.domain.profile.model.exception.InstagramAccountAlreadyInUseException;
import com.tinder.domain.profile.usecase.ConnectInstagram;
import com.tinder.domain.profile.usecase.DisconnectInstagram;
import com.tinder.domain.profile.usecase.GetProfileOptionData;
import com.tinder.etl.event.C11196b;
import com.tinder.etl.event.C11207c;
import com.tinder.etl.event.C11232d;
import com.tinder.etl.event.C11280e;
import com.tinder.etl.event.C11291f;
import com.tinder.etl.event.C11294g;
import com.tinder.interfaces.InstagramLoginView;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.C17356a;
import io.reactivex.disposables.Disposable;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;

public class bf {
    @DeadshotTarget
    /* renamed from: a */
    InstagramLoginView f45542a;
    /* renamed from: b */
    private final GetProfileOptionData f45543b;
    /* renamed from: c */
    private final C2630h f45544c;
    /* renamed from: d */
    private final ConnectInstagram f45545d;
    /* renamed from: e */
    private final DisconnectInstagram f45546e;
    /* renamed from: f */
    private final C17356a f45547f = new C17356a();

    /* renamed from: b */
    final /* synthetic */ void m54698b(InstagramAuthResult instagramAuthResult) {
        m54683c(instagramAuthResult);
    }

    @Inject
    public bf(GetProfileOptionData getProfileOptionData, C2630h c2630h, ConnectInstagram connectInstagram, DisconnectInstagram disconnectInstagram) {
        this.f45543b = getProfileOptionData;
        this.f45544c = c2630h;
        this.f45545d = connectInstagram;
        this.f45546e = disconnectInstagram;
    }

    /* renamed from: a */
    public void m54688a(int i) {
        this.f45544c.a(C11196b.a().a(Integer.valueOf(i)).a());
        this.f45542a.showInstagramLoginScreen();
    }

    /* renamed from: b */
    public void m54697b(int i) {
        this.f45542a.showProgress();
        this.f45547f.add(this.f45543b.execute(Instagram.INSTANCE).e(new bg(this, i)).b(C15756a.m59010b()).a(C15674a.m58830a()).d(new bh(this)).a(new bn(this), new bo(this)));
    }

    /* renamed from: a */
    final /* synthetic */ CompletableSource m54686a(int i, com.tinder.domain.common.model.Instagram instagram) throws Exception {
        return this.f45546e.execute().b(new bk(this, i, instagram)).b(new bl(this, instagram)).a(new bm(this, instagram));
    }

    /* renamed from: a */
    final /* synthetic */ void m54689a(int i, com.tinder.domain.common.model.Instagram instagram, Disposable disposable) throws Exception {
        m54680a(i, instagram.username());
    }

    /* renamed from: a */
    final /* synthetic */ void m54690a(com.tinder.domain.common.model.Instagram instagram) throws Exception {
        m54682b(instagram.username());
    }

    /* renamed from: a */
    final /* synthetic */ void m54691a(com.tinder.domain.common.model.Instagram instagram, Throwable th) throws Exception {
        m54684c(instagram.username());
    }

    /* renamed from: f */
    final /* synthetic */ void m54704f() throws Exception {
        this.f45542a.hideProgress();
    }

    /* renamed from: e */
    final /* synthetic */ void m54703e() throws Exception {
        this.f45542a.showInstagramLoggedOut();
    }

    /* renamed from: c */
    final /* synthetic */ void m54701c(Throwable th) throws Exception {
        this.f45542a.showInstagramDisconnectError();
    }

    /* renamed from: a */
    public void m54694a(String str) {
        if (C8578a.a(str)) {
            this.f45542a.showInstagramConnectError();
            return;
        }
        this.f45542a.showProgress();
        C17356a c17356a = this.f45547f;
        str = this.f45545d.execute(str).b(new bp(this)).c(new bq(this)).b(C15756a.m59010b()).a(C15674a.m58830a());
        InstagramLoginView instagramLoginView = this.f45542a;
        instagramLoginView.getClass();
        c17356a.add(str.a(br.m60823a(instagramLoginView)).a(new bs(this), new bt(this)));
    }

    /* renamed from: b */
    final /* synthetic */ void m54699b(Throwable th) throws Exception {
        m54685g();
    }

    /* renamed from: a */
    final /* synthetic */ void m54692a(InstagramAuthResult instagramAuthResult) throws Exception {
        this.f45542a.showInstagramLoggedIn(instagramAuthResult.getUserName());
        this.f45542a.showInitialPhotosFetched(instagramAuthResult.getHasFetched());
    }

    /* renamed from: a */
    final /* synthetic */ void m54695a(Throwable th) throws Exception {
        if ((th instanceof InstagramAccountAlreadyInUseException) != null) {
            this.f45542a.showInstagramAccountInUseError();
        } else {
            this.f45542a.showInstagramConnectError();
        }
    }

    /* renamed from: a */
    public void m54687a() {
        m54681a(new bu(this));
    }

    /* renamed from: d */
    final /* synthetic */ void m54702d() {
        this.f45542a.showInstagramDisconnectDialog();
    }

    /* renamed from: b */
    public void m54696b() {
        m54681a(null);
    }

    @Drop
    /* renamed from: c */
    public void m54700c() {
        this.f45547f.m63446a();
    }

    /* renamed from: a */
    private void m54681a(@Nullable Runnable runnable) {
        this.f45547f.add(this.f45543b.execute(Instagram.INSTANCE).b(com.tinder.domain.common.model.Instagram.DISCONNECTED).b(C15756a.m59010b()).a(C15674a.m58830a()).a(new bi(this, runnable), bj.f49849a));
    }

    /* renamed from: a */
    final /* synthetic */ void m54693a(@Nullable Runnable runnable, com.tinder.domain.common.model.Instagram instagram) throws Exception {
        if (C8578a.a(instagram.username()) != null) {
            m54688a(1);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: a */
    private void m54680a(int i, String str) {
        this.f45544c.a(C11207c.a().a(Integer.valueOf(i)).a(str).a());
    }

    /* renamed from: b */
    private void m54682b(String str) {
        this.f45544c.a(C11294g.a().a(str).a());
    }

    /* renamed from: c */
    private void m54684c(String str) {
        this.f45544c.a(C11291f.a().a(str).a());
    }

    /* renamed from: c */
    private void m54683c(InstagramAuthResult instagramAuthResult) {
        this.f45544c.a(C11280e.a().a(instagramAuthResult.getUserName()).a());
    }

    /* renamed from: g */
    private void m54685g() {
        this.f45544c.a(C11232d.a().a());
    }
}
