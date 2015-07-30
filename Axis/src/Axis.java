public class Axis {

	public static int getLevel(int n) {
		int level = 0;
		while (n > 0) {
			n -= (2 * level) + 1;
			level++;
		}

		return level;
	}

	public static int getCorner(int level) {
		return (int) (Math.pow(level, 2)) - (level - 1);
	}

	public static Point getCornerAxis(int corner) {
		int XYaxis = getLevel(corner);
		return new Point(XYaxis, XYaxis);
	}

	public static Point getAxis(int n) {
		int level = getLevel(n);
		int corner = getCorner(level);
		Point cornerAxis = getCornerAxis(corner);
		int x = cornerAxis.getX();
		int y = cornerAxis.getY();

		int diff = n - corner;

		if (diff == 0)
			return cornerAxis;

		// If it is even level
		if (level % 2 == 0) {
			if (diff < 0) { // even & negative: move X down
				return new Point(x - Math.abs(diff), y);
			} else { // even & positive: move Y down
				return new Point(x, y - Math.abs(diff));
			}
		} else {
			if (diff < 0) {
				return new Point(x, y - Math.abs(diff));
			} else {
				return new Point(x - Math.abs(diff), y);
			}
		}

	}

	public static void main(String[] argv) {
		Point p = getAxis(6);
		Point p2 = getAxis(11);
		System.out.println("(" + p.getX() + "," + p.getY() + ")");
		System.out.println("(" + p2.getX() + "," + p2.getY() + ")");

	}

}
