package com.tinder.data.profile;

import com.tinder.api.model.profile.Spotify;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/api/model/profile/Spotify;", "invoke"}, k = 3, mv = {1, 1, 10})
final class ProfileClient$get$4$1 extends Lambda implements Function1 {
    /* renamed from: a */
    public static final ProfileClient$get$4$1 f43957a = new ProfileClient$get$4$1();

    ProfileClient$get$4$1() {
        super(1);
    }

    @Nullable
    /* renamed from: a */
    public final Void m53408a(@NotNull Spotify spotify) {
        C2668g.b(spotify, "it");
        return null;
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m53408a((Spotify) obj);
    }
}
