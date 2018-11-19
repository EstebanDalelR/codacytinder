package com.tinder.model;

import android.content.Context;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.ColorInt;
import android.support.annotation.Nullable;
import android.support.v4.content.C0432b;
import com.google.gson.Gson;
import com.tinder.R;
import com.tinder.utils.ad;

@Deprecated
public class Badge implements Parcelable {
    public static final Creator<Badge> CREATOR = new C99161();
    @ColorInt
    public int color = -1;
    @Nullable
    public String colorString;
    @Nullable
    public String description;
    @Nullable
    public String type;

    /* renamed from: com.tinder.model.Badge$1 */
    static class C99161 implements Creator<Badge> {
        C99161() {
        }

        public Badge createFromParcel(Parcel parcel) {
            return new Badge(parcel);
        }

        public Badge[] newArray(int i) {
            return new Badge[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public Badge(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.type = str;
        this.description = str2;
        this.colorString = str3;
        if (str3 != null) {
            try {
                this.color = Color.parseColor(str3);
            } catch (String str4) {
                ad.a("Failed to parse badge color", str4);
            }
        }
    }

    @ColorInt
    public int getColor(Context context) {
        if (this.color == -1) {
            return C0432b.c(context, R.color.premium_blue);
        }
        return this.color;
    }

    public String toString() {
        return new Gson().toJson(this);
    }

    protected Badge(Parcel parcel) {
        this.type = parcel.readString();
        this.description = parcel.readString();
        this.color = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeString(this.description);
        parcel.writeInt(this.color);
    }
}
