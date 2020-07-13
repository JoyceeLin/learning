
package learning.java8.CompletableFuture;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/1/6 20:28
 * @Version V1.0
 */
public class Main {

    public static void main(String[] args) {
        List<Shop> shops = new ArrayList<>();
        shops.add(Shop.builder().name("店铺1").price(1.00f).build());
        shops.add(Shop.builder().name("店铺2").price(2.00f).build());
        shops.add(Shop.builder().name("店铺3").price(3.00f).build());
        List<CompletableFuture<String>> priceFutures =
                shops.stream()
                        .map(shop ->
                                CompletableFuture.supplyAsync(
                                        () -> String.format("%s price is %.2f", shop.getName(), shop.getPrice())))
                        .collect(Collectors.toList());
        List<String> shopAndPrices = priceFutures.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());
        System.out.println(shopAndPrices);
    }
}
