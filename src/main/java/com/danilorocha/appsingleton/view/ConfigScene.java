package com.danilorocha.appsingleton.view;

import com.danilorocha.appsingleton.App;
import com.danilorocha.appsingleton.model.Config;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class ConfigScene extends AbstractScene {
    private final Config config = Config.getInstance();
    public ConfigScene(App app) {
        super(app);
        var label1 = new Label("Formato de Relatórios");
        var fieldFormatRelatorios = new TextField(config.getFormatRelatorios());
        var label2 = new Label("Tipo de Gráficos");
        var fieldTiposGraficos = new TextField(config.getTipoGraficos());
        var btnOk = new Button("OK");
        setRoot(new VBox(label1, fieldFormatRelatorios, label2, fieldTiposGraficos, btnOk));

        btnOk.setOnAction(actionEvent -> {
            config.setFormatRelatorios(fieldFormatRelatorios.getText());
            config.setTipoGraficos(fieldTiposGraficos.getText());
            app.setScene(new MainScene(app));
        });
    }
}//construtor
