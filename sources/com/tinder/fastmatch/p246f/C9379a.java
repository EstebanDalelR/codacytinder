package com.tinder.fastmatch.p246f;

import com.tinder.domain.fastmatch.model.FastMatchConfig;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.managers.bk;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/fastmatch/usecase/MarkFastMatchTutorialAsSeen;", "", "sharedPreferences", "Lcom/tinder/managers/ManagerSharedPreferences;", "fastMatchConfigProvider", "Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;", "(Lcom/tinder/managers/ManagerSharedPreferences;Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;)V", "execute", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fastmatch.f.a */
public final class C9379a {
    /* renamed from: a */
    private final bk f31463a;
    /* renamed from: b */
    private final FastMatchConfigProvider f31464b;

    @Inject
    public C9379a(@NotNull bk bkVar, @NotNull FastMatchConfigProvider fastMatchConfigProvider) {
        C2668g.b(bkVar, "sharedPreferences");
        C2668g.b(fastMatchConfigProvider, "fastMatchConfigProvider");
        this.f31463a = bkVar;
        this.f31464b = fastMatchConfigProvider;
    }

    /* renamed from: a */
    public final void m39279a() {
        this.f31463a.H(true);
        this.f31464b.update(FastMatchConfig.copy$default(this.f31464b.get(), false, true, 0, null, 0, 0, 0, 0, 0, null, 1021, null));
    }
}
