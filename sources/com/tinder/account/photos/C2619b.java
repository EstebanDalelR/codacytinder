package com.tinder.account.photos;

import com.tinder.domain.profile.model.ProfilePhoto;
import io.reactivex.C3959e;
import io.reactivex.subjects.C19040a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0017J\u0014\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eRJ\u0010\u0010\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0013 \u0014*\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00120\u0012 \u0014*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0013 \u0014*\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00120\u0012\u0018\u00010\u00110\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/tinder/account/photos/InMemoryPhotoDataStore;", "", "()V", "hasPendingMoves", "", "getHasPendingMoves", "()Z", "setHasPendingMoves", "(Z)V", "indexToReplace", "", "getIndexToReplace", "()Ljava/lang/Integer;", "setIndexToReplace", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "photosSubject", "Lio/reactivex/subjects/BehaviorSubject;", "", "Lcom/tinder/domain/profile/model/ProfilePhoto;", "kotlin.jvm.PlatformType", "getPhotos", "observePhotos", "Lio/reactivex/Observable;", "updatePhotos", "", "photos", "account_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.account.photos.b */
public final class C2619b {
    /* renamed from: a */
    private boolean f8159a;
    @Nullable
    /* renamed from: b */
    private Integer f8160b;
    /* renamed from: c */
    private final C19040a<List<ProfilePhoto>> f8161c = C19040a.a(C19301m.a());

    /* renamed from: a */
    public final void m9791a(boolean z) {
        this.f8159a = z;
    }

    /* renamed from: a */
    public final boolean m9792a() {
        return this.f8159a;
    }

    /* renamed from: a */
    public final void m9789a(@Nullable Integer num) {
        this.f8160b = num;
    }

    @Nullable
    /* renamed from: b */
    public final Integer m9793b() {
        return this.f8160b;
    }

    @NotNull
    /* renamed from: c */
    public final C3959e<List<ProfilePhoto>> m9794c() {
        Object obj = this.f8161c;
        C2668g.m10305a(obj, "photosSubject");
        return (C3959e) obj;
    }

    @NotNull
    /* renamed from: d */
    public final List<ProfilePhoto> m9795d() {
        Object obj = this.f8161c;
        C2668g.m10305a(obj, "photosSubject");
        obj = obj.b();
        C2668g.m10305a(obj, "photosSubject.value");
        return (List) obj;
    }

    /* renamed from: a */
    public final void m9790a(@NotNull List<? extends ProfilePhoto> list) {
        C2668g.m10309b(list, "photos");
        this.f8161c.onNext(list);
    }
}
