package com.tinder.usecase;

import com.tinder.auth.interactor.C8279j;
import com.tinder.auth.model.AuthType;
import com.tinder.common.logger.Logger;
import com.tinder.domain.common.usecase.SimpleVoidUseCase;
import com.tinder.managers.C2652a;
import com.tinder.model.auth.LogoutFrom$FORCED;
import com.tinder.model.auth.LogoutFrom.Merge;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/usecase/MergeAccounts;", "Lcom/tinder/domain/common/usecase/SimpleVoidUseCase;", "authenticationManager", "Lcom/tinder/managers/AuthenticationManager;", "authInteractor", "Lcom/tinder/auth/interactor/AuthInteractor2;", "logger", "Lcom/tinder/common/logger/Logger;", "(Lcom/tinder/managers/AuthenticationManager;Lcom/tinder/auth/interactor/AuthInteractor2;Lcom/tinder/common/logger/Logger;)V", "execute", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.usecase.h */
public final class C17224h implements SimpleVoidUseCase {
    /* renamed from: a */
    private final C2652a f52802a;
    /* renamed from: b */
    private final C8279j f52803b;
    /* renamed from: c */
    private final Logger f52804c;

    @Inject
    public C17224h(@NotNull C2652a c2652a, @NotNull C8279j c8279j, @NotNull Logger logger) {
        C2668g.b(c2652a, "authenticationManager");
        C2668g.b(c8279j, "authInteractor");
        C2668g.b(logger, "logger");
        this.f52802a = c2652a;
        this.f52803b = c8279j;
        this.f52804c = logger;
    }

    public void execute() {
        AuthType a = this.f52803b.a();
        if (a != null) {
            this.f52802a.a(new Merge(a));
            return;
        }
        C17224h c17224h = this;
        c17224h.f52804c.error("AuthType is null");
        c17224h.f52802a.a(LogoutFrom$FORCED.INSTANCE);
    }
}
