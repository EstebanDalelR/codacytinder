package bolts;

import android.net.Uri;

public interface AppLinkResolver {
    Task<Object> getAppLinkFromUrlInBackground(Uri uri);
}
