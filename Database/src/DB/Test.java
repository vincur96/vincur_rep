package DB;

//BbDb.sqlite has another table with nickname and points...if an exception occurs, you must include jdbc library!

public class Test {
    public static void main(String[] args) {
        DBCom db1 = new DBCom();
        db1.start();
        //db1.insert();
    }
}
