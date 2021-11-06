package com.danilorocha.appsingleton.view;

import com.danilorocha.appsingleton.App;
import com.danilorocha.appsingleton.model.Config;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;

public class RelatoriosScene extends AbstractScene {
    private final Config config = Config.getInstance();

    public RelatoriosScene(App app) {
        super(app);
        var label = new Label("Formato de Relatórios = "+ config.getFormatRelatorios());
        var btnVoltar = new Button("Voltar");
        setRoot(new TilePane(label, btnVoltar));
        btnVoltar.setOnAction(actionEvent -> app.setScene(new MainScene(app)));
    }
}//classe
