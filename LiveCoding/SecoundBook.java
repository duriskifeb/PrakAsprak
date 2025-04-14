package LiveCoding;

public class SecoundBook extends Book {
    private String condition;

    //bikin Constructor
    public SecoundBook(String title, String author, int price, int stock){
        super(title, author, price, stock);
        this.condition = condition;
    }

    //setter dan getter 
    public String getCondition() {
        return condition;
    }

    public String setCondition() {
        return condition;
    }

    @Override 
    public String toString() {
        return super.toString() + "Condition " + condition;
    }
}
