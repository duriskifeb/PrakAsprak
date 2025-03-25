package InheritaneJurnalModul6;

import InheritaneJurnalModul6.Book;

public class SecoundBook extends Book{
    private String condition;

    //buat constructor 
    public SecoundBook(String title, String author, int price, int stock, String condition) {
        super(title, author, price, stock);
        this.condition = condition;
    }

    //set dulu getter dan setter nya
    public String getCondition() {
        return condition;
    }
    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return super.toString() + " Kondisi " + condition;
    }
}
