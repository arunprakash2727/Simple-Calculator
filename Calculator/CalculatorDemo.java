package Calculator;

import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
class Calculator extends Frame implements ActionListener{
    TextField display;
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,plus,minus,multiply,devision,equal,clear;
    public Calculator(){
        setTitle("Calculator");
        setVisible(true);
        setSize(1000,600);
        Color backround=new Color(150,130,230);
        setBackground(backround);
        setLayout(null);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });

        Font titleFont=new Font("Arial",Font.BOLD,35);
        Font displayFont=new Font("Helvetica",Font.PLAIN,30);
        Font buttonFont=new Font("Verdana",Font.PLAIN,22);

        Label title=new Label("Calculator");
        title.setBounds(370,35,170,35);
        title.setFont(titleFont);
        title.setForeground(Color.CYAN);

        display=new TextField("");
        display.setBounds(100,80,800,50);
        display.setFont(displayFont);

        btn0=new Button("0");
        btn0.setBounds(100,150,90,70);
        btn0.setFont(buttonFont);
        btn0.setBackground(Color.LIGHT_GRAY);
        btn0.addActionListener(this);

        btn1=new Button("1");
        btn1.setBounds(300,150,90,70);
        btn1.setFont(buttonFont);
        btn1.setBackground(Color.LIGHT_GRAY);
        btn1.addActionListener(this);

        btn2=new Button("2");
        btn2.setBounds(500,150,90,70);
        btn2.setFont(buttonFont);
        btn2.setBackground(Color.LIGHT_GRAY);
        btn2.addActionListener(this);

        btn3=new Button("3");
        btn3.setBounds(700,150,90,70);
        btn3.setFont(buttonFont);
        btn3.setBackground(Color.LIGHT_GRAY);
        btn3.addActionListener(this);

        btn4=new Button("4");
        btn4.setBounds(100,280,90,70);
        btn4.setFont(buttonFont);
        btn4.setBackground(Color.LIGHT_GRAY);
        btn4.addActionListener(this);

        btn5=new Button("5");
        btn5.setBounds(300,280,90,70);
        btn5.setFont(buttonFont);
        btn5.setBackground(Color.LIGHT_GRAY);
        btn5.addActionListener(this);

        btn6=new Button("6");
        btn6.setBounds(500,280,90,70);
        btn6.setFont(buttonFont);
        btn6.setBackground(Color.LIGHT_GRAY);
        btn6.addActionListener(this);

        btn7=new Button("7");
        btn7.setBounds(700,280,90,70);
        btn7.setFont(buttonFont);
        btn7.setBackground(Color.LIGHT_GRAY);
        btn7.addActionListener(this);

        btn8=new Button("8");
        btn8.setBounds(100,420,90,70);
        btn8.setFont(buttonFont);
        btn8.setBackground(Color.LIGHT_GRAY);
        btn8.addActionListener(this);

        btn9=new Button("9");
        btn9.setBounds(300,420,90,70);
        btn9.setFont(buttonFont);
        btn9.setBackground(Color.LIGHT_GRAY);
        btn9.addActionListener(this);

        equal=new Button("=");
        equal.setBounds(500,420,90,70);
        equal.setFont(buttonFont);
        equal.setBackground(Color.GREEN);
        equal.addActionListener(this);

        clear=new Button("Clear");
        clear.setBounds(700,420,90,70);
        clear.setFont(buttonFont);
        clear.setBackground(Color.YELLOW);
        clear.addActionListener(this);

        plus=new Button("+");
        plus.setBounds(850,160,60,50);
        plus.setFont(buttonFont);
        plus.setBackground(Color.MAGENTA);
        plus.addActionListener(this);

        minus=new Button("-");
        minus.setBounds(850,250,60,50);
        minus.setFont(buttonFont);
        minus.setBackground(Color.MAGENTA);
        minus.addActionListener(this);

        multiply=new Button("x");
        multiply.setBounds(850,340,60,50);
        multiply.setFont(buttonFont);
        multiply.setBackground(Color.MAGENTA);
        multiply.addActionListener(this);

        devision=new Button("/");
        devision.setBounds(850,435,60,50);
        devision.setFont(buttonFont);
        devision.setBackground(Color.MAGENTA);
        devision.addActionListener(this);

        add(title);
        add(display);
        add(btn0);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btn7);
        add(btn8);
        add(btn9);
        add(equal);
        add(clear);
        add(plus);
        add(minus);
        add(multiply);
        add(devision);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn0){
            String expression=display.getText();
            expression +="0";
            display.setText(expression);
        }
        if(e.getSource()==btn1){
            String expression=display.getText();
            expression +="1";
            display.setText(expression);
        }
        if(e.getSource()==btn2){
            String expression=display.getText();
            expression +="2";
            display.setText(expression);
        }
        if(e.getSource()==btn3){
            String expression=display.getText();
            expression +="3";
            display.setText(expression);
        }
        if(e.getSource()==btn4){
            String expression=display.getText();
            expression +="4";
            display.setText(expression);
        }
        if(e.getSource()==btn5){
            String expression=display.getText();
            expression +="5";
            display.setText(expression);
        }
        if(e.getSource()==btn6){
            String expression=display.getText();
            expression +="6";
            display.setText(expression);
        }
        if(e.getSource()==btn7){
            String expression=display.getText();
            expression +="7";
            display.setText(expression);
        }
        if(e.getSource()==btn8){
            String expression=display.getText();
            expression +="8";
            display.setText(expression);
        }
        if(e.getSource()==btn9){
            String expression=display.getText();
            expression +="9";
            display.setText(expression);
        }
        if(e.getSource()==plus){
            String expression=display.getText();
            expression +="+";
            display.setText(expression);
        }
        if(e.getSource()==minus){
            String expression=display.getText();
            expression +="-";
            display.setText(expression);
        }
        if(e.getSource()==multiply){
            String expression=display.getText();
            expression +="x";
            display.setText(expression);
        }
        if(e.getSource()==devision){
            String expression=display.getText();
            expression +="/";
            display.setText(expression);
        }
        if(e.getSource()==clear){
            display.setText("");
        }
        if(e.getSource()==equal){
            int a,b,i;
            char operator='+';
            String expression=display.getText();
            String tempA="", tempB="";
            for(i=0;i<expression.length();i++){
                if(Character.isDigit(expression.charAt(i))){
                    tempA +=expression.charAt(i);
                }
                else{
                    operator=expression.charAt(i);
                    break;
                }
            }
            tempB +=expression.substring(i+1);

            a = Integer.parseInt(tempA);
            b = Integer.parseInt(tempB);

            int result=0;

            switch(operator){
                case '+'->
                        result=a+b;

                case '-'->
                        result=a-b;


                case 'x'->
                        result=a*b;


                case '/'->
                        result=a/b;
            }
            display.setText(String.valueOf(result));
        }
    }
}
public class CalculatorDemo{
    public static void main(String[]args){
        new Calculator();
    }
}
