package com.manisha.java.OOPS.Abstraction.Interface.Phone;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class windowsPhone implements Phone {
    @Override
    public void setRandomWallpaper() {
        log.info("windowsPhone :: setRandomWallpaper");
    }

    @Override
    public void setCustomWallpaper(String wallPaperName) {
        log.info("windowsPhone :: setCustomWallpaper {}", wallPaperName);
    }
}
