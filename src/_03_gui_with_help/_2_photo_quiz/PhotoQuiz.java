package _03_gui_with_help._2_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address” )

		// 2. create a variable of type "Component" that will hold your image
		Component c;
		// 3. use the "createImage()" method below to initialize your Component
		c = createImage("https://vtwp-media.s3-accelerate.amazonaws.com/2021/06/panda-cubs-2021-06-30-0839.jpg");
		// 4. add the image to the quiz window
		quizWindow.add(c);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String question_1 = JOptionPane.showInputDialog("How many baby pandas are there?");
		// 7. print "CORRECT" if the user gave the right answer
		if(question_1.contentEquals("3")) {
			System.out.println("CORRECT");
		} else {
			System.out.println("INCORRECT");
		}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(c);
		// 10. find another image and create it (might take more than one line
		// of code)
		Component cc = createImage("https://static.boredpanda.com/blog/wp-content/uploads/2019/12/5e04b784657bf_EFMZ5cGx58It3l8xJdRYLhPmPErL1uOeVwWT19xnfMs__700.jpg");
		// 11. add the second image to the quiz window
		quizWindow.add(cc);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String question_2 = JOptionPane.showInputDialog("How many baby otters are there?");
		// 14+ check answer, say if correct or incorrect, etc.
		if(question_2.contentEquals("4")) {
			System.out.println("CORRECT");
		} else {
			System.out.println("INCORRECT");
		}
	}

	private Component createImage(String imageUrl) {
		JLabel imageLabel = new JLabel();
		URL url;
		try {
			url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			imageLabel.setIcon(icon);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "I can't find your image!!");
		}
		
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
