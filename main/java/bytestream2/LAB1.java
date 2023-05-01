/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bytestream2;

/**
 *
 * @author Student
 */
public class LAB1 {
    public static void main(String[] args) {
       Circle c = new Circle();
    RedShapeDecorator redCircle= new RedShapeDecorator(new Circle());
    RedShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
    redCircle.draw();
    redRectangle.draw(); 
    }
    
}
