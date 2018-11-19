package com.facebook.accountkit;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.facebook.accountkit.internal.InternalAccountKitError;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

public final class AccountKitError implements Parcelable {
    public static final Creator<AccountKitError> CREATOR = new C11831();
    private final Type errorType;
    private final InternalAccountKitError internalError;

    /* renamed from: com.facebook.accountkit.AccountKitError$1 */
    static class C11831 implements Creator<AccountKitError> {
        C11831() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m4124a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m4125a(i);
        }

        /* renamed from: a */
        public AccountKitError m4124a(Parcel parcel) {
            return new AccountKitError(parcel);
        }

        /* renamed from: a */
        public AccountKitError[] m4125a(int i) {
            return new AccountKitError[i];
        }
    }

    public enum Type {
        NETWORK_CONNECTION_ERROR(100, "A request failed due to a network error"),
        SERVER_ERROR(Callback.DEFAULT_DRAG_ANIMATION_DURATION, "Server generated an error"),
        LOGIN_INVALIDATED(MapboxConstants.ANIMATION_DURATION, "The request timed out"),
        INTERNAL_ERROR(400, "An internal consistency error has occurred"),
        INITIALIZATION_ERROR(500, "Initialization error"),
        ARGUMENT_ERROR(600, "Invalid argument provided"),
        UPDATE_INVALIDATED(700, "The update request timed out");
        
        private final int code;
        private final String message;

        private Type(int i, String str) {
            this.code = i;
            this.message = str;
        }

        public String getMessage() {
            return this.message;
        }

        public int getCode() {
            return this.code;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.code);
            stringBuilder.append(": ");
            stringBuilder.append(this.message);
            return stringBuilder.toString();
        }
    }

    public int describeContents() {
        return 0;
    }

    public AccountKitError(Type type) {
        this(type, null);
    }

    public AccountKitError(Type type, InternalAccountKitError internalAccountKitError) {
        this.errorType = type;
        this.internalError = internalAccountKitError;
    }

    public int getDetailErrorCode() {
        if (this.internalError == null) {
            return -1;
        }
        return this.internalError.getCode();
    }

    public Type getErrorType() {
        return this.errorType;
    }

    public String getUserFacingMessage() {
        if (this.internalError == null) {
            return null;
        }
        return this.internalError.getUserFacingMessage();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.errorType);
        stringBuilder.append(": ");
        stringBuilder.append(this.internalError);
        return stringBuilder.toString();
    }

    private AccountKitError(Parcel parcel) {
        this.errorType = Type.values()[parcel.readInt()];
        this.internalError = (InternalAccountKitError) parcel.readParcelable(InternalAccountKitError.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.errorType.ordinal());
        parcel.writeParcelable(this.internalError, i);
    }
}
