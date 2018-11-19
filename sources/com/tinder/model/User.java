package com.tinder.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.tinder.domain.boost.model.BoostStatus;
import com.tinder.enums.Gender;
import com.tinder.enums.UserPhotoSize;
import com.tinder.goingout.model.GoingOut;
import com.tinder.interfaces.VerifiedBadgeModel;
import com.tinder.managers.ManagerProfile;
import com.tinder.spotify.model.Artist;
import com.tinder.spotify.model.SearchTrack;
import com.tinder.utils.DateUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class User implements Parcelable, VerifiedBadgeModel, Serializable {
    public static final Creator<User> CREATOR = new User$1();
    @Nullable
    private String mAge;
    private int mAgeFilterMax;
    private int mAgeFilterMin;
    private boolean mAgeVerificationRequired;
    @Nullable
    private List<Badge> mBadges;
    private String mBio;
    @Nullable
    private Date mBirthDate;
    private String mBlend;
    private BoostStatus mBoostStatus;
    private Career mCareer;
    private List<String> mCommonFriends;
    private List<Interest> mCommonInterests;
    private List<String> mCommonLikes;
    private ConnectionsGroup mConnections;
    private String mContentHash;
    private String mCreateDate;
    private String mCustomGender;
    private String mDiscoverability;
    private boolean mDiscoverable;
    private int mDistanceFilter;
    private int mDistanceMiles;
    private String mFacebookId;
    private Gender mGender;
    private boolean mGenderVerificationRequired;
    private GoingOut mGoingOut;
    private boolean mHideAds;
    private boolean mHideAge;
    private boolean mHideDistance;
    private String mId;
    private InstagramDataSet mInstagramDataSet;
    private List<Gender> mInterestedIn;
    private boolean mIsAllowedToAddGroup;
    private boolean mIsAlreadyMatched;
    private boolean mIsBrand;
    private boolean mIsNewUser;
    private boolean mIsPhotoOptimizerEnabled;
    private boolean mIsPhotoProcessing;
    private boolean mIsPlaceholder;
    private boolean mIsRecAndPassporting;
    private boolean mIsSpotifyConnected;
    private boolean mIsSuperlike;
    private boolean mIsTinderSelectMember;
    private boolean mIsVerified;
    private String mLastActivityDate;
    private String mName;
    private String mNearByLocationName;
    @Nullable
    private String mNearByLocationProximity;
    private int mNumConnections;
    private String mPhoneNumber;
    @Nullable
    private String mPingLocationName;
    private Date mPingTime;
    @Nullable
    private List<ProfilePhoto> mProfilePhotos;
    private String mSNumber;
    private boolean mShowGenderOnProfile;
    private String mSpotifyLastUpdated;
    @Nullable
    private SearchTrack mSpotifyThemeTrack;
    @Nullable
    private List<Artist> mSpotifyTopArtists;
    private String mSpotifyUserName;
    private String mSpotifyUserType;
    private int mTravelDistanceMiles;
    @Nullable
    private String mTravelLocationName;
    private List<Interest> mUncommonInterests;
    private String mUsername;

    public int describeContents() {
        return 0;
    }

    public User(String str, @Nullable Date date, String str2, String str3, Date date2, int i, String str4, @NonNull Gender gender, List<Gender> list, @NonNull List<ProfilePhoto> list2, String str5, boolean z, boolean z2, boolean z3, @Nullable List<Badge> list3, String str6, Career career, boolean z4, boolean z5, boolean z6, boolean z7, @Nullable SearchTrack searchTrack, @Nullable List<Artist> list4) {
        this.mLastActivityDate = "";
        this.mIsSpotifyConnected = false;
        this.mShowGenderOnProfile = false;
        this.mBio = str;
        this.mBirthDate = date;
        this.mId = str2;
        this.mName = str3;
        this.mPingTime = date2;
        this.mDistanceMiles = i;
        this.mFacebookId = str4;
        this.mGender = gender;
        this.mInterestedIn = list;
        this.mProfilePhotos = list2;
        this.mLastActivityDate = str5;
        this.mIsVerified = z;
        this.mBadges = list3;
        this.mIsSuperlike = z2;
        this.mIsBrand = z3;
        this.mUsername = str6;
        this.mCareer = career;
        this.mIsPlaceholder = z4;
        this.mIsAlreadyMatched = z5;
        this.mIsPhotoProcessing = z6;
        this.mIsNewUser = z7;
        this.mSpotifyThemeTrack = searchTrack;
        this.mSpotifyTopArtists = list4;
    }

    public User(String str, String str2, @Nullable Date date, String str3, Date date2, Gender gender, List<String> list, List<String> list2, int i, @Nullable List<ProfilePhoto> list3, String str4, String str5, @Nullable String str6, boolean z, boolean z2, boolean z3, @Nullable List<Badge> list4, String str7, Career career, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, @Nullable String str8, @Nullable SearchTrack searchTrack, @Nullable List<Artist> list5) {
        this.mLastActivityDate = "";
        this.mIsSpotifyConnected = false;
        this.mShowGenderOnProfile = false;
        this.mBio = str2;
        this.mBirthDate = date;
        this.mId = str3;
        this.mPingTime = date2;
        this.mGender = gender;
        this.mName = str;
        this.mCommonFriends = list;
        this.mCommonLikes = list2;
        this.mDistanceMiles = i;
        this.mLastActivityDate = str4;
        this.mProfilePhotos = list3;
        this.mNearByLocationName = str5;
        this.mNearByLocationProximity = str6;
        this.mIsVerified = z;
        this.mBadges = list4;
        this.mIsSuperlike = z2;
        this.mIsBrand = z3;
        this.mUsername = str7;
        this.mCareer = career;
        this.mIsPlaceholder = z4;
        this.mIsAlreadyMatched = z5;
        this.mIsPhotoProcessing = z6;
        this.mIsPhotoOptimizerEnabled = z7;
        this.mIsNewUser = z8;
        this.mContentHash = str8;
        this.mSpotifyThemeTrack = searchTrack;
        this.mSpotifyTopArtists = list5;
    }

    public User() {
        this.mLastActivityDate = "";
        this.mIsSpotifyConnected = false;
        this.mShowGenderOnProfile = false;
        this.mCommonInterests = new ArrayList(0);
        this.mUncommonInterests = new ArrayList(0);
        this.mCareer = Career.emptyCareer();
    }

    protected User(Parcel parcel) {
        Date date;
        Gender gender;
        this.mLastActivityDate = "";
        boolean z = false;
        this.mIsSpotifyConnected = false;
        this.mShowGenderOnProfile = false;
        this.mBio = parcel.readString();
        this.mId = parcel.readString();
        long readLong = parcel.readLong();
        Date date2 = null;
        if (readLong == -1) {
            date = null;
        } else {
            date = new Date(readLong);
        }
        this.mPingTime = date;
        this.mDistanceMiles = parcel.readInt();
        this.mTravelDistanceMiles = parcel.readInt();
        int readInt = parcel.readInt();
        if (readInt == -1) {
            gender = null;
        } else {
            gender = Gender.values()[readInt];
        }
        this.mGender = gender;
        this.mCommonFriends = parcel.createStringArrayList();
        this.mCommonLikes = parcel.createStringArrayList();
        this.mName = parcel.readString();
        this.mFacebookId = parcel.readString();
        this.mLastActivityDate = parcel.readString();
        readLong = parcel.readLong();
        if (readLong != -1) {
            date2 = new Date(readLong);
        }
        this.mBirthDate = date2;
        this.mInterestedIn = new ArrayList();
        Object arrayList = new ArrayList();
        parcel.readList(arrayList, List.class.getClassLoader());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.mInterestedIn.add(Gender.values()[((Integer) it.next()).intValue()]);
        }
        this.mProfilePhotos = parcel.createTypedArrayList(ProfilePhoto.CREATOR);
        this.mIsRecAndPassporting = parcel.readByte() != (byte) 0;
        this.mTravelLocationName = parcel.readString();
        this.mPingLocationName = parcel.readString();
        this.mNearByLocationName = parcel.readString();
        this.mNearByLocationProximity = parcel.readString();
        this.mCommonInterests = parcel.createTypedArrayList(Interest.CREATOR);
        this.mUncommonInterests = parcel.createTypedArrayList(Interest.CREATOR);
        this.mConnections = (ConnectionsGroup) parcel.readSerializable();
        this.mInstagramDataSet = (InstagramDataSet) parcel.readSerializable();
        this.mNumConnections = parcel.readInt();
        this.mIsVerified = parcel.readByte() != (byte) 0;
        this.mIsSuperlike = parcel.readByte() != (byte) 0;
        this.mIsBrand = parcel.readByte() != (byte) 0;
        this.mBadges = parcel.createTypedArrayList(Badge.CREATOR);
        this.mUsername = parcel.readString();
        this.mCareer = (Career) parcel.readParcelable(Career.class.getClassLoader());
        this.mIsPlaceholder = parcel.readInt() == 1;
        this.mIsAlreadyMatched = parcel.readInt() == 1;
        this.mIsNewUser = parcel.readInt() == 1;
        this.mContentHash = parcel.readString();
        this.mHideAge = parcel.readInt() == 1;
        this.mHideDistance = parcel.readInt() == 1;
        this.mSpotifyUserName = parcel.readString();
        this.mSpotifyThemeTrack = (SearchTrack) parcel.readParcelable(SearchTrack.class.getClassLoader());
        this.mIsSpotifyConnected = parcel.readInt() == 1;
        this.mSpotifyLastUpdated = parcel.readString();
        this.mSpotifyTopArtists = parcel.createTypedArrayList(Artist.CREATOR);
        this.mSNumber = parcel.readString();
        this.mContentHash = parcel.readString();
        this.mIsTinderSelectMember = parcel.readByte() != (byte) 0;
        this.mGoingOut = (GoingOut) parcel.readParcelable(GoingOut.class.getClassLoader());
        this.mDistanceFilter = parcel.readInt();
        this.mIsAllowedToAddGroup = parcel.readInt() == 1;
        this.mBlend = ManagerProfile.m10071b(parcel.readString());
        this.mDiscoverable = parcel.readInt() == 1;
        this.mAgeFilterMin = parcel.readInt();
        this.mAgeFilterMax = parcel.readInt();
        this.mCreateDate = parcel.readString();
        this.mDiscoverability = ManagerProfile.m10074c(parcel.readString());
        this.mHideAds = parcel.readInt() == 1;
        this.mAgeVerificationRequired = parcel.readInt() == 1;
        this.mGenderVerificationRequired = parcel.readInt() == 1;
        if (parcel.readInt() == 1) {
            z = true;
        }
        this.mIsPhotoOptimizerEnabled = z;
    }

    public User(String str, String str2, Gender gender, Date date, int i, String str3, boolean z, Date date2) {
        this.mLastActivityDate = "";
        this.mIsSpotifyConnected = false;
        this.mShowGenderOnProfile = false;
        this.mId = str;
        this.mBio = str2;
        this.mGender = gender;
        this.mBirthDate = date;
        this.mNumConnections = i;
        this.mName = str3;
        this.mIsVerified = z;
        this.mPingTime = date2;
    }

    public String getPhoneNumber() {
        return this.mPhoneNumber == null ? "" : this.mPhoneNumber;
    }

    public void setPhoneNumber(String str) {
        this.mPhoneNumber = str;
    }

    public String getUsername() {
        return this.mUsername == null ? "" : this.mUsername;
    }

    public void setUsername(String str) {
        this.mUsername = str;
    }

    @Nullable
    public List<Artist> getSpotifyTopArtists() {
        return this.mSpotifyTopArtists != null ? this.mSpotifyTopArtists : Collections.emptyList();
    }

    public boolean isSpotifyConnected() {
        return this.mIsSpotifyConnected;
    }

    public String getSpotifyLastUpdatedAt() {
        return this.mSpotifyLastUpdated;
    }

    public void setSpotifyLastUpdated(String str) {
        this.mSpotifyLastUpdated = str;
    }

    public void setIsSpotifyConnected(boolean z) {
        this.mIsSpotifyConnected = z;
    }

    public String getSpotifyUserType() {
        return this.mSpotifyUserType;
    }

    public void setSpotifyUserType(String str) {
        this.mSpotifyUserType = str;
    }

    public void setSpotifyUserName(String str) {
        this.mSpotifyUserName = str;
    }

    public String getSpotifyUserName() {
        return this.mSpotifyUserName;
    }

    @Nullable
    public SearchTrack getSpotifyThemeTrack() {
        return this.mSpotifyThemeTrack;
    }

    public boolean hasSpotifyAnthemConnected() {
        return (this.mSpotifyThemeTrack == null || TextUtils.isEmpty(this.mSpotifyThemeTrack.getName())) ? false : true;
    }

    @Nullable
    public List<Badge> getBadges() {
        return this.mBadges;
    }

    public void setBadges(List<Badge> list) {
        this.mBadges = list;
    }

    public void setCareer(Career career) {
        this.mCareer = career;
    }

    @Nullable
    public Badge getFirstBadge() {
        return (this.mBadges == null || this.mBadges.isEmpty()) ? null : (Badge) this.mBadges.get(0);
    }

    @Nullable
    public ConnectionsGroup getConnections() {
        return this.mConnections;
    }

    public void setConnections(ConnectionsGroup connectionsGroup) {
        this.mConnections = connectionsGroup;
    }

    public int getNumConnections() {
        return Math.max(this.mNumConnections, this.mConnections == null ? 0 : this.mConnections.size());
    }

    public void setNumConnections(int i) {
        this.mNumConnections = i;
    }

    public List<Interest> getCommonInterests() {
        return this.mCommonInterests != null ? this.mCommonInterests : Collections.EMPTY_LIST;
    }

    public void setCommonInterests(List<Interest> list) {
        this.mCommonInterests = list;
    }

    public int getNumCommonInterests() {
        return this.mCommonInterests == null ? 0 : this.mCommonInterests.size();
    }

    public List<Interest> getUncommonInterests() {
        return this.mUncommonInterests != null ? this.mUncommonInterests : Collections.EMPTY_LIST;
    }

    public void setUncommonInterests(List<Interest> list) {
        this.mUncommonInterests = list;
    }

    public boolean isRecAndPassporting() {
        return this.mIsRecAndPassporting;
    }

    public void setRecAndPassporting(boolean z) {
        this.mIsRecAndPassporting = z;
    }

    public String getBio() {
        if (this.mBio == null) {
            return "";
        }
        return this.mBio;
    }

    @Nullable
    public Date getBirthDate() {
        return this.mBirthDate;
    }

    public int getDistanceMiles() {
        return this.mDistanceMiles;
    }

    public Gender getGender() {
        return this.mGender;
    }

    public void updateGender(Gender gender) {
        this.mGender = gender;
    }

    public String getId() {
        return this.mId;
    }

    public String getName() {
        return this.mName;
    }

    public void setName(String str) {
        this.mName = str;
    }

    @NonNull
    public List<ProfilePhoto> getPhotos() {
        if (this.mProfilePhotos == null) {
            return Collections.emptyList();
        }
        return this.mProfilePhotos;
    }

    public void setPhotos(List<ProfilePhoto> list) {
        this.mProfilePhotos = list;
    }

    public int getPhotoCount() {
        if (this.mProfilePhotos == null) {
            return 0;
        }
        return this.mProfilePhotos.size();
    }

    public List<InstagramPhoto> getInstagramPhotos() {
        if (this.mInstagramDataSet != null) {
            return this.mInstagramDataSet.photos;
        }
        return Collections.emptyList();
    }

    public InstagramDataSet getInstagramDataSet() {
        return this.mInstagramDataSet;
    }

    public void setInstagramDataSet(InstagramDataSet instagramDataSet) {
        this.mInstagramDataSet = instagramDataSet;
    }

    public Date getPingTime() {
        return this.mPingTime;
    }

    public int getCommonFriendCount() {
        return this.mCommonFriends == null ? 0 : this.mCommonFriends.size();
    }

    public int getCommonLikeCount() {
        return this.mCommonLikes == null ? 0 : this.mCommonLikes.size();
    }

    public boolean isInterestedInMales() {
        if (this.mInterestedIn == null) {
            return false;
        }
        for (Gender equals : this.mInterestedIn) {
            if (equals.equals(Gender.MALE)) {
                return true;
            }
        }
        return false;
    }

    public boolean isInterestedInFemales() {
        if (this.mInterestedIn == null) {
            return false;
        }
        for (Gender equals : this.mInterestedIn) {
            if (equals.equals(Gender.FEMALE)) {
                return true;
            }
        }
        return false;
    }

    public int getSeekGender() {
        if (isInterestedInMales() && isInterestedInFemales()) {
            return -1;
        }
        return isInterestedInMales() ? 0 : 1;
    }

    public int getAgeInt() {
        if (this.mBirthDate == null) {
            return 0;
        }
        return DateUtils.a(this.mBirthDate);
    }

    @Nullable
    public String getAge() {
        if (this.mAge == null && this.mBirthDate != null) {
            this.mAge = Integer.toString(DateUtils.a(this.mBirthDate));
        }
        return this.mAge;
    }

    public String getLastActivityDate() {
        return this.mLastActivityDate;
    }

    @NonNull
    public List<String> getOtherPhotoIds(String str) {
        List arrayList = new ArrayList();
        if (this.mProfilePhotos == null) {
            return Collections.emptyList();
        }
        for (int i = 0; i < this.mProfilePhotos.size(); i++) {
            if (!((ProfilePhoto) this.mProfilePhotos.get(i)).getPhotoId().equals(str)) {
                arrayList.add(((ProfilePhoto) this.mProfilePhotos.get(i)).getPhotoId());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public boolean isPlaceholder() {
        return this.mIsPlaceholder;
    }

    public void setInterestedIn(List<Gender> list) {
        this.mInterestedIn = list;
    }

    public boolean hasPhotos() {
        return this.mProfilePhotos != null && this.mProfilePhotos.size() > 0;
    }

    public String getThumbnailUrl() {
        ProfilePhoto mainPhoto = getMainPhoto();
        if (mainPhoto == null) {
            return "";
        }
        ProcessedPhoto processedPhoto = mainPhoto.getProcessedPhoto(UserPhotoSize.SMALL);
        if (processedPhoto == null) {
            return "";
        }
        return processedPhoto.imageUrl;
    }

    @Nullable
    public ProfilePhoto getMainPhoto() {
        return hasPhotos() ? (ProfilePhoto) this.mProfilePhotos.get(0) : null;
    }

    public boolean isPhotoProcessing() {
        return this.mIsPhotoProcessing;
    }

    public void setIsPhotoProcessing(boolean z) {
        this.mIsPhotoProcessing = z;
    }

    public boolean isPhotoOptimizerEnabled() {
        return this.mIsPhotoOptimizerEnabled;
    }

    public void setSpotifyTopArtists(List<Artist> list) {
        this.mSpotifyTopArtists = list;
    }

    public void setSpotifyThemeTrack(SearchTrack searchTrack) {
        this.mSpotifyThemeTrack = searchTrack;
    }

    public boolean isNewUser() {
        return this.mIsNewUser;
    }

    public boolean equals(Object obj) {
        return obj instanceof User ? ((User) obj).getId().equals(this.mId) : null;
    }

    @Deprecated
    @NonNull
    public Career getCareer() {
        return this.mCareer == null ? Career.emptyCareer() : this.mCareer;
    }

    @NonNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ID: ");
        stringBuilder.append(this.mId);
        stringBuilder.append(" Name: ");
        stringBuilder.append(this.mName);
        String stringBuilder2 = stringBuilder.toString();
        if (this.mProfilePhotos == null) {
            return stringBuilder2;
        }
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append(" Num Photos: ");
        stringBuilder3.append(this.mProfilePhotos.size());
        return stringBuilder3.toString();
    }

    public boolean isVerified() {
        return this.mIsVerified;
    }

    public boolean hasBadge() {
        return getFirstBadge() != null;
    }

    public boolean isSuperLike() {
        return this.mIsSuperlike;
    }

    public void setIsSuperLike(boolean z) {
        this.mIsSuperlike = z;
    }

    public boolean isBrand() {
        return this.mIsBrand;
    }

    public void setHideAge(boolean z) {
        this.mHideAge = z;
    }

    public boolean getHideAge() {
        return this.mHideAge;
    }

    public void setHideDistance(boolean z) {
        this.mHideDistance = z;
    }

    public boolean getHideDistance() {
        return this.mHideDistance;
    }

    public String getSNumber() {
        if (this.mSNumber != null) {
            if (!this.mSNumber.isEmpty()) {
                return this.mSNumber;
            }
        }
        return "";
    }

    public void setSNumber(String str) {
        this.mSNumber = str;
    }

    public boolean hasDifferentPhotos(@NonNull List<ProfilePhoto> list) {
        int i;
        String photoId;
        if (this.mProfilePhotos != null) {
            if (!this.mProfilePhotos.isEmpty()) {
                i = 0;
                if (i == 0 && list.isEmpty()) {
                    return false;
                }
                if ((i ^ list.isEmpty()) == 0 || this.mProfilePhotos.size() != list.size()) {
                    return true;
                }
                i = 0;
                while (i < list.size()) {
                    photoId = ((ProfilePhoto) list.get(i)).getPhotoId();
                    if (photoId == null && !photoId.equalsIgnoreCase(((ProfilePhoto) this.mProfilePhotos.get(i)).getPhotoId())) {
                        return true;
                    }
                    i++;
                }
                return false;
            }
        }
        i = 1;
        if (i == 0) {
        }
        if ((i ^ list.isEmpty()) == 0) {
            return true;
        }
        i = 0;
        while (i < list.size()) {
            photoId = ((ProfilePhoto) list.get(i)).getPhotoId();
            if (photoId == null) {
            }
            i++;
        }
        return false;
    }

    public void setIsTinderSelectMember(boolean z) {
        this.mIsTinderSelectMember = z;
    }

    public boolean isTinderSelectMember() {
        return this.mIsTinderSelectMember;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mBio);
        parcel.writeString(this.mId);
        long j = -1;
        parcel.writeLong(this.mPingTime != 0 ? this.mPingTime.getTime() : -1);
        parcel.writeInt(this.mDistanceMiles);
        parcel.writeInt(this.mTravelDistanceMiles);
        parcel.writeInt(this.mGender == 0 ? -1 : this.mGender.ordinal());
        parcel.writeStringList(this.mCommonFriends);
        parcel.writeStringList(this.mCommonLikes);
        parcel.writeString(this.mName);
        parcel.writeString(this.mFacebookId);
        parcel.writeString(this.mLastActivityDate);
        if (this.mBirthDate != 0) {
            j = this.mBirthDate.getTime();
        }
        parcel.writeLong(j);
        i = new ArrayList();
        if (this.mInterestedIn != null) {
            for (Gender ordinal : this.mInterestedIn) {
                i.add(Integer.valueOf(ordinal.ordinal()));
            }
        }
        parcel.writeList(i);
        parcel.writeTypedList(this.mProfilePhotos);
        parcel.writeByte(this.mIsRecAndPassporting);
        parcel.writeString(this.mTravelLocationName);
        parcel.writeString(this.mPingLocationName);
        parcel.writeString(this.mNearByLocationName);
        parcel.writeString(this.mNearByLocationProximity);
        parcel.writeTypedList(this.mCommonInterests);
        parcel.writeTypedList(this.mUncommonInterests);
        parcel.writeSerializable(this.mConnections);
        parcel.writeSerializable(this.mInstagramDataSet);
        parcel.writeInt(this.mNumConnections);
        parcel.writeByte(this.mIsVerified);
        parcel.writeByte(this.mIsSuperlike);
        parcel.writeByte(this.mIsBrand);
        parcel.writeTypedList(this.mBadges);
        parcel.writeString(this.mUsername);
        parcel.writeParcelable(this.mCareer, 0);
        parcel.writeInt(this.mIsPlaceholder);
        parcel.writeInt(this.mIsAlreadyMatched);
        parcel.writeInt(this.mIsNewUser);
        parcel.writeString(this.mContentHash);
        parcel.writeInt(this.mHideAge);
        parcel.writeInt(this.mHideDistance);
        parcel.writeString(this.mSpotifyUserName);
        parcel.writeParcelable(this.mSpotifyThemeTrack, 0);
        parcel.writeInt(this.mIsSpotifyConnected);
        parcel.writeString(this.mSpotifyLastUpdated);
        parcel.writeTypedList(this.mSpotifyTopArtists);
        parcel.writeString(this.mSNumber);
        parcel.writeString(this.mContentHash);
        parcel.writeByte(this.mIsTinderSelectMember);
        parcel.writeParcelable(this.mGoingOut, 0);
        parcel.writeInt(this.mDistanceFilter);
        parcel.writeInt(this.mIsAllowedToAddGroup);
        parcel.writeString(this.mBlend);
        parcel.writeInt(this.mDiscoverable);
        parcel.writeInt(this.mAgeFilterMin);
        parcel.writeInt(this.mAgeFilterMax);
        parcel.writeString(this.mCreateDate);
        parcel.writeString(this.mDiscoverability);
        parcel.writeInt(this.mHideAds);
        parcel.writeInt(this.mAgeVerificationRequired);
        parcel.writeInt(this.mGenderVerificationRequired);
        parcel.writeInt(this.mIsPhotoOptimizerEnabled);
    }

    public boolean isAlreadyMatched() {
        return this.mIsAlreadyMatched;
    }

    public String getContentHash() {
        return this.mContentHash;
    }

    public void setContentHash(String str) {
        this.mContentHash = str;
    }

    public BoostStatus getBoostStatus() {
        return this.mBoostStatus;
    }

    public void setBoostStatus(BoostStatus boostStatus) {
        this.mBoostStatus = boostStatus;
    }

    public void setShowGenderOnProfile(boolean z) {
        this.mShowGenderOnProfile = z;
    }

    public boolean getShowGenderOnProfile() {
        return this.mShowGenderOnProfile;
    }

    public void setGoingOut(@Nullable GoingOut goingOut) {
        this.mGoingOut = goingOut;
    }

    @Nullable
    public GoingOut getGoingOut() {
        return this.mGoingOut;
    }

    public int getDistanceFilter() {
        return this.mDistanceFilter;
    }

    public void setDistanceFilter(int i) {
        this.mDistanceFilter = i;
    }

    public String getBlend() {
        return this.mBlend;
    }

    public void setBlend(String str) {
        this.mBlend = str;
    }

    public boolean isDiscoverable() {
        return this.mDiscoverable;
    }

    public void setDiscoverable(boolean z) {
        this.mDiscoverable = z;
    }

    public int getAgeFilterMin() {
        return this.mAgeFilterMin;
    }

    public void setAgeFilterMin(int i) {
        this.mAgeFilterMin = i;
    }

    public int getAgeFilterMax() {
        return this.mAgeFilterMax;
    }

    public void setAgeFilterMax(int i) {
        this.mAgeFilterMax = i;
    }

    public String getCreateDate() {
        return this.mCreateDate;
    }

    public void setCreateDate(String str) {
        this.mCreateDate = str;
    }

    public String getDiscoverability() {
        return this.mDiscoverability;
    }

    public void setDiscoverability(String str) {
        this.mDiscoverability = str;
    }

    public boolean isHideAds() {
        return this.mHideAds;
    }

    public void setHideAds(boolean z) {
        this.mHideAds = z;
    }

    public boolean isAgeVerificationRequired() {
        return this.mAgeVerificationRequired;
    }

    public void setAgeVerificationRequired(boolean z) {
        this.mAgeVerificationRequired = z;
    }

    public void setGenderVerificationRequired(boolean z) {
        this.mGenderVerificationRequired = z;
    }

    @NonNull
    public List<Job> getJobs() {
        return getCareer().getJobs();
    }

    @NonNull
    public List<School> getSchools() {
        return getCareer().getSchools();
    }

    public void setCustomGender(@Nullable String str) {
        this.mCustomGender = str;
    }

    @Nullable
    public String getCustomGender() {
        return this.mCustomGender;
    }
}
