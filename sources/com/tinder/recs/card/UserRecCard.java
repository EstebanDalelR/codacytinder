package com.tinder.recs.card;

import android.support.annotation.ColorRes;
import android.support.annotation.NonNull;
import com.tinder.R;
import com.tinder.cardstack.model.C8395a;
import com.tinder.common.p077b.C2641a;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.domain.recs.model.UserRec.Teaser;
import com.tinder.profile.model.Profile.C14418b;
import com.tinder.recs.RecsPhotoUrlFactory;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java8.util.stream.Collectors;
import java8.util.stream.StreamSupport;

public class UserRecCard extends C8395a<UserRec> {
    private static final String EMPTY_PHOTO_URL = "";
    @NonNull
    private final CardSizeProvider cardSizeProvider;
    @NonNull
    private final RecsPhotoUrlFactory photoUrlFactory;
    @NonNull
    private final C14418b profileFactory;
    @NonNull
    private final UserRec userRec;

    public UserRecCard(@NonNull UserRec userRec, @NonNull RecsPhotoUrlFactory recsPhotoUrlFactory, @NonNull CardSizeProvider cardSizeProvider, @NonNull C14418b c14418b) {
        super(userRec.getId(), userRec);
        this.userRec = userRec;
        this.photoUrlFactory = recsPhotoUrlFactory;
        this.cardSizeProvider = cardSizeProvider;
        this.profileFactory = c14418b;
    }

    @NonNull
    public List<Teaser> teasers() {
        Collection teasers = this.userRec.getTeasers();
        if (C2641a.a(teasers)) {
            return Collections.emptyList();
        }
        if (teasers.size() == 1) {
            return Collections.singletonList(teasers.get(0));
        }
        return Collections.unmodifiableList((List) StreamSupport.m59708a(teasers).limit(2).collect(Collectors.m59434a()));
    }

    @NonNull
    public String name() {
        return this.userRec.getUser().name();
    }

    public boolean showAge() {
        return this.userRec.getUser().profileUser().hideAge() ^ 1;
    }

    @NonNull
    public String age() {
        return this.profileFactory.m54934a(this.userRec.getUser().birthDate(), this.userRec.getUser().profileUser().hideAge());
    }

    public boolean isVerified() {
        return this.userRec.getUser().profileUser().verified();
    }

    public void notifySizeUpdate(int i, int i2) {
        this.cardSizeProvider.updateSize(i, i2);
    }

    @NonNull
    public String photoUrlForSize(int i, int i2, int i3) {
        List photos = this.userRec.getUser().photos();
        if (i > photos.size() - 1) {
            return "";
        }
        return this.photoUrlFactory.createUrl((Photo) photos.get(i), i2, i3);
    }

    @ColorRes
    public int gradientColor() {
        return this.userRec.isSuperLike() ? R.color.rec_edgeless_bottom_gradient_superlike : R.color.rec_edgeless_bottom_gradient_default;
    }

    @NonNull
    public UserRec userRec() {
        return this.userRec;
    }
}
