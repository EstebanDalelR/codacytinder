package com.tinder.domain.auth;

import android.content.SharedPreferences;
import io.reactivex.C3956a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0002H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/domain/auth/ClearSharedPreferences;", "Lkotlin/Function0;", "Lio/reactivex/Completable;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "invoke", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class ClearSharedPreferences implements Function0<C3956a> {
    private final SharedPreferences sharedPreferences;

    @Inject
    public ClearSharedPreferences(@NotNull SharedPreferences sharedPreferences) {
        C2668g.b(sharedPreferences, "sharedPreferences");
        this.sharedPreferences = sharedPreferences;
    }

    @NotNull
    public C3956a invoke() {
        C3956a a = C3956a.a(new ClearSharedPreferences$invoke$1(this));
        C2668g.a(a, "Completable.fromAction {….edit().clear().apply() }");
        return a;
    }
}
