package it.unisa.gad.seriestracker.Constant;

/**
 * Created by ludimar on 09/11/15.
 */
public class XPathConstant {
   // public static final String TV_COM_GET_NEWS = "//ul[@class='m hub_list']";
    public static final String TV_COM_GET_LINK_SHOW = "//li[@class='show']/div/h4/a/@href";
//  public static final String TV_GUIDE_TRENDING_TONIGHT ="//*[@id='content']/div[1]/div[1]/ul/li";
    public static final String TV_GUIDE_TRENDING_TONIGHT = "//li[@class='listings-program']";

    public static final String TV_SHOW_MANAGER_DAYS_FOR_NEXT_EP="//div//span[@class=\"odometer-value\"]/text()";
    public static final String TV_COM_GET_NEWS_DETAILS_NEWS="//div[@class =\"actions_bar\"]/following-sibling::div[1]";
    public static final String TV_COM_GET_NEWS_DETAILS_SHOWS="//div[@class =\"content editable complex\"]";
    public static final String TV_COM_NEWS_GET_NEWS="//div[@class=\"m news_list _standard_module _clear_fix\"]/ul[@class =\"stories\"]";

}
