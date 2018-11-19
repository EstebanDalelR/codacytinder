package com.tinder.data.model;

import android.database.Cursor;
import android.support.annotation.NonNull;
import com.squareup.sqldelight.RowMapper;
import com.tinder.data.model.MatchGroupMemberModel.C8704a;
import com.tinder.data.model.MatchPersonModel.C8707a;
import com.tinder.domain.common.model.Gender;
import java.util.List;
import org.joda.time.DateTime;

public interface MatchGroupModel {

    public interface Creator<T extends MatchGroupModel> {
        T create(@NonNull String str);
    }

    public interface Group_viewCreator<T2 extends MatchGroupModel, T3 extends MatchGroupMemberModel, T4 extends MatchPersonModel, T extends Group_viewModel<T2, T3, T4>> {
        T create(@NonNull String str, @NonNull T2 t2, @NonNull T3 t3, @NonNull T4 t4);
    }

    public interface Group_viewModel<T2 extends MatchGroupModel, T3 extends MatchGroupMemberModel, T4 extends MatchPersonModel> {
        @NonNull
        T3 GM();

        @NonNull
        String g_id();

        @NonNull
        T2 match_group();

        @NonNull
        T4 match_person();
    }

    /* renamed from: com.tinder.data.model.MatchGroupModel$a */
    public static final class C8705a<T extends MatchGroupModel> {
        /* renamed from: a */
        public final Creator<T> f30657a;

        public C8705a(Creator<T> creator) {
            this.f30657a = creator;
        }
    }

    /* renamed from: com.tinder.data.model.MatchGroupModel$b */
    public static final class C10853b<T2 extends MatchGroupModel, T3 extends MatchGroupMemberModel, T4 extends MatchPersonModel, T extends Group_viewModel<T2, T3, T4>> implements RowMapper<T> {
        /* renamed from: a */
        private final Group_viewCreator<T2, T3, T4, T> f35494a;
        /* renamed from: b */
        private final C8705a<T2> f35495b;
        /* renamed from: c */
        private final C8704a<T3> f35496c;
        /* renamed from: d */
        private final C8707a<T4> f35497d;

        @NonNull
        public /* synthetic */ Object map(@NonNull Cursor cursor) {
            return m43357a(cursor);
        }

        public C10853b(Group_viewCreator<T2, T3, T4, T> group_viewCreator, C8705a<T2> c8705a, C8704a<T3> c8704a, C8707a<T4> c8707a) {
            this.f35494a = group_viewCreator;
            this.f35495b = c8705a;
            this.f35496c = c8704a;
            this.f35497d = c8707a;
        }

        @NonNull
        /* renamed from: a */
        public T m43357a(@NonNull Cursor cursor) {
            Cursor cursor2 = cursor;
            Group_viewCreator group_viewCreator = this.f35494a;
            String string = cursor2.getString(0);
            MatchGroupModel create = this.f35495b.f30657a.create(cursor2.getString(1));
            MatchGroupMemberModel create2 = this.f35496c.f30656a.create(cursor2.getString(2), cursor2.getString(3), cursor2.getInt(4) == 1, cursor2.getLong(5));
            com.tinder.data.model.MatchPersonModel.Creator creator = r0.f35497d.f30663a;
            String string2 = cursor2.getString(6);
            String string3 = cursor2.getString(7);
            DateTime dateTime = null;
            String string4 = cursor2.isNull(8) ? null : cursor2.getString(8);
            if (!cursor2.isNull(9)) {
                dateTime = (DateTime) r0.f35497d.f30664b.decode(Long.valueOf(cursor2.getLong(9)));
            }
            return group_viewCreator.create(string, create, create2, creator.create(string2, string3, string4, dateTime, (Gender) r0.f35497d.f30665c.decode(cursor2.getBlob(10)), (List) r0.f35497d.f30666d.decode(cursor2.getBlob(11)), (List) r0.f35497d.f30667e.decode(cursor2.getBlob(12)), (List) r0.f35497d.f30668f.decode(cursor2.getBlob(13)), (List) r0.f35497d.f30669g.decode(cursor2.getBlob(14))));
        }
    }

    @NonNull
    String id();
}
