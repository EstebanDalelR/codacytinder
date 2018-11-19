package com.tinder.data.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public interface MatchGroupMemberModel {

    public interface Creator<T extends MatchGroupMemberModel> {
        T create(@NonNull String str, @NonNull String str2, boolean z, long j);
    }

    public interface Select_membersCreator<T1 extends MatchGroupMemberModel, T2 extends MatchPersonModel, T extends Select_membersModel<T1, T2>> {
        T create(@NonNull T1 t1, @Nullable T2 t2);
    }

    public interface Select_membersModel<T1 extends MatchGroupMemberModel, T2 extends MatchPersonModel> {
        @NonNull
        T1 GM();

        @Nullable
        /* renamed from: P */
        T2 m37167P();
    }

    /* renamed from: com.tinder.data.model.MatchGroupMemberModel$a */
    public static final class C8704a<T extends MatchGroupMemberModel> {
        /* renamed from: a */
        public final Creator<T> f30656a;

        public C8704a(Creator<T> creator) {
            this.f30656a = creator;
        }
    }

    @NonNull
    String group_id();

    boolean is_owner();

    @NonNull
    String person_id();

    long sort_order();
}
