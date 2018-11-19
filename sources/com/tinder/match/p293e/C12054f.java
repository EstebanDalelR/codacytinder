package com.tinder.match.p293e;

import android.support.annotation.NonNull;
import android.support.v7.util.DiffUtil.Callback;
import com.tinder.common.p077b.C2641a;
import com.tinder.match.viewmodel.C12102k;
import com.tinder.match.viewmodel.NewMatchListItem;
import com.tinder.match.viewmodel.NewMatchListItem.Type;
import java.util.List;

/* renamed from: com.tinder.match.e.f */
public class C12054f extends Callback {
    /* renamed from: a */
    private final List<NewMatchListItem> f39195a;
    /* renamed from: b */
    private final List<NewMatchListItem> f39196b;

    public C12054f(@NonNull List<NewMatchListItem> list, @NonNull List<NewMatchListItem> list2) {
        this.f39195a = list;
        this.f39196b = list2;
    }

    public int getOldListSize() {
        return C2641a.a(this.f39195a) ? 0 : this.f39195a.size();
    }

    public int getNewListSize() {
        return C2641a.a(this.f39196b) ? 0 : this.f39196b.size();
    }

    public boolean areItemsTheSame(int i, int i2) {
        boolean z = false;
        if (!this.f39195a.isEmpty()) {
            if (!this.f39196b.isEmpty()) {
                NewMatchListItem newMatchListItem = (NewMatchListItem) this.f39195a.get(i);
                NewMatchListItem newMatchListItem2 = (NewMatchListItem) this.f39196b.get(i2);
                if (newMatchListItem.mo10607b() == Type.SPACE_VIEW && newMatchListItem2.mo10607b() == Type.SPACE_VIEW) {
                    return true;
                }
                if (C12054f.m48164a(newMatchListItem, newMatchListItem2)) {
                    return ((C12102k) newMatchListItem.mo10606a().b()).mo11192a().equals(((C12102k) newMatchListItem2.mo10606a().b()).mo11192a());
                }
                if (newMatchListItem.mo10607b() == newMatchListItem2.mo10607b()) {
                    z = true;
                }
                return z;
            }
        }
        return false;
    }

    public boolean areContentsTheSame(int i, int i2) {
        boolean z = true;
        if (this.f39195a.isEmpty() && this.f39196b.isEmpty()) {
            return true;
        }
        NewMatchListItem newMatchListItem = (NewMatchListItem) this.f39195a.get(i);
        NewMatchListItem newMatchListItem2 = (NewMatchListItem) this.f39196b.get(i2);
        if ((newMatchListItem.mo10607b() == Type.SPACE_VIEW && newMatchListItem2.mo10607b() == Type.SPACE_VIEW) || !C12054f.m48164a(newMatchListItem, newMatchListItem2)) {
            return true;
        }
        C12102k c12102k = (C12102k) newMatchListItem.mo10606a().b();
        C12102k c12102k2 = (C12102k) newMatchListItem2.mo10606a().b();
        if (!c12102k.mo11193b().equals(c12102k2.mo11193b()) || c12102k.mo11197f() != c12102k2.mo11197f() || c12102k.mo11195d().equals(c12102k2.mo11195d()) == 0) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    private static boolean m48164a(@NonNull NewMatchListItem newMatchListItem, @NonNull NewMatchListItem newMatchListItem2) {
        return (newMatchListItem.mo10607b() != Type.NEW_MATCH || newMatchListItem2.mo10607b() != Type.NEW_MATCH || newMatchListItem.mo10606a().c() == null || newMatchListItem2.mo10606a().c() == null) ? null : true;
    }
}
