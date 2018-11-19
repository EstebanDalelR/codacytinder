package com.tinder.messageads.repository;

import com.tinder.domain.match.model.MessageAdMatch.Type;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/match/model/MessageAdMatch$Type;", "invoke"}, k = 3, mv = {1, 1, 10})
final class MessageAdSettingsSharedPreferencesRepository$load$1 extends Lambda implements Function1<Type, Boolean> {
    /* renamed from: a */
    public static final MessageAdSettingsSharedPreferencesRepository$load$1 f44606a = new MessageAdSettingsSharedPreferencesRepository$load$1();

    MessageAdSettingsSharedPreferencesRepository$load$1() {
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(m53807a((Type) obj));
    }

    /* renamed from: a */
    public final boolean m53807a(@NotNull Type type) {
        C2668g.b(type, "it");
        return type == Type.SPONSORED ? true : null;
    }
}
