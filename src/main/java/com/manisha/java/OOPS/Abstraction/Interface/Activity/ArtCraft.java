package com.manisha.java.OOPS.Abstraction.Interface.Activity;
import com.manisha.java.util.Print;
//STEP-2-Implementing an Interface
public class ArtCraft implements Activity{

    @Override
    public void makeArt() {
        Print.print("Making art makes you happy! so make a blue painting.");
    }
    @Override
    public void pinterestSearch() {
        Print.print("Take some idea from pinterest, before you start to paint.");
    }
}
