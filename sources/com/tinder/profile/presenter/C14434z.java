package com.tinder.profile.presenter;

import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.common.navigation.CurrentScreenNotifier;
import com.tinder.common.navigation.Screen.C10691j;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.common.model.PerspectableUser;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.model.Match.Attribution;
import com.tinder.domain.match.usecase.GetMatch;
import com.tinder.profile.model.Profile;
import com.tinder.profile.model.Profile.Adornment;
import com.tinder.profile.model.Profile.C14418b;
import com.tinder.profile.model.Profile.Source;
import com.tinder.profile.p363b.ai;
import com.tinder.profile.target.MatchProfileTarget;
import com.tinder.utils.RxUtils;
import java8.util.Optional;
import javax.inject.Inject;
import rx.Observable;
import rx.p500e.C19573b;

/* renamed from: com.tinder.profile.presenter.z */
public class C14434z {
    @DeadshotTarget
    /* renamed from: a */
    MatchProfileTarget f45728a;
    @NonNull
    /* renamed from: b */
    private final ai f45729b;
    @NonNull
    /* renamed from: c */
    private final C14418b f45730c;
    @NonNull
    /* renamed from: d */
    private final GetMatch f45731d;
    @NonNull
    /* renamed from: e */
    private final CurrentScreenNotifier f45732e;
    /* renamed from: f */
    private final C19573b f45733f = new C19573b();

    /* renamed from: com.tinder.profile.presenter.z$1 */
    static /* synthetic */ class C144331 {
        /* renamed from: a */
        static final /* synthetic */ int[] f45727a = new int[Attribution.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = com.tinder.domain.match.model.Match.Attribution.values();
            r0 = r0.length;
            r0 = new int[r0];
            f45727a = r0;
            r0 = f45727a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.tinder.domain.match.model.Match.Attribution.I_SUPER_LIKE_THEM;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f45727a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.tinder.domain.match.model.Match.Attribution.THEY_SUPER_LIKE_ME;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = f45727a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.tinder.domain.match.model.Match.Attribution.FAST_MATCH;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = f45727a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = com.tinder.domain.match.model.Match.Attribution.BOOST;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r0 = f45727a;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = com.tinder.domain.match.model.Match.Attribution.TOP_PICKS;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r2 = 5;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.profile.presenter.z.1.<clinit>():void");
        }
    }

    @Inject
    public C14434z(@NonNull ai aiVar, @NonNull C14418b c14418b, @NonNull GetMatch getMatch, @NonNull CurrentScreenNotifier currentScreenNotifier) {
        this.f45729b = aiVar;
        this.f45730c = c14418b;
        this.f45731d = getMatch;
        this.f45732e = currentScreenNotifier;
    }

    @Take
    @CallSuper
    /* renamed from: a */
    public void m55109a() {
        m55107d();
    }

    @Drop
    @CallSuper
    /* renamed from: b */
    public void m55112b() {
        this.f45733f.unsubscribe();
    }

    /* renamed from: a */
    public void m55111a(@NonNull String str, @NonNull String str2) {
        this.f45733f.a(Observable.b(this.f45729b.m60845a(str), this.f45731d.execute(str2), new aa(this)).h().a(RxUtils.a()).a(new ab(this, str2), ac.f57962a));
    }

    /* renamed from: a */
    final /* synthetic */ Profile m55108a(PerspectableUser perspectableUser, Optional optional) {
        if (m55105a(optional) == null) {
            return this.f45730c.m54930a(perspectableUser, Source.MATCH, new Adornment[0]);
        }
        return this.f45730c.m54930a(perspectableUser, Source.MATCH, optional);
    }

    /* renamed from: a */
    final /* synthetic */ void m55110a(@NonNull String str, Profile profile) {
        m55113c().showProfile(profile, str);
    }

    @NonNull
    /* renamed from: c */
    MatchProfileTarget m55113c() {
        return this.f45728a;
    }

    /* renamed from: d */
    private void m55107d() {
        this.f45732e.notify(C10691j.f35032a);
    }

    @Nullable
    /* renamed from: a */
    private Adornment m55105a(Optional<Match> optional) {
        if (!optional.m59132c()) {
            return null;
        }
        switch (C144331.f45727a[((Match) optional.m59127b()).getAttribution().ordinal()]) {
            case 1:
            case 2:
                return Adornment.SUPERLIKE;
            case 3:
                return Adornment.FAST_MATCH;
            case 4:
                return Adornment.BOOST;
            case 5:
                return Adornment.TOP_PICKS;
            default:
                return null;
        }
    }
}
