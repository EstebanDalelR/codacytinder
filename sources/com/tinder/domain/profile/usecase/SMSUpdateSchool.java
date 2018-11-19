package com.tinder.domain.profile.usecase;

import com.tinder.domain.common.model.School;
import com.tinder.domain.profile.model.EditProfileUpdateStatus;
import com.tinder.domain.profile.repository.SchoolRepository;
import io.reactivex.C3960g;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/domain/profile/usecase/SMSUpdateSchool;", "", "schoolRepository", "Lcom/tinder/domain/profile/repository/SchoolRepository;", "(Lcom/tinder/domain/profile/repository/SchoolRepository;)V", "execute", "Lio/reactivex/Single;", "Lcom/tinder/domain/profile/model/EditProfileUpdateStatus;", "request", "Lcom/tinder/domain/profile/usecase/SMSUpdateSchool$Request;", "OnSchoolChangedListener", "Request", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class SMSUpdateSchool {
    private final SchoolRepository schoolRepository;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/domain/profile/usecase/SMSUpdateSchool$OnSchoolChangedListener;", "", "afterSchoolChanged", "", "previousSchools", "", "Lcom/tinder/domain/common/model/School;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public interface OnSchoolChangedListener {
        void afterSchoolChanged(@NotNull List<? extends School> list);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tinder/domain/profile/usecase/SMSUpdateSchool$Request;", "", "school", "Lcom/tinder/domain/common/model/School;", "listener", "Lcom/tinder/domain/profile/usecase/SMSUpdateSchool$OnSchoolChangedListener;", "(Lcom/tinder/domain/common/model/School;Lcom/tinder/domain/profile/usecase/SMSUpdateSchool$OnSchoolChangedListener;)V", "getListener", "()Lcom/tinder/domain/profile/usecase/SMSUpdateSchool$OnSchoolChangedListener;", "getSchool", "()Lcom/tinder/domain/common/model/School;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Request {
        @Nullable
        private final OnSchoolChangedListener listener;
        @NotNull
        private final School school;

        @NotNull
        public static /* synthetic */ Request copy$default(Request request, School school, OnSchoolChangedListener onSchoolChangedListener, int i, Object obj) {
            if ((i & 1) != 0) {
                school = request.school;
            }
            if ((i & 2) != 0) {
                onSchoolChangedListener = request.listener;
            }
            return request.copy(school, onSchoolChangedListener);
        }

        @NotNull
        public final School component1() {
            return this.school;
        }

        @Nullable
        public final OnSchoolChangedListener component2() {
            return this.listener;
        }

        @NotNull
        public final Request copy(@NotNull School school, @Nullable OnSchoolChangedListener onSchoolChangedListener) {
            C2668g.b(school, "school");
            return new Request(school, onSchoolChangedListener);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Request) {
                    Request request = (Request) obj;
                    if (C2668g.a(this.school, request.school) && C2668g.a(this.listener, request.listener)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            School school = this.school;
            int i = 0;
            int hashCode = (school != null ? school.hashCode() : 0) * 31;
            OnSchoolChangedListener onSchoolChangedListener = this.listener;
            if (onSchoolChangedListener != null) {
                i = onSchoolChangedListener.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(school=");
            stringBuilder.append(this.school);
            stringBuilder.append(", listener=");
            stringBuilder.append(this.listener);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public Request(@NotNull School school, @Nullable OnSchoolChangedListener onSchoolChangedListener) {
            C2668g.b(school, "school");
            this.school = school;
            this.listener = onSchoolChangedListener;
        }

        @Nullable
        public final OnSchoolChangedListener getListener() {
            return this.listener;
        }

        @NotNull
        public final School getSchool() {
            return this.school;
        }
    }

    @Inject
    public SMSUpdateSchool(@NotNull SchoolRepository schoolRepository) {
        C2668g.b(schoolRepository, "schoolRepository");
        this.schoolRepository = schoolRepository;
    }

    @NotNull
    public final C3960g<EditProfileUpdateStatus> execute(@NotNull Request request) {
        C2668g.b(request, "request");
        request = this.schoolRepository.load().first(C19301m.a()).a(new SMSUpdateSchool$execute$1(this, request));
        C2668g.a(request, "schoolRepository\n       …          }\n            }");
        return request;
    }
}
