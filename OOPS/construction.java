public class construction {
   private double width;
    private double height;
    private double depth;
    construction(int width,int height,int depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
       double getvolume(){
           return width*height*depth;
       }
    public static void main(String[] args) {
      construction construction= new construction(10,20,30);
      System.out.println("The volume of construction is"+construction.getvolume());
    }
}