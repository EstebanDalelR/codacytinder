package com.tinder.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.io.Serializable;

public class Message implements Parcelable, Serializable, Cloneable, Comparable<Message> {
    public static final Creator<Message> CREATOR = new C99281();
    static final String TEMP_ID_PREFIX = "TEMP-ID";
    static final long serialVersionUID = 8434895317289603049L;
    private final String mCreationDate;
    public String mFromUserId;
    public boolean mHasError;
    public boolean mIsFailed;
    public boolean mIsLiked;
    public boolean mIsPending;
    public boolean mIsViewed;
    public String mLastActionDate;
    public final String mMatchId;
    public String mMessageId;
    public final String mText;
    public long mTime;
    public Type mType;

    /* renamed from: com.tinder.model.Message$1 */
    static class C99281 implements Creator<Message> {
        C99281() {
        }

        public Message createFromParcel(Parcel parcel) {
            return new Message(parcel);
        }

        public Message[] newArray(int i) {
            return new Message[i];
        }
    }

    public enum Type {
        GIF("gif"),
        REACTION("reaction"),
        MESSAGE("message"),
        SYSTEM("system"),
        UNKNOWN("unknown");
        
        String name;

        private Type(String str) {
            this.name = str;
        }

        public static Type getInstance(@Nullable String str) {
            if (str == null) {
                str = "default";
            }
            Object obj = -1;
            int hashCode = str.hashCode();
            if (hashCode != -887328209) {
                if (hashCode != -867509719) {
                    if (hashCode != 102340) {
                        if (hashCode == 954925063) {
                            if (str.equals("message") != null) {
                                obj = 2;
                            }
                        }
                    } else if (str.equals("gif") != null) {
                        obj = null;
                    }
                } else if (str.equals("reaction") != null) {
                    obj = 1;
                }
            } else if (str.equals("system") != null) {
                obj = 3;
            }
            switch (obj) {
                case null:
                    return GIF;
                case 1:
                    return REACTION;
                case 2:
                    return MESSAGE;
                case 3:
                    return SYSTEM;
                default:
                    return MESSAGE;
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public Message(String str, @Nullable String str2, String str3, String str4, String str5, String str6, Type type, boolean z, long j, boolean z2) {
        this.mCreationDate = str3;
        this.mLastActionDate = str4;
        this.mTime = j;
        this.mMatchId = str;
        if (str2 == null) {
            setTemporaryId();
        } else {
            this.mMessageId = str2;
        }
        this.mFromUserId = str5;
        this.mText = str6;
        this.mIsViewed = z;
        this.mIsLiked = z2;
        this.mType = type;
    }

    protected Message(Parcel parcel) {
        this.mMatchId = parcel.readString();
        this.mMessageId = parcel.readString();
        this.mText = parcel.readString();
        this.mFromUserId = parcel.readString();
        this.mCreationDate = parcel.readString();
        this.mLastActionDate = parcel.readString();
        this.mTime = parcel.readLong();
        boolean z = false;
        this.mHasError = parcel.readByte() != (byte) 0;
        this.mIsViewed = parcel.readByte() != (byte) 0;
        this.mIsPending = parcel.readByte() != (byte) 0;
        this.mIsFailed = parcel.readByte() != (byte) 0;
        if (parcel.readByte() != (byte) 0) {
            z = true;
        }
        this.mIsLiked = z;
        this.mType = Type.values()[parcel.readInt()];
    }

    Message(String str, String str2, String str3) {
        this.mMatchId = str;
        this.mText = str2;
        this.mCreationDate = str3;
    }

    public String getId() {
        return this.mMessageId;
    }

    public void setId(String str) {
        this.mMessageId = str;
    }

    @Nullable
    public Type getType() {
        return this.mType;
    }

    public void setType(Type type) {
        this.mType = type;
    }

    public boolean isGiphy() {
        return this.mType != null && this.mType == Type.GIF;
    }

    public boolean isFailed() {
        return this.mIsFailed;
    }

    public void setIsFailed(boolean z) {
        this.mIsFailed = z;
    }

    public void setIsPending(boolean z) {
        this.mIsPending = z;
    }

    public boolean isPending() {
        return this.mIsPending;
    }

    public String getMatchId() {
        return this.mMatchId;
    }

    public String getFromUserId() {
        return this.mFromUserId;
    }

    public boolean hasError() {
        return this.mHasError;
    }

    public String getText() {
        return this.mText;
    }

    public boolean isViewed() {
        return this.mIsViewed;
    }

    public void setViewed(boolean z) {
        this.mIsViewed = z;
    }

    public void setHasError(boolean z) {
        this.mHasError = z;
    }

    public boolean isLiked() {
        return this.mIsLiked;
    }

    public void setLiked(boolean z) {
        this.mIsLiked = z;
    }

    public void setLastActionDate(String str) {
        this.mLastActionDate = str;
    }

    public long getTime() {
        return this.mTime;
    }

    public void setTime(long j) {
        this.mTime = j;
    }

    public String getCreationDate() {
        return this.mCreationDate;
    }

    public void setTemporaryId() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TEMP-ID-");
        stringBuilder.append(System.currentTimeMillis());
        setId(stringBuilder.toString());
    }

    public boolean hasTemporaryId() {
        return this.mMessageId.startsWith(TEMP_ID_PREFIX);
    }

    public boolean compareIds(@NonNull Message message) {
        return (hasTemporaryId() || message.hasTemporaryId()) ? null : getId().equals(message.getId());
    }

    public int compareTo(@NonNull Message message) {
        int i = 0;
        if (this.mMessageId != null && message.mMessageId != null && this.mMessageId.equals(message.mMessageId)) {
            return 0;
        }
        if (this.mTime < message.mTime) {
            i = -1;
        } else if (this.mTime != message.mTime) {
            i = 1;
        }
        return i;
    }

    public boolean isFromUser(User user) {
        return (user == null || this.mFromUserId == null || this.mFromUserId.equals(user.getId()) == null) ? null : true;
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
        if (r5 == 0) goto L_0x008b;
    L_0x0007:
        r2 = r4.getClass();
        r3 = r5.getClass();
        if (r2 == r3) goto L_0x0013;
    L_0x0011:
        goto L_0x008b;
    L_0x0013:
        r5 = (com.tinder.model.Message) r5;
        r2 = r4.mHasError;
        r3 = r5.mHasError;
        if (r2 == r3) goto L_0x001c;
    L_0x001b:
        return r1;
    L_0x001c:
        r2 = r4.mIsViewed;
        r3 = r5.mIsViewed;
        if (r2 == r3) goto L_0x0023;
    L_0x0022:
        return r1;
    L_0x0023:
        r2 = r4.mIsPending;
        r3 = r5.mIsPending;
        if (r2 == r3) goto L_0x002a;
    L_0x0029:
        return r1;
    L_0x002a:
        r2 = r4.mIsLiked;
        r3 = r5.mIsLiked;
        if (r2 == r3) goto L_0x0031;
    L_0x0030:
        return r1;
    L_0x0031:
        r2 = r4.mMatchId;
        if (r2 == 0) goto L_0x0040;
    L_0x0035:
        r2 = r4.mMatchId;
        r3 = r5.mMatchId;
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x0045;
    L_0x003f:
        goto L_0x0044;
    L_0x0040:
        r2 = r5.mMatchId;
        if (r2 == 0) goto L_0x0045;
    L_0x0044:
        return r1;
    L_0x0045:
        r2 = r4.getCreationDate();
        if (r2 == 0) goto L_0x005a;
    L_0x004b:
        r2 = r4.getCreationDate();
        r3 = r5.getCreationDate();
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x0061;
    L_0x0059:
        goto L_0x0060;
    L_0x005a:
        r2 = r5.getCreationDate();
        if (r2 == 0) goto L_0x0061;
    L_0x0060:
        return r1;
    L_0x0061:
        r2 = r4.mText;
        if (r2 == 0) goto L_0x0070;
    L_0x0065:
        r2 = r4.mText;
        r3 = r5.mText;
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x0075;
    L_0x006f:
        goto L_0x0074;
    L_0x0070:
        r2 = r5.mText;
        if (r2 == 0) goto L_0x0075;
    L_0x0074:
        return r1;
    L_0x0075:
        r2 = r4.mFromUserId;
        if (r2 == 0) goto L_0x0084;
    L_0x0079:
        r2 = r4.mFromUserId;
        r5 = r5.mFromUserId;
        r5 = r2.equals(r5);
        if (r5 != 0) goto L_0x008a;
    L_0x0083:
        goto L_0x0089;
    L_0x0084:
        r5 = r5.mFromUserId;
        if (r5 != 0) goto L_0x0089;
    L_0x0088:
        goto L_0x008a;
    L_0x0089:
        r0 = 0;
    L_0x008a:
        return r0;
    L_0x008b:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.model.Message.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((((this.mMatchId != null ? this.mMatchId.hashCode() : 0) * 31) + (this.mText != null ? this.mText.hashCode() : 0)) * 31) + (getCreationDate() != null ? getCreationDate().hashCode() : 0)) * 31;
        if (this.mFromUserId != null) {
            i = this.mFromUserId.hashCode();
        }
        return ((((((((hashCode + i) * 31) + this.mHasError) * 31) + this.mIsViewed) * 31) + this.mIsPending) * 31) + this.mIsLiked;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Message{mTime=");
        stringBuilder.append(this.mTime);
        stringBuilder.append(", mText='");
        stringBuilder.append(this.mText);
        stringBuilder.append('\'');
        stringBuilder.append(", mIsPending=");
        stringBuilder.append(this.mIsPending);
        stringBuilder.append(", mIsFailed=");
        stringBuilder.append(this.mIsFailed);
        stringBuilder.append(", mIsLiked=");
        stringBuilder.append(this.mIsLiked);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public Message clone() {
        Message message = new Message(this.mMatchId, this.mMessageId, this.mCreationDate, this.mLastActionDate, this.mFromUserId, this.mText, this.mType, this.mIsViewed, this.mTime, this.mIsLiked);
        message.mIsPending = this.mIsPending;
        message.mIsFailed = this.mIsFailed;
        return message;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mMatchId);
        parcel.writeString(this.mMessageId);
        parcel.writeString(this.mText);
        parcel.writeString(this.mFromUserId);
        parcel.writeString(this.mCreationDate);
        parcel.writeString(this.mLastActionDate);
        parcel.writeLong(this.mTime);
        parcel.writeByte(this.mHasError);
        parcel.writeByte(this.mIsViewed);
        parcel.writeByte(this.mIsPending);
        parcel.writeByte(this.mIsFailed);
        parcel.writeByte(this.mIsLiked);
        parcel.writeInt(this.mType.ordinal());
    }
}
