package com.tinder.match.viewmodel;

import android.content.res.Resources;
import com.tinder.R;
import com.tinder.domain.match.model.CoreMatch;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.model.MessageAdMatch;
import com.tinder.domain.match.model.PlacesMatch;
import com.tinder.domain.message.ActivityMessage;
import com.tinder.domain.message.GifMessage;
import com.tinder.domain.message.ImageMessage;
import com.tinder.domain.message.Message;
import com.tinder.domain.message.ReactionMessage;
import com.tinder.domain.message.TextMessage;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\u001c\u0010\u0007\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0002\u001a\u001c\u0010\u0007\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0002\u001a\u001c\u0010\u0007\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0002\u001a\u001c\u0010\u0007\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0002\u001a\u001c\u0010\u0007\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"BITMOJI_SOURCE", "", "isInbound", "", "Lcom/tinder/domain/message/Message;", "match", "Lcom/tinder/domain/match/model/Match;", "latestMessagePreviewText", "Lcom/tinder/domain/message/ActivityMessage;", "resources", "Landroid/content/res/Resources;", "Lcom/tinder/domain/message/GifMessage;", "Lcom/tinder/domain/message/ImageMessage;", "Lcom/tinder/domain/message/ReactionMessage;", "Lcom/tinder/domain/message/TextMessage;", "Tinder_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.match.viewmodel.f */
public final class C9890f {
    /* renamed from: b */
    private static final boolean m40703b(@NotNull Message message, Match match) {
        if (match instanceof CoreMatch) {
            return C2668g.a(((CoreMatch) match).getPerson().id(), message.getFromId());
        }
        if (match instanceof MessageAdMatch) {
            return true;
        }
        if (match instanceof PlacesMatch) {
            return C2668g.a(((PlacesMatch) match).getPerson().id(), message.getFromId());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    private static final String m40702b(@NotNull TextMessage textMessage, boolean z, Resources resources) {
        if (!((z ^ 1) & textMessage.isLiked())) {
            return textMessage.getText();
        }
        textMessage = resources.getString(R.string.liked_your_message);
        C2668g.a(textMessage, "resources.getString(R.string.liked_your_message)");
        return textMessage;
    }

    /* renamed from: b */
    private static final String m40699b(@NotNull GifMessage gifMessage, boolean z, Resources resources) {
        z ^= 1;
        if ((gifMessage.isLiked() & z) != null) {
            gifMessage = resources.getString(R.string.liked_your_giphy);
            C2668g.a(gifMessage, "resources.getString(R.string.liked_your_giphy)");
            return gifMessage;
        } else if (z) {
            gifMessage = resources.getString(R.string.you_sent_a_giphy);
            C2668g.a(gifMessage, "resources.getString(R.string.you_sent_a_giphy)");
            return gifMessage;
        } else {
            gifMessage = resources.getString(R.string.sent_you_a_giphy);
            C2668g.a(gifMessage, "resources.getString(R.string.sent_you_a_giphy)");
            return gifMessage;
        }
    }

    /* renamed from: b */
    private static final String m40701b(@NotNull ReactionMessage reactionMessage, boolean z, Resources resources) {
        z ^= 1;
        if ((reactionMessage.isLiked() & z) != null) {
            reactionMessage = resources.getString(R.string.liked_your_reaction);
            C2668g.a(reactionMessage, "resources.getString(R.string.liked_your_reaction)");
            return reactionMessage;
        } else if (z) {
            reactionMessage = resources.getString(R.string.you_sent_a_reaction);
            C2668g.a(reactionMessage, "resources.getString(R.string.you_sent_a_reaction)");
            return reactionMessage;
        } else {
            reactionMessage = resources.getString(R.string.sent_you_a_reaction);
            C2668g.a(reactionMessage, "resources.getString(R.string.sent_you_a_reaction)");
            return reactionMessage;
        }
    }

    /* renamed from: b */
    private static final String m40698b(@NotNull ActivityMessage activityMessage, boolean z, Resources resources) {
        if (!((z ^ 1) & activityMessage.isLiked())) {
            return activityMessage.getText();
        }
        activityMessage = resources.getString(R.string.liked_your_message);
        C2668g.a(activityMessage, "resources.getString(R.string.liked_your_message)");
        return activityMessage;
    }

    /* renamed from: b */
    private static final String m40700b(@NotNull ImageMessage imageMessage, boolean z, Resources resources) {
        String string;
        String string2;
        z ^= true;
        String source = imageMessage.getImage().getSource();
        if (source.hashCode() == -102405906) {
            if (source.equals("bitmoji")) {
                string = resources.getString(R.string.bitmoji_main_title);
                if (source.hashCode() != -102405906) {
                    if (source.equals("bitmoji")) {
                        string2 = resources.getString(R.string.you_sent_bitmoji);
                        if (source.hashCode() == -102405906) {
                            if (source.equals("bitmoji")) {
                                source = resources.getString(R.string.sent_you_bitmoji);
                                if ((imageMessage.isLiked() & z) == null) {
                                    string2 = resources.getString(R.string.liked_your_image, new Object[]{string});
                                    C2668g.a(string2, "resources.getString(R.st…d_your_image, sourceText)");
                                    return string2;
                                } else if (z) {
                                    C2668g.a(source, "sentText");
                                    return source;
                                } else {
                                    C2668g.a(string2, "youSentText");
                                    return string2;
                                }
                            }
                        }
                        source = resources.getString(R.string.sent_you_image);
                        if ((imageMessage.isLiked() & z) == null) {
                            string2 = resources.getString(R.string.liked_your_image, new Object[]{string});
                            C2668g.a(string2, "resources.getString(R.st…d_your_image, sourceText)");
                            return string2;
                        } else if (z) {
                            C2668g.a(source, "sentText");
                            return source;
                        } else {
                            C2668g.a(string2, "youSentText");
                            return string2;
                        }
                    }
                }
                string2 = resources.getString(R.string.you_sent_image);
                if (source.hashCode() == -102405906) {
                    if (source.equals("bitmoji")) {
                        source = resources.getString(R.string.sent_you_bitmoji);
                        if ((imageMessage.isLiked() & z) == null) {
                            string2 = resources.getString(R.string.liked_your_image, new Object[]{string});
                            C2668g.a(string2, "resources.getString(R.st…d_your_image, sourceText)");
                            return string2;
                        } else if (z) {
                            C2668g.a(string2, "youSentText");
                            return string2;
                        } else {
                            C2668g.a(source, "sentText");
                            return source;
                        }
                    }
                }
                source = resources.getString(R.string.sent_you_image);
                if ((imageMessage.isLiked() & z) == null) {
                    string2 = resources.getString(R.string.liked_your_image, new Object[]{string});
                    C2668g.a(string2, "resources.getString(R.st…d_your_image, sourceText)");
                    return string2;
                } else if (z) {
                    C2668g.a(source, "sentText");
                    return source;
                } else {
                    C2668g.a(string2, "youSentText");
                    return string2;
                }
            }
        }
        string = resources.getString(R.string.image);
        if (source.hashCode() != -102405906) {
            if (source.equals("bitmoji")) {
                string2 = resources.getString(R.string.you_sent_bitmoji);
                if (source.hashCode() == -102405906) {
                    if (source.equals("bitmoji")) {
                        source = resources.getString(R.string.sent_you_bitmoji);
                        if ((imageMessage.isLiked() & z) == null) {
                            string2 = resources.getString(R.string.liked_your_image, new Object[]{string});
                            C2668g.a(string2, "resources.getString(R.st…d_your_image, sourceText)");
                            return string2;
                        } else if (z) {
                            C2668g.a(string2, "youSentText");
                            return string2;
                        } else {
                            C2668g.a(source, "sentText");
                            return source;
                        }
                    }
                }
                source = resources.getString(R.string.sent_you_image);
                if ((imageMessage.isLiked() & z) == null) {
                    string2 = resources.getString(R.string.liked_your_image, new Object[]{string});
                    C2668g.a(string2, "resources.getString(R.st…d_your_image, sourceText)");
                    return string2;
                } else if (z) {
                    C2668g.a(source, "sentText");
                    return source;
                } else {
                    C2668g.a(string2, "youSentText");
                    return string2;
                }
            }
        }
        string2 = resources.getString(R.string.you_sent_image);
        if (source.hashCode() == -102405906) {
            if (source.equals("bitmoji")) {
                source = resources.getString(R.string.sent_you_bitmoji);
                if ((imageMessage.isLiked() & z) == null) {
                    string2 = resources.getString(R.string.liked_your_image, new Object[]{string});
                    C2668g.a(string2, "resources.getString(R.st…d_your_image, sourceText)");
                    return string2;
                } else if (z) {
                    C2668g.a(string2, "youSentText");
                    return string2;
                } else {
                    C2668g.a(source, "sentText");
                    return source;
                }
            }
        }
        source = resources.getString(R.string.sent_you_image);
        if ((imageMessage.isLiked() & z) == null) {
            string2 = resources.getString(R.string.liked_your_image, new Object[]{string});
            C2668g.a(string2, "resources.getString(R.st…d_your_image, sourceText)");
            return string2;
        } else if (z) {
            C2668g.a(source, "sentText");
            return source;
        } else {
            C2668g.a(string2, "youSentText");
            return string2;
        }
    }
}
