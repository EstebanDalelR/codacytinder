package okhttp3;

import java.util.Collections;
import java.util.List;

public interface CookieJar {
    /* renamed from: a */
    public static final CookieJar f49062a = new C176411();

    /* renamed from: okhttp3.CookieJar$1 */
    class C176411 implements CookieJar {
        public void saveFromResponse(HttpUrl httpUrl, List<C15897h> list) {
        }

        C176411() {
        }

        public List<C15897h> loadForRequest(HttpUrl httpUrl) {
            return Collections.emptyList();
        }
    }

    List<C15897h> loadForRequest(HttpUrl httpUrl);

    void saveFromResponse(HttpUrl httpUrl, List<C15897h> list);
}
