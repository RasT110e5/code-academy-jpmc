package co;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class StackExample {

    public static void main (String args[]){
        Stack<String> stack = new Stack<>();
        stack.push("hola1");
        stack.push("hola2");
        stack.push("hola3");

        System.out.println(stack.pop());

        JFrame frame = new JFrame("Ejemplo");
        frame.setLayout(new FlowLayout());
        JTextField field = new JTextField("Ingrese un texto");
        JButton boton1 = new JButton("Undo");

        field.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println(field.getText());
            }});



        frame.add(field);
        frame.add(boton1);
        frame.setPreferredSize(new Dimension(400,400));
        frame.pack();
        frame.setVisible(true);
    }
}
