package retrofit;

import retrofit.client.C19370e;

public interface Callback<T> {
    void failure(RetrofitError retrofitError);

    void success(T t, C19370e c19370e);
}
