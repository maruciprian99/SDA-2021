package shape;

public class Circle implements Shape {
	private String fillColor;
	private int BorderWidth, radius;
	private static final String Circle ="Circle";

	public Circle(String HexFillColor, int BorderWidth, int radius) {
		this.fillColor = fillColor;
		if (BorderWidth > 0) {
			this.BorderWidth = BorderWidth;
		} else {
			throw new IllegalArgumentException("Invalid Border");
		}
		if (radius > 0) {
			this.radius = radius;
		} else {
			throw new IllegalArgumentException("Invalid radius");
		}
	}

	public int getBorderWidth() {
		return BorderWidth;
	}

	public int getRadius() {
		return radius;
	}

	@Override
	public double getArea() {
		double Area = 3.14 * radius * radius;
		return Area;
	}

	@Override
	public String getName() {
		return Circle;
	}

	public void draw() {
		double dist;
		for (int i = 0; i <= 2 * radius; i++) {
			for (int j = 0; j <= 2 * radius; j++) {
				dist = Math.sqrt((i - radius) * (i - radius) + (j - radius) * (j - radius));

				if (dist > radius - 0.5 && dist < radius + 0.5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.print("\n");
		}

	}

	@Override
	public String getHexFillCollor() {
		return fillColor;
	}
}
