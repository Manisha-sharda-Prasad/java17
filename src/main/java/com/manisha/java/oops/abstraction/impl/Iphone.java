package com.manisha.java.oops.abstraction.impl;

import com.manisha.java.oops.abstraction.Phone;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Iphone implements Phone{
    @Override
    public void setRandomWallpaper() {
        log.info("Iphone :: setRandomWallpaper {} ");
    }

    @Override
    public void setCustomWallpaper(String wallPaperName) {
        log.info("Iphone :: setCustomWallpaper {} ", wallPaperName);
    }
}
