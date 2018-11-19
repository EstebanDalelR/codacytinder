package com.tinder.match.p292c;

import com.tinder.data.database.C8643b;
import com.tinder.data.updates.C8811p;
import com.tinder.domain.common.model.Photo.Quality;
import com.tinder.domain.match.model.visitor.MatchAvatarUrlsVisitor;
import com.tinder.domain.match.repository.MatchRepository;
import com.tinder.domain.match.usecase.CountMatches;
import com.tinder.domain.match.usecase.GetMessagesMatches;
import com.tinder.domain.match.usecase.GetNewMatches;
import com.tinder.domain.message.MessageRepository;
import com.tinder.match.qualifiers.PhotoQualityM;
import com.tinder.match.qualifiers.PhotoQualityXL;
import dagger.Module;
import dagger.Provides;

@Module(includes = {C8643b.class, C8811p.class})
/* renamed from: com.tinder.match.c.a */
public class C9850a {
    @Provides
    /* renamed from: a */
    CountMatches m40541a(MatchRepository matchRepository) {
        return new CountMatches(matchRepository);
    }

    @Provides
    /* renamed from: a */
    GetNewMatches m40542a(MatchRepository matchRepository, MessageRepository messageRepository) {
        return new GetNewMatches(matchRepository, messageRepository);
    }

    @Provides
    /* renamed from: b */
    GetMessagesMatches m40544b(MatchRepository matchRepository, MessageRepository messageRepository) {
        return new GetMessagesMatches(matchRepository, messageRepository);
    }

    @PhotoQualityXL
    @Provides
    /* renamed from: a */
    MatchAvatarUrlsVisitor m40540a() {
        return new MatchAvatarUrlsVisitor(Quality.XL);
    }

    @PhotoQualityM
    @Provides
    /* renamed from: b */
    MatchAvatarUrlsVisitor m40543b() {
        return new MatchAvatarUrlsVisitor(Quality.M);
    }
}
