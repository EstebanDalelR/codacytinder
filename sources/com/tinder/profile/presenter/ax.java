package com.tinder.profile.presenter;

import android.support.annotation.NonNull;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.profile.ProfileScreenSource;
import com.tinder.profile.exception.ShareTextException;
import com.tinder.profile.exception.ShareTextException.ExceptionType;
import com.tinder.profile.model.Profile;
import com.tinder.profile.model.ProfileShareAction;
import com.tinder.profile.p363b.C14386k;
import com.tinder.profile.p363b.ab;
import com.tinder.profile.p363b.aj;
import com.tinder.profile.p363b.aj.C14373a;
import com.tinder.profile.target.ProfileRecommendToFriendTarget;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;

public class ax {
    @DeadshotTarget
    /* renamed from: a */
    ProfileRecommendToFriendTarget f45661a;
    @NonNull
    /* renamed from: b */
    private final ab f45662b;
    /* renamed from: c */
    private final C14386k f45663c;
    /* renamed from: d */
    private final aj f45664d;
    /* renamed from: e */
    private ProfileScreenSource f45665e = null;

    @Inject
    public ax(@NonNull ab abVar, C14386k c14386k, aj ajVar) {
        this.f45662b = abVar;
        this.f45663c = c14386k;
        this.f45664d = ajVar;
    }

    /* renamed from: a */
    public void m55012a(@NonNull String str, @NonNull String str2) {
        str = String.format(str, new Object[]{str2});
        str2 = str.indexOf("\n");
        if (str2 != -1) {
            String substring = str.substring(0, str2);
            str = str.substring(str2 + "\n".length(), str.length());
            this.f45661a.setTitle(substring);
            this.f45661a.setSubTitle(str);
            this.f45661a.setSubTitleVisibility(true);
            return;
        }
        this.f45661a.setTitle(str);
        this.f45661a.setSubTitleVisibility(false);
    }

    /* renamed from: a */
    public void m55008a(ProfileScreenSource profileScreenSource) {
        this.f45665e = profileScreenSource;
    }

    /* renamed from: a */
    public void m55009a(@NonNull Profile profile) {
        this.f45661a.setShareInProgress();
        this.f45662b.m54751a(profile.mo11651a()).a(RxUtils.a().m67518a()).a(new ay(this, profile), new az(this));
    }

    /* renamed from: a */
    final /* synthetic */ void m55011a(@NonNull Profile profile, String str) {
        this.f45661a.startShareRecIntent(str, profile, this.f45664d.m54765a(this.f45665e), ProfileShareAction.BUTTON);
        this.f45661a.setShareComplete();
    }

    /* renamed from: a */
    final /* synthetic */ void m55013a(Throwable th) {
        if (m55007b(th) != null) {
            this.f45661a.showUserHasSharingDisabledError();
        } else {
            this.f45661a.showGenericError();
        }
        this.f45661a.setShareComplete();
    }

    /* renamed from: a */
    public void m55010a(Profile profile, C14373a c14373a) {
        this.f45663c.m54805a(this.f45664d.m54761a(profile, c14373a));
    }

    /* renamed from: b */
    private boolean m55007b(Throwable th) {
        return ((th instanceof ShareTextException) && ((ShareTextException) th).m54889d() == ExceptionType.USER_IS_HIDDEN) ? true : null;
    }
}
