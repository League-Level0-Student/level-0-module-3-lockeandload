
void setup() {
  size (1000, 1000);
  // set the size of your sketch
}

void draw() {
  background (150, 250, 10);
  int x = 500;
  for (int y=0; y<9; y++) {
   if(y%2==0){
    fill(226, 10, 30);
   }else{
    fill(255, 255, 255);
    }  
    x = x-=45;
       ellipse(500, 500, x, x);
}
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.

  //Use an if statement and remainder to alternate the color of your rings.
}
