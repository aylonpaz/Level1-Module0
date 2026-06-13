package _01_methods._5_FlappyBird;

import java.util.Random;

import javax.swing.JOptionPane;

import processing.core.PApplet;
import processing.core.PImage;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int birdX = 150;
    int birdY = 300;
    int birdVelocity = -10;
    int framesDrawn = 0;
    int gravity = 1;
    PImage topPipe;
    PImage bottomPipe;
    int pipeX = 750;
    int topPipeSize = (int) random(100, 400);
    int pipeGap = 100;
    int bottomPipeLeftCorner;
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
       
    }

    @Override
    public void setup() {
        frameRate(60);
        topPipe = loadImage("src/_01_methods/_5_FlappyBird/topPipe.png");
        topPipe.resize(50, topPipeSize);
        bottomPipe = loadImage("src/_01_methods/_5_FlappyBird/bottomPipe.png");
        bottomPipeLeftCorner = topPipeSize + pipeGap;
    }

    @Override
    public void draw() {
    	
    	 background(40,200,40);
     fill(200, 40, 10);
     stroke(0,0,0);
     ellipse(birdX,birdY,30,30);
     image(topPipe,pipeX, 0);
     image(bottomPipe,pipeX, bottomPipeLeftCorner);
    // if(framesDrawn %2 == 0) {
     birdY += birdVelocity;
     birdVelocity += gravity;
     pipeX -= 1;
     if(mousePressed || keyPressed) {
    	 birdVelocity = -10;
     }
     if(birdY >= height + 50 || birdY <= -50) {
    	 JOptionPane.showMessageDialog(null, "You lost!");
    	 exit();
     }
     if(pipeX <= -50) {
    	 pipeX = 750;
    	 topPipeSize = (int) random(100, 400);
    	 topPipe.resize(50, topPipeSize);
    	 bottomPipe.resize(50, 600 - (topPipeSize + pipeGap));
     }
    // }
    // framesDrawn +=1;
    }
    
    @Override
    public void mouseClicked() {
    	// TODO Auto-generated method stub
    	super.mouseClicked();
    	 birdVelocity = -10;
    }
    
    @Override
    public void keyReleased() {
    	// TODO Auto-generated method stub
    	super.keyReleased();
    	 birdVelocity = -10;
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
