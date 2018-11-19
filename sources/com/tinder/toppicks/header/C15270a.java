package com.tinder.toppicks.header;

import com.tinder.domain.toppicks.model.TopPickTeaser;
import com.tinder.toppicks.teasers.C17117b;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/toppicks/header/TopPicksCardsFactory;", "", "()V", "createHeader", "Lcom/tinder/toppicks/header/TopPicksHeaderCard;", "isGold", "", "createTopPickTeaser", "Lcom/tinder/toppicks/teasers/TopPickTeaserCard;", "topPickTeaser", "Lcom/tinder/domain/toppicks/model/TopPickTeaser;", "toppicks_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.header.a */
public final class C15270a {
    @NotNull
    /* renamed from: a */
    public static /* synthetic */ C17028c m57373a(C15270a c15270a, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c15270a.m57374a(z);
    }

    @NotNull
    /* renamed from: a */
    public final C17028c m57374a(boolean z) {
        return new C17028c(new C15271b(z ? TopPicksHeaderState.GOLD : TopPicksHeaderState.NON_GOLD));
    }

    @NotNull
    /* renamed from: a */
    public final C17117b m57375a(@NotNull TopPickTeaser topPickTeaser) {
        C2668g.b(topPickTeaser, "topPickTeaser");
        return new C17117b(topPickTeaser);
    }
}
