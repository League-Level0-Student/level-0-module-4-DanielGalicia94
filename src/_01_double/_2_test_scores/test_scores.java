package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class test_scores {
public static void main(String[] args) {
String sco0re = JOptionPane.showInputDialog("What was your score");	
double score = Double.parseDouble(sco0re);
if (score > 100) {
score = 100;	
}
if (score == 100) {
JOptionPane.showMessageDialog(null, "Exellent job with the test");	
} else if (score >= 90) {
JOptionPane.showMessageDialog(null, "Really good job with your test");	
} else if (score >= 80) {
JOptionPane.showMessageDialog(null,"Good job with your test");
} else if (score >= 70) {
	JOptionPane.showMessageDialog(null, "You did ok with your test");
} else if (score >= 60) {
	JOptionPane.showMessageDialog(null, "You need to study more");
} else {
	JOptionPane.showMessageDialog(null, "You didnt study, did you");
}
}}