class Box {
    int width;
    int height;
    int depth;
        void volume(int width,int height,int depth){
            System.out.println("the volume of object with width: "+ width*height*depth);
        }
    
    public static void main(String[] args) {
      Box mybox=new Box();
      mybox.volume(100,10,20);
    }
}