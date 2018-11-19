package com.tinder.data.p216f.p217a;

import android.content.SharedPreferences;
import com.tinder.api.ManagerWebServices;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/data/pushnotifications/datastore/PushTokenDataStore;", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "deleteToken", "Lrx/Completable;", "saveToken", "token", "", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.f.a.a */
public final class C8646a {
    /* renamed from: a */
    private final SharedPreferences f30496a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.f.a.a$a */
    static final class C13797a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C8646a f43804a;

        C13797a(C8646a c8646a) {
            this.f43804a = c8646a;
        }

        public final void call() {
            this.f43804a.f30496a.edit().putBoolean("REGISTERED TINDER PUSH", false).apply();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.f.a.a$b */
    static final class C13798b implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C8646a f43805a;

        C13798b(C8646a c8646a) {
            this.f43805a = c8646a;
        }

        public final void call() {
            this.f43805a.f30496a.edit().putBoolean("REGISTERED TINDER PUSH", true).apply();
        }
    }

    @Inject
    public C8646a(@NotNull SharedPreferences sharedPreferences) {
        C2668g.b(sharedPreferences, "sharedPreferences");
        this.f30496a = sharedPreferences;
    }

    @NotNull
    /* renamed from: a */
    public final Completable m36881a(@NotNull String str) {
        C2668g.b(str, ManagerWebServices.PARAM_TOKEN);
        str = Completable.a((Action0) new C13798b(this));
        C2668g.a(str, "Completable.fromAction {…       .apply()\n        }");
        return str;
    }

    @NotNull
    /* renamed from: a */
    public final Completable m36880a() {
        Completable a = Completable.a(new C13797a(this));
        C2668g.a(a, "Completable.fromAction {…       .apply()\n        }");
        return a;
    }
}
