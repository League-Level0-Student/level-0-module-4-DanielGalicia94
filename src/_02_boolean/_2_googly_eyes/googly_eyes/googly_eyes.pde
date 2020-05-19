PImage face;
void mousePressed() {
print("X = " +mouseX+", ");
print("Y = " +mouseY+";  ");
} 

void setup() {
face = loadImage("owl.jpg");
size(800,600);
face.resize(width,height);  
}

void draw() {

}
