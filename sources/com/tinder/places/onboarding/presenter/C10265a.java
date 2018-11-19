package com.tinder.places.onboarding.presenter;

import butterknife.internal.C0761c;
import com.tinder.cardstack.model.C8395a;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.domain.common.model.CommonConnection;
import com.tinder.domain.common.model.Gender;
import com.tinder.domain.common.model.Gender.Value;
import com.tinder.domain.common.model.Interest;
import com.tinder.domain.common.model.PerspectableUser;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.common.model.ProfileUser;
import com.tinder.domain.common.model.School;
import com.tinder.domain.places.model.PlacesOnboardingConfig.OnboardingRec;
import com.tinder.domain.profile.model.LocalProfilePhoto;
import com.tinder.domain.recs.model.DefaultUserRec;
import com.tinder.domain.recs.model.PlacesUserRec;
import com.tinder.domain.recs.model.RecSource;
import com.tinder.domain.recs.model.RecSource.Places;
import com.tinder.domain.recs.model.UserRec.Teaser;
import com.tinder.places.onboarding.target.PlacesOnboardingCardTarget;
import com.tinder.recs.RecsCardFactory;
import com.tinder.recs.card.UserRecCard;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/tinder/places/onboarding/presenter/PlacesOnboardingCardPresenter;", "", "cardFactory", "Lcom/tinder/recs/RecsCardFactory;", "(Lcom/tinder/recs/RecsCardFactory;)V", "target", "Lcom/tinder/places/onboarding/target/PlacesOnboardingCardTarget;", "getTarget$Tinder_release", "()Lcom/tinder/places/onboarding/target/PlacesOnboardingCardTarget;", "setTarget$Tinder_release", "(Lcom/tinder/places/onboarding/target/PlacesOnboardingCardTarget;)V", "parseTeasers", "", "Lcom/tinder/domain/recs/model/UserRec$Teaser;", "rec", "Lcom/tinder/domain/places/model/PlacesOnboardingConfig$OnboardingRec;", "setup", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.onboarding.presenter.a */
public final class C10265a {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public PlacesOnboardingCardTarget f33385a;
    /* renamed from: b */
    private final RecsCardFactory f33386b;

    @Inject
    public C10265a(@NotNull RecsCardFactory recsCardFactory) {
        C2668g.b(recsCardFactory, "cardFactory");
        this.f33386b = recsCardFactory;
    }

    /* renamed from: a */
    public final void m41636a(@NotNull OnboardingRec onboardingRec) {
        C2668g.b(onboardingRec, "rec");
        String name = onboardingRec.getName();
        String str = "1";
        Photo createFromProfilePhoto = Photo.createFromProfilePhoto(new LocalProfilePhoto("1", onboardingRec.getImageUrl()));
        PerspectableUser build = PerspectableUser.builder().distanceMiles(5).commmonInterests(C0761c.a(new Interest[0])).commonConnections(C0761c.a(new CommonConnection[0])).profileUser(ProfileUser.builder().id(str).badges(C19301m.a()).bio("Whatever!").birthDate(DateTime.a().c(25)).gender(Gender.create(Value.MALE)).name(name).photos(C0761c.a(new Photo[]{createFromProfilePhoto})).jobs(C19301m.a()).schools(C0761c.a(new School[0])).connectionCount(1).spotifyTopArtists(C19301m.a()).spotifyConnected(false).hideAge(false).hideDistance(true).verified(false).showGenderOnProfile(true).build()).build();
        RecSource places = new Places(0);
        C2668g.a(build, "perspectableUser");
        C8395a createCard = this.f33386b.createCard(new PlacesUserRec(new DefaultUserRec(str, places, null, build, name, "28", "", 0, false, false, false, false, false, m41635b(onboardingRec), false, false, false, null, 131076, null), false, "0"));
        if (createCard == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.recs.card.UserRecCard");
        }
        UserRecCard userRecCard = (UserRecCard) createCard;
        PlacesOnboardingCardTarget placesOnboardingCardTarget = r0.f33385a;
        if (placesOnboardingCardTarget == null) {
            C2668g.b("target");
        }
        placesOnboardingCardTarget.attachRecCard(userRecCard);
    }

    /* renamed from: b */
    private final List<Teaser> m41635b(OnboardingRec onboardingRec) {
        if (onboardingRec.getSchool() != null) {
            onboardingRec = C0761c.a(new Teaser[]{new Teaser(onboardingRec.getSchool(), "school")});
            if (onboardingRec != null) {
                return onboardingRec;
            }
        }
        onboardingRec = C0761c.a(new Teaser[0]);
        C2668g.a(onboardingRec, "listOf()");
        return onboardingRec;
    }
}
