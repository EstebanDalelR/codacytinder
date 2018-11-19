package com.tinder.data.profile;

import com.tinder.api.model.profile.Notification;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "", "it", "Lcom/tinder/api/model/profile/Notification;", "invoke"}, k = 3, mv = {1, 1, 10})
final class ProfileClient$get$4$3 extends Lambda implements Function1<List<? extends Notification>, List<? extends String>> {
    /* renamed from: a */
    public static final ProfileClient$get$4$3 f43959a = new ProfileClient$get$4$3();

    ProfileClient$get$4$3() {
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m53410a((List) obj);
    }

    @NotNull
    /* renamed from: a */
    public final List<String> m53410a(@NotNull List<? extends Notification> list) {
        C2668g.b(list, "it");
        return C19301m.a();
    }
}
