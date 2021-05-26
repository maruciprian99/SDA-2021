package lab4prob4;

public class Rectangle implements Shape {

	private String fillColor;
	private int borderWidth, height, width;
	private HexColorValidator val;
	private static final String Rectangle = "Rectangle";

	public Rectangle(String fillColor, int borderWidth, int height, int width) throws IllegalArgumentException {
		this.val = new HexColorValidator();
		if (val.validate(fillColor))
			this.fillColor = fillColor;
		else
			throw new IllegalArgumentException(Rectangle + " : invalid color");

		if (borderWidth > 0)
			this.borderWidth = borderWidth;
		else
			throw new IllegalArgumentException(Rectangle + " : invalid border width");

		if (height > 0)
			this.height = height;
		else
			throw new IllegalArgumentException(Rectangle + " : invalid height");

		if (width > 0)
			this.width = width;
		else
			throw new IllegalArgumentException(Rectangle + ": invalid width");
	}

	public String getHexFillColor() {
		return fillColor;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
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
	public void draw() {
		int i, j;
		for (i = 0; i < height; i++) {
			for (j = 0; j < width; j++) {
				if (i == 0 || i == height - 1 || j == 0 || j == width - 1)
					System.out.print("# ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}