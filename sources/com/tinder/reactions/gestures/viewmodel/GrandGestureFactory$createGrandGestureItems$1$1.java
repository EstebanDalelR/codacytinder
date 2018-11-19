package com.tinder.reactions.gestures.viewmodel;

import com.tinder.domain.common.model.Gender.Value;
import com.tinder.domain.meta.model.CurrentUser;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class GrandGestureFactory$createGrandGestureItems$1$1 extends Lambda implements Function0<Boolean> {
    /* renamed from: a */
    final /* synthetic */ CurrentUser f58250a;

    GrandGestureFactory$createGrandGestureItems$1$1(CurrentUser currentUser) {
        this.f58250a = currentUser;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return Boolean.valueOf(m67189a());
    }

    /* renamed from: a */
    public final boolean m67189a() {
        return this.f58250a.gender().value() == Value.FEMALE;
    }
}
