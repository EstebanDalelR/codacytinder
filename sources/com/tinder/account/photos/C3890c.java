package com.tinder.account.photos;

import android.support.v7.util.DiffUtil.Callback;
import com.tinder.account.photos.photogrid.C2626d;
import com.tinder.account.photos.photogrid.C3912a;
import com.tinder.account.photos.photogrid.C3913b;
import com.tinder.account.photos.photogrid.C3914c;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/account/photos/PhotoGridDiffCallback;", "Landroid/support/v7/util/DiffUtil$Callback;", "oldItems", "", "Lcom/tinder/account/photos/photogrid/PhotoGridEntry;", "newItems", "(Ljava/util/List;Ljava/util/List;)V", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getChangePayload", "", "getNewListSize", "getOldListSize", "account_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.account.photos.c */
public final class C3890c extends Callback {
    /* renamed from: a */
    private final List<C2626d> f12167a;
    /* renamed from: b */
    private final List<C2626d> f12168b;

    public C3890c(@NotNull List<? extends C2626d> list, @NotNull List<? extends C2626d> list2) {
        C2668g.m10309b(list, "oldItems");
        C2668g.m10309b(list2, "newItems");
        this.f12167a = list;
        this.f12168b = list2;
    }

    public int getOldListSize() {
        return this.f12167a.size();
    }

    public int getNewListSize() {
        return this.f12168b.size();
    }

    public boolean areItemsTheSame(int i, int i2) {
        C2626d c2626d = (C2626d) this.f12167a.get(i);
        i2 = (C2626d) this.f12168b.get(i2);
        Object obj = null;
        if (c2626d instanceof C3912a) {
            C3914c c3914c = (C3914c) (!(i2 instanceof C3914c) ? null : i2);
            C3912a c3912a = (C3912a) c2626d;
            if (C2668g.m10308a(c3914c != null ? c3914c.m14674a() : null, c3912a.m14671a())) {
                return true;
            }
            if (!(i2 instanceof C3912a)) {
                i2 = 0;
            }
            C3912a c3912a2 = (C3912a) i2;
            if (c3912a2 != null) {
                obj = c3912a2.m14671a();
            }
            if (C2668g.m10308a(obj, c3912a.m14671a()) != 0) {
                return true;
            }
            return false;
        } else if (c2626d instanceof C3914c) {
            if (!(i2 instanceof C3914c)) {
                i2 = 0;
            }
            C3914c c3914c2 = (C3914c) i2;
            if (c3914c2 != null) {
                obj = c3914c2.m14675b();
            }
            return C2668g.m10308a(obj, ((C3914c) c2626d).m14675b());
        } else if ((c2626d instanceof C3913b) != 0) {
            return true;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public boolean areContentsTheSame(int i, int i2) {
        return C2668g.m10308a((C2626d) this.f12167a.get(i), (C2626d) this.f12168b.get(i2));
    }

    @Nullable
    public Object getChangePayload(int i, int i2) {
        i = this.f12167a.get(i);
        if (!(i instanceof C3914c)) {
            i = 0;
        }
        C3914c c3914c = (C3914c) i;
        i2 = this.f12168b.get(i2);
        if (!(i2 instanceof C3914c)) {
            i2 = 0;
        }
        C3914c c3914c2 = (C3914c) i2;
        if (c3914c == null) {
            return null;
        }
        if ((C2668g.m10308a(c3914c.m14674a(), c3914c2 != null ? c3914c2.m14674a() : 0) ^ 1) != 0) {
            return "label";
        }
        return null;
    }
}
