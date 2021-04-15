public class URLBuilder {
    public String BaseUrl = "https://www.sephora.com";

    public String ShampooUrl = "https://www.sephora.com/shop/shampoo-sulfate-free-shampoo";

    public String ProductUrl =
            "https://www.sephora.com/product/charlotte-tilbury-mini-pillow-talk-lip-duo-P458268?icid2=products%20grid:p458268";

    public String getProductUrl()
    {
        return ProductUrl;
    }

    public String getBaseUrl()
    {
        return BaseUrl;
    }

    public String getShampooUrl()
    {
        return ShampooUrl;
    }

    public String getSearchUrl()
    {
        return BaseUrl;
    }
}
