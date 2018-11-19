package com.tinder.webprofile.activity;

import com.tinder.webprofile.C15478a.C15472b;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "inputText", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class WebProfileUsernameActivity$setClickListeners$2 extends Lambda implements Function1<String, C15813i> {
    /* renamed from: a */
    final /* synthetic */ WebProfileUsernameActivity f58777a;

    WebProfileUsernameActivity$setClickListeners$2(WebProfileUsernameActivity webProfileUsernameActivity) {
        this.f58777a = webProfileUsernameActivity;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        m67538a((String) obj);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m67538a(@NotNull String str) {
        C2668g.b(str, "inputText");
        WebProfileUsernameActivity.m68623b(this.f58777a).setImageResource(C15472b.transparent);
        this.f58777a.m68630a().m57968b(str);
    }
}
