package com.tinder.p238f.p243e;

import com.tinder.common.logger.Logger;
import com.tinder.domain.common.watchers.Watcher;
import com.tinder.fireboarding.domain.C11824u;
import com.tinder.fireboarding.domain.C9566h;
import com.tinder.model.UserMeta;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/meta/watchers/UpdateFireboardingConfigWatcher;", "Lcom/tinder/domain/common/watchers/Watcher;", "Lcom/tinder/model/UserMeta;", "updateFireboardingConfig", "Lcom/tinder/fireboarding/domain/UpdateFireboardingConfig;", "logger", "Lcom/tinder/common/logger/Logger;", "(Lcom/tinder/fireboarding/domain/UpdateFireboardingConfig;Lcom/tinder/common/logger/Logger;)V", "execute", "", "userMeta", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.f.e.i */
public final class C11607i extends Watcher<UserMeta> {
    /* renamed from: a */
    private final C11824u f38008a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.f.e.i$a */
    static final class C11605a implements Action {
        /* renamed from: a */
        public static final C11605a f38006a = new C11605a();

        C11605a() {
        }

        public final void run() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.f.e.i$b */
    static final class C11606b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C11606b f38007a = new C11606b();

        C11606b() {
        }

        public /* synthetic */ void accept(Object obj) {
            m47332a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m47332a(Throwable th) {
            C0001a.c(th);
        }
    }

    public /* synthetic */ void execute(Object obj) {
        m47333a((UserMeta) obj);
    }

    @Inject
    public C11607i(@NotNull C11824u c11824u, @NotNull Logger logger) {
        C2668g.b(c11824u, "updateFireboardingConfig");
        C2668g.b(logger, "logger");
        super(logger);
        this.f38008a = c11824u;
    }

    /* renamed from: a */
    protected void m47333a(@NotNull UserMeta userMeta) {
        C2668g.b(userMeta, "userMeta");
        this.f38008a.m47736a(new C9566h(userMeta.getGlobalConfig().fireboarding)).a(C11605a.f38006a, C11606b.f38007a);
    }
}
