package shape;

public class Rectangle implements Shape {

	private String fillColor;
	private int BorderWidth, height, width;
	private static final String Rectangle="Rectangle";

	public Rectangle(String fillColor, int BorderWidth, int height, int width) {

		this.fillColor = fillColor;

		if (BorderWidth > 0) {
			this.BorderWidth = BorderWidth;
		} else {
			throw new IllegalArgumentException("Invalid Border");
		}
		if (height > 0) {
			this.height = height;
		} else {
			throw new IllegalArgumentException("Invalid height");
		}
		if (width > 0) {
			this.width = width;
		} else {
			throw new IllegalArgumentException("Invalid width");
		}

	}

	public int getBorderWidth() {
		return BorderWidth;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public void draw() {
		int i, j;
		for (i = 0; i < height; i++) {
			for (j = 0; j < width; j++) {
				if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
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

		return height * width;
	}

	@Override
	public String getName() {

		return Rectangle;
	}

	@Override
	public String getHexFillCollor() {

		return fillColor;
	}

}
