package com.example.studydaggerbasic.dipattern.facade_pattern;

import dagger.Component;

@Component
public interface ShopKeeperComponent {

    ShopKeeper getShopkeeper();

}
