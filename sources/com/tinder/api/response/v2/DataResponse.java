package com.tinder.api.response.v2;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.response.v2.AutoValue_DataResponse.MoshiJsonAdapter;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public abstract class DataResponse<T> {
    @Nullable
    public abstract T data();

    @Nullable
    public abstract ResponseError error();

    @Nullable
    public abstract ResponseMeta meta();

    public static <T> JsonAdapter<DataResponse<T>> jsonAdapter(C5987p c5987p, Type[] typeArr) {
        return new MoshiJsonAdapter(c5987p, typeArr);
    }

    public static <T> DataResponse<T> success(T t) {
        return new AutoValue_DataResponse(new ResponseMeta(Callback.DEFAULT_DRAG_ANIMATION_DURATION), t, null);
    }
}
