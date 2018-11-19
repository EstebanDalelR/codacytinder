package com.tinder.feed.view.info;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.tinder.R;
import com.tinder.common.badge.view.BadgeAttributionIcon;
import com.tinder.common.model.Bindable;
import com.tinder.feed.view.model.ActivityFeedViewModel.Attribution;
import com.tinder.module.FeedViewComponentProvider;
import com.tinder.profile.p365d.C14398a;
import com.tinder.utils.au;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/tinder/feed/view/info/FeedBadgeAttributionIcon;", "Lcom/tinder/common/badge/view/BadgeAttributionIcon;", "Lcom/tinder/common/model/Bindable;", "Lcom/tinder/feed/view/model/ActivityFeedViewModel$Attribution;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "boostIndicator", "Landroid/graphics/drawable/Drawable;", "getBoostIndicator", "()Landroid/graphics/drawable/Drawable;", "superlikeIndicator", "getSuperlikeIndicator", "verifiedIndicator", "getVerifiedIndicator", "setupDagger", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class FeedBadgeAttributionIcon extends BadgeAttributionIcon implements Bindable<Attribution> {
    @NotNull
    /* renamed from: c */
    private final Drawable f42065c = au.b(this, R.drawable.ic_match_type_superlike);
    @NotNull
    /* renamed from: d */
    private final Drawable f42066d = au.b(this, R.drawable.ic_match_type_boost);
    @NotNull
    /* renamed from: e */
    private final Drawable f42067e = au.b(this, R.drawable.ic_match_type_verified);

    public FeedBadgeAttributionIcon(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attributeSet");
        super(context, attributeSet);
    }

    @NotNull
    public Drawable getSuperlikeIndicator() {
        return this.f42065c;
    }

    @NotNull
    public Drawable getBoostIndicator() {
        return this.f42066d;
    }

    @NotNull
    public Drawable getVerifiedIndicator() {
        return this.f42067e;
    }

    /* renamed from: a */
    public void mo11135a() {
        if (!isInEditMode()) {
            Context a = C14398a.a(getContext());
            if (a == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.module.FeedViewComponentProvider");
            }
            ((FeedViewComponentProvider) a).provideFeedViewComponent().inject(this);
        }
    }
}
