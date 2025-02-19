package Piano_s;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

public class Piano {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Piano window = new Piano();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Piano() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("JSPiano");
		frame.setBounds(100, 100, 849, 537);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btnD = new JButton("D");
		btnD.setBounds(99, 286, 69, 202);
		btnD.setForeground(Color.BLACK);
		btnD.setBackground(Color.WHITE);
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					AudioInputStream audioInputStream = AudioSystem
							.getAudioInputStream(new File("C:\\Javawork\\d.wav"));
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();

				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		frame.getContentPane().setLayout(null);
		btnD.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnD.setVerticalAlignment(SwingConstants.BOTTOM);
		frame.getContentPane().add(btnD);

		JButton btnC = new JButton("C");
		btnC.setBounds(10, 286, 69, 202);
		btnC.setForeground(Color.BLACK);
		btnC.setBackground(Color.WHITE);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					AudioInputStream audioInputStream = AudioSystem
							.getAudioInputStream(new File("C:\\Javawork\\c.wav"));
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();

				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		btnC.setVerticalAlignment(SwingConstants.BOTTOM);
		btnC.setFont(new Font("Tahoma", Font.BOLD, 22));
		frame.getContentPane().add(btnC);

		JButton btnE = new JButton("E");
		btnE.setBounds(194, 286, 69, 202);
		btnE.setForeground(Color.BLACK);
		btnE.setBackground(Color.WHITE);
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					AudioInputStream audioInputStream = AudioSystem
							.getAudioInputStream(new File("C:\\Javawork\\e.wav"));
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();

				} catch (Exception e1) {
					// TODO: handle exception
				}
			}
		});
		btnE.setVerticalAlignment(SwingConstants.BOTTOM);
		btnE.setFont(new Font("Tahoma", Font.BOLD, 22));
		frame.getContentPane().add(btnE);

		JButton btnF = new JButton("F");
		btnF.setBounds(283, 286, 69, 202);
		btnF.setForeground(Color.BLACK);
		btnF.setBackground(Color.WHITE);
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					AudioInputStream audioInputStream = AudioSystem
							.getAudioInputStream(new File("C:\\Javawork\\f.wav"));
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();

				} catch (Exception e1) {
				}
			}
		});
		btnF.setVerticalAlignment(SwingConstants.BOTTOM);
		btnF.setFont(new Font("Tahoma", Font.BOLD, 22));
		frame.getContentPane().add(btnF);

		JButton btnG = new JButton("G");
		btnG.setBounds(362, 286, 69, 202);
		btnG.setForeground(Color.BLACK);
		btnG.setBackground(Color.WHITE);
		btnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream = AudioSystem
							.getAudioInputStream(new File("C:\\Javawork\\g.wav"));
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();

				} catch (Exception e1) {
					// TODO: handle exception
				}
			}
		});
		btnG.setVerticalAlignment(SwingConstants.BOTTOM);
		btnG.setFont(new Font("Tahoma", Font.BOLD, 22));
		frame.getContentPane().add(btnG);

		JButton btnA = new JButton("A");
		btnA.setBounds(441, 286, 69, 202);
		btnA.setForeground(Color.BLACK);
		btnA.setBackground(Color.WHITE);
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					AudioInputStream audioInputStream = AudioSystem
							.getAudioInputStream(new File("C:\\Javawork\\a.wav"));
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();

				} catch (Exception e1) {
					// TODO: handle exception
				}
			}
		});
		btnA.setVerticalAlignment(SwingConstants.BOTTOM);
		btnA.setFont(new Font("Tahoma", Font.BOLD, 22));
		frame.getContentPane().add(btnA);

		JButton btnB = new JButton("B");
		btnB.setBounds(520, 286, 69, 202);
		btnB.setForeground(Color.BLACK);
		btnB.setBackground(Color.WHITE);
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					AudioInputStream audioInputStream = AudioSystem
							.getAudioInputStream(new File("C:\\Javawork\\b.wav"));
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();

				} catch (Exception e1) {
					// TODO: handle exception
				}
			}
		});
		btnB.setVerticalAlignment(SwingConstants.BOTTOM);
		btnB.setFont(new Font("Tahoma", Font.BOLD, 22));
		frame.getContentPane().add(btnB);

		JButton btnC_1 = new JButton("C#");
		btnC_1.setBounds(99, 50, 69, 202);
		btnC_1.setForeground(Color.WHITE);
		btnC_1.setBackground(Color.BLACK);
		btnC_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					AudioInputStream audioInputStream = AudioSystem
							.getAudioInputStream(new File("C:\\Javawork\\c#.wav"));
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();

				} catch (Exception e1) {
					// TODO: handle exception
				}

			}

		});
		btnC_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnC_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		frame.getContentPane().add(btnC_1);

		JButton btnD_1 = new JButton("D#");
		btnD_1.setBounds(181, 50, 69, 202);
		btnD_1.setForeground(Color.WHITE);
		btnD_1.setBackground(Color.BLACK);
		btnD_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					AudioInputStream audioInputStream = AudioSystem
							.getAudioInputStream(new File("C:\\Javawork\\d#.wav"));
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();

				} catch (Exception e1) {
					// TODO: handle exception
				}
			}
		});
		btnD_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnD_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		frame.getContentPane().add(btnD_1);

		JButton btnF_1 = new JButton("F#");
		btnF_1.setBounds(316, 50, 69, 202);
		btnF_1.setForeground(Color.WHITE);
		btnF_1.setBackground(Color.BLACK);
		btnF_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					AudioInputStream audioInputStream = AudioSystem
							.getAudioInputStream(new File("C:\\Javawork\\f#.wav"));
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();

				} catch (Exception e1) {
					// TODO: handle exception
				}
			}
		});
		btnF_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnF_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		frame.getContentPane().add(btnF_1);

		JButton btnBb = new JButton("Bb");
		btnBb.setBounds(636, 50, 69, 202);
		btnBb.setForeground(Color.WHITE);
		btnBb.setBackground(Color.BLACK);
		btnBb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					AudioInputStream audioInputStream = AudioSystem
							.getAudioInputStream(new File("C:\\Javawork\\bb.wav"));
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();

				} catch (Exception e1) {
					// TODO: handle exception
				}
			}
		});
		btnBb.setVerticalAlignment(SwingConstants.BOTTOM);
		btnBb.setFont(new Font("Tahoma", Font.BOLD, 22));
		frame.getContentPane().add(btnBb);

		JButton btnEb = new JButton("eB");
		btnEb.setBounds(715, 50, 69, 202);
		btnEb.setForeground(Color.WHITE);
		btnEb.setBackground(Color.BLACK);
		btnEb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					AudioInputStream audioInputStream = AudioSystem
							.getAudioInputStream(new File("C:\\Javawork\\eb.wav"));
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();

				} catch (Exception e1) {
					// TODO: handle exception
				}
			}
		});
		btnEb.setVerticalAlignment(SwingConstants.BOTTOM);
		btnEb.setFont(new Font("Tahoma", Font.BOLD, 22));
		frame.getContentPane().add(btnEb);

		JButton btnG_1 = new JButton("G#");
		btnG_1.setBounds(408, 50, 69, 202);
		btnG_1.setForeground(Color.WHITE);
		btnG_1.setBackground(Color.BLACK);
		btnG_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream = AudioSystem
							.getAudioInputStream(new File("C:\\Javawork\\g#.wav"));
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();

				} catch (Exception e1) {
					// TODO: handle exception
				}

			}
		});
		btnG_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnG_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		frame.getContentPane().add(btnG_1);

		JButton btnC_2 = new JButton("F1");
		btnC_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					AudioInputStream audioInputStream = AudioSystem
							.getAudioInputStream(new File("C:\\Javawork\\f1.wav"));
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();

				} catch (Exception e1) {
					// TODO: handle exception
				}
			}
		});
		btnC_2.setVerticalAlignment(SwingConstants.BOTTOM);
		btnC_2.setForeground(Color.BLACK);
		btnC_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnC_2.setBackground(Color.WHITE);
		btnC_2.setBounds(597, 286, 69, 202);
		frame.getContentPane().add(btnC_2);

		JButton btnD_2 = new JButton("D1");
		btnD_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					AudioInputStream audioInputStream = AudioSystem
							.getAudioInputStream(new File("C:\\Javawork\\d1.wav"));
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();

				} catch (Exception e1) {
					// TODO: handle exception
				}
			}
		});
		btnD_2.setVerticalAlignment(SwingConstants.BOTTOM);
		btnD_2.setForeground(Color.BLACK);
		btnD_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnD_2.setBackground(Color.WHITE);
		btnD_2.setBounds(675, 286, 69, 202);
		frame.getContentPane().add(btnD_2);

		JButton btnF_2 = new JButton("C1");
		btnF_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream = AudioSystem
							.getAudioInputStream(new File("C:\\Javawork\\c1.wav"));
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();

				} catch (Exception e1) {
					// TODO: handle exception
				}
			}
		});
		btnF_2.setVerticalAlignment(SwingConstants.BOTTOM);
		btnF_2.setForeground(Color.BLACK);
		btnF_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnF_2.setBackground(Color.WHITE);
		btnF_2.setBounds(754, 286, 69, 202);
		frame.getContentPane().add(btnF_2);

		JButton btnG_2 = new JButton("G1");
		btnG_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream = AudioSystem
							.getAudioInputStream(new File("C:\\Javawork\\g3.wav"));
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();

				} catch (Exception e1) {
					// TODO: handle exception
				}
			}
		});
		btnG_2.setVerticalAlignment(SwingConstants.BOTTOM);
		btnG_2.setForeground(Color.WHITE);
		btnG_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnG_2.setBackground(Color.BLACK);
		btnG_2.setBounds(503, 50, 69, 202);
		frame.getContentPane().add(btnG_2);
	}
}
