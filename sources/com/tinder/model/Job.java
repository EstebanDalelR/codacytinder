package com.tinder.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.tinder.R;

public class Job implements Parcelable {
    public static final Creator<Job> CREATOR = new C99251();
    @SerializedName("company")
    public Company mCompany;
    @SerializedName("title")
    public Title mTitle;

    /* renamed from: com.tinder.model.Job$1 */
    static class C99251 implements Creator<Job> {
        C99251() {
        }

        public Job createFromParcel(Parcel parcel) {
            return new Job(parcel);
        }

        public Job[] newArray(int i) {
            return new Job[i];
        }
    }

    public static class Company implements Parcelable {
        public static final Creator<Company> CREATOR = new C99261();
        @SerializedName("displayed")
        public boolean mDisplayed;
        @SerializedName("id")
        public String mId;
        @SerializedName("name")
        public String mName;

        /* renamed from: com.tinder.model.Job$Company$1 */
        static class C99261 implements Creator<Company> {
            C99261() {
            }

            public Company createFromParcel(Parcel parcel) {
                return new Company(parcel);
            }

            public Company[] newArray(int i) {
                return new Company[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public String getId() {
            return this.mId;
        }

        public String getName() {
            return this.mName;
        }

        public boolean isDisplayed() {
            return this.mDisplayed;
        }

        public void setDisplayed(boolean z) {
            this.mDisplayed = z;
        }

        public void setId(String str) {
            this.mId = str;
        }

        public void setName(String str) {
            this.mName = str;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r5) {
            /*
            r4 = this;
            r0 = 1;
            if (r4 != r5) goto L_0x0004;
        L_0x0003:
            return r0;
        L_0x0004:
            r1 = 0;
            if (r5 == 0) goto L_0x003c;
        L_0x0007:
            r2 = r4.getClass();
            r3 = r5.getClass();
            if (r2 == r3) goto L_0x0012;
        L_0x0011:
            goto L_0x003c;
        L_0x0012:
            r5 = (com.tinder.model.Job.Company) r5;
            r2 = r4.mId;
            if (r2 == 0) goto L_0x0023;
        L_0x0018:
            r2 = r4.mId;
            r3 = r5.mId;
            r2 = r2.equals(r3);
            if (r2 != 0) goto L_0x0028;
        L_0x0022:
            goto L_0x0027;
        L_0x0023:
            r2 = r5.mId;
            if (r2 == 0) goto L_0x0028;
        L_0x0027:
            return r1;
        L_0x0028:
            r2 = r4.mName;
            if (r2 == 0) goto L_0x0035;
        L_0x002c:
            r0 = r4.mName;
            r5 = r5.mName;
            r0 = r0.equals(r5);
            goto L_0x003b;
        L_0x0035:
            r5 = r5.mName;
            if (r5 != 0) goto L_0x003a;
        L_0x0039:
            goto L_0x003b;
        L_0x003a:
            r0 = 0;
        L_0x003b:
            return r0;
        L_0x003c:
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.model.Job.Company.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int i = 0;
            int hashCode = (this.mId != null ? this.mId.hashCode() : 0) * 31;
            if (this.mName != null) {
                i = this.mName.hashCode();
            }
            return hashCode + i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mId);
            parcel.writeString(this.mName);
            parcel.writeByte(this.mDisplayed);
        }

        protected Company(Parcel parcel) {
            this.mId = parcel.readString();
            this.mName = parcel.readString();
            this.mDisplayed = parcel.readByte() != null ? true : null;
        }
    }

    public static class Title implements Parcelable {
        public static final Creator<Title> CREATOR = new C99271();
        @SerializedName("displayed")
        public boolean mDisplayed;
        @SerializedName("id")
        public String mId;
        @SerializedName("name")
        public String mName;

        /* renamed from: com.tinder.model.Job$Title$1 */
        static class C99271 implements Creator<Title> {
            C99271() {
            }

            public Title createFromParcel(Parcel parcel) {
                return new Title(parcel);
            }

            public Title[] newArray(int i) {
                return new Title[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public String getId() {
            return this.mId;
        }

        public String getName() {
            return this.mName;
        }

        public boolean isDisplayed() {
            return this.mDisplayed;
        }

        public void setDisplayed(boolean z) {
            this.mDisplayed = z;
        }

        public void setId(String str) {
            this.mId = str;
        }

        public void setName(String str) {
            this.mName = str;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r5) {
            /*
            r4 = this;
            r0 = 1;
            if (r4 != r5) goto L_0x0004;
        L_0x0003:
            return r0;
        L_0x0004:
            r1 = 0;
            if (r5 == 0) goto L_0x003c;
        L_0x0007:
            r2 = r4.getClass();
            r3 = r5.getClass();
            if (r2 == r3) goto L_0x0012;
        L_0x0011:
            goto L_0x003c;
        L_0x0012:
            r5 = (com.tinder.model.Job.Title) r5;
            r2 = r4.mId;
            if (r2 == 0) goto L_0x0023;
        L_0x0018:
            r2 = r4.mId;
            r3 = r5.mId;
            r2 = r2.equals(r3);
            if (r2 != 0) goto L_0x0028;
        L_0x0022:
            goto L_0x0027;
        L_0x0023:
            r2 = r5.mId;
            if (r2 == 0) goto L_0x0028;
        L_0x0027:
            return r1;
        L_0x0028:
            r2 = r4.mName;
            if (r2 == 0) goto L_0x0035;
        L_0x002c:
            r0 = r4.mName;
            r5 = r5.mName;
            r0 = r0.equals(r5);
            goto L_0x003b;
        L_0x0035:
            r5 = r5.mName;
            if (r5 != 0) goto L_0x003a;
        L_0x0039:
            goto L_0x003b;
        L_0x003a:
            r0 = 0;
        L_0x003b:
            return r0;
        L_0x003c:
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.model.Job.Title.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int i = 0;
            int hashCode = (this.mId != null ? this.mId.hashCode() : 0) * 31;
            if (this.mName != null) {
                i = this.mName.hashCode();
            }
            return hashCode + i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mId);
            parcel.writeString(this.mName);
            parcel.writeByte(this.mDisplayed);
        }

        protected Title(Parcel parcel) {
            this.mId = parcel.readString();
            this.mName = parcel.readString();
            this.mDisplayed = parcel.readByte() != null ? true : null;
        }
    }

    public int describeContents() {
        return 0;
    }

    public Company getCompany() {
        return this.mCompany;
    }

    public Title getTitle() {
        return this.mTitle;
    }

    public void setCompany(Company company) {
        this.mCompany = company;
    }

    public void setTitle(Title title) {
        this.mTitle = title;
    }

    @Nullable
    @Deprecated
    public Spanned getSpanned(Context context) {
        if (hasTitle() && hasCompany()) {
            return Html.fromHtml(context.getString(R.string.job_at, new Object[]{this.mTitle.getName(), this.mCompany.getName()}).trim());
        } else if (hasTitle() != null) {
            return Html.fromHtml(this.mTitle.getName().trim());
        } else {
            return hasCompany() != null ? Html.fromHtml(this.mCompany.getName().trim()) : null;
        }
    }

    @Nullable
    @Deprecated
    public Spanned getSpannedStrict(Context context) {
        Object obj = (this.mTitle == null || !this.mTitle.isDisplayed()) ? null : 1;
        Object obj2 = (this.mCompany == null || !this.mCompany.isDisplayed()) ? null : 1;
        if (hasTitle() && obj != null && hasCompany() && obj2 != null) {
            return Html.fromHtml(context.getString(R.string.job_at, new Object[]{this.mTitle.getName(), this.mCompany.getName()}).trim());
        } else if (hasTitle() == null || obj == null) {
            return (hasCompany() == null || obj2 == null) ? null : Html.fromHtml(this.mCompany.getName().trim());
        } else {
            return Html.fromHtml(this.mTitle.getName().trim());
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r4 != r5) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = 0;
        if (r5 == 0) goto L_0x003c;
    L_0x0007:
        r2 = r4.getClass();
        r3 = r5.getClass();
        if (r2 == r3) goto L_0x0012;
    L_0x0011:
        goto L_0x003c;
    L_0x0012:
        r5 = (com.tinder.model.Job) r5;
        r2 = r4.mCompany;
        if (r2 == 0) goto L_0x0023;
    L_0x0018:
        r2 = r4.mCompany;
        r3 = r5.mCompany;
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x0028;
    L_0x0022:
        goto L_0x0027;
    L_0x0023:
        r2 = r5.mCompany;
        if (r2 == 0) goto L_0x0028;
    L_0x0027:
        return r1;
    L_0x0028:
        r2 = r4.mTitle;
        if (r2 == 0) goto L_0x0035;
    L_0x002c:
        r0 = r4.mTitle;
        r5 = r5.mTitle;
        r0 = r0.equals(r5);
        goto L_0x003b;
    L_0x0035:
        r5 = r5.mTitle;
        if (r5 != 0) goto L_0x003a;
    L_0x0039:
        goto L_0x003b;
    L_0x003a:
        r0 = 0;
    L_0x003b:
        return r0;
    L_0x003c:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.model.Job.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (this.mCompany != null ? this.mCompany.hashCode() : 0) * 31;
        if (this.mTitle != null) {
            i = this.mTitle.hashCode();
        }
        return hashCode + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mCompany, i);
        parcel.writeParcelable(this.mTitle, i);
    }

    private boolean hasCompany() {
        return (this.mCompany == null || TextUtils.isEmpty(this.mCompany.getName())) ? false : true;
    }

    private boolean hasTitle() {
        return (this.mTitle == null || TextUtils.isEmpty(this.mTitle.getName())) ? false : true;
    }

    protected Job(Parcel parcel) {
        this.mCompany = (Company) parcel.readParcelable(Company.class.getClassLoader());
        this.mTitle = (Title) parcel.readParcelable(Title.class.getClassLoader());
    }
}
