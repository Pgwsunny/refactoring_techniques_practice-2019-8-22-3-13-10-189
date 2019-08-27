package com.tws.refactoring.extract_method;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tws.refactoring.extract_variable.BannerRender;

public class BannerRenderTest {
	 @Test
	  public void printOwing() {
		 BannerRender bannerRender = new BannerRender() ;
		 String res = bannerRender.renderBanner("MAC","IE");
		 assertEquals("IE on Mac?", res);
	 }
	 
	 @Test
	  public void printOwing2() {
		 BannerRender bannerRender = new BannerRender() ;
		 String res = bannerRender.renderBanner("MAC","CHROME");
		 assertEquals("banner", res);
	 }
	 
	 @Test
	  public void printOwing3() {
		 BannerRender bannerRender = new BannerRender() ;
		 String res = bannerRender.renderBanner("WIN","CHROME");
		 assertEquals("banner", res);
	 }
	 
}
