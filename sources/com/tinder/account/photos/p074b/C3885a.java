package com.tinder.account.photos.p074b;

import com.tinder.account.photos.photogrid.analytics.AddProfileAddPhotoEvent;
import com.tinder.account.photos.photogrid.analytics.AddProfileAddPhotoEvent.C2625a;
import com.tinder.account.photos.photogrid.analytics.AddProfileAddPhotoEvent.From;
import com.tinder.account.photos.photogrid.analytics.ProfileEditSource;
import com.tinder.domain.common.reactivex.usecase.CompletableUseCase;
import com.tinder.domain.profile.model.PendingFacebookPhoto;
import com.tinder.domain.profile.usecase.AddPendingFacebookPhoto;
import io.reactivex.C3956a;
import io.reactivex.functions.Action;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0017\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/account/photos/usecase/AddPendingFacebookPhotoFromEditInfo;", "Lcom/tinder/domain/common/reactivex/usecase/CompletableUseCase;", "Lcom/tinder/account/photos/usecase/AddPendingFacebookPhotoFromEditInfo$Request;", "addPendingFacebookPhoto", "Lcom/tinder/domain/profile/usecase/AddPendingFacebookPhoto;", "addProfileAddPhotoEvent", "Lcom/tinder/account/photos/photogrid/analytics/AddProfileAddPhotoEvent;", "(Lcom/tinder/domain/profile/usecase/AddPendingFacebookPhoto;Lcom/tinder/account/photos/photogrid/analytics/AddProfileAddPhotoEvent;)V", "execute", "Lio/reactivex/Completable;", "request", "Request", "account_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.account.photos.b.a */
public final class C3885a implements CompletableUseCase<C2617a> {
    /* renamed from: a */
    private final AddPendingFacebookPhoto f12157a;
    /* renamed from: b */
    private final AddProfileAddPhotoEvent f12158b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/account/photos/usecase/AddPendingFacebookPhotoFromEditInfo$Request;", "", "pendingFacebookPhoto", "Lcom/tinder/domain/profile/model/PendingFacebookPhoto;", "destinationIndex", "", "(Lcom/tinder/domain/profile/model/PendingFacebookPhoto;I)V", "getDestinationIndex", "()I", "getPendingFacebookPhoto", "()Lcom/tinder/domain/profile/model/PendingFacebookPhoto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "account_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.account.photos.b.a$a */
    public static final class C2617a {
        @NotNull
        /* renamed from: a */
        private final PendingFacebookPhoto f8155a;
        /* renamed from: b */
        private final int f8156b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C2617a) {
                C2617a c2617a = (C2617a) obj;
                if (C2668g.m10308a(this.f8155a, c2617a.f8155a)) {
                    if ((this.f8156b == c2617a.f8156b ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            PendingFacebookPhoto pendingFacebookPhoto = this.f8155a;
            return ((pendingFacebookPhoto != null ? pendingFacebookPhoto.hashCode() : 0) * 31) + this.f8156b;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(pendingFacebookPhoto=");
            stringBuilder.append(this.f8155a);
            stringBuilder.append(", destinationIndex=");
            stringBuilder.append(this.f8156b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C2617a(@NotNull PendingFacebookPhoto pendingFacebookPhoto, int i) {
            C2668g.m10309b(pendingFacebookPhoto, "pendingFacebookPhoto");
            this.f8155a = pendingFacebookPhoto;
            this.f8156b = i;
        }

        @NotNull
        /* renamed from: a */
        public final PendingFacebookPhoto m9785a() {
            return this.f8155a;
        }

        /* renamed from: b */
        public final int m9786b() {
            return this.f8156b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.account.photos.b.a$b */
    static final class C3884b implements Action {
        /* renamed from: a */
        final /* synthetic */ C3885a f12155a;
        /* renamed from: b */
        final /* synthetic */ C2617a f12156b;

        C3884b(C3885a c3885a, C2617a c2617a) {
            this.f12155a = c3885a;
            this.f12156b = c2617a;
        }

        public final void run() {
            this.f12155a.f12158b.m14672a(new C2625a(ProfileEditSource.EDIT_INFO, From.FACEBOOK, this.f12156b.m9786b()));
        }
    }

    @Inject
    public C3885a(@NotNull AddPendingFacebookPhoto addPendingFacebookPhoto, @NotNull AddProfileAddPhotoEvent addProfileAddPhotoEvent) {
        C2668g.m10309b(addPendingFacebookPhoto, "addPendingFacebookPhoto");
        C2668g.m10309b(addProfileAddPhotoEvent, "addProfileAddPhotoEvent");
        this.f12157a = addPendingFacebookPhoto;
        this.f12158b = addProfileAddPhotoEvent;
    }

    public /* synthetic */ C3956a execute(Object obj) {
        return m14631a((C2617a) obj);
    }

    @NotNull
    /* renamed from: a */
    public C3956a m14631a(@NotNull C2617a c2617a) {
        C2668g.m10309b(c2617a, "request");
        Object b = this.f12157a.execute(c2617a.m9785a()).m15295b((Action) new C3884b(this, c2617a));
        C2668g.m10305a(b, "addPendingFacebookPhoto.…          )\n            }");
        return b;
    }
}
