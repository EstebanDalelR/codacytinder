package okhttp3;

import java.io.IOException;

public interface Callback {
    void onFailure(Call call, IOException iOException);

    void onResponse(Call call, C15966s c15966s) throws IOException;
}
