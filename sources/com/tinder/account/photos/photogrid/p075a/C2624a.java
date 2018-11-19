package com.tinder.account.photos.photogrid.p075a;

import android.support.annotation.UiThread;
import com.tinder.account.photos.C2619b;
import com.tinder.account.photos.p074b.C3885a;
import com.tinder.account.photos.p074b.C3885a.C2617a;
import com.tinder.account.photos.p074b.C3887b;
import com.tinder.account.photos.p074b.C3889c;
import com.tinder.account.photos.p074b.C3889c.C2618a;
import com.tinder.account.photos.photogrid.C2626d;
import com.tinder.account.photos.photogrid.C2627e;
import com.tinder.account.photos.photogrid.target.PhotoGridTarget;
import com.tinder.common.permissions.IsExternalReadPermissionGranted;
import com.tinder.domain.profile.experiment.MaxPhotoExperiment;
import com.tinder.domain.profile.model.LocalProfilePhoto;
import com.tinder.domain.profile.model.PendingFacebookPhoto;
import com.tinder.domain.profile.model.ProfileOption.SmartPhoto;
import com.tinder.domain.profile.model.ProfilePhoto;
import com.tinder.domain.profile.model.settings.SmartPhotoSettings;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.domain.profile.usecase.ObserveProfilePhotos;
import com.tinder.domain.profile.usecase.ObserveProfilePhotos.Result;
import com.tinder.domain.profile.usecase.SaveSmartPhotosSettings;
import com.tinder.domain.profile.usecase.UpdateProfilePhotoOrder;
import io.reactivex.C3956a;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001BW\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020 H\u0002J\b\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020 H\u0002J\u0010\u0010'\u001a\u00020 2\u0006\u0010(\u001a\u00020%H\u0002J\u0018\u0010)\u001a\u00020 2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u0010.\u001a\u00020 2\u0006\u0010(\u001a\u00020%H\u0007J\u0006\u0010/\u001a\u00020 J\b\u00100\u001a\u00020 H\u0002J\b\u00101\u001a\u00020 H\u0002J\u0018\u00102\u001a\u00020 2\u0006\u00103\u001a\u00020%2\u0006\u00104\u001a\u00020%H\u0007J2\u00102\u001a\b\u0012\u0004\u0012\u0002H605\"\u0004\b\u0000\u001062\f\u00107\u001a\b\u0012\u0004\u0012\u0002H6052\u0006\u00108\u001a\u00020%2\u0006\u00109\u001a\u00020%H\u0002J\b\u0010:\u001a\u00020 H\u0007J\u0006\u0010;\u001a\u00020 J\u0010\u0010<\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0007J\u0010\u0010=\u001a\u00020 2\u0006\u0010>\u001a\u00020?H\u0007J\b\u0010@\u001a\u00020 H\u0002J\u0006\u0010A\u001a\u00020 J\u0010\u0010B\u001a\u00020-2\u0006\u0010(\u001a\u00020%H\u0002J\u0018\u0010C\u001a\u00020 2\u0006\u0010D\u001a\u00020%2\u0006\u0010E\u001a\u00020\"H\u0002J\u0018\u0010F\u001a\u00020 2\u0006\u0010D\u001a\u00020%2\u0006\u0010G\u001a\u00020?H\u0002J\b\u0010H\u001a\u00020 H\u0007J\b\u0010I\u001a\u00020 H\u0007J\u0010\u0010J\u001a\u00020 2\u0006\u0010>\u001a\u00020?H\u0002J\u000e\u0010K\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010L\u001a\u00020 2\u0006\u0010M\u001a\u00020NR\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006O"}, d2 = {"Lcom/tinder/account/photos/photogrid/presenter/PhotoGridPresenter;", "", "observeProfilePhotos", "Lcom/tinder/domain/profile/usecase/ObserveProfilePhotos;", "updateProfilePhotoOrder", "Lcom/tinder/domain/profile/usecase/UpdateProfilePhotoOrder;", "isExternalReadPermissionGranted", "Lcom/tinder/common/permissions/IsExternalReadPermissionGranted;", "uploadPhotoFromEditInfo", "Lcom/tinder/account/photos/usecase/UploadPhotoFromEditInfo;", "deletePhotoFromEditInfo", "Lcom/tinder/account/photos/usecase/DeletePhotoFromEditInfo;", "addPendingFacebookPhotoFromEditInfo", "Lcom/tinder/account/photos/usecase/AddPendingFacebookPhotoFromEditInfo;", "maxPhotoExperiment", "Lcom/tinder/domain/profile/experiment/MaxPhotoExperiment;", "inMemoryPhotoDataStore", "Lcom/tinder/account/photos/InMemoryPhotoDataStore;", "loadProfileOptionData", "Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;", "saveSmartPhotosSettings", "Lcom/tinder/domain/profile/usecase/SaveSmartPhotosSettings;", "(Lcom/tinder/domain/profile/usecase/ObserveProfilePhotos;Lcom/tinder/domain/profile/usecase/UpdateProfilePhotoOrder;Lcom/tinder/common/permissions/IsExternalReadPermissionGranted;Lcom/tinder/account/photos/usecase/UploadPhotoFromEditInfo;Lcom/tinder/account/photos/usecase/DeletePhotoFromEditInfo;Lcom/tinder/account/photos/usecase/AddPendingFacebookPhotoFromEditInfo;Lcom/tinder/domain/profile/experiment/MaxPhotoExperiment;Lcom/tinder/account/photos/InMemoryPhotoDataStore;Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;Lcom/tinder/domain/profile/usecase/SaveSmartPhotosSettings;)V", "bindPhotosDisposable", "Lio/reactivex/disposables/Disposable;", "loadPhotosDisposable", "loadSmartPhotoSettingsDisposable", "target", "Lcom/tinder/account/photos/photogrid/target/PhotoGridTarget;", "topPhotoId", "", "addFacebookPhoto", "", "pendingFacebookPhoto", "Lcom/tinder/domain/profile/model/PendingFacebookPhoto;", "bindPhotos", "calculateDestinationIndex", "", "checkForPermissionToAddPhoto", "checkIfReplacingAPhotoIsSupported", "index", "completeAndThenDelete", "toComplete", "Lio/reactivex/Completable;", "photoToDelete", "Lcom/tinder/domain/profile/model/ProfilePhoto;", "delete", "dropTarget", "loadPhotos", "loadSmartPhotoSettings", "move", "fromIndex", "toIndex", "", "T", "list", "from", "to", "onAdd", "onDroppingTarget", "onFacebookPhotoReadyToAdd", "onPhotoReadyToUpload", "localProfilePhoto", "Lcom/tinder/domain/profile/model/LocalProfilePhoto;", "onSmartPhotoSettingsSaveFailed", "onTakingTarget", "prepareForDeletion", "replaceWithFacebookPhoto", "photoToDeleteIndex", "photoToAdd", "replaceWithPhoto", "photoToUpload", "retryLoadingPhotos", "saveOrder", "startPhotoUpload", "takeTarget", "updateSmartPhotoSettings", "isEnabled", "", "account_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.account.photos.photogrid.a.a */
public final class C2624a {
    /* renamed from: a */
    private PhotoGridTarget f8180a;
    /* renamed from: b */
    private Disposable f8181b;
    /* renamed from: c */
    private Disposable f8182c;
    /* renamed from: d */
    private Disposable f8183d;
    /* renamed from: e */
    private String f8184e;
    /* renamed from: f */
    private final ObserveProfilePhotos f8185f;
    /* renamed from: g */
    private final UpdateProfilePhotoOrder f8186g;
    /* renamed from: h */
    private final IsExternalReadPermissionGranted f8187h;
    /* renamed from: i */
    private final C3889c f8188i;
    /* renamed from: j */
    private final C3887b f8189j;
    /* renamed from: k */
    private final C3885a f8190k;
    /* renamed from: l */
    private final MaxPhotoExperiment f8191l;
    /* renamed from: m */
    private final C2619b f8192m;
    /* renamed from: n */
    private final LoadProfileOptionData f8193n;
    /* renamed from: o */
    private final SaveSmartPhotosSettings f8194o;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.account.photos.photogrid.a.a$a */
    static final class C3894a implements Action {
        /* renamed from: a */
        public static final C3894a f12174a = new C3894a();

        C3894a() {
        }

        public final void run() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.account.photos.photogrid.a.a$b */
    static final class C3895b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C2624a f12175a;
        /* renamed from: b */
        final /* synthetic */ PendingFacebookPhoto f12176b;

        C3895b(C2624a c2624a, PendingFacebookPhoto pendingFacebookPhoto) {
            this.f12175a = c2624a;
            this.f12176b = pendingFacebookPhoto;
        }

        public /* synthetic */ void accept(Object obj) {
            m14659a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m14659a(Throwable th) {
            th = this.f12175a.f8180a;
            if (th != null) {
                th.showPhotoUploadError();
            }
            this.f12175a.f8192m.m9790a(C19301m.c(this.f12175a.f8192m.m9795d(), this.f12176b));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/tinder/account/photos/photogrid/PhotoGridEntry;", "it", "Lcom/tinder/domain/profile/model/ProfilePhoto;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.account.photos.photogrid.a.a$c */
    static final class C3896c<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ C2624a f12177a;

        C3896c(C2624a c2624a) {
            this.f12177a = c2624a;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m14660a((List) obj);
        }

        @NotNull
        /* renamed from: a */
        public final List<C2626d> m14660a(@NotNull List<? extends ProfilePhoto> list) {
            C2668g.m10309b(list, "it");
            return C2627e.f8199a.m9847a(list, Math.max(0, this.f12177a.f8191l.getCount() - list.size()), this.f12177a.f8184e);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/tinder/account/photos/photogrid/PhotoGridEntry;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.account.photos.photogrid.a.a$d */
    static final class C3897d<T> implements Consumer<List<? extends C2626d>> {
        /* renamed from: a */
        final /* synthetic */ C2624a f12178a;

        C3897d(C2624a c2624a) {
            this.f12178a = c2624a;
        }

        public /* synthetic */ void accept(Object obj) {
            m14661a((List) obj);
        }

        /* renamed from: a */
        public final void m14661a(List<? extends C2626d> list) {
            PhotoGridTarget e = this.f12178a.f8180a;
            if (e != null) {
                C2668g.m10305a((Object) list, "it");
                e.showPhotos(list);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.account.photos.photogrid.a.a$e */
    static final class C3898e<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C3898e f12179a = new C3898e();

        C3898e() {
        }

        public /* synthetic */ void accept(Object obj) {
            m14662a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m14662a(Throwable th) {
            C0001a.m30c(th, "Error binding photos", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.account.photos.photogrid.a.a$f */
    static final class C3899f implements Action {
        /* renamed from: a */
        final /* synthetic */ C2624a f12180a;

        C3899f(C2624a c2624a) {
            this.f12180a = c2624a;
        }

        public final void run() {
            this.f12180a.m9825h();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.account.photos.photogrid.a.a$g */
    static final class C3900g implements Action {
        /* renamed from: a */
        final /* synthetic */ C3956a f12181a;
        /* renamed from: b */
        final /* synthetic */ ProfilePhoto f12182b;

        C3900g(C3956a c3956a, ProfilePhoto profilePhoto) {
            this.f12181a = c3956a;
            this.f12182b = profilePhoto;
        }

        public final void run() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(this.f12181a);
            stringBuilder.append(" and Deleted photo ");
            stringBuilder.append(this.f12182b);
            C0001a.m25b(stringBuilder.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.account.photos.photogrid.a.a$h */
    static final class C3901h<T> implements Consumer<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C3956a f12183a;
        /* renamed from: b */
        final /* synthetic */ ProfilePhoto f12184b;

        C3901h(C3956a c3956a, ProfilePhoto profilePhoto) {
            this.f12183a = c3956a;
            this.f12184b = profilePhoto;
        }

        public /* synthetic */ void accept(Object obj) {
            m14663a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m14663a(Throwable th) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error completing ");
            stringBuilder.append(this.f12183a);
            stringBuilder.append(" and deleting photo ");
            stringBuilder.append(this.f12184b);
            C0001a.m30c(th, stringBuilder.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "result", "Lcom/tinder/domain/profile/usecase/ObserveProfilePhotos$Result;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.account.photos.photogrid.a.a$i */
    static final class C3902i<T> implements Consumer<Result> {
        /* renamed from: a */
        final /* synthetic */ C2624a f12185a;

        C3902i(C2624a c2624a) {
            this.f12185a = c2624a;
        }

        public /* synthetic */ void accept(Object obj) {
            m14664a((Result) obj);
        }

        /* renamed from: a */
        public final void m14664a(Result result) {
            this.f12185a.f8192m.m9791a(false);
            this.f12185a.f8192m.m9790a(result.getPhotos());
            this.f12185a.f8184e = result.getTopPhotoId();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.account.photos.photogrid.a.a$j */
    static final class C3903j<T> implements Consumer<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C2624a f12186a;

        C3903j(C2624a c2624a) {
            this.f12186a = c2624a;
        }

        public /* synthetic */ void accept(Object obj) {
            m14665a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m14665a(Throwable th) {
            C0001a.m30c(th, "Error loading photos", new Object[0]);
            this.f12186a.f8192m.m9790a(C19301m.a());
            th = this.f12186a.f8180a;
            if (th != null) {
                th.showLoadingPhotosError();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/profile/model/settings/SmartPhotoSettings;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.account.photos.photogrid.a.a$k */
    static final class C3904k<T> implements Consumer<SmartPhotoSettings> {
        /* renamed from: a */
        final /* synthetic */ C2624a f12187a;

        C3904k(C2624a c2624a) {
            this.f12187a = c2624a;
        }

        public /* synthetic */ void accept(Object obj) {
            m14666a((SmartPhotoSettings) obj);
        }

        /* renamed from: a */
        public final void m14666a(SmartPhotoSettings smartPhotoSettings) {
            if (smartPhotoSettings.getEnabled() != null) {
                smartPhotoSettings = this.f12187a.f8180a;
                if (smartPhotoSettings != null) {
                    smartPhotoSettings.showSmartPhotosEnabled();
                    return;
                }
                return;
            }
            smartPhotoSettings = this.f12187a.f8180a;
            if (smartPhotoSettings != null) {
                smartPhotoSettings.showSmartPhotosDisabled();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.account.photos.photogrid.a.a$l */
    static final class C3905l<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C3905l f12188a = new C3905l();

        C3905l() {
        }

        public /* synthetic */ void accept(Object obj) {
            m14667a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m14667a(Throwable th) {
            C0001a.m30c(th, "Error loading smart photo settings", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.account.photos.photogrid.a.a$m */
    static final class C3906m implements Action {
        /* renamed from: a */
        final /* synthetic */ C2624a f12189a;

        C3906m(C2624a c2624a) {
            this.f12189a = c2624a;
        }

        public final void run() {
            this.f12189a.f8192m.m9791a(false);
            C0001a.m25b("Updated profile photo order", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.account.photos.photogrid.a.a$n */
    static final class C3907n<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C3907n f12190a = new C3907n();

        C3907n() {
        }

        public /* synthetic */ void accept(Object obj) {
            m14668a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m14668a(Throwable th) {
            C0001a.m30c(th, "Error persisting photo order", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.account.photos.photogrid.a.a$o */
    static final class C3908o implements Action {
        /* renamed from: a */
        public static final C3908o f12191a = new C3908o();

        C3908o() {
        }

        public final void run() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.account.photos.photogrid.a.a$p */
    static final class C3909p<T> implements Consumer<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C2624a f12192a;
        /* renamed from: b */
        final /* synthetic */ LocalProfilePhoto f12193b;

        C3909p(C2624a c2624a, LocalProfilePhoto localProfilePhoto) {
            this.f12192a = c2624a;
            this.f12193b = localProfilePhoto;
        }

        public /* synthetic */ void accept(Object obj) {
            m14669a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m14669a(Throwable th) {
            th = this.f12192a.f8180a;
            if (th != null) {
                th.showPhotoUploadError();
            }
            this.f12192a.f8192m.m9790a(C19301m.c(this.f12192a.f8192m.m9795d(), this.f12193b));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.account.photos.photogrid.a.a$q */
    static final class C3910q implements Action {
        /* renamed from: a */
        final /* synthetic */ SmartPhotoSettings f12194a;

        C3910q(SmartPhotoSettings smartPhotoSettings) {
            this.f12194a = smartPhotoSettings;
        }

        public final void run() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Saved Smart Photo Settings: enabled=");
            stringBuilder.append(this.f12194a);
            C0001a.m25b(stringBuilder.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.account.photos.photogrid.a.a$r */
    static final class C3911r<T> implements Consumer<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C2624a f12195a;

        C3911r(C2624a c2624a) {
            this.f12195a = c2624a;
        }

        public /* synthetic */ void accept(Object obj) {
            m14670a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m14670a(Throwable th) {
            C0001a.m30c(th, "Failed to save SmartPhotoSettings", new Object[0]);
            this.f12195a.m9829l();
        }
    }

    @Inject
    public C2624a(@NotNull ObserveProfilePhotos observeProfilePhotos, @NotNull UpdateProfilePhotoOrder updateProfilePhotoOrder, @NotNull IsExternalReadPermissionGranted isExternalReadPermissionGranted, @NotNull C3889c c3889c, @NotNull C3887b c3887b, @NotNull C3885a c3885a, @NotNull MaxPhotoExperiment maxPhotoExperiment, @NotNull C2619b c2619b, @NotNull LoadProfileOptionData loadProfileOptionData, @NotNull SaveSmartPhotosSettings saveSmartPhotosSettings) {
        C2668g.m10309b(observeProfilePhotos, "observeProfilePhotos");
        C2668g.m10309b(updateProfilePhotoOrder, "updateProfilePhotoOrder");
        C2668g.m10309b(isExternalReadPermissionGranted, "isExternalReadPermissionGranted");
        C2668g.m10309b(c3889c, "uploadPhotoFromEditInfo");
        C2668g.m10309b(c3887b, "deletePhotoFromEditInfo");
        C2668g.m10309b(c3885a, "addPendingFacebookPhotoFromEditInfo");
        C2668g.m10309b(maxPhotoExperiment, "maxPhotoExperiment");
        C2668g.m10309b(c2619b, "inMemoryPhotoDataStore");
        C2668g.m10309b(loadProfileOptionData, "loadProfileOptionData");
        C2668g.m10309b(saveSmartPhotosSettings, "saveSmartPhotosSettings");
        this.f8185f = observeProfilePhotos;
        this.f8186g = updateProfilePhotoOrder;
        this.f8187h = isExternalReadPermissionGranted;
        this.f8188i = c3889c;
        this.f8189j = c3887b;
        this.f8190k = c3885a;
        this.f8191l = maxPhotoExperiment;
        this.f8192m = c2619b;
        this.f8193n = loadProfileOptionData;
        this.f8194o = saveSmartPhotosSettings;
    }

    /* renamed from: a */
    public final void m9833a(@NotNull PhotoGridTarget photoGridTarget) {
        C2668g.m10309b(photoGridTarget, "target");
        this.f8180a = photoGridTarget;
    }

    /* renamed from: a */
    public final void m9830a() {
        m9825h();
        m9824g();
        m9826i();
    }

    /* renamed from: b */
    public final void m9837b() {
        Disposable disposable = this.f8181b;
        if (disposable != null) {
            disposable.dispose();
        }
        disposable = this.f8182c;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* renamed from: c */
    public final void m9838c() {
        this.f8180a = (PhotoGridTarget) null;
    }

    @UiThread
    /* renamed from: a */
    public final void m9832a(int i, int i2) {
        this.f8192m.m9791a(true);
        this.f8192m.m9790a(m9810a(this.f8192m.m9795d(), i, i2));
    }

    @UiThread
    /* renamed from: a */
    public final void m9831a(int i) {
        List d = this.f8192m.m9795d();
        if (d.size() == 1) {
            this.f8192m.m9789a(Integer.valueOf(i));
            m9827j();
            return;
        }
        C3956a execute;
        ProfilePhoto b = m9815b(i);
        if (this.f8192m.m9792a()) {
            execute = this.f8186g.execute(d);
        } else {
            execute = C3956a.m15269a();
        }
        C2668g.m10305a((Object) execute, "orderCompletable");
        m9814a(execute, b);
    }

    @UiThread
    /* renamed from: d */
    public final void m9839d() {
        m9825h();
    }

    @UiThread
    /* renamed from: e */
    public final void m9840e() {
        if (this.f8192m.m9792a()) {
            this.f8186g.execute(this.f8192m.m9795d()).m15294b(C15756a.b()).m15284a(C15674a.a()).m15288a((Action) new C3906m(this), (Consumer) C3907n.f12190a);
        }
    }

    @UiThread
    /* renamed from: f */
    public final void m9841f() {
        this.f8192m.m9789a((Integer) null);
        m9827j();
    }

    @UiThread
    /* renamed from: a */
    public final void m9834a(@NotNull LocalProfilePhoto localProfilePhoto) {
        C2668g.m10309b(localProfilePhoto, "localProfilePhoto");
        Integer b = this.f8192m.m9793b();
        if (b != null) {
            m9811a(b.intValue(), localProfilePhoto);
        } else {
            m9817b(localProfilePhoto);
        }
    }

    @UiThread
    /* renamed from: a */
    public final void m9835a(@NotNull PendingFacebookPhoto pendingFacebookPhoto) {
        C2668g.m10309b(pendingFacebookPhoto, "pendingFacebookPhoto");
        Integer b = this.f8192m.m9793b();
        if (b != null) {
            m9812a(b.intValue(), pendingFacebookPhoto);
        } else {
            m9818b(pendingFacebookPhoto);
        }
    }

    /* renamed from: a */
    public final void m9836a(boolean z) {
        SmartPhotoSettings smartPhotoSettings = new SmartPhotoSettings(z);
        this.f8194o.execute(smartPhotoSettings).m15294b(C15756a.b()).m15284a(C15674a.a()).m15288a((Action) new C3910q(smartPhotoSettings), (Consumer) new C3911r(this));
    }

    /* renamed from: g */
    private final void m9824g() {
        this.f8182c = this.f8192m.m9794c().map(new C3896c(this)).subscribe(new C3897d(this), C3898e.f12179a);
    }

    /* renamed from: h */
    private final void m9825h() {
        Disposable disposable = this.f8181b;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f8181b = this.f8185f.execute().subscribeOn(C15756a.b()).observeOn(C15674a.a()).subscribe(new C3902i(this), new C3903j(this));
    }

    /* renamed from: i */
    private final void m9826i() {
        this.f8183d = this.f8193n.execute(SmartPhoto.INSTANCE).distinctUntilChanged().subscribeOn(C15756a.b()).observeOn(C15674a.a()).subscribe(new C3904k(this), C3905l.f12188a);
    }

    /* renamed from: a */
    private final <T> List<T> m9810a(List<? extends T> list, int i, int i2) {
        list = C19301m.d(list);
        list.add(i2, list.remove(i));
        return C19301m.l(list);
    }

    /* renamed from: j */
    private final void m9827j() {
        PhotoGridTarget photoGridTarget;
        if (this.f8187h.invoke()) {
            photoGridTarget = this.f8180a;
            if (photoGridTarget != null) {
                photoGridTarget.showExternalReadPermissionGranted();
                return;
            }
            return;
        }
        photoGridTarget = this.f8180a;
        if (photoGridTarget != null) {
            photoGridTarget.showExternalReadPermissionDenied();
        }
    }

    /* renamed from: b */
    private final void m9817b(LocalProfilePhoto localProfilePhoto) {
        this.f8192m.m9790a(C19301m.a(this.f8192m.m9795d(), localProfilePhoto));
        this.f8188i.m14635a(new C2618a(localProfilePhoto, m9828k())).m15294b(C15756a.b()).m15284a(C15674a.a()).m15288a((Action) C3908o.f12191a, (Consumer) new C3909p(this, localProfilePhoto));
    }

    /* renamed from: b */
    private final void m9818b(PendingFacebookPhoto pendingFacebookPhoto) {
        this.f8192m.m9790a(C19301m.a(this.f8192m.m9795d(), pendingFacebookPhoto));
        this.f8190k.m14631a(new C2617a(pendingFacebookPhoto, m9828k())).m15294b(C15756a.b()).m15284a(C15674a.a()).m15288a((Action) C3894a.f12174a, (Consumer) new C3895b(this, pendingFacebookPhoto));
    }

    /* renamed from: a */
    private final void m9811a(int i, LocalProfilePhoto localProfilePhoto) {
        m9820c(i);
        ProfilePhoto b = m9815b(i);
        this.f8192m.m9790a(C19301m.a(this.f8192m.m9795d(), localProfilePhoto));
        m9814a(this.f8188i.m14635a(new C2618a(localProfilePhoto, m9828k())), b);
    }

    /* renamed from: a */
    private final void m9812a(int i, PendingFacebookPhoto pendingFacebookPhoto) {
        m9820c(i);
        ProfilePhoto b = m9815b(i);
        this.f8192m.m9790a(C19301m.a(this.f8192m.m9795d(), pendingFacebookPhoto));
        m9814a(this.f8190k.m14631a(new C2617a(pendingFacebookPhoto, m9828k())), b);
    }

    /* renamed from: b */
    private final ProfilePhoto m9815b(int i) {
        List d = this.f8192m.m9795d();
        Object obj = (ProfilePhoto) d.get(i);
        C2619b c2619b = this.f8192m;
        Collection arrayList = new ArrayList();
        for (Object next : d) {
            if ((C2668g.m10308a((ProfilePhoto) next, obj) ^ 1) != 0) {
                arrayList.add(next);
            }
        }
        c2619b.m9790a((List) arrayList);
        Disposable disposable = this.f8181b;
        if (disposable != null) {
            disposable.dispose();
        }
        return obj;
    }

    /* renamed from: a */
    private final void m9814a(C3956a c3956a, ProfilePhoto profilePhoto) {
        c3956a.m15293b((CompletableSource) this.f8189j.m14633a(profilePhoto)).m15294b(C15756a.b()).m15284a(C15674a.a()).m15304d(new C3899f(this)).m15288a((Action) new C3900g(c3956a, profilePhoto), (Consumer) new C3901h(c3956a, profilePhoto));
    }

    /* renamed from: c */
    private final void m9820c(int i) {
        if (i != 0) {
            throw ((Throwable) new NotImplementedError("Replacing a photo at an index other than 0 is not supported yet"));
        }
    }

    /* renamed from: k */
    private final int m9828k() {
        return this.f8192m.m9795d().size() - 1;
    }

    /* renamed from: l */
    private final void m9829l() {
        PhotoGridTarget photoGridTarget = this.f8180a;
        if (photoGridTarget != null) {
            photoGridTarget.showSmartPhotoSettingsSaveError();
        }
    }
}
