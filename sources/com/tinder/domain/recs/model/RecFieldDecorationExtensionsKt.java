package com.tinder.domain.recs.model;

import com.tinder.domain.common.model.Photo.Quality;
import com.tinder.domain.match.model.visitor.UserPhotoExtKt;
import com.tinder.domain.recs.DeepLinkReferralInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\u0002\u001a\f\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0002¨\u0006\t"}, d2 = {"deepLinkInfo", "Lcom/tinder/domain/recs/DeepLinkReferralInfo;", "Lcom/tinder/domain/recs/model/Rec;", "isReferred", "", "isSuperLikeable", "name", "", "thumbnailImageUrl", "domain_release"}, k = 2, mv = {1, 1, 10})
public final class RecFieldDecorationExtensionsKt {
    @NotNull
    public static final String name(@NotNull Rec rec) {
        C2668g.b(rec, "$receiver");
        return rec instanceof UserRec ? ((UserRec) rec).getName() : "";
    }

    @Nullable
    public static final DeepLinkReferralInfo deepLinkInfo(@NotNull Rec rec) {
        C2668g.b(rec, "$receiver");
        return rec instanceof DefaultUserRec ? ((DefaultUserRec) rec).getDeepLinkReferralInfo() : null;
    }

    public static final boolean isReferred(@NotNull Rec rec) {
        C2668g.b(rec, "$receiver");
        return deepLinkInfo(rec) != null ? true : null;
    }

    public static final boolean isSuperLikeable(@NotNull Rec rec) {
        C2668g.b(rec, "$receiver");
        return (!(rec instanceof UserRec) || ((UserRec) rec).isSuperLike() || rec.getType() == RecType.BRAND) ? false : true;
    }

    @Nullable
    public static final String thumbnailImageUrl(@NotNull Rec rec) {
        C2668g.b(rec, "$receiver");
        return rec instanceof UserRec ? UserPhotoExtKt.avatarUrl(((UserRec) rec).getUser(), Quality.S) : null;
    }
}
