package com.example.maquinaexpendedora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label label;
    @FXML
    private Label label1;
    @FXML
    private Label label2;
    private String producto;
    private String dinero = "0.00";
    private String precio = "0.00";
    private double traductor;
    private double traductor2;
    @FXML
    public void CalculoDinero() {

            traductor = Double.parseDouble(dinero);
            traductor2 = Double.parseDouble(precio);
            if(traductor >= traductor2)
            {
                dinero = String.valueOf(traductor - traductor2);


                Alert alerta = new Alert(Alert.AlertType.INFORMATION);
                alerta.setTitle("Comprado");
                alerta.setHeaderText("Compra realizada");
                alerta.setContentText("Has comprado "+producto+" por "+precio+"€. Te sobra "+dinero+"€");
                alerta.showAndWait();
                precio = "0.00";
                label.setText((precio));
                label1.setText(String.valueOf(dinero));
                producto = "";
            }
            else
            {
                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setTitle("No se pudo comprar");
                alerta.setHeaderText("Saldo insuficiente");
                alerta.setContentText("No se pudo comprar "+producto+" por falta de saldo");
                alerta.showAndWait();
            }


    }



    public void SandwichPavo(ActionEvent event) {
    precio = "2.00";
    label.setText((precio));
    producto = "Sandwich Pavo";
    label2.setText((producto));
    }

    public void SandwichMixto(ActionEvent event) {
    precio = "2.50";
    label.setText((precio));
    producto = "Sandwich Mixto";
    label2.setText((producto));
    }

    public void CocaCola(ActionEvent event) {
    precio = "1.00";
    label.setText((precio));
    producto = "CocaCola";
    label2.setText((producto));
    }

    public void Fanta(ActionEvent event) {
    precio = "0.80";
    label.setText((precio));
    producto = "Fanta";
    label2.setText((producto));
    }

    public void Oreos(ActionEvent event) {
    precio = "1.50";
    label.setText((precio));
    producto = "Oreos";
    label2.setText((producto));
    }

    public void Cargador(ActionEvent event) {
    precio = "5.00";
    label.setText((precio));
    producto = "Cargador";
    label2.setText((producto));
    }

    public void uneuro(ActionEvent event){
        traductor = Double.parseDouble(dinero);
        dinero = String.valueOf(traductor + 1);
        label1.setText((dinero));
    }
    public void doseuro(ActionEvent event){
        traductor = Double.parseDouble(dinero);
        dinero = String.valueOf(traductor + 2);
        label1.setText((dinero));
    }
    public void cinccent(ActionEvent event){
        traductor = Double.parseDouble(dinero);
        dinero = String.valueOf(traductor + 0.50);
        label1.setText((dinero));
    }
    public void veintecent(ActionEvent event){
        traductor = Double.parseDouble(dinero);
        dinero = String.valueOf(traductor + 0.20);
        label1.setText((dinero));
    }
    public void diezcent(ActionEvent event){
        traductor = Double.parseDouble(dinero);
        dinero = String.valueOf(traductor + 0.10);
        label1.setText((dinero));
    }
    public void cincocent(ActionEvent event){
        traductor = Double.parseDouble(dinero);
        dinero = String.valueOf(traductor + 0.05);
        label1.setText((dinero));
    }
    public void doscent(ActionEvent event){
        traductor = Double.parseDouble(dinero);
        dinero = String.valueOf(traductor + 0.02);
        label1.setText((dinero));
    }
    public void unocent(ActionEvent event){
        traductor = Double.parseDouble(dinero);
        dinero = String.valueOf(traductor + 0.01);
        label1.setText((dinero));
    }
    public void BotonDevolver(ActionEvent event){
        dinero = "0.00";
        label1.setText((dinero));

    }


}
