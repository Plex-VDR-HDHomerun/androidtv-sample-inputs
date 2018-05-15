package com.example.android.sampletvinput.service;

import com.example.android.sampletvinput.domain.Channel;
import com.example.android.sampletvinput.domain.Program;
import com.example.android.sampletvinput.xmltv.XmlTvParser;

import java.util.List;

public interface ITvListing {
    List<XmlTvParser.Channel> getChannels();
    List<XmlTvParser.Program> getProgramsFor(Channel channel);
}
