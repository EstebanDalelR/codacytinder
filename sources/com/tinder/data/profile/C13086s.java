package com.tinder.data.profile;

import com.tinder.data.profile.persistence.ProfileDataStore;
import com.tinder.domain.profile.model.ProfileOption.Likes;
import com.tinder.domain.profile.usecase.SaveLikeStatus;
import com.tinder.domain.tinderplus.LikeStatus;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/data/profile/SaveLikeStatusData;", "Lcom/tinder/domain/profile/usecase/SaveLikeStatus;", "profileDataStore", "Lcom/tinder/data/profile/persistence/ProfileDataStore;", "(Lcom/tinder/data/profile/persistence/ProfileDataStore;)V", "execute", "Lrx/Completable;", "request", "Lcom/tinder/domain/tinderplus/LikeStatus;", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.profile.s */
public final class C13086s implements SaveLikeStatus {
    /* renamed from: a */
    private final ProfileDataStore f41689a;

    @Inject
    public C13086s(@NotNull ProfileDataStore profileDataStore) {
        C2668g.b(profileDataStore, "profileDataStore");
        this.f41689a = profileDataStore;
    }

    public /* synthetic */ Completable execute(Object obj) {
        return m50919a((LikeStatus) obj);
    }

    @NotNull
    /* renamed from: a */
    public Completable m50919a(@NotNull LikeStatus likeStatus) {
        C2668g.b(likeStatus, "request");
        return RxJavaInteropExtKt.toV1Completable(this.f41689a.save(Likes.INSTANCE, likeStatus));
    }
}
