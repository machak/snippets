
package com.machak.snippets.beans;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;

@Node(jcrType="snippets:textdocument")
public class TextDocument extends BaseDocument{



    public String getSummary() {
        return getProperty("snippets:summary");
    }
    
    public HippoHtml getHtml(){
        return getHippoHtml("snippets:body");    
    }
}
