package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.app.C2826c.C0388a;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

final class BackStackState implements Parcelable {
    public static final Creator<BackStackState> CREATOR = new C03651();
    final int mBreadCrumbShortTitleRes;
    final CharSequence mBreadCrumbShortTitleText;
    final int mBreadCrumbTitleRes;
    final CharSequence mBreadCrumbTitleText;
    final int mIndex;
    final String mName;
    final int[] mOps;
    final boolean mReorderingAllowed;
    final ArrayList<String> mSharedElementSourceNames;
    final ArrayList<String> mSharedElementTargetNames;
    final int mTransition;
    final int mTransitionStyle;

    /* renamed from: android.support.v4.app.BackStackState$1 */
    static class C03651 implements Creator<BackStackState> {
        C03651() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m1312a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m1313a(i);
        }

        /* renamed from: a */
        public BackStackState m1312a(Parcel parcel) {
            return new BackStackState(parcel);
        }

        /* renamed from: a */
        public BackStackState[] m1313a(int i) {
            return new BackStackState[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public BackStackState(C2826c c2826c) {
        int size = c2826c.f8934b.size();
        this.mOps = new int[(size * 6)];
        if (c2826c.f8941i) {
            int i = 0;
            int i2 = 0;
            while (i < size) {
                C0388a c0388a = (C0388a) c2826c.f8934b.get(i);
                int i3 = i2 + 1;
                this.mOps[i2] = c0388a.f1316a;
                int i4 = i3 + 1;
                this.mOps[i3] = c0388a.f1317b != null ? c0388a.f1317b.mIndex : -1;
                i3 = i4 + 1;
                this.mOps[i4] = c0388a.f1318c;
                i4 = i3 + 1;
                this.mOps[i3] = c0388a.f1319d;
                i3 = i4 + 1;
                this.mOps[i4] = c0388a.f1320e;
                i4 = i3 + 1;
                this.mOps[i3] = c0388a.f1321f;
                i++;
                i2 = i4;
            }
            this.mTransition = c2826c.f8939g;
            this.mTransitionStyle = c2826c.f8940h;
            this.mName = c2826c.f8943k;
            this.mIndex = c2826c.f8945m;
            this.mBreadCrumbTitleRes = c2826c.f8946n;
            this.mBreadCrumbTitleText = c2826c.f8947o;
            this.mBreadCrumbShortTitleRes = c2826c.f8948p;
            this.mBreadCrumbShortTitleText = c2826c.f8949q;
            this.mSharedElementSourceNames = c2826c.f8950r;
            this.mSharedElementTargetNames = c2826c.f8951s;
            this.mReorderingAllowed = c2826c.f8952t;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public BackStackState(Parcel parcel) {
        this.mOps = parcel.createIntArray();
        this.mTransition = parcel.readInt();
        this.mTransitionStyle = parcel.readInt();
        this.mName = parcel.readString();
        this.mIndex = parcel.readInt();
        this.mBreadCrumbTitleRes = parcel.readInt();
        this.mBreadCrumbTitleText = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.mBreadCrumbShortTitleRes = parcel.readInt();
        this.mBreadCrumbShortTitleText = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.mSharedElementSourceNames = parcel.createStringArrayList();
        this.mSharedElementTargetNames = parcel.createStringArrayList();
        this.mReorderingAllowed = parcel.readInt() != null ? true : null;
    }

    public C2826c instantiate(C2832k c2832k) {
        C2826c c2826c = new C2826c(c2832k);
        int i = 0;
        int i2 = 0;
        while (i < this.mOps.length) {
            C0388a c0388a = new C0388a();
            int i3 = i + 1;
            c0388a.f1316a = this.mOps[i];
            if (C2832k.f8974a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Instantiate ");
                stringBuilder.append(c2826c);
                stringBuilder.append(" op #");
                stringBuilder.append(i2);
                stringBuilder.append(" base fragment #");
                stringBuilder.append(this.mOps[i3]);
                Log.v("FragmentManager", stringBuilder.toString());
            }
            int i4 = i3 + 1;
            i = this.mOps[i3];
            if (i >= 0) {
                c0388a.f1317b = (Fragment) c2832k.f8986f.get(i);
            } else {
                c0388a.f1317b = null;
            }
            i3 = i4 + 1;
            c0388a.f1318c = this.mOps[i4];
            i4 = i3 + 1;
            c0388a.f1319d = this.mOps[i3];
            i3 = i4 + 1;
            c0388a.f1320e = this.mOps[i4];
            i4 = i3 + 1;
            c0388a.f1321f = this.mOps[i3];
            c2826c.f8935c = c0388a.f1318c;
            c2826c.f8936d = c0388a.f1319d;
            c2826c.f8937e = c0388a.f1320e;
            c2826c.f8938f = c0388a.f1321f;
            c2826c.m11035a(c0388a);
            i2++;
            i = i4;
        }
        c2826c.f8939g = this.mTransition;
        c2826c.f8940h = this.mTransitionStyle;
        c2826c.f8943k = this.mName;
        c2826c.f8945m = this.mIndex;
        c2826c.f8941i = true;
        c2826c.f8946n = this.mBreadCrumbTitleRes;
        c2826c.f8947o = this.mBreadCrumbTitleText;
        c2826c.f8948p = this.mBreadCrumbShortTitleRes;
        c2826c.f8949q = this.mBreadCrumbShortTitleText;
        c2826c.f8950r = this.mSharedElementSourceNames;
        c2826c.f8951s = this.mSharedElementTargetNames;
        c2826c.f8952t = this.mReorderingAllowed;
        c2826c.m11033a(1);
        return c2826c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.mOps);
        parcel.writeInt(this.mTransition);
        parcel.writeInt(this.mTransitionStyle);
        parcel.writeString(this.mName);
        parcel.writeInt(this.mIndex);
        parcel.writeInt(this.mBreadCrumbTitleRes);
        TextUtils.writeToParcel(this.mBreadCrumbTitleText, parcel, 0);
        parcel.writeInt(this.mBreadCrumbShortTitleRes);
        TextUtils.writeToParcel(this.mBreadCrumbShortTitleText, parcel, 0);
        parcel.writeStringList(this.mSharedElementSourceNames);
        parcel.writeStringList(this.mSharedElementTargetNames);
        parcel.writeInt(this.mReorderingAllowed);
    }
}
