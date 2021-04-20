package shape;

public class Square implements Shape {

	private String fillColor;
	private int borderWidth;
	private int size;
	private static final String Square ="Square";

	public Square(String fillColor, int BorderWidth, int size) throws IllegalArgumentException {
		this.fillColor = fillColor;

		if (BorderWidth > 0) {
			this.borderWidth = BorderWidth;
		} else {
			throw new IllegalArgumentException("Invalid Border");
		}
		if (size > 0) {
			this.size = size;
		} else {
			throw new IllegalArgumentException("Invalid size");
		}
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public int getSize() {
		return size;
	}

	@Override
	public void draw() {
		int i, j;
		for (i = 0; i < size; i++) {
			for (j = 0; j < size; j++) {
				if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	@Override
	public double getArea() {
		return size * size;
	}

	@Override
	public String getName() {
		return Square;
	}

	@Override
	public String getHexFillCollor() {

		return fillColor;
	}

}
