package com.example.android.sampletvinput.plugins;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * An object that can be serialized into JSON.
 */
public interface JsonContainer {
    JSONObject toJson() throws JSONException;
    String toString();
}
