package com.machak.snippets.beans;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;

@Node(jcrType="snippets:basedocument")
public class BaseDocument extends HippoDocument {


    public String getTitle() {
        return getProperty("snippets:title");
    }
}
