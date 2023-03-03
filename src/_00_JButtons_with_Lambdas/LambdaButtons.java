package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

import intro.AFunctionalInterface;

public class LambdaButtons implements ActionListener {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		addNumbers.addActionListener(this);
		randNumber.addActionListener(this);
		tellAJoke.addActionListener(this);
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
		
		AFunctionalInterface add2Numbers = (input1, input2) -> {
            System.out.println("Sum = " + (input1 + input2));
            return 0;
        };
        
        AFunctionalInterface getRandNum = (input1, input2) -> {
        	int randNum;
        	Random rand = new Random();
            randNum = rand.nextInt(100);
            return randNum;
        };
        
        AFunctionalInterface tellJoke = (input1, input2) -> {
        	String[] jokeList = {"What’s the difference between a poorly dressed man on a tricycle and a well-dressed man on a bicycle?... Attire!", "Why can't you trust the king of the jungle?... Because he's always lion.", "Why do seagulls fly over the sea?... If they flew over the bay, they would be bagels.", "What did the janitor say when he jumped out of the closet?... Supplies!"};
        	int randNum;
        	Random rand = new Random();
            randNum = rand.nextInt(4);
            String joke = jokeList.get(randNum);
            return jokeList[randNum];
        };
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
}
