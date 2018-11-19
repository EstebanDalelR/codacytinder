package com.tinder.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConnectionsGroup implements Parcelable, Serializable {
    private static final DegreeComparator COMPARATOR = new DegreeComparator();
    public static final Creator<ConnectionsGroup> CREATOR = new C99201();
    private List<CommonConnection> mCompleteCxns;
    private boolean mIgnoreUnbuilt;
    @NonNull
    private HashMap<String, CommonConnection> mUnbuiltCxns;

    /* renamed from: com.tinder.model.ConnectionsGroup$1 */
    static class C99201 implements Creator<ConnectionsGroup> {
        C99201() {
        }

        public ConnectionsGroup createFromParcel(Parcel parcel) {
            return new ConnectionsGroup(parcel);
        }

        public ConnectionsGroup[] newArray(int i) {
            return new ConnectionsGroup[i];
        }
    }

    private static class DegreeComparator implements Comparator<CommonConnection> {
        private DegreeComparator() {
        }

        public int compare(@NonNull CommonConnection commonConnection, @NonNull CommonConnection commonConnection2) {
            commonConnection = commonConnection.degree;
            commonConnection2 = commonConnection2.degree;
            if (commonConnection > commonConnection2) {
                return 1;
            }
            return commonConnection == commonConnection2 ? null : -1;
        }
    }

    public int describeContents() {
        return 0;
    }

    public ConnectionsGroup(List<CommonConnection> list, @NonNull List<CommonConnection> list2) {
        this.mCompleteCxns = list;
        this.mUnbuiltCxns = new HashMap();
        buildMap(list2);
        sort();
    }

    private void buildMap(@NonNull List<CommonConnection> list) {
        if (list != null) {
            for (CommonConnection commonConnection : list) {
                this.mUnbuiltCxns.put(commonConnection.id, commonConnection);
            }
        }
    }

    @NonNull
    public List<String> getUnbuiltIds() {
        return Arrays.asList(this.mUnbuiltCxns.keySet().toArray(new String[this.mUnbuiltCxns.size()]));
    }

    @NonNull
    public Map<String, CommonConnection> getUnbuiltConnections() {
        return this.mUnbuiltCxns;
    }

    public List<CommonConnection> getCompleteConnections() {
        return this.mCompleteCxns;
    }

    public boolean needsFill() {
        return !this.mIgnoreUnbuilt && this.mUnbuiltCxns.size() > 0;
    }

    public boolean getIgnoreUnresolvableIds() {
        return this.mIgnoreUnbuilt;
    }

    public void setIgnoreUnresolvableIds(boolean z) {
        this.mIgnoreUnbuilt = z;
    }

    public int size() {
        int i = 0;
        int size = this.mUnbuiltCxns == null ? 0 : this.mUnbuiltCxns.size();
        if (this.mCompleteCxns != null) {
            i = this.mCompleteCxns.size();
        }
        return size + i;
    }

    public void fillIn(@NonNull List<CommonConnection> list) {
        for (CommonConnection commonConnection : list) {
            String str = commonConnection.id;
            if (this.mUnbuiltCxns.containsKey(str)) {
                this.mUnbuiltCxns.remove(str);
                this.mCompleteCxns.add(commonConnection);
            }
        }
        sort();
    }

    public int getDegreeCount(int i) {
        int i2;
        if (this.mCompleteCxns != null) {
            i2 = 0;
            for (CommonConnection commonConnection : this.mCompleteCxns) {
                i2 += commonConnection.degree == i ? 1 : 0;
            }
        } else {
            i2 = 0;
        }
        if (!this.mUnbuiltCxns.isEmpty()) {
            for (CommonConnection commonConnection2 : this.mUnbuiltCxns.values()) {
                i2 += commonConnection2.degree == i ? 1 : 0;
            }
        }
        return i2;
    }

    public void sort() {
        if (this.mCompleteCxns != null) {
            Collections.sort(this.mCompleteCxns, COMPARATOR);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.mIgnoreUnbuilt);
        parcel.writeList(this.mCompleteCxns);
        parcel.writeSerializable(this.mUnbuiltCxns);
    }

    protected ConnectionsGroup(Parcel parcel) {
        this.mIgnoreUnbuilt = parcel.readByte() != (byte) 0;
        this.mCompleteCxns = new ArrayList();
        parcel.readList(this.mCompleteCxns, List.class.getClassLoader());
        this.mUnbuiltCxns = (HashMap) parcel.readSerializable();
    }
}
