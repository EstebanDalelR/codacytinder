package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.exoplayer2.C2005C;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2314v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public final class DrmInitData implements Parcelable, Comparator<SchemeData> {
    public static final Creator<DrmInitData> CREATOR = new C20491();
    private int hashCode;
    public final int schemeDataCount;
    private final SchemeData[] schemeDatas;
    @Nullable
    public final String schemeType;

    /* renamed from: com.google.android.exoplayer2.drm.DrmInitData$1 */
    static class C20491 implements Creator<DrmInitData> {
        C20491() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m7362a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m7363a(i);
        }

        /* renamed from: a */
        public DrmInitData m7362a(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        /* renamed from: a */
        public DrmInitData[] m7363a(int i) {
            return new DrmInitData[i];
        }
    }

    public static final class SchemeData implements Parcelable {
        public static final Creator<SchemeData> CREATOR = new C20501();
        public final byte[] data;
        private int hashCode;
        public final String mimeType;
        public final boolean requiresSecureDecryption;
        private final UUID uuid;

        /* renamed from: com.google.android.exoplayer2.drm.DrmInitData$SchemeData$1 */
        static class C20501 implements Creator<SchemeData> {
            C20501() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m7364a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m7365a(i);
            }

            /* renamed from: a */
            public SchemeData m7364a(Parcel parcel) {
                return new SchemeData(parcel);
            }

            /* renamed from: a */
            public SchemeData[] m7365a(int i) {
                return new SchemeData[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public SchemeData(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, false);
        }

        public SchemeData(UUID uuid, String str, byte[] bArr, boolean z) {
            this.uuid = (UUID) C2289a.m8309a((Object) uuid);
            this.mimeType = (String) C2289a.m8309a((Object) str);
            this.data = bArr;
            this.requiresSecureDecryption = z;
        }

        SchemeData(Parcel parcel) {
            this.uuid = new UUID(parcel.readLong(), parcel.readLong());
            this.mimeType = parcel.readString();
            this.data = parcel.createByteArray();
            this.requiresSecureDecryption = parcel.readByte() != null ? true : null;
        }

        public boolean matches(UUID uuid) {
            if (!C2005C.f5444b.equals(this.uuid)) {
                if (uuid.equals(this.uuid) == null) {
                    return null;
                }
            }
            return true;
        }

        public boolean canReplace(SchemeData schemeData) {
            return (!hasData() || schemeData.hasData() || matches(schemeData.uuid) == null) ? null : true;
        }

        public boolean hasData() {
            return this.data != null;
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            boolean z = true;
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            if (!this.mimeType.equals(schemeData.mimeType) || !C2314v.m8480a(this.uuid, schemeData.uuid) || Arrays.equals(this.data, schemeData.data) == null) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            if (this.hashCode == 0) {
                this.hashCode = (((this.uuid.hashCode() * 31) + this.mimeType.hashCode()) * 31) + Arrays.hashCode(this.data);
            }
            return this.hashCode;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.uuid.getMostSignificantBits());
            parcel.writeLong(this.uuid.getLeastSignificantBits());
            parcel.writeString(this.mimeType);
            parcel.writeByteArray(this.data);
            parcel.writeByte((byte) this.requiresSecureDecryption);
        }
    }

    public int describeContents() {
        return 0;
    }

    @Nullable
    public static DrmInitData createSessionCreationData(@Nullable DrmInitData drmInitData, @Nullable DrmInitData drmInitData2) {
        String str;
        List arrayList = new ArrayList();
        if (drmInitData != null) {
            str = drmInitData.schemeType;
            for (SchemeData schemeData : drmInitData.schemeDatas) {
                if (schemeData.hasData()) {
                    arrayList.add(schemeData);
                }
            }
        } else {
            str = null;
        }
        if (drmInitData2 != null) {
            if (str == null) {
                str = drmInitData2.schemeType;
            }
            drmInitData = arrayList.size();
            for (SchemeData schemeData2 : drmInitData2.schemeDatas) {
                if (schemeData2.hasData() && !containsSchemeDataWithUuid(arrayList, drmInitData, schemeData2.uuid)) {
                    arrayList.add(schemeData2);
                }
            }
        }
        if (arrayList.isEmpty() != null) {
            return null;
        }
        return new DrmInitData(str, arrayList);
    }

    public DrmInitData(List<SchemeData> list) {
        this(null, false, (SchemeData[]) list.toArray(new SchemeData[list.size()]));
    }

    public DrmInitData(String str, List<SchemeData> list) {
        this(str, false, (SchemeData[]) list.toArray(new SchemeData[list.size()]));
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this(null, schemeDataArr);
    }

    public DrmInitData(@Nullable String str, SchemeData... schemeDataArr) {
        this(str, true, schemeDataArr);
    }

    private DrmInitData(@Nullable String str, boolean z, SchemeData... schemeDataArr) {
        this.schemeType = str;
        if (z) {
            schemeDataArr = (SchemeData[]) schemeDataArr.clone();
        }
        Arrays.sort(schemeDataArr, this);
        this.schemeDatas = schemeDataArr;
        this.schemeDataCount = schemeDataArr.length;
    }

    DrmInitData(Parcel parcel) {
        this.schemeType = parcel.readString();
        this.schemeDatas = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        this.schemeDataCount = this.schemeDatas.length;
    }

    @Deprecated
    public SchemeData get(UUID uuid) {
        for (SchemeData schemeData : this.schemeDatas) {
            if (schemeData.matches(uuid)) {
                return schemeData;
            }
        }
        return null;
    }

    public SchemeData get(int i) {
        return this.schemeDatas[i];
    }

    public DrmInitData copyWithSchemeType(@Nullable String str) {
        if (C2314v.m8480a(this.schemeType, (Object) str)) {
            return this;
        }
        return new DrmInitData(str, false, this.schemeDatas);
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = ((this.schemeType == null ? 0 : this.schemeType.hashCode()) * 31) + Arrays.hashCode(this.schemeDatas);
        }
        return this.hashCode;
    }

    public boolean equals(@Nullable Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                DrmInitData drmInitData = (DrmInitData) obj;
                if (!C2314v.m8480a(this.schemeType, drmInitData.schemeType) || Arrays.equals(this.schemeDatas, drmInitData.schemeDatas) == null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int compare(SchemeData schemeData, SchemeData schemeData2) {
        if (C2005C.f5444b.equals(schemeData.uuid)) {
            return C2005C.f5444b.equals(schemeData2.uuid) != null ? null : 1;
        } else {
            return schemeData.uuid.compareTo(schemeData2.uuid);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.schemeType);
        parcel.writeTypedArray(this.schemeDatas, 0);
    }

    private static boolean containsSchemeDataWithUuid(ArrayList<SchemeData> arrayList, int i, UUID uuid) {
        for (int i2 = 0; i2 < i; i2++) {
            if (((SchemeData) arrayList.get(i2)).uuid.equals(uuid)) {
                return true;
            }
        }
        return false;
    }
}
