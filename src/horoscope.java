import javax.swing.JOptionPane;

public class horoscope {
public static void main(String[] args) {
	String zodiac =  JOptionPane.showInputDialog("whats your zodiac sign");
	if (zodiac.equals("Cancer")) {
	 JOptionPane.showMessageDialog(null, "When you have to solve a situation in an alien way to you today, you might learn something new.");
	}
	else if(zodiac.equals("scorpio")) {
	JOptionPane.showMessageDialog(null, "When something interrupts your routine or schedule today relax into it and be flexible, dont panic");
	}
	else if(zodiac.equals("leo")) {
	JOptionPane.showMessageDialog(null, "Theres urgency in your passions today, from romantic passion to any cause or pursuit you are passionate about.");
}
	else if(zodiac.equals("Pisces")) {
	JOptionPane.showMessageDialog(null, "As The Moon leaves your house today go with the flow when things heat up in your work life.");

}
else if(zodiac.equals("Virgo")) {
JOptionPane.showMessageDialog(null, "While you reflect on holding back today others will feel you are withdrawing from them, find balance");
}
else if(zodiac.equals("Aquarius")) {
JOptionPane.showMessageDialog(null, "As peace comes to you today take this chance to rest and charge our batteries, you have perspective and calm.");
}
else if(zodiac.equals("Aries")) {
JOptionPane.showMessageDialog(null, "Be flexible when a situation isnt perfect today, dont fall back on charm to get you out of this.");
}
else if(zodiac.equals("Taurus")) {
JOptionPane.showMessageDialog(null, "Be welcoming and warm to everyone you meet today, someone will be important for your future.");	
}
else if(zodiac.equals("Gemini ")) {
JOptionPane.showMessageDialog(null, "When you want to move a relationship on today be gentle and dont push too hard or you may push them away");
}
else if(zodiac.equals("Libra ")) {
JOptionPane.showMessageDialog(null, "When you are tempted to pick fault with others today, turn the attention on yourself instead");
	}
else if(zodiac.equals("Sagittarius")) {
JOptionPane.showMessageDialog(null, "When things dont go to plan today dont blame others, be understanding of their issues and lives.");
}
else if(zodiac.equals("Capricorn ")) {
JOptionPane.showMessageDialog(null, "You are ready to attack anyone who crosses you today, but be considerate of those who dont mean to offend you.");	
}
}




}
