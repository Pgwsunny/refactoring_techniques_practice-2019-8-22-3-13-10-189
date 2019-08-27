package com.tws.refactoring.extract_variable;

public class BannerRender {
	public static final String MAC = "MAC";
	public static final String IE = "IE";
    public String renderBanner(String platform, String browser) {
    	boolean b1 = platform.toUpperCase().indexOf(MAC) > -1;
    	boolean b2 = browser.toUpperCase().indexOf(IE) > -1;
		if (b1 && b2) {
            return "IE on Mac?";
        }
		return "banner";
    }
}
