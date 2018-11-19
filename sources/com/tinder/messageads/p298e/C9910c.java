package com.tinder.messageads.p298e;

import com.tinder.domain.match.model.MessageAdMatch.Type;
import com.tinder.messageads.model.C9912b;
import com.tinder.messageads.model.C9912b.C9911a;
import com.tinder.messageads.provider.C9913a;
import com.tinder.messageads.target.MessageAdSettingsTarget;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Consumer;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0006\u0010\u000f\u001a\u00020\u000eJ\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0002J\r\u0010\u0014\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/tinder/messageads/presenter/MessageAdSettingsPresenter;", "", "shadowProvider", "Lcom/tinder/messageads/provider/MessageAdSettingsShadowProvider;", "(Lcom/tinder/messageads/provider/MessageAdSettingsShadowProvider;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "target", "Lcom/tinder/messageads/target/MessageAdSettingsTarget;", "typeSettingsSortOrder", "", "Lcom/tinder/domain/match/model/MessageAdMatch$Type;", "[Lcom/tinder/domain/match/model/MessageAdMatch$Type;", "clearCompositeDisposable", "", "dropTarget", "handleMessageAdMatchSettings", "messageAdMatchSettings", "Lcom/tinder/messageads/model/MessageAdMatchSettings;", "observeMessageAdSettings", "onConfirmButtonClicked", "()Lkotlin/Unit;", "setTarget", "showMessageAdMatchSettings", "sortedTypeSettings", "", "Lcom/tinder/messageads/model/MessageAdMatchSettings$TypeOptInSetting;", "takeTarget", "message-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.messageads.e.c */
public final class C9910c {
    /* renamed from: a */
    private MessageAdSettingsTarget f32762a;
    /* renamed from: b */
    private final C17356a f32763b = new C17356a();
    /* renamed from: c */
    private final Type[] f32764c = new Type[]{Type.SPONSORED};
    /* renamed from: d */
    private final C9913a f32765d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "messageAdMatchSettings", "Lcom/tinder/messageads/model/MessageAdMatchSettings;", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.messageads.e.c$a */
    static final class C12125a<T> implements Consumer<C9912b> {
        /* renamed from: a */
        final /* synthetic */ C9910c f39347a;

        C12125a(C9910c c9910c) {
            this.f39347a = c9910c;
        }

        public /* synthetic */ void accept(Object obj) {
            m48266a((C9912b) obj);
        }

        /* renamed from: a */
        public final void m48266a(@Nullable C9912b c9912b) {
            if (c9912b != null) {
                this.f39347a.m40742a(c9912b);
            }
        }
    }

    @Inject
    public C9910c(@NotNull C9913a c9913a) {
        C2668g.b(c9913a, "shadowProvider");
        this.f32765d = c9913a;
    }

    /* renamed from: a */
    public final void m40748a(@NotNull MessageAdSettingsTarget messageAdSettingsTarget) {
        C2668g.b(messageAdSettingsTarget, "target");
        this.f32762a = messageAdSettingsTarget;
        m40745c();
    }

    /* renamed from: a */
    public final void m40747a() {
        m40746d();
        this.f32762a = (MessageAdSettingsTarget) null;
    }

    @Nullable
    /* renamed from: b */
    public final C15813i m40749b() {
        MessageAdSettingsTarget messageAdSettingsTarget = this.f32762a;
        if (messageAdSettingsTarget == null) {
            return null;
        }
        messageAdSettingsTarget.exitMessageAdSettings();
        return C15813i.f49016a;
    }

    /* renamed from: c */
    private final void m40745c() {
        this.f32763b.add(this.f32765d.m40758b().subscribeOn(C15756a.b()).observeOn(C15674a.a()).subscribe(new C12125a(this)));
    }

    /* renamed from: d */
    private final void m40746d() {
        this.f32763b.a();
    }

    /* renamed from: a */
    private final void m40742a(C9912b c9912b) {
        MessageAdSettingsTarget messageAdSettingsTarget;
        if (c9912b.m40753a()) {
            messageAdSettingsTarget = this.f32762a;
            if (messageAdSettingsTarget != null) {
                messageAdSettingsTarget.enableAllSettings();
            }
        } else {
            messageAdSettingsTarget = this.f32762a;
            if (messageAdSettingsTarget != null) {
                messageAdSettingsTarget.disableAllSettings();
            }
        }
        m40743b(c9912b);
    }

    /* renamed from: b */
    private final void m40743b(C9912b c9912b) {
        C9912b c9912b2 = new C9912b(m40744c(c9912b));
        c9912b = this.f32762a;
        if (c9912b != null) {
            c9912b.showMessageAdMatchSettings(c9912b2);
        }
    }

    /* renamed from: c */
    private final Set<C9911a> m40744c(C9912b c9912b) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Type a : this.f32764c) {
            linkedHashSet.add(c9912b.m40752a(a));
        }
        return linkedHashSet;
    }
}
