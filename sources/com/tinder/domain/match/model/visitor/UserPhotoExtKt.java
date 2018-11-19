package com.tinder.domain.match.model.visitor;

import com.tinder.domain.common.model.Photo;
import com.tinder.domain.common.model.Photo.Quality;
import com.tinder.domain.common.model.Photo.Render;
import com.tinder.domain.common.model.User;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\u0012\u0010\u0007\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0014\u0010\t\u001a\u00020\u0001*\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"EMPTY_AVATAR_URL", "", "getUrlByQualityFromPhoto", "photo", "Lcom/tinder/domain/common/model/Photo;", "quality", "Lcom/tinder/domain/common/model/Photo$Quality;", "avatarUrl", "Lcom/tinder/domain/common/model/User;", "getUrlByQuality", "domain_release"}, k = 2, mv = {1, 1, 10})
public final class UserPhotoExtKt {
    private static final String EMPTY_AVATAR_URL = "";

    @NotNull
    public static final String avatarUrl(@NotNull User user, @NotNull Quality quality) {
        C2668g.b(user, "$receiver");
        C2668g.b(quality, "quality");
        user = user.photos();
        C2668g.a(user, "photos()");
        return getUrlByQualityFromPhoto((Photo) C19301m.g(user), quality);
    }

    @NotNull
    public static final String getUrlByQuality(@Nullable Photo photo, @NotNull Quality quality) {
        C2668g.b(quality, "quality");
        return getUrlByQualityFromPhoto(photo, quality);
    }

    private static final String getUrlByQualityFromPhoto(Photo photo, Quality quality) {
        Render render;
        if (photo != null) {
            photo = photo.renders();
            if (photo != null) {
                render = (Render) C19301m.c(photo, Math.min(photo.size() - 1, quality.ordinal()));
                if (render != null) {
                    photo = render.url();
                    if (photo != null) {
                        return photo;
                    }
                }
                return "";
            }
        }
        photo = C19301m.a();
        render = (Render) C19301m.c(photo, Math.min(photo.size() - 1, quality.ordinal()));
        if (render != null) {
            photo = render.url();
            if (photo != null) {
                return photo;
            }
        }
        return "";
    }
}
