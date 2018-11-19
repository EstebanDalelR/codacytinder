package com.tinder.domain.profile.usecase;

import com.tinder.domain.common.model.School;
import com.tinder.domain.profile.model.EditProfileUpdateStatus;
import com.tinder.domain.profile.usecase.SMSUpdateSchool.OnSchoolChangedListener;
import com.tinder.domain.profile.usecase.SMSUpdateSchool.Request;
import io.reactivex.C3960g;
import io.reactivex.SingleSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.Function;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/tinder/domain/profile/model/EditProfileUpdateStatus;", "kotlin.jvm.PlatformType", "previousSchools", "", "Lcom/tinder/domain/common/model/School;", "apply"}, k = 3, mv = {1, 1, 10})
final class SMSUpdateSchool$execute$1<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ Request $request;
    final /* synthetic */ SMSUpdateSchool this$0;

    SMSUpdateSchool$execute$1(SMSUpdateSchool sMSUpdateSchool, Request request) {
        this.this$0 = sMSUpdateSchool;
        this.$request = request;
    }

    public final C3960g<EditProfileUpdateStatus> apply(@NotNull final List<? extends School> list) {
        C2668g.b(list, "previousSchools");
        for (Object next : list) {
            if (C2668g.a(((School) next).toBuilder().id(null).build(), this.$request.getSchool())) {
                break;
            }
        }
        Object next2 = null;
        if (((School) next2) != null) {
            return C3960g.a(EditProfileUpdateStatus.NO_CHANGE);
        }
        return this.this$0.schoolRepository.updateForSmsUser(C19301m.a(this.$request.getSchool())).b(new Action() {
            public final void run() {
                OnSchoolChangedListener listener = this.$request.getListener();
                if (listener != null) {
                    List list = list;
                    C2668g.a(list, "previousSchools");
                    listener.afterSchoolChanged(list);
                }
            }
        }).a(C3960g.a(EditProfileUpdateStatus.UPDATED));
    }
}
