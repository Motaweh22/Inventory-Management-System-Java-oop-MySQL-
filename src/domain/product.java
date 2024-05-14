/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author mazen
 */
public class product {
    private String product_name;
    private String product_coste;
    private String product_type;
    private String product_id;   
    private String product_quantity;

    public product(String product_name, String product_coste, String product_type, String product_id, String product_quantity) {
        this.product_name = product_name;
        this.product_coste = product_coste;
        this.product_type = product_type;
        this.product_id = product_id;
        this.product_quantity = product_quantity;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_coste() {
        return product_coste;
    }

    public void setProduct_coste(String product_coste) {
        this.product_coste = product_coste;
    }

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getProduct_quantity() {
        return product_quantity;
    }

    public void setProduct_quantity(String product_quantity) {
        this.product_quantity = product_quantity;
    }

}
