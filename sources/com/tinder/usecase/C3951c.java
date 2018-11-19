package com.tinder.usecase;

import com.tinder.domain.common.usecase.SimpleVoidUseCase;
import com.tinder.match.sponsoredmessage.ViewedSponsoredMessageCache;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/tinder/usecase/ClearViewdSponsoredMessageCache;", "Lcom/tinder/domain/common/usecase/SimpleVoidUseCase;", "sponsoredMessageCache", "Lcom/tinder/match/sponsoredmessage/ViewedSponsoredMessageCache;", "(Lcom/tinder/match/sponsoredmessage/ViewedSponsoredMessageCache;)V", "getSponsoredMessageCache", "()Lcom/tinder/match/sponsoredmessage/ViewedSponsoredMessageCache;", "execute", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.usecase.c */
public final class C3951c implements SimpleVoidUseCase {
    @NotNull
    /* renamed from: a */
    private final ViewedSponsoredMessageCache f12542a;

    @Inject
    public C3951c(@NotNull ViewedSponsoredMessageCache viewedSponsoredMessageCache) {
        C2668g.m10309b(viewedSponsoredMessageCache, "sponsoredMessageCache");
        this.f12542a = viewedSponsoredMessageCache;
    }

    public void execute() {
        this.f12542a.clear();
    }
}
