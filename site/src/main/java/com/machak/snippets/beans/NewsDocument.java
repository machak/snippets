package com.machak.snippets.beans;

import java.util.Calendar;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSetBean;
import org.hippoecm.hst.content.beans.standard.HippoHtml;

@Node(jcrType = "snippets:newsdocument")
public class NewsDocument extends BaseDocument {

    public String getTitle() {
        return getProperty("snippets:title");
    }
    
    public String getSummary() {
        return getProperty("snippets:summary");
    }

    public HippoHtml getHtml() {
        return getHippoHtml("snippets:body");
    }

    public Calendar getDate() {
        return getProperty("snippets:date");
    }

    /**
     * Get the imageset of the newspage
     *
     * @return the imageset of the newspage
     */
    public HippoGalleryImageSetBean getImage() {
        return getLinkedBean("snippets:image", HippoGalleryImageSetBean.class);
    }

}
