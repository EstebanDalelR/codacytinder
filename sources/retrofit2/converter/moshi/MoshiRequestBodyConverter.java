package retrofit2.converter.moshi;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.JsonAdapter;
import java.io.IOException;
import okhttp3.C15958m;
import okhttp3.C15964r;
import okio.C18549c;
import retrofit2.Converter;

final class MoshiRequestBodyConverter<T> implements Converter<T, C15964r> {
    private static final C15958m MEDIA_TYPE = C15958m.a("application/json; charset=UTF-8");
    private final JsonAdapter<T> adapter;

    MoshiRequestBodyConverter(JsonAdapter<T> jsonAdapter) {
        this.adapter = jsonAdapter;
    }

    public C15964r convert(T t) throws IOException {
        Object c18549c = new C18549c();
        this.adapter.toJson(C5983k.a(c18549c), t);
        return C15964r.create(MEDIA_TYPE, c18549c.readByteString());
    }
}
