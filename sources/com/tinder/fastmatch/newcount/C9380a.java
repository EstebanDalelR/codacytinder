package com.tinder.fastmatch.newcount;

import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.fastmatch.model.PollingMode;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.managers.bk;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/fastmatch/newcount/FastMatchNewCountAbTestResolver;", "", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "fastMatchConfigProvider", "Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;", "managerSharedPreferences", "Lcom/tinder/managers/ManagerSharedPreferences;", "(Lcom/tinder/core/experiment/AbTestUtility;Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;Lcom/tinder/managers/ManagerSharedPreferences;)V", "isEnabled", "", "isFeatureOn", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fastmatch.newcount.a */
public final class C9380a {
    /* renamed from: a */
    private final AbTestUtility f31465a;
    /* renamed from: b */
    private final FastMatchConfigProvider f31466b;
    /* renamed from: c */
    private final bk f31467c;

    @Inject
    public C9380a(@NotNull AbTestUtility abTestUtility, @NotNull FastMatchConfigProvider fastMatchConfigProvider, @NotNull bk bkVar) {
        C2668g.b(abTestUtility, "abTestUtility");
        C2668g.b(fastMatchConfigProvider, "fastMatchConfigProvider");
        C2668g.b(bkVar, "managerSharedPreferences");
        this.f31465a = abTestUtility;
        this.f31466b = fastMatchConfigProvider;
        this.f31467c = bkVar;
    }

    /* renamed from: a */
    public final boolean m39280a() {
        return this.f31467c.af() && m39281b();
    }

    /* renamed from: b */
    public final boolean m39281b() {
        return this.f31465a.isFastMatchPollingEnabled() && this.f31466b.get().getPollingMode() != PollingMode.NONE;
    }
}
