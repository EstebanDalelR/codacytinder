package com.tinder.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.enums.Gender;
import com.tinder.enums.UserPhotoSize;
import com.tinder.utils.DateUtils;
import com.tinder.utils.ad;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Person implements Parcelable, Serializable {
    public static final Creator<Person> CREATOR = new C99291();
    @Nullable
    public List<Badge> badges;
    @Nullable
    public Date birthDate;
    private Career career;
    @Nullable
    public Gender gender;
    public boolean isVerified;
    public final String name;
    private List<ProfilePhoto> profilePhotos;
    public final String userId;
    public String username;

    /* renamed from: com.tinder.model.Person$1 */
    static class C99291 implements Creator<Person> {
        C99291() {
        }

        public Person createFromParcel(Parcel parcel) {
            return new Person(parcel);
        }

        public Person[] newArray(int i) {
            return new Person[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public Person(String str, String str2, @Nullable List<ProfilePhoto> list, @Nullable Gender gender, boolean z, @Nullable List<Badge> list2, String str3, Career career, @Nullable Date date) {
        this.gender = Gender.MALE;
        this.userId = str;
        this.name = str2;
        this.gender = gender;
        this.isVerified = z;
        this.badges = list2;
        this.username = str3;
        this.career = career;
        this.birthDate = date;
        if (list == null) {
            this.profilePhotos = new ArrayList();
        } else {
            this.profilePhotos = list;
        }
    }

    public Person(String str, String str2, @Nullable Gender gender, boolean z, @Nullable List<Badge> list, String str3, Career career, @Nullable Date date) {
        this(str, str2, null, gender, z, list, str3, career, date);
    }

    public String getAvatarUrl(int i, UserPhotoSize userPhotoSize) {
        if (this.profilePhotos.size() > i) {
            ProfilePhoto profilePhoto = (ProfilePhoto) this.profilePhotos.get(i);
            if (profilePhoto != null) {
                i = profilePhoto.getProcessedPhoto(userPhotoSize);
                if (i != 0) {
                    return i.imageUrl;
                }
                ad.b("Couldn't find processed photo at that size");
                return "";
            }
            ad.b("Couldn't find photo at that position");
        } else {
            ad.b("Not enough photos");
        }
        return "";
    }

    @NonNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(id: ");
        stringBuilder.append(this.userId);
        stringBuilder.append(" name: ");
        stringBuilder.append(this.name);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public boolean equals(@Nullable Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                Person person = (Person) obj;
                if (this.userId != null) {
                    if (this.userId.equals(person.userId) == null) {
                    }
                    return z;
                } else if (person.userId == null) {
                    return z;
                }
                z = false;
                return z;
            }
        }
        return false;
    }

    public Career getCareer() {
        return this.career == null ? Career.emptyCareer() : this.career;
    }

    public List<ProfilePhoto> getProfilePhotos() {
        return Collections.unmodifiableList(this.profilePhotos);
    }

    public void addProfilePhoto(ProfilePhoto profilePhoto) {
        this.profilePhotos.add(profilePhoto);
    }

    public void updatePhotos(List<ProfilePhoto> list) {
        this.profilePhotos = new ArrayList(list);
    }

    @Nullable
    public String getAge() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("birthdate null ? ");
        stringBuilder.append(this.birthDate == null);
        ad.a(stringBuilder.toString());
        return this.birthDate != null ? Integer.toString(DateUtils.a(this.birthDate)) : null;
    }

    public int hashCode() {
        return this.userId != null ? this.userId.hashCode() : 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.userId);
        parcel.writeString(this.name);
        parcel.writeInt(this.gender == null ? -1 : this.gender.ordinal());
        parcel.writeTypedList(this.profilePhotos);
        parcel.writeByte(this.isVerified);
        parcel.writeTypedList(this.badges);
        parcel.writeString(this.username);
        parcel.writeParcelable(this.career, i);
        parcel.writeLong(this.birthDate != 0 ? this.birthDate.getTime() : -1);
    }

    protected Person(Parcel parcel) {
        Gender gender;
        this.gender = Gender.MALE;
        this.userId = parcel.readString();
        this.name = parcel.readString();
        int readInt = parcel.readInt();
        Date date = null;
        if (readInt == -1) {
            gender = null;
        } else {
            gender = Gender.values()[readInt];
        }
        this.gender = gender;
        this.profilePhotos = parcel.createTypedArrayList(ProfilePhoto.CREATOR);
        this.isVerified = parcel.readByte() != (byte) 0;
        this.badges = parcel.createTypedArrayList(Badge.CREATOR);
        this.username = parcel.readString();
        this.career = (Career) parcel.readParcelable(Career.class.getClassLoader());
        long readLong = parcel.readLong();
        if (readLong != -1) {
            date = new Date(readLong);
        }
        this.birthDate = date;
    }
}
