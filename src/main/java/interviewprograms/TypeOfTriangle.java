package interviewprograms;

class TypeOfTriangle {
    public static void main(String[] args) {
        int[] sides = { 20, 3, 2 };
        // 1. Equi (all side same)
        // 2. Iso (2 side same)
        // 3. Sca (no side same)

        findTypeOfTriangleFromSides(sides);
        int[] angles = { 88, 1, 120 };
        // 1. Right Angle = 90
        // 2. Obtuse > 90
        // 3. Acute < 90
        findTypeOfTriangleFromAngles(angles);
    }

    private static void findTypeOfTriangleFromSides(int[] sides) {
        if (sides[0] == sides[1] && sides[1] == sides[2])
            System.out.println("Equilater Triangle");

        else if (sides[0] == sides[1] || sides[1] == sides[2] || sides[0] == sides[2])
            System.out.println("Isoceles Triangle");

        else
            System.out.println("Scalene Triangle");
    }

    private static void findTypeOfTriangleFromAngles(int[] angles) {

        if (angles[0] == 90 || angles[1] == 90 || angles[2] == 90)
            System.out.println("Right Angle Triangle");

        else if (angles[0] > 90 || angles[1] > 90 || angles[2] > 90)
            System.out.println("Obtuse Angle Triangle");

        else
            System.out.println("Acute Angle Triangle");

    }

}
