package com.kodilla.good.patterns.Food2Door;

public interface Producer {

    boolean process(OrderRequest orderRequest);
    String getName();

}
