void setup() {
	size(400, 400);
}
void draw() {
	background(255);
	stroke(0);
  fill(255);
  line(200,0,200,400);
  line(0,200,400,200);
  
  if(mouseX < 200 && mouseY < 200){
    fill(0)
    rect(0,0,200,200)  
  
  }else if(mouseX > 200 && mouseY < 200){
    fill(0)
    rect(200,0,200,200)  
 
  }else if(mouseX > 200 && mouseY > 200){
    fill(0)
    rect(200,200,200,200) 
 
  }else if(mouseX < 200 && mouseY > 200){
    fill(0)
    rect(0,200,200,200)
  }
  println(mouseX,mouseY);
} 
