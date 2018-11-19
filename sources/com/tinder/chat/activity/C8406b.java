package com.tinder.chat.activity;

import android.content.Context;
import android.content.Intent;
import com.tinder.analytics.chat.Origin;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.match.model.CoreMatch;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.model.MessageAdMatch;
import com.tinder.domain.match.model.PlacesMatch;
import com.tinder.itsamatch.ItsAMatchDialogModel.Attribution;
import com.tinder.messageads.activity.AdMessageChatActivity;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19303i;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eJ&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J \u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0002J.\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\f\b\u0002\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/tinder/chat/activity/ChatIntentFactory;", "", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "(Lcom/tinder/core/experiment/AbTestUtility;)V", "createChatIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "origin", "Lcom/tinder/analytics/chat/Origin;", "match", "Lcom/tinder/domain/match/model/Match;", "matchId", "", "attribution", "Lcom/tinder/itsamatch/ItsAMatchDialogModel$Attribution;", "newIntent", "chatActivityClass", "Ljava/lang/Class;", "trimMatchIdToPreventOverflowAttack", "id", "verifyNonBlankMatchId", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.activity.b */
public final class C8406b {
    /* renamed from: a */
    private final AbTestUtility f29837a;

    @Inject
    public C8406b(@NotNull AbTestUtility abTestUtility) {
        C2668g.b(abTestUtility, "abTestUtility");
        this.f29837a = abTestUtility;
    }

    @NotNull
    /* renamed from: a */
    public final Intent m35881a(@NotNull Context context, @NotNull Origin origin, @NotNull String str) {
        C2668g.b(context, "context");
        C2668g.b(origin, "origin");
        C2668g.b(str, "matchId");
        m35877a(str);
        if (this.f29837a.isBitmojiEnabled()) {
            return m35876a(context, origin, str, BitmojiChatActivity.class);
        }
        if (this.f29837a.isGrandGesturesEnabled()) {
            return m35876a(context, origin, str, GrandGestureChatActivity.class);
        }
        return m35878b(context, origin, str);
    }

    @NotNull
    /* renamed from: a */
    public final Intent m35880a(@NotNull Context context, @NotNull Origin origin, @NotNull Match match) {
        C2668g.b(context, "context");
        C2668g.b(origin, "origin");
        C2668g.b(match, "match");
        String id = match.getId();
        m35877a(id);
        if (match instanceof MessageAdMatch) {
            return m35876a(context, origin, id, AdMessageChatActivity.class);
        }
        if (match instanceof CoreMatch) {
            return m35881a(context, origin, id);
        }
        if ((match instanceof PlacesMatch) != null) {
            return m35881a(context, origin, id);
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    /* renamed from: a */
    public final Intent m35882a(@NotNull Context context, @NotNull Origin origin, @NotNull String str, @NotNull Attribution attribution) {
        C2668g.b(context, "context");
        C2668g.b(origin, "origin");
        C2668g.b(str, "matchId");
        C2668g.b(attribution, "attribution");
        m35877a(str);
        if (C8407c.f29838a[attribution.ordinal()] != 1) {
            return m35881a(context, origin, str);
        }
        return m35876a(context, origin, str, AdMessageChatActivity.class);
    }

    /* renamed from: a */
    private final void m35877a(String str) {
        if ((C19303i.a(str) ^ 1) == 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Match id cannot be blank: matchId = \"");
            stringBuilder.append(str);
            stringBuilder.append('\"');
            throw new IllegalArgumentException(stringBuilder.toString().toString());
        }
    }

    /* renamed from: b */
    private final Intent m35878b(Context context, Origin origin, String str) {
        return m35876a(context, origin, str, ChatActivity.class);
    }

    /* renamed from: a */
    private final Intent m35876a(Context context, Origin origin, String str, Class<?> cls) {
        Intent intent = new Intent(context, cls);
        intent.putExtra("match_id", m35879b(str));
        intent.putExtra("origin", origin);
        return intent;
    }

    /* renamed from: b */
    private final String m35879b(String str) {
        if (str.length() < 50) {
            return str;
        }
        if (str == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        str = str.substring(0, 49);
        C2668g.a(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return str;
    }
}
