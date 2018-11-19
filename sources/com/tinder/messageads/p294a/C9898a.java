package com.tinder.messageads.p294a;

import com.tinder.messageads.model.C9912b;
import com.tinder.messageads.model.C9912b.C9911a;
import com.tinder.messageads.p350g.C12130c;
import com.tinder.messageads.provider.C9913a;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C15829m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\fJ\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0018\u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/tinder/messageads/controller/MessageAdSettingsController;", "", "messageAdSettingsShadowProvider", "Lcom/tinder/messageads/provider/MessageAdSettingsShadowProvider;", "saveMessageAdMatchSettings", "Lcom/tinder/messageads/usecase/SaveMessageAdMatchSettings;", "(Lcom/tinder/messageads/provider/MessageAdSettingsShadowProvider;Lcom/tinder/messageads/usecase/SaveMessageAdMatchSettings;)V", "disableAllMessageAdSettings", "Lcom/tinder/messageads/model/MessageAdMatchSettings;", "messageAdMatchSettings", "enableAllMessageAdSettings", "onAllMessageAdSettingsTurnedOff", "", "onAllMessageAdSettingsTurnedOn", "onTypeSettingChanged", "typeOptInSetting", "Lcom/tinder/messageads/model/MessageAdMatchSettings$TypeOptInSetting;", "saveSettings", "toggleMessageAdMatchSettings", "toggle", "", "updateMessageAdMatchTypeSetting", "message-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.messageads.a.a */
public final class C9898a {
    /* renamed from: a */
    private final C9913a f32743a;
    /* renamed from: b */
    private final C12130c f32744b;

    @Inject
    public C9898a(@NotNull C9913a c9913a, @NotNull C12130c c12130c) {
        C2668g.b(c9913a, "messageAdSettingsShadowProvider");
        C2668g.b(c12130c, "saveMessageAdMatchSettings");
        this.f32743a = c9913a;
        this.f32744b = c12130c;
    }

    /* renamed from: a */
    public final void m40711a() {
        C9912b a = this.f32743a.m40756a();
        if (a != null) {
            this.f32743a.m40757a(m40707a(a));
            return;
        }
        C0001a.d("MessageAdSettingsShadowProvider returned null MessagedMatchSettings on .get()", new Object[0]);
    }

    /* renamed from: b */
    public final void m40713b() {
        C9912b a = this.f32743a.m40756a();
        if (a != null) {
            this.f32743a.m40757a(m40710b(a));
            return;
        }
        C0001a.d("MessageAdSettingsShadowProvider returned null MessagedMatchSettings on .get()", new Object[0]);
    }

    /* renamed from: c */
    public final void m40714c() {
        C9912b a = this.f32743a.m40756a();
        if (a != null) {
            this.f32744b.m48270a(a);
        } else {
            C0001a.d("MessageAdSettingsShadowProvider returned null MessagedMatchSettings on .get()", new Object[0]);
        }
    }

    /* renamed from: a */
    private final C9912b m40707a(C9912b c9912b) {
        return m40709a(c9912b, true);
    }

    /* renamed from: b */
    private final C9912b m40710b(C9912b c9912b) {
        return m40709a(c9912b, false);
    }

    /* renamed from: a */
    private final C9912b m40709a(C9912b c9912b, boolean z) {
        Set linkedHashSet = new LinkedHashSet();
        for (C9911a a : c9912b.m40754b()) {
            linkedHashSet.add(new C9911a(a.m40750a(), z));
        }
        return new C9912b(linkedHashSet);
    }

    /* renamed from: a */
    private final C9912b m40708a(C9912b c9912b, C9911a c9911a) {
        Set q = C19301m.q(c9912b.m40754b());
        Collection collection = q;
        for (Object next : c9912b.m40754b()) {
            Object obj;
            if (((C9911a) next).m40750a() == c9911a.m40750a()) {
                obj = 1;
                continue;
            } else {
                obj = null;
                continue;
            }
            if (obj != null) {
                break;
            }
        }
        Object next2 = null;
        if (collection == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        }
        C15829m.c(collection).remove(next2);
        q.add(c9911a);
        return new C9912b(q);
    }

    /* renamed from: a */
    public final void m40712a(@NotNull C9911a c9911a) {
        C2668g.b(c9911a, "typeOptInSetting");
        C9912b a = this.f32743a.m40756a();
        if (a != null) {
            this.f32743a.m40757a(m40708a(a, c9911a));
            return;
        }
        C0001a.d("MessageAdSettingsShadowProvider returned null MessagedMatchSettings on .get()", new Object[0]);
    }
}
