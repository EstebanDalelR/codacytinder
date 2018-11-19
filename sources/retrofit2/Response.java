package retrofit2;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import javax.annotation.Nullable;
import okhttp3.C15957l;
import okhttp3.C15963q.C15962a;
import okhttp3.C15966s;
import okhttp3.C15966s.C15965a;
import okhttp3.C15968t;
import okhttp3.Protocol;

public final class Response<T> {
    @Nullable
    private final T body;
    @Nullable
    private final C15968t errorBody;
    private final C15966s rawResponse;

    public static <T> Response<T> success(@Nullable T t) {
        return success((Object) t, new C15965a().a(Callback.DEFAULT_DRAG_ANIMATION_DURATION).a("OK").a(Protocol.HTTP_1_1).a(new C15962a().a("http://localhost/").d()).a());
    }

    public static <T> Response<T> success(@Nullable T t, C15957l c15957l) {
        Utils.checkNotNull(c15957l, "headers == null");
        return success((Object) t, new C15965a().a(Callback.DEFAULT_DRAG_ANIMATION_DURATION).a("OK").a(Protocol.HTTP_1_1).a(c15957l).a(new C15962a().a("http://localhost/").d()).a());
    }

    public static <T> Response<T> success(@Nullable T t, C15966s c15966s) {
        Utils.checkNotNull(c15966s, "rawResponse == null");
        if (c15966s.d()) {
            return new Response(c15966s, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public static <T> Response<T> error(int i, C15968t c15968t) {
        if (i >= 400) {
            return error(c15968t, new C15965a().a(i).a("Response.error()").a(Protocol.HTTP_1_1).a(new C15962a().a("http://localhost/").d()).a());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("code < 400: ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static <T> Response<T> error(C15968t c15968t, C15966s c15966s) {
        Utils.checkNotNull(c15968t, "body == null");
        Utils.checkNotNull(c15966s, "rawResponse == null");
        if (!c15966s.d()) {
            return new Response(c15966s, null, c15968t);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    private Response(C15966s c15966s, @Nullable T t, @Nullable C15968t c15968t) {
        this.rawResponse = c15966s;
        this.body = t;
        this.errorBody = c15968t;
    }

    public C15966s raw() {
        return this.rawResponse;
    }

    public int code() {
        return this.rawResponse.c();
    }

    public String message() {
        return this.rawResponse.e();
    }

    public C15957l headers() {
        return this.rawResponse.g();
    }

    public boolean isSuccessful() {
        return this.rawResponse.d();
    }

    @Nullable
    public T body() {
        return this.body;
    }

    @Nullable
    public C15968t errorBody() {
        return this.errorBody;
    }

    public String toString() {
        return this.rawResponse.toString();
    }
}
