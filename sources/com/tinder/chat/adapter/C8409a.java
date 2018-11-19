package com.tinder.chat.adapter;

import com.tinder.chat.view.model.C10642p;
import com.tinder.chat.view.model.C10643r;
import com.tinder.chat.view.model.C10644y;
import com.tinder.chat.view.model.C12747i;
import com.tinder.chat.view.model.C8492a;
import com.tinder.chat.view.model.C8496j;
import com.tinder.chat.view.model.aa;
import com.tinder.chat.view.model.ab;
import com.tinder.chat.view.model.ac;
import com.tinder.chat.view.model.ad;
import com.tinder.chat.view.model.ae;
import com.tinder.chat.view.model.af;
import com.tinder.chat.view.model.aj;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/chat/adapter/ActivityMessageViewTypeResolver;", "", "()V", "resolveViewType", "", "viewModel", "Lcom/tinder/chat/view/model/ActivityMessageViewModel;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.adapter.a */
public final class C8409a {
    /* renamed from: a */
    public final int m35885a(@NotNull C12747i c12747i) {
        C2668g.b(c12747i, "viewModel");
        C8492a a = c12747i.m50169a();
        if (a instanceof C10643r) {
            boolean a2 = C8496j.m36394a((C10643r) c12747i.m50169a());
            return C8410b.f29841a[c12747i.m42902i().ordinal()] != 1 ? a2 ? 18 : 17 : a2 ? 8 : 7;
        } else if (a instanceof C10644y) {
            return C8410b.f29842b[c12747i.m42902i().ordinal()] != 1 ? 14 : 9;
        } else {
            if (a instanceof aj) {
                if (C8410b.f29843c[c12747i.m42902i().ordinal()] == 1) {
                    return 10;
                }
            } else if (a instanceof C10642p) {
                return C8410b.f29844d[c12747i.m42902i().ordinal()] != 1 ? 15 : 11;
            } else if (a instanceof ab) {
                return C8410b.f29845e[c12747i.m42902i().ordinal()] != 1 ? 13 : 12;
            } else if (a instanceof af) {
                if (C8410b.f29846f[c12747i.m42902i().ordinal()] == 1) {
                    return 10;
                }
            } else if (a instanceof aa) {
                return C8410b.f29847g[c12747i.m42902i().ordinal()] != 1 ? 20 : 19;
            } else if (a instanceof ac) {
                return C8410b.f29848h[c12747i.m42902i().ordinal()] != 1 ? 22 : 21;
            } else if (a instanceof ae) {
                return C8410b.f29849i[c12747i.m42902i().ordinal()] != 1 ? 24 : 23;
            } else if (a instanceof ad) {
                return C8410b.f29850j[c12747i.m42902i().ordinal()] != 1 ? 26 : 25;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return 16;
        }
    }
}
