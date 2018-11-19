package com.ryanharter.auto.value.parcel;

import android.os.Parcel;

public interface TypeAdapter<T> {
    T fromParcel(Parcel parcel);

    void toParcel(T t, Parcel parcel);
}
