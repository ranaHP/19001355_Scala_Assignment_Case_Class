class point(x:Double, y:Double){
  def dx:Double=x;
  def dy:Double=y;
  
  def move(dx:Double=0,dy:Double=0) = new point( this.dx+dx,this.dy+dy);
  
  def invert()=new point(this.dy, this.dx);
  
  override def toString="("+dx+","+dy+")";
}


object Question1 extends App{
  
  val pointer1=new point(1,2);
  val pointer2=new point(3,4);
 
  def add(pointer1:point,pointer2:point) = new point( pointer1.dx+pointer2.dx,pointer1.dy+pointer2.dy);

  def distance(pointer1:point,pointer2:point) =  new point((scala.math.sqrt(scala.math.pow((pointer1.dx-pointer2.dx),2)+scala.math.pow((pointer1.dy-pointer2.dy),2))),0);
 
  println("Add of (1,2) (3,4) --> "+add(pointer1,pointer2));
  println("move pointer1 by (3,0) --> "+pointer1.move(3));
  println("distance of (1,2) (3,4) --> "+distance(pointer1,pointer2).dx);
  println("Invert of (1,2) --> "+pointer1.invert());
}