package com.tinder.reactions.p382a.p383a;

import com.squareup.sqlbrite.BriteDatabase;
import com.tinder.chat.injection.scope.ChatActivityScope;
import com.tinder.data.database.DBv2;
import com.tinder.data.reactions.C10986b;
import com.tinder.data.reactions.C10987c;
import com.tinder.data.reactions.StrikeReactionStore;
import com.tinder.domain.reactions.repository.StrikeReactionRepository;
import dagger.Module;
import dagger.Provides;

@Module
/* renamed from: com.tinder.reactions.a.a.a */
public class C14578a {
    @ChatActivityScope
    @Provides
    /* renamed from: a */
    StrikeReactionRepository m55619a(StrikeReactionStore strikeReactionStore) {
        return new C10986b(strikeReactionStore);
    }

    @ChatActivityScope
    @Provides
    /* renamed from: a */
    StrikeReactionStore m55618a(@DBv2 BriteDatabase briteDatabase) {
        return new C10987c(briteDatabase);
    }
}
