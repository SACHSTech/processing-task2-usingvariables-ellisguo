import processing.core.PApplet;
 
public class Sketch extends PApplet {
  
  
 /**
  * Called once at the beginning of execution, put your size all in this method
  */
 public void settings() {
  // put your size call here
   size(500, 500);
 }
 
 /**
  * Called once at the beginning of execution.  Add initial set up
  * values here i.e background, stroke, fill etc.
  */
 public void setup() {
   background(173, 216, 230);
 }
 
 /**
  * Called repeatedly, anything drawn to the screen goes here
  */
 public void draw() {
   
  // sample code, delete this stuff
  
   // feet
   fill(0, 128, 0);
   ellipse((width * 7)/16, height * 3/4, 30, 50);
   ellipse((width * 9)/16, height * 3/4, 30, 50);
  
   // head
   fill(0, 128, 0);
   ellipse(width/2, (height * 3)/8, (width * 3)/16, (height * 3)/16);
  
   // mask
   fill(255, 227, 48);
   rect((width * 7)/16, (height * 7)/20, width/8, height/20); 
  
   // eyes
   fill(0, 0, 0);
   ellipse((width * 19)/40, (height * 3)/8, width/40, height/40);
   ellipse((width * 21)/40, (height * 3)/8, width/40, height/40);
  
   // body
   fill(0, 128, 0);
   rect((width * 163)/400, (height * 187)/400, (width * 3)/16, height/4);
  
   // arms
   fill(0, 128, 0);
   rect((width * 113)/400, (height * 187)/400, width/8, height/20);
   rect((width * 238)/400, (height * 187)/400, width/8, height/20);
  
   // wand
   fill(0, 128, 0);
   line((width * 3)/4, height/2, (width * 3)/4, (height * 5)/16);
  
 }
  // define other methods down here.
}
