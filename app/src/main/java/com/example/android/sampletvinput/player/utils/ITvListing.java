package com.example.android.sampletvinput.player.utils;

import com.google.android.media.tv.companionlibrary.model.Channel;
import com.google.android.media.tv.companionlibrary.model.Program;

import java.util.List;

public interface ITvListing {
    List<Channel> getChannels();
    List<Program> getProgramsFor(Channel channel);
}
