public class Box {

    private double width ;
    private double height ;
    private double length ;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(Box boxObject) {
        this.width = boxObject.width;
        this.height = boxObject.height ;
        this.length = boxObject.length ;
    }

    public double getVolume(){
        return this.height * this.length * this.width ;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public void makeItBigger(Box box , int times){
        box.width *= times ;
        box.height *= times ;
        box.length *= times ;
    }


}
