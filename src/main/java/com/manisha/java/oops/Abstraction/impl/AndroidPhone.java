package com.manisha.java.oops.Abstraction.impl;

import com.manisha.java.oops.Abstraction.Phone;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AndroidPhone implements Phone {
    @Override
    public void setRandomWallpaper() {
        log.info("AndroidPhone :: setRandomWallpaper");
    }

    @Override
    public void setCustomWallpaper(String wallPaperName) {
        log.info("AndroidPhone :: setCustomWallpaper {} ", wallPaperName);
    }

    // properties
    // method

}
