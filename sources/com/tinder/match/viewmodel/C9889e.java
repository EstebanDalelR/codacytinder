package com.tinder.match.viewmodel;

import android.content.res.Resources;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.model.visitor.MatchAvatarUrlsVisitor;
import com.tinder.domain.match.model.visitor.MatchNameVisitor;
import com.tinder.domain.message.ActivityMessage;
import com.tinder.domain.message.GifMessage;
import com.tinder.domain.message.ImageMessage;
import com.tinder.domain.message.Message;
import com.tinder.domain.message.ReactionMessage;
import com.tinder.domain.message.SystemMessage;
import com.tinder.domain.message.TextMessage;
import com.tinder.match.qualifiers.PhotoQualityM;
import com.tinder.match.viewmodel.C12102k.C12101a;
import com.tinder.match.viewmodel.MatchListItemViewModel.Builder;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ \u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/tinder/match/viewmodel/MatchListViewModelFactory;", "", "resources", "Landroid/content/res/Resources;", "matchAvatarUrlsVisitor", "Lcom/tinder/domain/match/model/visitor/MatchAvatarUrlsVisitor;", "matchNameVisitor", "Lcom/tinder/domain/match/model/visitor/MatchNameVisitor;", "(Landroid/content/res/Resources;Lcom/tinder/domain/match/model/visitor/MatchAvatarUrlsVisitor;Lcom/tinder/domain/match/model/visitor/MatchNameVisitor;)V", "configureFieldsForMatch", "", "builder", "Lcom/tinder/match/viewmodel/MatchListItemViewModel$Builder;", "match", "Lcom/tinder/domain/match/model/Match;", "createMatchMessage", "Lcom/tinder/match/viewmodel/MatchMessageViewModel;", "message", "Lcom/tinder/domain/message/Message;", "createNewMatch", "Lcom/tinder/match/viewmodel/NewMatchViewModel;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.match.viewmodel.e */
public final class C9889e {
    /* renamed from: a */
    private final Resources f32724a;
    /* renamed from: b */
    private final MatchAvatarUrlsVisitor f32725b;
    /* renamed from: c */
    private final MatchNameVisitor f32726c;

    @Inject
    public C9889e(@NotNull Resources resources, @NotNull @PhotoQualityM MatchAvatarUrlsVisitor matchAvatarUrlsVisitor, @NotNull MatchNameVisitor matchNameVisitor) {
        C2668g.b(resources, "resources");
        C2668g.b(matchAvatarUrlsVisitor, "matchAvatarUrlsVisitor");
        C2668g.b(matchNameVisitor, "matchNameVisitor");
        this.f32724a = resources;
        this.f32725b = matchAvatarUrlsVisitor;
        this.f32726c = matchNameVisitor;
    }

    @NotNull
    /* renamed from: a */
    public final C12099h m40690a(@NotNull Match match, @NotNull Message message) {
        String a;
        C2668g.b(match, "match");
        C2668g.b(message, "message");
        boolean a2 = C9890f.m40703b(message, match);
        if (message instanceof TextMessage) {
            a = C9890f.m40702b((TextMessage) message, a2, this.f32724a);
        } else if (message instanceof GifMessage) {
            a = C9890f.m40699b((GifMessage) message, a2, this.f32724a);
        } else if (message instanceof ReactionMessage) {
            a = C9890f.m40701b((ReactionMessage) message, a2, this.f32724a);
        } else if (message instanceof ActivityMessage) {
            a = C9890f.m40698b((ActivityMessage) message, a2, this.f32724a);
        } else if (message instanceof ImageMessage) {
            a = C9890f.m40700b((ImageMessage) message, a2, this.f32724a);
        } else if (message instanceof SystemMessage) {
            a = message.getText();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        message = C12099h.m48213j().mo11183c(a).mo11184c(a2);
        C2668g.a(message, "this");
        m40689a((Builder) message, match);
        match = message.mo11182a();
        C2668g.a(match, "MatchMessageViewModel.bu…\n                .build()");
        return match;
    }

    @NotNull
    /* renamed from: a */
    public final C12102k m40691a(@NotNull Match match) {
        C2668g.b(match, "match");
        C12101a h = C12102k.m48217h();
        C2668g.a(h, "this");
        m40689a((Builder) h, match);
        match = h.mo11201a();
        C2668g.a(match, "NewMatchViewModel.builde…ch(this, match) }.build()");
        return match;
    }

    /* renamed from: a */
    private final void m40689a(Builder<?, ?> builder, Match match) {
        builder.id(match.getId()).name((String) match.accept(this.f32726c)).imageUrls((List) match.accept(this.f32725b)).matchAttribution(match.getAttribution()).hasInteractedWithView(match.getTouched()).isMuted(match.getMuted()).match(match);
    }
}
