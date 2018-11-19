package com.tinder.toppicks;

import com.tinder.common.function.Mapper;
import com.tinder.toppicks.C15235b.C15231g;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¨\u0006\f"}, d2 = {"Lcom/tinder/toppicks/TopPicksExpirationTimeMapper;", "Lcom/tinder/common/function/Mapper;", "Lcom/tinder/toppicks/TimerContent;", "", "()V", "map", "timerContent", "shouldNotAddHourOffset", "", "hours", "", "minutes", "toppicks_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.d */
public final class C16995d implements Mapper<C15236c, String> {
    /* renamed from: a */
    private final boolean m62760a(int i, int i2) {
        return (i != 1 || i2 >= 1) ? i == 24 : true;
    }

    public /* synthetic */ Object map(Object obj) {
        return m62761a((C15236c) obj);
    }

    @NotNull
    /* renamed from: a */
    public String m62761a(@NotNull C15236c c15236c) {
        C2668g.b(c15236c, "timerContent");
        long b = c15236c.m57301b();
        int i = (int) (b / 3600000);
        int i2 = (int) ((b % 3600000) / 60000);
        c15236c = c15236c.m57299a().getResources();
        if (m62760a(i, i2)) {
            c15236c = c15236c.getQuantityString(C15231g.top_picks_rec_card_hours, i, new Object[]{Integer.valueOf(i)});
            C2668g.a(c15236c, "res.getQuantityString(R.…            hours, hours)");
            return c15236c;
        } else if (i > 0) {
            c15236c = c15236c.getQuantityString(C15231g.top_picks_rec_card_hours, i + 1, new Object[]{Integer.valueOf(i + 1)});
            C2668g.a(c15236c, "res.getQuantityString(R.…SET, hours + HOUR_OFFSET)");
            return c15236c;
        } else if (i2 < 1) {
            c15236c = c15236c.getQuantityString(C15231g.top_picks_rec_card_minutes, 1, new Object[]{Integer.valueOf(1)});
            C2668g.a(c15236c, "res.getQuantityString(R.…s_rec_card_minutes, 1, 1)");
            return c15236c;
        } else {
            c15236c = c15236c.getQuantityString(C15231g.top_picks_rec_card_minutes, i2, new Object[]{Integer.valueOf(i2)});
            C2668g.a(c15236c, "res.getQuantityString(R.…inutes, minutes, minutes)");
            return c15236c;
        }
    }
}
