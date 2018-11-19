package com.tinder.messageads.provider;

import com.tinder.messageads.model.C9912b;
import com.tinder.messageads.p350g.C12127a;
import io.reactivex.C3959e;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.C15756a;
import io.reactivex.subjects.C19040a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u0004\u0018\u00010\u0007J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007R2\u0010\u0005\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/messageads/provider/MessageAdSettingsShadowProvider;", "", "loadMessageAdMatchSettings", "Lcom/tinder/messageads/usecase/LoadMessageAdMatchSettings;", "(Lcom/tinder/messageads/usecase/LoadMessageAdMatchSettings;)V", "messageAdMatchSettingsBehaviorSubject", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/tinder/messageads/model/MessageAdMatchSettings;", "kotlin.jvm.PlatformType", "get", "observe", "Lio/reactivex/Observable;", "update", "", "newMessageAdMatchSettings", "message-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.messageads.provider.a */
public final class C9913a {
    /* renamed from: a */
    private final C19040a<C9912b> f32769a = C19040a.a();

    @Inject
    public C9913a(@NotNull C12127a c12127a) {
        C2668g.b(c12127a, "loadMessageAdMatchSettings");
        c12127a = c12127a.execute().b(C15756a.b());
        Consumer c121321 = new Consumer<C9912b>() {
            public /* synthetic */ void accept(Object obj) {
                m48279a((C9912b) obj);
            }

            /* renamed from: a */
            public final void m48279a(C9912b c9912b) {
                this.f32769a.onNext(c9912b);
            }
        };
        Function1 function1 = MessageAdSettingsShadowProvider$2.f45324a;
        if (function1 != null) {
            function1 = new C12133b(function1);
        }
        c12127a.a(c121321, (Consumer) function1);
    }

    @Nullable
    /* renamed from: a */
    public final C9912b m40756a() {
        C19040a c19040a = this.f32769a;
        C2668g.a(c19040a, "messageAdMatchSettingsBehaviorSubject");
        return (C9912b) c19040a.b();
    }

    /* renamed from: a */
    public final void m40757a(@NotNull C9912b c9912b) {
        C2668g.b(c9912b, "newMessageAdMatchSettings");
        if ((C2668g.a(c9912b, m40756a()) ^ 1) != 0) {
            this.f32769a.onNext(c9912b);
        }
    }

    @NotNull
    /* renamed from: b */
    public final C3959e<C9912b> m40758b() {
        C3959e<C9912b> hide = this.f32769a.hide();
        C2668g.a(hide, "messageAdMatchSettingsBehaviorSubject.hide()");
        return hide;
    }
}
