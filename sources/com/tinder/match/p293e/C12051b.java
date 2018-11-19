package com.tinder.match.p293e;

import android.support.annotation.NonNull;
import android.support.v7.util.DiffUtil.Callback;
import com.tinder.match.viewmodel.MatchListItem;
import com.tinder.match.viewmodel.MatchListItem.Type;
import java.util.List;

/* renamed from: com.tinder.match.e.b */
public class C12051b extends Callback {
    @NonNull
    /* renamed from: a */
    private final List<MatchListItem> f39191a;
    @NonNull
    /* renamed from: b */
    private final List<MatchListItem> f39192b;

    public C12051b(@NonNull List<MatchListItem> list, @NonNull List<MatchListItem> list2) {
        this.f39191a = list;
        this.f39192b = list2;
    }

    public int getOldListSize() {
        return this.f39191a.size();
    }

    public int getNewListSize() {
        return this.f39192b.size();
    }

    public boolean areItemsTheSame(int i, int i2) {
        boolean z = false;
        if (!this.f39191a.isEmpty()) {
            if (!this.f39192b.isEmpty()) {
                MatchListItem matchListItem = (MatchListItem) this.f39191a.get(i);
                MatchListItem matchListItem2 = (MatchListItem) this.f39192b.get(i2);
                if (matchListItem.mo10602c() == Type.GOING_OUT_V1 && matchListItem2.mo10602c() == Type.GOING_OUT_V1) {
                    return true;
                }
                if (matchListItem.mo10602c() == Type.GOING_OUT_V2 && matchListItem2.mo10602c() == Type.GOING_OUT_V2) {
                    return true;
                }
                if (matchListItem.mo10602c() == Type.NEW_MATCHES && matchListItem2.mo10602c() == Type.NEW_MATCHES) {
                    return true;
                }
                if (matchListItem.mo10602c() == Type.MATCH_WITH_MESSAGE && matchListItem2.mo10602c() == Type.MATCH_WITH_MESSAGE) {
                    return matchListItem.mo10600a().mo11192a().equals(matchListItem2.mo10600a().mo11192a());
                }
                if (matchListItem.mo10602c() == matchListItem2.mo10602c()) {
                    z = true;
                }
                return z;
            }
        }
        return false;
    }

    public boolean areContentsTheSame(int i, int i2) {
        boolean z = true;
        if (this.f39191a.isEmpty() && this.f39192b.isEmpty()) {
            return true;
        }
        MatchListItem matchListItem = (MatchListItem) this.f39191a.get(i);
        MatchListItem matchListItem2 = (MatchListItem) this.f39192b.get(i2);
        if (matchListItem.mo10602c() == Type.MATCH_WITH_MESSAGE && matchListItem2.mo10602c() == Type.MATCH_WITH_MESSAGE) {
            if (matchListItem.mo10600a().mo11197f() != matchListItem2.mo10600a().mo11197f() || !matchListItem.mo10600a().mo11200i().equals(matchListItem2.mo10600a().mo11200i()) || matchListItem.mo10600a().mo11193b().equals(matchListItem2.mo10600a().mo11193b()) == 0) {
                z = false;
            }
            return z;
        } else if (matchListItem.mo10602c() != Type.MESSAGES_HEADER || matchListItem2.mo10602c() != Type.MESSAGES_HEADER || matchListItem.mo10601b() == null || matchListItem2.mo10601b() == null) {
            return true;
        } else {
            return matchListItem.mo10601b().equals(matchListItem2.mo10601b());
        }
    }
}
