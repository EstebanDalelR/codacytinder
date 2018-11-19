package com.tinder.auth.p168c;

import com.tinder.auth.repository.C10353p;
import com.tinder.common.repository.C10698c;
import com.tinder.smsauth.entity.C14976d;
import com.tinder.smsauth.entity.C16747a;
import com.tinder.smsauth.entity.C16749e;
import io.reactivex.C3956a;
import io.reactivex.functions.Action;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/auth/usecase/PersistLoginCredentials;", "", "longLivedTokenRepository", "Lcom/tinder/auth/repository/TinderLongLivedTokenRepository;", "tokenRepository", "Lcom/tinder/common/repository/TokenRepository;", "(Lcom/tinder/auth/repository/TinderLongLivedTokenRepository;Lcom/tinder/common/repository/TokenRepository;)V", "execute", "Lio/reactivex/Completable;", "credentials", "Lcom/tinder/smsauth/entity/LoginCredentials;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.auth.c.d */
public final class C8273d {
    /* renamed from: a */
    private final C10353p f29516a;
    /* renamed from: b */
    private final C10698c f29517b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.auth.c.d$a */
    static final class C10332a implements Action {
        /* renamed from: a */
        final /* synthetic */ C8273d f33741a;
        /* renamed from: b */
        final /* synthetic */ C14976d f33742b;

        C10332a(C8273d c8273d, C14976d c14976d) {
            this.f33741a = c8273d;
            this.f33742b = c14976d;
        }

        public final void run() {
            C14976d c14976d = this.f33742b;
            if (c14976d instanceof C16749e) {
                this.f33741a.f29517b.m43019b(((C16749e) this.f33742b).a());
            } else if (c14976d instanceof C16747a) {
                this.f33741a.f29517b.m43018a(((C16747a) this.f33742b).a());
            }
        }
    }

    @Inject
    public C8273d(@NotNull C10353p c10353p, @NotNull C10698c c10698c) {
        C2668g.b(c10353p, "longLivedTokenRepository");
        C2668g.b(c10698c, "tokenRepository");
        this.f29516a = c10353p;
        this.f29517b = c10698c;
    }

    @NotNull
    /* renamed from: a */
    public final C3956a m35324a(@NotNull C14976d c14976d) {
        C2668g.b(c14976d, "credentials");
        c14976d = this.f29516a.save(c14976d.b()).b(C3956a.a(new C10332a(this, c14976d)));
        C2668g.a(c14976d, "longLivedTokenRepository…         }\n            })");
        return c14976d;
    }
}
