import java.io.Serializable;

public class Product implements Serializable {
    private int idProduct;
    private String nameProduct;
    private String compaynProduc;
    private int priceProduct;
    private String title;

    public Product() {
    }

    public Product(int idProduct, String nameProduct, String compaynProduc, int priceProduct, String title) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.compaynProduc = compaynProduc;
        this.priceProduct = priceProduct;
        this.title = title;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getCompaynProduc() {
        return compaynProduc;
    }

    public void setCompaynProduc(String compaynProduc) {
        this.compaynProduc = compaynProduc;
    }

    public int getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
