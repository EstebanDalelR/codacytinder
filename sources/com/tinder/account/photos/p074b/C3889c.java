package com.tinder.account.photos.p074b;

import com.tinder.account.photos.photogrid.analytics.AddProfileAddPhotoEvent;
import com.tinder.account.photos.photogrid.analytics.AddProfileAddPhotoEvent.C2625a;
import com.tinder.account.photos.photogrid.analytics.AddProfileAddPhotoEvent.From;
import com.tinder.account.photos.photogrid.analytics.ProfileEditSource;
import com.tinder.domain.common.reactivex.usecase.CompletableUseCase;
import com.tinder.domain.profile.model.LocalProfilePhoto;
import com.tinder.domain.profile.usecase.UploadPhoto;
import io.reactivex.C3956a;
import io.reactivex.functions.Action;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0017\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/account/photos/usecase/UploadPhotoFromEditInfo;", "Lcom/tinder/domain/common/reactivex/usecase/CompletableUseCase;", "Lcom/tinder/account/photos/usecase/UploadPhotoFromEditInfo$Request;", "uploadPhoto", "Lcom/tinder/domain/profile/usecase/UploadPhoto;", "addProfileAddPhotoEvent", "Lcom/tinder/account/photos/photogrid/analytics/AddProfileAddPhotoEvent;", "(Lcom/tinder/domain/profile/usecase/UploadPhoto;Lcom/tinder/account/photos/photogrid/analytics/AddProfileAddPhotoEvent;)V", "execute", "Lio/reactivex/Completable;", "request", "Request", "account_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.account.photos.b.c */
public final class C3889c implements CompletableUseCase<C2618a> {
    /* renamed from: a */
    private final UploadPhoto f12165a;
    /* renamed from: b */
    private final AddProfileAddPhotoEvent f12166b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/account/photos/usecase/UploadPhotoFromEditInfo$Request;", "", "localProfilePhoto", "Lcom/tinder/domain/profile/model/LocalProfilePhoto;", "destinationIndex", "", "(Lcom/tinder/domain/profile/model/LocalProfilePhoto;I)V", "getDestinationIndex", "()I", "getLocalProfilePhoto", "()Lcom/tinder/domain/profile/model/LocalProfilePhoto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "account_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.account.photos.b.c$a */
    public static final class C2618a {
        @NotNull
        /* renamed from: a */
        private final LocalProfilePhoto f8157a;
        /* renamed from: b */
        private final int f8158b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C2618a) {
                C2618a c2618a = (C2618a) obj;
                if (C2668g.m10308a(this.f8157a, c2618a.f8157a)) {
                    if ((this.f8158b == c2618a.f8158b ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            LocalProfilePhoto localProfilePhoto = this.f8157a;
            return ((localProfilePhoto != null ? localProfilePhoto.hashCode() : 0) * 31) + this.f8158b;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(localProfilePhoto=");
            stringBuilder.append(this.f8157a);
            stringBuilder.append(", destinationIndex=");
            stringBuilder.append(this.f8158b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C2618a(@NotNull LocalProfilePhoto localProfilePhoto, int i) {
            C2668g.m10309b(localProfilePhoto, "localProfilePhoto");
            this.f8157a = localProfilePhoto;
            this.f8158b = i;
        }

        @NotNull
        /* renamed from: a */
        public final LocalProfilePhoto m9787a() {
            return this.f8157a;
        }

        /* renamed from: b */
        public final int m9788b() {
            return this.f8158b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.account.photos.b.c$b */
    static final class C3888b implements Action {
        /* renamed from: a */
        final /* synthetic */ C3889c f12163a;
        /* renamed from: b */
        final /* synthetic */ C2618a f12164b;

        C3888b(C3889c c3889c, C2618a c2618a) {
            this.f12163a = c3889c;
            this.f12164b = c2618a;
        }

        public final void run() {
            this.f12163a.f12166b.m14672a(new C2625a(ProfileEditSource.EDIT_INFO, From.GALLERY, this.f12164b.m9788b()));
        }
    }

    @Inject
    public C3889c(@NotNull UploadPhoto uploadPhoto, @NotNull AddProfileAddPhotoEvent addProfileAddPhotoEvent) {
        C2668g.m10309b(uploadPhoto, "uploadPhoto");
        C2668g.m10309b(addProfileAddPhotoEvent, "addProfileAddPhotoEvent");
        this.f12165a = uploadPhoto;
        this.f12166b = addProfileAddPhotoEvent;
    }

    public /* synthetic */ C3956a execute(Object obj) {
        return m14635a((C2618a) obj);
    }

    @NotNull
    /* renamed from: a */
    public C3956a m14635a(@NotNull C2618a c2618a) {
        C2668g.m10309b(c2618a, "request");
        Object b = this.f12165a.execute(c2618a.m9787a()).m15295b((Action) new C3888b(this, c2618a));
        C2668g.m10305a(b, "uploadPhoto.execute(requ…\n            ))\n        }");
        return b;
    }
}
