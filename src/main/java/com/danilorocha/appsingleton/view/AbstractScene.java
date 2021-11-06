package com.danilorocha.appsingleton.view;

import com.danilorocha.appsingleton.App;
import javafx.scene.Scene;
import javafx.scene.layout.TilePane;

public abstract class AbstractScene extends Scene {

    public AbstractScene(App app) {
        super(new TilePane(), 640, 480);
    }//construtor

}//classe
