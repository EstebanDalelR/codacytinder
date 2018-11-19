package com.tinder.interactors;

import android.support.annotation.NonNull;
import com.tinder.api.model.meta.Meta;
import com.tinder.api.model.profile.Products;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.interactors.p262a.C9712i;
import com.tinder.model.UserMeta;
import com.tinder.purchase.p371a.C14479a;
import com.tinder.superlike.p418a.C15066a;
import rx.Observable;

/* renamed from: com.tinder.interactors.h */
public class C9717h {
    @NonNull
    /* renamed from: a */
    private final C9712i f32310a;
    @NonNull
    /* renamed from: b */
    private final C15066a f32311b;
    @NonNull
    /* renamed from: c */
    private final C14479a f32312c;
    /* renamed from: d */
    private final AbTestUtility f32313d;

    public C9717h(@NonNull C9712i c9712i, @NonNull C15066a c15066a, @NonNull C14479a c14479a, AbTestUtility abTestUtility) {
        this.f32310a = c9712i;
        this.f32311b = c15066a;
        this.f32312c = c14479a;
        this.f32313d = abTestUtility;
    }

    /* renamed from: a */
    public Observable<UserMeta> m40214a(Meta meta) {
        return Observable.a(m40213b(meta));
    }

    /* renamed from: b */
    private UserMeta m40213b(@NonNull Meta meta) {
        UserMeta a = this.f32310a.m40199a(meta);
        Products products = meta.products();
        Object obj = (products == null || this.f32313d.profileV2EnabledForRevenue()) ? null : 1;
        if (obj != null) {
            this.f32312c.a(products);
        }
        meta = meta.rating();
        if (meta != null) {
            a.setLikesPercentRemaining(meta.likesRemaining());
            a.setMillisRateLimitedUntil(meta.rateLimitUntil());
            a.setSuperlikeStatus(this.f32311b.a(meta.superLikes()));
        }
        return a;
    }
}
