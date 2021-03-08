package com.company;

public class Product_category_name_translation extends Products {
    private String product_category_name_english;

    public Product_category_name_translation(String product_category_name,String product_category_name_english) {
        super(product_category_name);
        this.product_category_name_english=product_category_name_english;
    }
    public String getProduct_category_name_english() {
        return product_category_name_english;
    }
    public void setProduct_category_name_english(String product_category_name_english) {
        this.product_category_name_english=product_category_name_english;
    }
}
