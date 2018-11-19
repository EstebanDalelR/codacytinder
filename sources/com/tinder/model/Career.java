package com.tinder.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import com.tinder.api.ManagerWebServices;
import com.tinder.etl.event.uf.C9286a;
import com.tinder.utils.C15375x;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated
public class Career implements Parcelable {
    public static final Creator<Career> CREATOR = new C99171();
    @SerializedName("jobs")
    @NonNull
    private List<Job> mJobs;
    @SerializedName("schools")
    @NonNull
    private List<School> mSchools;
    @Nullable
    @SerializedName("teaser")
    private Teaser mTeaser;

    /* renamed from: com.tinder.model.Career$1 */
    static class C99171 implements Creator<Career> {
        C99171() {
        }

        public Career createFromParcel(Parcel parcel) {
            return new Career(parcel);
        }

        public Career[] newArray(int i) {
            return new Career[i];
        }
    }

    public static class Builder {
        private final Career mCareer = new Career();

        public Builder teaser(@Nullable Teaser teaser) {
            this.mCareer.mTeaser = teaser;
            return this;
        }

        public Builder jobs(@Nullable List<Job> list) {
            if (list != null) {
                this.mCareer.mJobs = list;
            }
            return this;
        }

        public Builder schools(@Nullable List<School> list) {
            if (list != null) {
                this.mCareer.mSchools = list;
            }
            return this;
        }

        public Career build() {
            return this.mCareer;
        }
    }

    public int describeContents() {
        return 0;
    }

    @Nullable
    public static Career fromJsonObject(@Nullable JSONObject jSONObject) {
        Object[] objArr = null;
        if (jSONObject == null) {
            return null;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(ManagerWebServices.PARAM_TEASER);
        Teaser teaser = optJSONObject != null ? (Teaser) C15375x.a(optJSONObject.toString(), Teaser.class) : null;
        JSONArray optJSONArray = jSONObject.optJSONArray(ManagerWebServices.PARAM_JOBS);
        Object[] objArr2 = optJSONArray != null ? (Job[]) C15375x.a(optJSONArray.toString(), Job[].class) : null;
        jSONObject = jSONObject.optJSONArray(ManagerWebServices.PARAM_SCHOOLS);
        if (jSONObject != null) {
            objArr = (School[]) C15375x.a(jSONObject.toString(), School[].class);
        }
        return new Builder().teaser(teaser).jobs(objArr2 != null ? Arrays.asList(objArr2) : Collections.emptyList()).schools(objArr != null ? Arrays.asList(objArr) : Collections.emptyList()).build();
    }

    @Nullable
    public static String toJson(@Nullable Career career) {
        if (career == null) {
            return null;
        }
        if (career.getJobs().isEmpty() && career.getSchools().isEmpty()) {
            return null;
        }
        return C15375x.a().toJson(career, Career.class);
    }

    public void setJobs(@NonNull List<Job> list) {
        this.mJobs = list;
    }

    public static Career emptyCareer() {
        return new Career();
    }

    private Career() {
        this.mJobs = Collections.emptyList();
        this.mSchools = Collections.emptyList();
    }

    public boolean hasTeaser() {
        return (this.mTeaser == null || this.mTeaser.toString() == null || this.mTeaser.toString().isEmpty()) ? false : true;
    }

    @Nullable
    public Teaser getTeaser() {
        return this.mTeaser;
    }

    @NonNull
    public List<School> getSchools() {
        return this.mSchools;
    }

    @NonNull
    public List<Job> getJobs() {
        return this.mJobs;
    }

    public boolean hasSchools() {
        return this.mSchools.isEmpty() ^ 1;
    }

    public boolean hasJobs() {
        return this.mJobs.isEmpty() ^ 1;
    }

    @Nullable
    @Deprecated
    public Job getMyJob() {
        if (this.mJobs.isEmpty()) {
            return null;
        }
        for (Job job : this.mJobs) {
            Object obj = null;
            Object obj2 = (job.getCompany() == null || !job.getCompany().isDisplayed()) ? null : 1;
            if (job.getTitle() != null && job.getTitle().isDisplayed()) {
                obj = 1;
            }
            if (obj2 == null) {
                if (obj != null) {
                }
            }
            return job;
        }
        return null;
    }

    @Nullable
    public Job getJob() {
        return !this.mJobs.isEmpty() ? (Job) this.mJobs.get(0) : null;
    }

    public boolean hasDisplayedSchool() {
        if (!hasSchools()) {
            return false;
        }
        for (School school : this.mSchools) {
            if (school.isDisplayed) {
                return true;
            }
        }
        return false;
    }

    public void appendAnalyticsInfoViewProfile(C9286a c9286a) {
        if (hasTeaser()) {
            c9286a.m38800e(getTeaser().getType());
            c9286a.m38801f(getTeaser().toString());
        }
    }

    public void appendAnalyticsInfo(SparksEvent sparksEvent) {
        if (hasTeaser()) {
            sparksEvent.put("teaserType", getTeaser().getType());
            sparksEvent.put("teaserValue", getTeaser().toString());
        }
    }

    @Deprecated
    public void setSchools(@NonNull List<School> list) {
        this.mSchools = list;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Career{teaser=");
        stringBuilder.append(this.mTeaser);
        stringBuilder.append(", jobs=");
        stringBuilder.append(this.mJobs);
        stringBuilder.append(", schools=");
        stringBuilder.append(this.mSchools);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
        r3 = this;
        if (r3 != r4) goto L_0x0004;
    L_0x0002:
        r4 = 1;
        return r4;
    L_0x0004:
        r0 = 0;
        if (r4 == 0) goto L_0x003c;
    L_0x0007:
        r1 = r3.getClass();
        r2 = r4.getClass();
        if (r1 == r2) goto L_0x0012;
    L_0x0011:
        goto L_0x003c;
    L_0x0012:
        r4 = (com.tinder.model.Career) r4;
        r1 = r3.mTeaser;
        if (r1 == 0) goto L_0x0023;
    L_0x0018:
        r1 = r3.mTeaser;
        r2 = r4.mTeaser;
        r1 = r1.equals(r2);
        if (r1 != 0) goto L_0x0028;
    L_0x0022:
        goto L_0x0027;
    L_0x0023:
        r1 = r4.mTeaser;
        if (r1 == 0) goto L_0x0028;
    L_0x0027:
        return r0;
    L_0x0028:
        r1 = r3.mJobs;
        r2 = r4.mJobs;
        r1 = r1.equals(r2);
        if (r1 != 0) goto L_0x0033;
    L_0x0032:
        return r0;
    L_0x0033:
        r0 = r3.mSchools;
        r4 = r4.mSchools;
        r4 = r0.equals(r4);
        return r4;
    L_0x003c:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.model.Career.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return ((((this.mTeaser != null ? this.mTeaser.hashCode() : 0) * 31) + this.mJobs.hashCode()) * 31) + this.mSchools.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mTeaser, i);
        parcel.writeTypedList(this.mJobs);
        parcel.writeTypedList(this.mSchools);
    }

    protected Career(Parcel parcel) {
        this.mJobs = Collections.emptyList();
        this.mSchools = Collections.emptyList();
        this.mTeaser = (Teaser) parcel.readParcelable(Teaser.class.getClassLoader());
        this.mJobs = parcel.createTypedArrayList(Job.CREATOR);
        this.mSchools = parcel.createTypedArrayList(School.CREATOR);
    }
}
