package activities;

public class MyBook extends Book{

     public void setTitle(String s){
          title = s;
     }
public static void main(String[] args){

          MyBook newNovel = new MyBook();
          newNovel.setTitle("Full Stack Tester");
          System.out.println("The title is: " + newNovel.getTitle());
}

}
