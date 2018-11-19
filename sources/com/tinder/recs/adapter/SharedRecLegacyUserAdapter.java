package com.tinder.recs.adapter;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.model.PerspectableUser;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.common.model.UserImpl;
import com.tinder.domain.recs.DeepLinkReferralInfo.Builder;
import com.tinder.domain.recs.model.DefaultUserRec;
import com.tinder.domain.recs.model.RecSource;
import com.tinder.domain.recs.model.RecSource.Core;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.domain.utils.AgeCalculator;
import com.tinder.enums.UserPhotoSize;
import com.tinder.model.ProcessedPhoto;
import com.tinder.model.ProfilePhoto;
import com.tinder.model.User;
import com.tinder.profile.adapters.C14367k;
import com.tinder.recs.model.DeepLinkReferralInfo;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C15807n;
import kotlin.collections.C17554o;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/tinder/recs/adapter/SharedRecLegacyUserAdapter;", "", "legacyUserAdapter", "Lcom/tinder/profile/adapters/LegacyUserAdapter;", "ageCalculator", "Lcom/tinder/domain/utils/AgeCalculator;", "(Lcom/tinder/profile/adapters/LegacyUserAdapter;Lcom/tinder/domain/utils/AgeCalculator;)V", "fromDeepLinkReferralInfo", "Lcom/tinder/domain/recs/DeepLinkReferralInfo;", "deepLinkReferralInfo", "Lcom/tinder/recs/model/DeepLinkReferralInfo;", "fromReferrer", "Lcom/tinder/domain/common/model/UserImpl;", "referrer", "Lcom/tinder/model/User;", "fromSharedRec", "Lcom/tinder/domain/recs/model/UserRec;", "user", "getNumberFromString", "", "number", "", "photoListFromProfilePhotoList", "", "Lcom/tinder/domain/common/model/Photo;", "mainPhoto", "Lcom/tinder/model/ProfilePhoto;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class SharedRecLegacyUserAdapter {
    private final AgeCalculator ageCalculator;
    private final C14367k legacyUserAdapter;

    @Inject
    public SharedRecLegacyUserAdapter(@NotNull C14367k c14367k, @NotNull AgeCalculator ageCalculator) {
        C2668g.b(c14367k, "legacyUserAdapter");
        C2668g.b(ageCalculator, "ageCalculator");
        this.legacyUserAdapter = c14367k;
        this.ageCalculator = ageCalculator;
    }

    @NotNull
    public final UserRec fromSharedRec(@NotNull User user, @NotNull DeepLinkReferralInfo deepLinkReferralInfo) {
        User user2 = user;
        DeepLinkReferralInfo deepLinkReferralInfo2 = deepLinkReferralInfo;
        C2668g.b(user2, ManagerWebServices.PARAM_USER);
        C2668g.b(deepLinkReferralInfo2, "deepLinkReferralInfo");
        PerspectableUser a = this.legacyUserAdapter.m54736a(user2);
        String id = user.getId();
        C2668g.a(id, "user.id");
        String name = user.getName();
        C2668g.a(name, "user.name");
        String yearsSinceDate = this.ageCalculator.yearsSinceDate(a.birthDate());
        RecSource recSource = Core.INSTANCE;
        boolean isTinderSelectMember = user.isTinderSelectMember();
        String contentHash = user.getContentHash();
        List a2 = C17554o.m64195a();
        long numberFromString = getNumberFromString(user.getSNumber());
        boolean isAlreadyMatched = user.isAlreadyMatched();
        boolean isBrand = user.isBrand();
        boolean isSuperLike = user.isSuperLike();
        C2668g.a(a, "perspectableUser");
        return new DefaultUserRec(id, recSource, null, a, name, yearsSinceDate, contentHash, numberFromString, isSuperLike, false, false, isBrand, isTinderSelectMember, a2, isAlreadyMatched, false, false, fromDeepLinkReferralInfo(deepLinkReferralInfo2), 4, null);
    }

    private final com.tinder.domain.recs.DeepLinkReferralInfo fromDeepLinkReferralInfo(DeepLinkReferralInfo deepLinkReferralInfo) {
        Builder referralUrl = com.tinder.domain.recs.DeepLinkReferralInfo.builder().activityType(deepLinkReferralInfo.activityType()).from(deepLinkReferralInfo.from()).referralString(deepLinkReferralInfo.referralString()).referralUrl(deepLinkReferralInfo.referralUrl());
        deepLinkReferralInfo = deepLinkReferralInfo.referrer();
        if (deepLinkReferralInfo != null) {
            referralUrl.referrer(fromReferrer(deepLinkReferralInfo));
        }
        deepLinkReferralInfo = referralUrl.build();
        C2668g.a(deepLinkReferralInfo, "builder.build()");
        return deepLinkReferralInfo;
    }

    private final UserImpl fromReferrer(User user) {
        user = UserImpl.builder().id(user.getId()).name(user.getName()).bio(user.getBio()).photos(photoListFromProfilePhotoList(user.getMainPhoto())).birthDate(this.legacyUserAdapter.m54738a(user.getBirthDate())).badges(this.legacyUserAdapter.m54737a(user.getBadges())).gender(this.legacyUserAdapter.m54735a(user.getGender(), user.getCustomGender())).jobs(this.legacyUserAdapter.m54740b(user.getJobs())).schools(this.legacyUserAdapter.m54741c(user.getSchools())).build();
        C2668g.a(user, "UserImpl.builder()\n     …\n                .build()");
        return user;
    }

    private final long getNumberFromString(java.lang.String r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = 0;
        r1 = r4;	 Catch:{ NumberFormatException -> 0x0011 }
        r1 = (java.lang.CharSequence) r1;	 Catch:{ NumberFormatException -> 0x0011 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ NumberFormatException -> 0x0011 }
        if (r1 == 0) goto L_0x000b;	 Catch:{ NumberFormatException -> 0x0011 }
    L_0x000a:
        goto L_0x0027;	 Catch:{ NumberFormatException -> 0x0011 }
    L_0x000b:
        r1 = java.lang.Integer.parseInt(r4);	 Catch:{ NumberFormatException -> 0x0011 }
        r0 = r1;
        goto L_0x0027;
    L_0x0011:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "NumberFormatException: ";
        r1.append(r2);
        r1.append(r4);
        r4 = r1.toString();
        r1 = new java.lang.Object[r0];
        p000a.p001a.C0001a.e(r4, r1);
    L_0x0027:
        r0 = (long) r0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.recs.adapter.SharedRecLegacyUserAdapter.getNumberFromString(java.lang.String):long");
    }

    private final List<Photo> photoListFromProfilePhotoList(ProfilePhoto profilePhoto) {
        if (profilePhoto == null) {
            return C17554o.m64195a();
        }
        ProcessedPhoto processedPhoto = profilePhoto.getProcessedPhoto(UserPhotoSize.SMALL);
        if (processedPhoto != null) {
            return C15807n.m59826a(Photo.builder().id(profilePhoto.getPhotoId()).url(processedPhoto.getImageUrl()).renders(C17554o.m64195a()).videos(C17554o.m64195a()).build());
        }
        return C17554o.m64195a();
    }
}
