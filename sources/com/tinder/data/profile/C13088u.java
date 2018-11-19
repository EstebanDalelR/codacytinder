package com.tinder.data.profile;

import com.tinder.data.profile.persistence.ProfileDataStore;
import com.tinder.domain.profile.model.ProfileOption.SuperLikes;
import com.tinder.domain.profile.usecase.SaveSuperlikeStatus;
import com.tinder.domain.superlike.SuperlikeStatus;
import io.reactivex.annotations.Experimental;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/data/profile/SaveSuperlikeStatusData;", "Lcom/tinder/domain/profile/usecase/SaveSuperlikeStatus;", "profileDataStore", "Lcom/tinder/data/profile/persistence/ProfileDataStore;", "(Lcom/tinder/data/profile/persistence/ProfileDataStore;)V", "execute", "", "request", "Lcom/tinder/domain/superlike/SuperlikeStatus;", "data_release"}, k = 1, mv = {1, 1, 10})
@Experimental
/* renamed from: com.tinder.data.profile.u */
public final class C13088u implements SaveSuperlikeStatus {
    /* renamed from: a */
    private final ProfileDataStore f41691a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.u$a */
    static final class C10982a implements Action {
        /* renamed from: a */
        public static final C10982a f35705a = new C10982a();

        C10982a() {
        }

        public final void run() {
        }
    }

    @Inject
    public C13088u(@NotNull ProfileDataStore profileDataStore) {
        C2668g.b(profileDataStore, "profileDataStore");
        this.f41691a = profileDataStore;
    }

    public /* synthetic */ void execute(Object obj) {
        m50923a((SuperlikeStatus) obj);
    }

    /* renamed from: a */
    public void m50923a(@NotNull SuperlikeStatus superlikeStatus) {
        C2668g.b(superlikeStatus, "request");
        superlikeStatus = this.f41691a.save(SuperLikes.INSTANCE, superlikeStatus).b(C15756a.b());
        Action action = C10982a.f35705a;
        Function1 function1 = SaveSuperlikeStatusData$execute$2.f45313a;
        if (function1 != null) {
            function1 = new C10983v(function1);
        }
        superlikeStatus.a(action, (Consumer) function1);
    }
}
