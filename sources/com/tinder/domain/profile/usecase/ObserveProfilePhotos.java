package com.tinder.domain.profile.usecase;

import com.tinder.domain.common.reactivex.usecase.ObservableResultUseCase;
import com.tinder.domain.profile.model.ProfilePhoto;
import com.tinder.domain.profile.repository.ProfilePhotoRepository;
import io.reactivex.C3959e;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u000f\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/domain/profile/usecase/ObserveProfilePhotos;", "Lcom/tinder/domain/common/reactivex/usecase/ObservableResultUseCase;", "Lcom/tinder/domain/profile/usecase/ObserveProfilePhotos$Result;", "profilePhotosRepository", "Lcom/tinder/domain/profile/repository/ProfilePhotoRepository;", "(Lcom/tinder/domain/profile/repository/ProfilePhotoRepository;)V", "execute", "Lio/reactivex/Observable;", "Result", "domain_release"}, k = 1, mv = {1, 1, 10})
public class ObserveProfilePhotos implements ObservableResultUseCase<Result> {
    private final ProfilePhotoRepository profilePhotosRepository;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/tinder/domain/profile/usecase/ObserveProfilePhotos$Result;", "", "photos", "", "Lcom/tinder/domain/profile/model/ProfilePhoto;", "topPhotoId", "", "(Ljava/util/List;Ljava/lang/String;)V", "getPhotos", "()Ljava/util/List;", "getTopPhotoId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Result {
        @NotNull
        private final List<ProfilePhoto> photos;
        @Nullable
        private final String topPhotoId;

        @NotNull
        public static /* synthetic */ Result copy$default(Result result, List list, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                list = result.photos;
            }
            if ((i & 2) != 0) {
                str = result.topPhotoId;
            }
            return result.copy(list, str);
        }

        @NotNull
        public final List<ProfilePhoto> component1() {
            return this.photos;
        }

        @Nullable
        public final String component2() {
            return this.topPhotoId;
        }

        @NotNull
        public final Result copy(@NotNull List<? extends ProfilePhoto> list, @Nullable String str) {
            C2668g.b(list, "photos");
            return new Result(list, str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Result) {
                    Result result = (Result) obj;
                    if (C2668g.a(this.photos, result.photos) && C2668g.a(this.topPhotoId, result.topPhotoId)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            List list = this.photos;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            String str = this.topPhotoId;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Result(photos=");
            stringBuilder.append(this.photos);
            stringBuilder.append(", topPhotoId=");
            stringBuilder.append(this.topPhotoId);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public Result(@NotNull List<? extends ProfilePhoto> list, @Nullable String str) {
            C2668g.b(list, "photos");
            this.photos = list;
            this.topPhotoId = str;
        }

        @NotNull
        public final List<ProfilePhoto> getPhotos() {
            return this.photos;
        }

        @Nullable
        public final String getTopPhotoId() {
            return this.topPhotoId;
        }
    }

    @Inject
    public ObserveProfilePhotos(@NotNull ProfilePhotoRepository profilePhotoRepository) {
        C2668g.b(profilePhotoRepository, "profilePhotosRepository");
        this.profilePhotosRepository = profilePhotoRepository;
    }

    @NotNull
    public C3959e<Result> execute() {
        C3959e<Result> combineLatest = C3959e.combineLatest(this.profilePhotosRepository.observeTopPhotoSettings(), this.profilePhotosRepository.observe(), ObserveProfilePhotos$execute$1.INSTANCE);
        C2668g.a(combineLatest, "Observable.combineLatest…opPhotoId)\n            })");
        return combineLatest;
    }
}
