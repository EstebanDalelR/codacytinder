package okhttp3;

import java.io.IOException;
import javax.annotation.Nullable;

public interface Authenticator {
    /* renamed from: a */
    public static final Authenticator f49061a = new C176401();

    /* renamed from: okhttp3.Authenticator$1 */
    class C176401 implements Authenticator {
        public C15963q authenticate(C15969u c15969u, C15966s c15966s) {
            return null;
        }

        C176401() {
        }
    }

    @Nullable
    C15963q authenticate(C15969u c15969u, C15966s c15966s) throws IOException;
}
