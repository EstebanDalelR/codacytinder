package com.tinder.profiletab.p369c;

import com.tinder.domain.common.reactivex.usecase.ObservableResultUseCase;
import com.tinder.domain.profile.experiment.MaxPhotoExperiment;
import com.tinder.domain.profile.usecase.ObserveProfilePhotos;
import com.tinder.domain.profile.usecase.ObserveProfilePhotos.Result;
import io.reactivex.C3959e;
import io.reactivex.functions.Function;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/profiletab/usecase/IsProfileMediaFull;", "Lcom/tinder/domain/common/reactivex/usecase/ObservableResultUseCase;", "", "observeProfilePhotos", "Lcom/tinder/domain/profile/usecase/ObserveProfilePhotos;", "maxPhotoExperiment", "Lcom/tinder/domain/profile/experiment/MaxPhotoExperiment;", "(Lcom/tinder/domain/profile/usecase/ObserveProfilePhotos;Lcom/tinder/domain/profile/experiment/MaxPhotoExperiment;)V", "execute", "Lio/reactivex/Observable;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.profiletab.c.g */
public final class C16178g implements ObservableResultUseCase<Boolean> {
    /* renamed from: a */
    private final ObserveProfilePhotos f50392a;
    /* renamed from: b */
    private final MaxPhotoExperiment f50393b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/profile/usecase/ObserveProfilePhotos$Result;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.profiletab.c.g$a */
    static final class C16177a<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ C16178g f50391a;

        C16177a(C16178g c16178g) {
            this.f50391a = c16178g;
        }

        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(m61126a((Result) obj));
        }

        /* renamed from: a */
        public final boolean m61126a(@NotNull Result result) {
            C2668g.b(result, "it");
            return result.getPhotos().size() >= this.f50391a.f50393b.getCount() ? true : null;
        }
    }

    @Inject
    public C16178g(@NotNull ObserveProfilePhotos observeProfilePhotos, @NotNull MaxPhotoExperiment maxPhotoExperiment) {
        C2668g.b(observeProfilePhotos, "observeProfilePhotos");
        C2668g.b(maxPhotoExperiment, "maxPhotoExperiment");
        this.f50392a = observeProfilePhotos;
        this.f50393b = maxPhotoExperiment;
    }

    @NotNull
    public C3959e<Boolean> execute() {
        C3959e<Boolean> map = this.f50392a.execute().map(new C16177a(this));
        C2668g.a(map, "observeProfilePhotos\n   …axPhotoExperiment.count }");
        return map;
    }
}
