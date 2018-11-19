package retrofit2.converter.moshi;

import com.squareup.moshi.JsonAdapter;
import java.io.IOException;
import okhttp3.C15968t;
import okio.BufferedSource;
import okio.ByteString;
import retrofit2.Converter;

final class MoshiResponseBodyConverter<T> implements Converter<C15968t, T> {
    private static final ByteString UTF8_BOM = ByteString.c("EFBBBF");
    private final JsonAdapter<T> adapter;

    MoshiResponseBodyConverter(JsonAdapter<T> jsonAdapter) {
        this.adapter = jsonAdapter;
    }

    public T convert(C15968t c15968t) throws IOException {
        BufferedSource source = c15968t.source();
        try {
            if (source.rangeEquals(0, UTF8_BOM)) {
                source.skip((long) UTF8_BOM.h());
            }
            T fromJson = this.adapter.fromJson(source);
            return fromJson;
        } finally {
            c15968t.close();
        }
    }
}
