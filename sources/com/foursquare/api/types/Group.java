package com.foursquare.api.types;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Collection;

public class Group<T extends FoursquareType> extends ArrayList<T> implements Parcelable, FoursquareType {
    public static final Creator<Group> CREATOR = new C18991();
    private static final String TAG = "Group";
    private static final long serialVersionUID = 1;
    public boolean _isArray;
    private int count;
    private String displayStyle;
    private int initialCountToShow;
    private boolean isPlaceholderGroup;
    private String name;
    private int placeholderLimit;
    private String summary;
    private String title;
    private String type;

    /* renamed from: com.foursquare.api.types.Group$1 */
    class C18991 implements Creator<Group> {
        C18991() {
        }

        public Group createFromParcel(Parcel parcel) {
            return new Group(parcel);
        }

        public Group[] newArray(int i) {
            return new Group[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public Group(Collection<T> collection) {
        super(collection);
    }

    protected Group(android.os.Parcel r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r4 = this;
        r4.<init>();
        r0 = r5.readInt();
        r4.count = r0;
        r0 = r5.readString();
        r4.name = r0;
        r0 = r5.readString();
        r4.summary = r0;
        r0 = r5.readString();
        r4.type = r0;
        r0 = r5.readString();
        r4.displayStyle = r0;
        r0 = r5.readString();
        r4.title = r0;
        r0 = r5.readInt();
        r1 = 0;
        r2 = 1;
        if (r0 != r2) goto L_0x0030;
    L_0x002f:
        goto L_0x0031;
    L_0x0030:
        r2 = 0;
    L_0x0031:
        r4.isPlaceholderGroup = r2;
        r0 = r5.readInt();
        r4.placeholderLimit = r0;
        r0 = r5.readInt();
        r4.initialCountToShow = r0;
        r0 = r5.readInt();
        if (r0 <= 0) goto L_0x005f;
    L_0x0045:
        r2 = r5.readString();
        r2 = java.lang.Class.forName(r2);	 Catch:{ ClassNotFoundException -> 0x005f }
        r2 = r2.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x005f }
    L_0x0051:
        if (r1 >= r0) goto L_0x005f;	 Catch:{ ClassNotFoundException -> 0x005f }
    L_0x0053:
        r3 = r5.readParcelable(r2);	 Catch:{ ClassNotFoundException -> 0x005f }
        r3 = (com.foursquare.api.types.FoursquareType) r3;	 Catch:{ ClassNotFoundException -> 0x005f }
        r4.add(r3);	 Catch:{ ClassNotFoundException -> 0x005f }
        r1 = r1 + 1;
        goto L_0x0051;
    L_0x005f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.api.types.Group.<init>(android.os.Parcel):void");
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String str) {
        this.summary = str;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String getDisplayStyle() {
        return this.displayStyle;
    }

    public void setDisplayStyle(String str) {
        this.displayStyle = str;
    }

    public boolean isPlaceholderGroup() {
        return this.isPlaceholderGroup;
    }

    public void setIsPlaceholderGroup(boolean z) {
        this.isPlaceholderGroup = z;
    }

    public int getPlaceholderLimit() {
        return this.placeholderLimit;
    }

    public void setPlaceholderLimit(int i) {
        this.placeholderLimit = i;
    }

    public int getInitialCountToShow() {
        return this.initialCountToShow;
    }

    public void setInitialCountToShow(int i) {
        this.initialCountToShow = i;
    }

    public String getTitle() {
        return this.title;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        parcel.writeString(this.name);
        parcel.writeString(this.summary);
        parcel.writeString(this.type);
        parcel.writeString(this.displayStyle);
        parcel.writeString(this.title);
        parcel.writeInt(this.isPlaceholderGroup);
        parcel.writeInt(this.placeholderLimit);
        parcel.writeInt(this.initialCountToShow);
        int i2 = 0;
        if (size() <= 0) {
            parcel.writeInt(0);
        } else if (get(0) instanceof Parcelable) {
            parcel.writeInt(size());
            parcel.writeString(((FoursquareType) get(0)).getClass().getName());
            while (i2 < size()) {
                parcel.writeParcelable((Parcelable) get(i2), i);
                i2++;
            }
        } else {
            parcel.writeInt(0);
        }
    }
}
