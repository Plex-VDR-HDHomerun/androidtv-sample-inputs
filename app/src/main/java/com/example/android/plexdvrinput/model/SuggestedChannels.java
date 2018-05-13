package com.example.android.plexdvrinput.model;

import android.media.tv.TvContract;

import com.felkertech.cumulustv.plugins.CumulusChannel;

/**
 * <p>This utility class is a single place to access the "Suggested Channels" that are seen in the
 * app. Having them in a separate place makes it easy to edit without affecting other parts
 * of the app.
 *
 * <p>The numbering scheme for these channels is a bit specific. They follow a rule:
 * </p>
 *
 * <ul>
 * <li>0xx NEWS</li>
 * <li>1xx SCIENCE / TECH / NATURE</li>
 * <li>2xx HISTORY / EDUCATION</li>
 * <li>3xx SPORTS / VIDEO GAMES</li>
 * <li>4xx MUSIC</li>
 * <li>5xx FICTION</li>
 * <li>6xx NONFICTION</li>
 * <li>7xx GOVERNMENT / SOCIETY</li>
 * <li>8xx ART / CULTURE / LANGUAGE</li>
 * <li>9xx MISC</li>
 * </ul>
 *
 * <p>
 * Some streams were found via <a href='http://rgw.ustream.tv/json.php/Ustream.searchBroadcast/'>
 *     UStream</a>.</p>
 */
public class SuggestedChannels {
    private static final CumulusChannel[] channels = {
            new JsonChannel.Builder()
                    .setGenres(TvContract.Programs.Genres.TECH_SCIENCE + "," +
                            TvContract.Programs.Genres.NEWS)
                    .setLogo("https://zap2it.tmsimg.com/h3/NowShowing/58646/s58646_h3_aa.png")
                    .setMediaUrl("http://plexlivetv.ddns.net:3000/EXT/I-0-340-683")
                    .setEpgUrl("http://plexlivetv.ddns.net/playlist/iptvGuide.xml")
                    .setName("CNN HD")
                    .setNumber("600")
                    .build(),
            new JsonChannel.Builder()
                    .setGenres(TvContract.Programs.Genres.TECH_SCIENCE + "," +
                            TvContract.Programs.Genres.NEWS)
                    .setLogo("https://zap2it.tmsimg.com/h3/NowShowing/21222/s28717_h3_aa.png")
                    .setMediaUrl("http://plexlivetv.ddns.net:3000/EXT/I-0-90-111")
                    .setEpgUrl("http://plexlivetv.ddns.net/playlist/iptvGuide.xml")
                    .setName("NBC HD")
                    .setNumber("508")
                    .build(),
            new JsonChannel.Builder()
                    .setGenres(TvContract.Programs.Genres.TECH_SCIENCE + "," +
                            TvContract.Programs.Genres.NEWS)
                    .setLogo("https://zap2it.tmsimg.com/h3/NowShowing/56905/s56905_h3_aa.png")
                    .setMediaUrl("http://plexlivetv.ddns.net:3000/EXT/I-0-410-632")
                    .setEpgUrl("http://plexlivetv.ddns.net/playlist/iptvGuide.xml")
                    .setName("DISCHD")
                    .setNumber("620")
                    .build(),
            new JsonChannel.Builder()
                    .setGenres(TvContract.Programs.Genres.TECH_SCIENCE + "," +
                            TvContract.Programs.Genres.NEWS)
                    .setLogo("https://zap2it.tmsimg.com/h3/NowShowing/49438/s49438_h3_aa.png")
                    .setMediaUrl("http://plexlivetv.ddns.net:3000/EXT/I-0-420-604")
                    .setEpgUrl("http://plexlivetv.ddns.net/playlist/iptvGuide.xml")
                    .setName("NATGEO")
                    .setNumber("621")
                    .build(),
            new JsonChannel.Builder()
                    .setGenres(TvContract.Programs.Genres.TECH_SCIENCE + "," +
                            TvContract.Programs.Genres.NEWS)
                    .setLogo("https://zap2it.tmsimg.com/h3/NowShowing/57708/s57708_h3_aa.png")
                    .setMediaUrl("http://plexlivetv.ddns.net:3000/EXT/I-0-450-659")
                    .setEpgUrl("http://plexlivetv.ddns.net/playlist/iptvGuide.xml")
                    .setNumber("632")
                    .setName("History HD")
                    .build(),
            new JsonChannel.Builder()
                    .setGenres(TvContract.Programs.Genres.ARTS + "," +
                            TvContract.Programs.Genres.ENTERTAINMENT)
                    .setLogo("https://zap2it.tmsimg.com/h3/NowShowing/45438/s45438_h3_aa.png")
                    .setMediaUrl("http://plexlivetv.ddns.net:3000/EXT/I-0-620-622")
                    .setEpgUrl("http://plexlivetv.ddns.net/playlist/iptvGuide.xml")
                    .setName("AWE HD")
                    .setNumber("699")
                    .build()
    };

    public static CumulusChannel[] getSuggestedChannels() {
        return channels;
    }
}

/* new CumulusChannel("001",
        "Sky News",
        "https://www.youtube.com/embed/y60wDzZt8yg?autoplay=1",
        "http://news.sky.com/images/33dc2677.sky-news-logo.png", "",
        TvContract.Programs.Genres.NEWS),
new CumulusChannel("002",
        "Taiwan Formosa Live News",
        "https://www.youtube.com/embed/XxJKnDLYZz4?autoplay=1",
        "https://i.ytimg.com/vi/XxJKnDLYZz4/maxresdefault_live.jpg", "",
        TvContract.Programs.Genres.NEWS),*/
/*
        new CumulusChannel("900", "Euronews De", "http://fr-par-iphone-2.cdn.hexaglobe.net/streaming/euronews_ewns/14-live.m3u8", ""),
        new CumulusChannel("901", "TVI (Portugal)", "http://noscdn1.connectedviews.com:1935/live/smil:tvi.smil/playlist.m3u8", ""),
        new CumulusChannel("902", "PHOENIXHD", "http://teleboy.customers.cdn.iptv.ch/1122/index.m3u8", ""),
        new CumulusChannel("903", "Sport 1 Germany", "http://streaming-hub.com/tv/i/sport1_1@97464/index_1300_av-p.m3u8?sd=10&rebase=on", ""),
        new CumulusChannel("904", "RTP International", "http://rtp-pull-live.hls.adaptive.level3.net/liverepeater/rtpi_5ch120h264.stream/livestream.m3u8", "")
*/