public class Book {
    public String isim;
    public int pageNumber;

    public Book(String isim, int pageNumber) {
        if(pageNumber<0){
            pageNumber=0;
        }
        this.isim = isim;
        this.pageNumber = pageNumber;
    }

    public void changePageNumber(int pageNumber){
        if(pageNumber<0){
            pageNumber=0;
        }
        this.pageNumber=pageNumber;
    }

    public String showName(){
        return this.isim;
    }

    public void setName(String isim){
        this.isim = isim;
    }
}
