package com.itu.assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * This class is to used authenticate the user credentials.
 * If the username and password are correct then it should popup a welcome window.
 * @author sindhu
 *
 */
class AuthenticateUserCredentials extends JFrame {
	JButton login, borrow, returnBook, exit;
	JTextField unameField, bookField;
	JPasswordField passwordField;
	JLabel username, password;
	JLabel bookName ;
	int javaAvailableBookCount=5, pythonAvailableBookCount=5, javaScriptAvailableBookCount=5, phpAvailableBookCount=5, rubyAvailableBookCount = 5;
	int javaBorrowedBookCount=0, pythonBorrowedBookCount=0, javaScriptBorrowedBookCount=0, phpBorrowedBookCount=0, rubyBorrowedBookCount = 0;
	String bookTransactedName;

	public AuthenticateUserCredentials() {
		setTitle("Login to ITU");
		setLayout(new GridLayout(3, 2));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		username = new JLabel("Username");
		password = new JLabel("Password");

		unameField = new JTextField(20);
		passwordField = new JPasswordField(20);

		login = new JButton("Login");
		exit = new JButton("Exit");

		add(username);
		add(unameField);

		add(password);
		add(passwordField);

		add(login);
		add(exit);

		unameField.requestFocus();

		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				System.exit(0);
			}
		});

		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String un = unameField.getText();
				String pa = new String(passwordField.getPassword());

				if ((un.equals("student_2")) && (pa.equals("ituOfsanjose"))) {
					dispose();
					new AuthenticationSuccess();
				}else{
					dispose();
					new AuthenticationFailure();
				}
			}
		});

		KeyAdapter k = new KeyAdapter() {
			public void keyPressed(KeyEvent ke) {
				if (ke.getKeyCode() == KeyEvent.VK_ENTER)
					login.doClick();
			}
		};

		passwordField.addKeyListener(k);
		unameField.addKeyListener(k);

		pack();
		setLocationRelativeTo(null);
	}

	class BookBorrowed extends JFrame {
		public BookBorrowed() {
		setTitle("Borrow Books");
		setLayout(new GridLayout(2, 2));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		bookName = new JLabel("Which Book?");

		bookField = new JTextField(20);

		borrow = new JButton("Borrow");
		exit = new JButton("Exit");

		add(bookName);
		add(bookField);


		add(borrow);
		add(exit);

		bookField.requestFocus();

		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				System.exit(0);
			}
		});

		borrow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				bookTransactedName = bookField.getText();

				if ((!bookTransactedName.equals(""))) {
					bookBorrowTransaction(bookTransactedName);
					dispose();
					new ViewStock();
				}
			}
		});

		KeyAdapter k = new KeyAdapter() {
			public void keyPressed(KeyEvent ke) {
				if (ke.getKeyCode() == KeyEvent.VK_ENTER)
					borrow.doClick();
			}
		};

		bookField.addKeyListener(k);

		pack();
		setLocationRelativeTo(null);
	}
	}
	
	class BookReturned extends JFrame {
		public BookReturned() {
		setTitle("Return Books");
		setLayout(new GridLayout(2, 2));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		bookName = new JLabel("Which Book?");

		bookField = new JTextField(20);

		returnBook = new JButton("Return");
		exit = new JButton("Exit");

		add(bookName);
		add(bookField);


		add(returnBook);
		add(exit);

		bookField.requestFocus();

		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				System.exit(0);
			}
		});

		returnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				bookTransactedName = bookField.getText();

				if ((!bookTransactedName.equals(""))) {
					returnBookTransaction(bookTransactedName);
					dispose();
					new ViewStock();
				}
			}
		});

		KeyAdapter k = new KeyAdapter() {
			public void keyPressed(KeyEvent ke) {
				if (ke.getKeyCode() == KeyEvent.VK_ENTER)
					returnBook.doClick();
			}
		};

		bookField.addKeyListener(k);

		pack();
		setLocationRelativeTo(null);
	}
	}
	
	void bookBorrowTransaction(String bookName){
		
		if(bookName.equalsIgnoreCase("Java")){
			javaBorrowedBookCount = javaBorrowedBookCount + 1;
	    	javaAvailableBookCount = javaAvailableBookCount - 1;
		} else if(bookName.equalsIgnoreCase("JavaScript")){
			javaScriptBorrowedBookCount = javaScriptBorrowedBookCount + 1;
	    	javaScriptAvailableBookCount = javaScriptAvailableBookCount - 1;
		}if(bookName.equalsIgnoreCase("Python")){
			pythonBorrowedBookCount = pythonBorrowedBookCount + 1;
	    	pythonAvailableBookCount = pythonAvailableBookCount - 1;
		}if(bookName.equalsIgnoreCase("PHP")){
			phpBorrowedBookCount = phpBorrowedBookCount + 1;
	    	phpAvailableBookCount = phpAvailableBookCount - 1;
		}if(bookName.equalsIgnoreCase("Ruby")){
			rubyBorrowedBookCount = rubyBorrowedBookCount + 1;
	    	rubyAvailableBookCount = rubyAvailableBookCount - 1;
		}
		
	}
	
	void returnBookTransaction(String bookName){
		
		if(bookName.equalsIgnoreCase("Java")){
			javaBorrowedBookCount = javaBorrowedBookCount - 1;
	    	javaAvailableBookCount = javaAvailableBookCount + 1;
		} else if(bookName.equalsIgnoreCase("JavaScript")){
			javaScriptBorrowedBookCount = javaScriptBorrowedBookCount - 1;
	    	javaScriptAvailableBookCount = javaScriptAvailableBookCount + 1;
		}if(bookName.equalsIgnoreCase("Phython")){
			pythonBorrowedBookCount = pythonBorrowedBookCount - 1;
	    	pythonAvailableBookCount = pythonAvailableBookCount + 1;
		}if(bookName.equalsIgnoreCase("PHP")){
			phpBorrowedBookCount = phpBorrowedBookCount - 1;
	    	phpAvailableBookCount = phpAvailableBookCount + 1;
		}if(bookName.equalsIgnoreCase("Ruby")){
			rubyBorrowedBookCount = rubyBorrowedBookCount - 1;
	    	rubyAvailableBookCount = rubyAvailableBookCount + 1;
		}
		
	}
	
	//This is to bring up a popup window for successful login
	class AuthenticationSuccess extends JFrame {
		JLabel exit;
		JMenuBar mbar;
		JLabel label, title, availableBooksCount, borrowedBooksCount;
		JLabel Java, Python, Javascript, PHP, Ruby;

		public AuthenticationSuccess() {
			setTitle("Welcome To ITU");
			setSize(400, 400);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);

			mbar = new JMenuBar();
			mbar.setLayout(new FlowLayout());

			setLayout(new GridLayout(6, 3));
			
			label = new JLabel("Congratulations! You are now logged in to ITU.");
			mbar.add(label);
			exit = new JLabel("<html><a href=''>Exit</a></html>");
			exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
			exit.setFont(new Font("Tahoma", Font.PLAIN, 13));

			
			
			
			
			exit.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent ae) {
					System.exit(0);
				}
			});

			mbar.add(exit);

			setJMenuBar(mbar);

			setExtendedState(MAXIMIZED_BOTH);
			
			Action viewTheStock = new AbstractAction() {
			    public void actionPerformed(ActionEvent e) {
			    	dispose();
			    	new ViewStock();
			    }
			};
			Action borrowTheBook = new AbstractAction() {
			    public void actionPerformed(ActionEvent e) {
			    	dispose();
			    	new BookBorrowed();
			    }
			};
			Action returnTheBook = new AbstractAction() {
			    public void actionPerformed(ActionEvent e) {
			    	dispose();
			    	new BookReturned();
			    }
			};
			Action quitTheApplication = new AbstractAction() {
			    public void actionPerformed(ActionEvent e) {
			    	dispose();
			    	System.exit(0);
			    }
			};
			
			mbar.getInputMap().put(KeyStroke.getKeyStroke("V"),
                    "viewTheStock");
			mbar.getInputMap().put(KeyStroke.getKeyStroke("B"),
                    "borrowTheBook");
			mbar.getInputMap().put(KeyStroke.getKeyStroke("R"),
                    "returnTheBook");
			mbar.getInputMap().put(KeyStroke.getKeyStroke("Q"),
                    "quitTheApplication");
			
			
			mbar.getActionMap().put("viewTheStock",
					viewTheStock);
			mbar.getActionMap().put("borrowTheBook",
					borrowTheBook);
			mbar.getActionMap().put("returnTheBook",
					returnTheBook);
			mbar.getActionMap().put("quitTheApplication",
					quitTheApplication);
			
			
		}
		
		
	}
	
	
	//This is to bring up a popup window for successful login
		class ViewStock extends JFrame {
			JLabel exit;
			JMenuBar mbar;
			JLabel label, title, availableBooksCount, borrowedBooksCount;
			JLabel Java, Python, Javascript, PHP, Ruby;

			public ViewStock() {
				setTitle("View Stock");
				setSize(400, 400);
				setVisible(true);
				setDefaultCloseOperation(EXIT_ON_CLOSE);

				mbar = new JMenuBar();
				mbar.setLayout(new FlowLayout());

				setLayout(new GridLayout(6, 3));
				
				label = new JLabel("Congratulations! You are now logged in to ITU.");
				mbar.add(label);
				exit = new JLabel("<html><a href=''>Exit</a></html>");
				exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
				exit.setFont(new Font("Tahoma", Font.PLAIN, 13));

				
				title = new JLabel("Title");
				availableBooksCount = new JLabel("Available Book Count");
				borrowedBooksCount = new JLabel("Borrowed Book Count");
				
				Java = new JLabel("Java");
				Python = new JLabel("Python");
				Javascript = new JLabel("Javascript");
				PHP = new JLabel("PHP");
				Ruby = new JLabel("Ruby");
				
				
				add(title);
				add(availableBooksCount);
				add(borrowedBooksCount);
				
				add(Java);
				add(new JLabel(javaAvailableBookCount + ""));
				add(new JLabel(javaBorrowedBookCount + ""));
				
				add(Python);
				add(new JLabel(pythonAvailableBookCount + ""));
				add(new JLabel(pythonBorrowedBookCount + ""));
				
				add(Javascript);
				add(new JLabel(javaScriptAvailableBookCount + ""));
				add(new JLabel(javaScriptBorrowedBookCount + ""));
				
				add(PHP);
				add(new JLabel(phpAvailableBookCount + ""));
				add(new JLabel(phpBorrowedBookCount + ""));
				
				add(Ruby);
				add(new JLabel(rubyAvailableBookCount + ""));
				add(new JLabel(rubyBorrowedBookCount + ""));
				
				
				exit.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent ae) {
						System.exit(0);
					}
				});

				mbar.add(exit);

				setJMenuBar(mbar);

				setExtendedState(MAXIMIZED_BOTH);
				
				Action viewTheStock = new AbstractAction() {
				    public void actionPerformed(ActionEvent e) {
				    	dispose();
				    	new ViewStock();
				    }
				};
				Action borrowTheBook = new AbstractAction() {
				    public void actionPerformed(ActionEvent e) {
				    	dispose();
				    	new BookBorrowed();
				    }
				};
				Action returnTheBook = new AbstractAction() {
				    public void actionPerformed(ActionEvent e) {
				    	dispose();
				    	new BookReturned();
				    }
				};
				Action quitTheApplication = new AbstractAction() {
				    public void actionPerformed(ActionEvent e) {
				    	dispose();
				    	System.exit(0);
				    }
				};
				
				mbar.getInputMap().put(KeyStroke.getKeyStroke("V"),
	                    "viewTheStock");
				mbar.getInputMap().put(KeyStroke.getKeyStroke("B"),
	                    "borrowTheBook");
				mbar.getInputMap().put(KeyStroke.getKeyStroke("R"),
	                    "returnTheBook");
				mbar.getInputMap().put(KeyStroke.getKeyStroke("Q"),
	                    "quitTheApplication");
				
				
				mbar.getActionMap().put("viewTheStock",
						viewTheStock);
				mbar.getActionMap().put("borrowTheBook",
						borrowTheBook);
				mbar.getActionMap().put("returnTheBook",
						returnTheBook);
				mbar.getActionMap().put("quitTheApplication",
						quitTheApplication);
				
				
			}
			
			
		}
	
	//This is to bring up a popup window for incorrect credentials.
	class AuthenticationFailure extends JFrame {
		JLabel retry;
		JMenuBar mbar;
		JLabel label;

		public AuthenticationFailure() {
			setTitle("Authetication Failure!!!");
			setSize(400, 400);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);

			mbar = new JMenuBar();
			mbar.setLayout(new FlowLayout());

			label = new JLabel("Sorry! Your credentials are incorrect!");
			mbar.add(label);
			retry = new JLabel("<html><a href=''>Try Again</a></html>");
			retry.setCursor(new Cursor(Cursor.HAND_CURSOR));
			retry.setFont(new Font("Tahoma", Font.PLAIN, 13));

			retry.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent ae) {
					dispose();
					new AuthenticateUserCredentials();
				}
			});

			mbar.add(retry);

			setJMenuBar(mbar);

			setExtendedState(MAXIMIZED_BOTH);
		}
	}

	//This is to execute the program
	public static void main(String args[]) {
		new AuthenticateUserCredentials();
	}

}