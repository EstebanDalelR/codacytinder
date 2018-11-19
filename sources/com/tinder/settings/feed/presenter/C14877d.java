package com.tinder.settings.feed.presenter;

import com.tinder.domain.settings.feed.model.FeedSharingType;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"!\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"SHARING_OPTIONS_SORT_ORDER", "Ljava/util/LinkedHashSet;", "Lcom/tinder/domain/settings/feed/model/FeedSharingType;", "Lkotlin/collections/LinkedHashSet;", "getSHARING_OPTIONS_SORT_ORDER", "()Ljava/util/LinkedHashSet;", "Tinder_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.settings.feed.presenter.d */
public final class C14877d {
    @NotNull
    /* renamed from: a */
    private static final LinkedHashSet<FeedSharingType> f46561a = am.m64180c(FeedSharingType.PROFILE_PHOTOS, FeedSharingType.INSTAGRAM, FeedSharingType.SPOTIFY_ANTHEM, FeedSharingType.SPOTIFY_TOP_ARTISTS);

    @NotNull
    /* renamed from: a */
    public static final LinkedHashSet<FeedSharingType> m56317a() {
        return f46561a;
    }
}
