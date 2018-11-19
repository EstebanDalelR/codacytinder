package com.tinder.toppicks.teasers;

import com.tinder.api.ManagerWebServices;
import com.tinder.cardstack.model.C8395a;
import com.tinder.domain.toppicks.model.TopPickTeaser;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/tinder/toppicks/teasers/TopPickTeaserCard;", "Lcom/tinder/cardstack/model/Card;", "Lcom/tinder/domain/toppicks/model/TopPickTeaser;", "teaser", "(Lcom/tinder/domain/toppicks/model/TopPickTeaser;)V", "getShowRevertIndicator", "", "toppicks_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.teasers.b */
public final class C17117b extends C8395a<TopPickTeaser> {
    public boolean getShowRevertIndicator() {
        return false;
    }

    public C17117b(@NotNull TopPickTeaser topPickTeaser) {
        C2668g.b(topPickTeaser, ManagerWebServices.PARAM_TEASER);
        super(topPickTeaser.getId(), topPickTeaser);
    }
}
