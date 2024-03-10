package com.company.etc.wo20240310;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {
    public String[] solution(String[] productInfo, String[] dailyProductSales) {
        List<String> answer = new ArrayList<>();

        Products products = new Products(
                Arrays.stream(productInfo)
                        .map(Product::new)
                        .collect(Collectors.toList())
        );

        for (String dailyProductSale : dailyProductSales) {
            Sale sale = new Sale(dailyProductSale);

            Product product = products.find(sale.id);

            answer.add(
                String.join(
                        ",",
                        sale.date,
                        product.id,
                        product.name,
                        Integer.toString(product.price * sale.stock)
                )
            );
        }

        return answer.toArray(new String[0]);
    }

    static class Product {
        private final String id;
        private final String name;
        private final int price;

        public Product(String productInfo) {
            String[] productInfoArr = productInfo.split(",");

            this.id = productInfoArr[0];
            this.name = productInfoArr[1];
            this.price = Integer.parseInt(productInfoArr[2]);
        }
    }

    static class Sale {
        private final String date;
        private final String id;
        private final int stock;

        public Sale(String dailyProductSale) {
            String[] dailyProductSaleArr = dailyProductSale.split(",");

            this.date = dailyProductSaleArr[0];
            this.id = dailyProductSaleArr[1];
            this.stock = Integer.parseInt(dailyProductSaleArr[2]);
        }
    }

    static class Products {
        private final List<Product> products;

        public Products(List<Product> products) {
            this.products = products;
        }

        public Product find(String id) {
            return products.stream()
                    .filter(product -> product.id.equals(id))
                    .findFirst()
                    .orElseThrow();
        }
    }
}
