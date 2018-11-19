package com.tinder.auth.repository;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tinder.api.ManagerWebServices;
import com.tinder.auth.model.AuthType;
import io.reactivex.C3956a;
import io.reactivex.functions.Action;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u0004\u0018\u00010\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/tinder/auth/repository/TinderLongLivedTokenRepository;", "Lcom/tinder/auth/repository/LongLivedTokenRepository;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "authType", "Lcom/tinder/auth/model/AuthType;", "getAuthType", "()Lcom/tinder/auth/model/AuthType;", "id", "", "getId", "()Ljava/lang/String;", "token", "getToken", "save", "Lio/reactivex/Completable;", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.auth.repository.p */
public final class C10353p implements LongLivedTokenRepository {
    @Nullable
    /* renamed from: a */
    private final String f33783a;
    @NotNull
    /* renamed from: b */
    private final AuthType f33784b = AuthType.TINDER_SMS;
    /* renamed from: c */
    private final SharedPreferences f33785c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.auth.repository.p$a */
    static final class C10352a implements Action {
        /* renamed from: a */
        final /* synthetic */ C10353p f33781a;
        /* renamed from: b */
        final /* synthetic */ String f33782b;

        C10352a(C10353p c10353p, String str) {
            this.f33781a = c10353p;
            this.f33782b = str;
        }

        public final void run() {
            Editor edit = this.f33781a.f33785c.edit();
            edit.putString("tinder_long_lived_token", this.f33782b);
            edit.apply();
        }
    }

    @Inject
    public C10353p(@NotNull SharedPreferences sharedPreferences) {
        C2668g.b(sharedPreferences, "sharedPreferences");
        this.f33785c = sharedPreferences;
    }

    @NotNull
    public C3956a save(@NotNull String str) {
        C2668g.b(str, ManagerWebServices.PARAM_TOKEN);
        str = C3956a.a(new C10352a(this, str));
        C2668g.a(str, "Completable.fromAction {… editor.apply()\n        }");
        return str;
    }

    @Nullable
    public String getToken() {
        return this.f33785c.getString("tinder_long_lived_token", null);
    }

    @Nullable
    public String getId() {
        return this.f33783a;
    }

    @NotNull
    public AuthType getAuthType() {
        return this.f33784b;
    }
}
