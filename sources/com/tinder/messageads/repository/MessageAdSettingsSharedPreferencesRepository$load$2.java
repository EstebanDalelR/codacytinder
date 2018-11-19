package com.tinder.messageads.repository;

import com.tinder.domain.match.model.MessageAdMatch.Type;
import com.tinder.messageads.model.C9912b.C9911a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/messageads/model/MessageAdMatchSettings$TypeOptInSetting;", "it", "Lcom/tinder/domain/match/model/MessageAdMatch$Type;", "invoke"}, k = 3, mv = {1, 1, 10})
final class MessageAdSettingsSharedPreferencesRepository$load$2 extends Lambda implements Function1<Type, C9911a> {
    /* renamed from: a */
    final /* synthetic */ C12136a f44607a;

    MessageAdSettingsSharedPreferencesRepository$load$2(C12136a c12136a) {
        this.f44607a = c12136a;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m53808a((Type) obj);
    }

    @NotNull
    /* renamed from: a */
    public final C9911a m53808a(@NotNull Type type) {
        C2668g.b(type, "it");
        return new C9911a(type, this.f44607a.f39369a.getBoolean(type.name(), true));
    }
}
