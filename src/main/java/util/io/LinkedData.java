/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.io;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author elahi
 */
public class LinkedData {

    @JsonProperty("endpoint")
    private String endpoint = null;
    @JsonProperty("prefix")
    private Map<String, String> prefix = new TreeMap<String, String>();

    public LinkedData() {

    }

    public String getEndpoint() {
        return endpoint;
    }

    public Map<String, String> getPrefixes() {
        return prefix;
    }

}