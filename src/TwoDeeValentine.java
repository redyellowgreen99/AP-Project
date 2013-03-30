import javax.swing.JOptionPane;

import junit.framework.TestCase;

/**
 * A kiss is a space containing an x that has an x at each of it’s 4 corners. A
 * hug is a space that is empty at the center and is surrounded by x’s on all
 * sides.
 **/

public class TwoDeeValentine extends TestCase {

	String[][] love = {
			{ "x", "x", " ", " ", "x", " ", "x", "x", " ", " ", " ", "x", "x" },
			{ "x", "x", " ", "x", "x", "x", "x", "x", " ", " ", " ", "x", "x" },
			{ " ", "x", " ", "x", " ", "x", " ", "x", " ", " ", " ", "x", "x" },
			{ "x", " ", " ", " ", "x", " ", " ", "x", " ", " ", " ", "x", "x" },
			{ "x", "x", " ", "x", " ", "x", "x", "x", " ", " ", "x", "x", "x" },
			{ "x", "x", " ", "x", " ", " ", "x", "x", " ", " ", "x", " ", "x" },
			{ "x", "x", " ", "x", "x", " ", "x", "x", " ", " ", "x", "x", "x" } };

	public void testFindKisses() throws Exception {
		print(love);
		assertEquals(3, getKissRow());
		assertEquals(4, getKissColumn());
		assertEquals(5, getHugRow());
		assertEquals(11, getHugColumn());
	}

	public int getKissRow() {
		for (int i = 0; i < love.length; i++) {
			for (int j = 0; j < love[i].length; j++) {
				if (i > 0 && j > 0 && j < love[i].length - 1
						&& i < love.length - 1) {
					if (love[i + 1][j + 1].equals("x")) {
						if (love[i - 1][j - 1].equals("x")) {
							if (love[i + 1][j - 1].equals("x")) {
								if (love[i - 1][j + 1].equals("x")) {
									if (love[i][j].equals("x")) {
										return i;
									}
								}
							}
						}
					}
				}
			}
		}
		return -1;
	}

	public int getKissColumn() {
		for (int i = 0; i < love.length; i++) {
			for (int j = 0; j < love[i].length; j++) {
				if (i > 0 && j > 0 && j < love[i].length - 1
						&& i < love.length - 1) {
					if (love[i + 1][j + 1].equals("x")) {
						if (love[i - 1][j - 1].equals("x")) {
							if (love[i + 1][j - 1].equals("x")) {
								if (love[i - 1][j + 1].equals("x")) {
									if (love[i][j].equals("x")) {
										return j;
									}
								}
							}
						}
					}
				}
			}
		}
		return -1;
	}

	public int getHugRow() {
		for (int i = 0; i < love.length; i++) {
			for (int j = 0; j < love[i].length; j++) {
				if (i > 0 && j > 0 && j < love[i].length - 1
						&& i < love.length - 1) {
					if (love[i + 1][j + 1].equals("x")) {
						if (love[i - 1][j - 1].equals("x")) {
							if (love[i + 1][j - 1].equals("x")) {
								if (love[i + 1][j].equals("x")) {
									if (love[i][j + 1].equals("x")) {
										if (love[i - 1][j].equals("x")) {
											if (love[i][j - 1].equals("x")) {
												if (love[i][j + 1].equals("x")) {
													if (love[i][j - 1]
															.equals("x")) {
														if (love[i - 1][j + 1]
																.equals("x")) {
															if (love[i][j]
																	.equals(" ")) {
																return i;
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return -1;
	}
	
	public int getHugColumn() {
		for (int i = 0; i < love.length; i++) {
			for (int j = 0; j < love[i].length; j++) {
				if (i > 0 && j > 0 && j < love[i].length - 1
						&& i < love.length - 1) {
					if (love[i + 1][j + 1].equals("x")) {
						if (love[i - 1][j - 1].equals("x")) {
							if (love[i + 1][j - 1].equals("x")) {
								if (love[i + 1][j].equals("x")) {
									if (love[i][j + 1].equals("x")) {
										if (love[i - 1][j].equals("x")) {
											if (love[i][j - 1].equals("x")) {
												if (love[i][j + 1].equals("x")) {
													if (love[i][j - 1]
															.equals("x")) {
														if (love[i - 1][j + 1]
																.equals("x")) {
															if (love[i][j]
																	.equals(" ")) {
																return j;
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return -1;
	}

	void print(String[][] table) {

		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.print(table[i][j]);
			}
			System.out.println("");
		}
	}
}
