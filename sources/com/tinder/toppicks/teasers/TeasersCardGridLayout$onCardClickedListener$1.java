package com.tinder.toppicks.teasers;

import com.tinder.domain.toppicks.model.TopPickTeaser;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/toppicks/model/TopPickTeaser;", "invoke"}, k = 3, mv = {1, 1, 10})
final class TeasersCardGridLayout$onCardClickedListener$1 extends Lambda implements Function1<TopPickTeaser, C15813i> {
    /* renamed from: a */
    public static final TeasersCardGridLayout$onCardClickedListener$1 f58691a = new TeasersCardGridLayout$onCardClickedListener$1();

    TeasersCardGridLayout$onCardClickedListener$1() {
        super(1);
    }

    /* renamed from: a */
    public final void m67479a(@NotNull TopPickTeaser topPickTeaser) {
        C2668g.b(topPickTeaser, "it");
    }

    public /* synthetic */ Object invoke(Object obj) {
        m67479a((TopPickTeaser) obj);
        return C15813i.f49016a;
    }
}
