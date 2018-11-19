package com.tinder.data.auth;

import android.content.SharedPreferences;
import com.f2prateek.rx.preferences.C1159e;
import com.f2prateek.rx.preferences.Preference;
import com.tinder.domain.auth.AuthStatus;
import com.tinder.domain.auth.AuthStatusRepository;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import io.reactivex.C3957b;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0002R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00050\u00050\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/data/auth/AuthStatusSharedPreferenceRepository;", "Lcom/tinder/domain/auth/AuthStatusRepository;", "sharedPreferences", "Landroid/content/SharedPreferences;", "authTokenKey", "", "(Landroid/content/SharedPreferences;Ljava/lang/String;)V", "authTokenPreference", "Lcom/f2prateek/rx/preferences/Preference;", "kotlin.jvm.PlatformType", "rxPreferences", "Lcom/f2prateek/rx/preferences/RxSharedPreferences;", "observeAuthStatus", "Lio/reactivex/Flowable;", "Lcom/tinder/domain/auth/AuthStatus;", "toAuthStatus", "authToken", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.auth.a */
public final class C10747a implements AuthStatusRepository {
    /* renamed from: a */
    private final C1159e f35141a;
    /* renamed from: b */
    private final Preference<String> f35142b;

    public C10747a(@NotNull SharedPreferences sharedPreferences, @NotNull String str) {
        C2668g.b(sharedPreferences, "sharedPreferences");
        C2668g.b(str, "authTokenKey");
        this.f35141a = C1159e.a(sharedPreferences);
        this.f35142b = this.f35141a.a(str, null);
    }

    @NotNull
    public C3957b<AuthStatus> observeAuthStatus() {
        Observable g = this.f35142b.c().k(new C12840b(new AuthStatusSharedPreferenceRepository$observeAuthStatus$1(this))).g();
        C2668g.a(g, "authTokenPreference.asOb…  .distinctUntilChanged()");
        C3957b<AuthStatus> j = RxJavaInteropExtKt.toV2Flowable(g).j();
        C2668g.a(j, "authTokenPreference.asOb…  .onBackpressureLatest()");
        return j;
    }

    /* renamed from: a */
    private final AuthStatus m43154a(String str) {
        CharSequence charSequence = str;
        if (charSequence != null) {
            if (charSequence.length() != null) {
                str = null;
                if (str == null) {
                    return AuthStatus.LOGGED_OUT;
                }
                return AuthStatus.LOGGED_IN;
            }
        }
        str = true;
        if (str == null) {
            return AuthStatus.LOGGED_IN;
        }
        return AuthStatus.LOGGED_OUT;
    }
}
